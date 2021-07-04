package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.example.sketsaid.Account.LoginActivity;

public class FragmentSearchTopNavigation extends Fragment {
    public FragmentSearchTopNavigation(){
        super(R.layout.fragment_search_top_navigation);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_top_navigation, container, false);

        EditText searchBar = (EditText) view.findViewById(R.id.searchBar);
        Button searchButton = (Button) view.findViewById(R.id.searchButton);
        ImageButton character = (ImageButton) view.findViewById(R.id.characterButton);

        character.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragmentSearchTopNavigation.super.getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


}


