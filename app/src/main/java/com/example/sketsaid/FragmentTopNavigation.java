package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.example.sketsaid.ui.login.LoginActivity;

public class FragmentTopNavigation extends Fragment {
    public FragmentTopNavigation(){
        super(R.layout.fragment_top_navigation);
    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.activity_main, container, false);
//        Button character = view.findViewById(R.id.characterButton);
//        character.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FragmentTopNavigation.super.getActivity(), LoginActivity.class);
//                intent.putExtra("MOVE", "Login");
//                startActivity(intent);
//            }
//        });
//        return view;
//    }
}
