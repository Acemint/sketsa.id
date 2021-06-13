package com.example.sketsaid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class FragmentContentSlider extends Fragment {
    public FragmentContentSlider(){
        super(R.layout.fragment_slides);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slides, container, false);
    }
}
