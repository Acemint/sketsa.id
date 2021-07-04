package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;

public class FragmentContentArt extends Fragment {
    LinearLayout slides, card;

    public FragmentContentArt(){
        super(R.layout.fragment_content_art);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content_art, container, false);

        slides = (LinearLayout) view.findViewById(R.id.horizontalSlider);
        for(int i = 0; i < slides.getChildCount(); i++){
            card = (LinearLayout) slides.getChildAt(i);
            card.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), ArtActivity.class);
                    startActivity(intent);
                }
            });
        }
        return view;
    }
}
