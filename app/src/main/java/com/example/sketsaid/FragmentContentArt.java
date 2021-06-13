package com.example.sketsaid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class FragmentContentArt extends Fragment {
    public FragmentContentArt(){
        super(R.layout.fragment_content_art);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content_art, container, false);
    }
}
