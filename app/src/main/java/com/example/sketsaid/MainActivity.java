package com.example.sketsaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import androidx.fragment.app.Fragment;
import com.example.sketsaid.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    public static final String MOVE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the bottom navigation menu
//        FragmentBottomNavigation bottomNavigation = (FragmentBottomNavigation) getSupportFragmentManager().findFragmentById(R.id.FragmentBottom);
//        FragmentTopNavigation topNavigation = (FragmentTopNavigation) getSupportFragmentManager().findFragmentById(R.id.FragmentTop);
    }

    public void moveToLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(MOVE, "Login");
        startActivity(intent);
    }
}