package org.maktab.materialdesign;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TopAppBarFragment extends Fragment {


    public static TopAppBarFragment newInstance() {
        
        Bundle args = new Bundle();
        
        TopAppBarFragment fragment = new TopAppBarFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_app_bar, container, false);
    }

}
