package org.maktab.materialdesign;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ModalBottomSheetsFragment extends BottomSheetDialogFragment {

    public static ModalBottomSheetsFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ModalBottomSheetsFragment fragment = new ModalBottomSheetsFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_modal_bottom_sheet,container,false);


        return view;
    }

}
