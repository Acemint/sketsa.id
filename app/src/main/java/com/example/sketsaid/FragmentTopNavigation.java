package com.example.sketsaid;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.example.sketsaid.ui.login.LoginActivity;

public class FragmentTopNavigation extends Fragment {
    public FragmentTopNavigation(){
        super(R.layout.fragment_top_navigation);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_navigation, container, false);

        ImageButton logo = (ImageButton) view.findViewById(R.id.sketsaIdButton);
        ImageButton character = (ImageButton) view.findViewById(R.id.characterButton);

        logo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FragmentTopNavigation.super.getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        character.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragmentTopNavigation.super.getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
