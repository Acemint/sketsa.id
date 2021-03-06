package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.sketsaid.Account.AccountDetailsActivity;
import com.example.sketsaid.Account.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.Serializable;

public class FragmentTopNavigation extends Fragment implements Serializable {
    private ImageButton character;
    private TextView textUsername;
    public FragmentTopNavigation(){
        super(R.layout.fragment_top_navigation);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_navigation, container, false);

        character = (ImageButton) view.findViewById(R.id.characterButton);
        textUsername = (TextView) view.findViewById(R.id.textFullName);

        character.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setLoginState();
                checkLoginState();
            }
        });

        checkLoginState();
        return view;
    }

    public void checkLoginState(){
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user != null){
            textUsername.setText(user.getDisplayName());
        }
        else{
            textUsername.setText("Login");
        }
    }

    public void setLoginState(){
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        Intent intent;
        if(user != null){
            intent = new Intent(FragmentTopNavigation.super.getContext(), AccountDetailsActivity.class);
        }
        else{
            intent = new Intent(FragmentTopNavigation.super.getContext(), LoginActivity.class);
        }
        startActivity(intent);
    }
}

