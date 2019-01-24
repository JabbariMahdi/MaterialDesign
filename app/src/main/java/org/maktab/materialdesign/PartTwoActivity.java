package org.maktab.materialdesign;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PartTwoActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_two);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        bottomNavigationView=findViewById(R.id.bottom_navigation);

        TopAppBarFragment topAppBarFragment = TopAppBarFragment.newInstance();
        adapter.addFrag(topAppBarFragment,"Top App Bars");

        TabLayoutFragment tabLayoutFragment = TabLayoutFragment.newInstance();
        adapter.addFrag(tabLayoutFragment,"Tab Layout");

        BottomNavigationFragment bottomNavigationFragment = BottomNavigationFragment.newInstance();
        adapter.addFrag(bottomNavigationFragment,"Bottom Navigation");

        TextFieldsFragment textFieldsFragment = TextFieldsFragment.newInstance();
        adapter.addFrag(textFieldsFragment,"Text Fields");

        viewPager.setAdapter(adapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.tab_search:
                        Toast.makeText(PartTwoActivity.this, "Search", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.tab_home:
                        Toast.makeText(PartTwoActivity.this, "Home", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.tab_setting:
                        Toast.makeText(PartTwoActivity.this, "Setting", Toast.LENGTH_SHORT).show();

                        break;

                }
                return true;
            }
        });

    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
}
