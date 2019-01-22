package org.maktab.materialdesign;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.chip.Chip;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PartOneActivity extends AppCompatActivity {

    private Chip entryChip;
    private Chip actionChip;
    private BottomAppBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_one);

        entryChip =  findViewById(R.id.entryChip);

        entryChip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryChip.setVisibility(View.GONE);
            }
        });

        actionChip =  findViewById(R.id.actionChip);
        actionChip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryChip.setVisibility(View.VISIBLE);
            }
        });

        bar = findViewById(R.id.bar);
        setSupportActionBar(bar);
        bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PartOneActivity.this, "Menu", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottom_app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.tab_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab_setting:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
