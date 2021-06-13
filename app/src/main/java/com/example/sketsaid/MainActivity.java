package com.example.sketsaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.sketsaid.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    public static final String MOVE = null;
    FragmentTopNavigation topNavigation;
    FragmentBottomNavigation bottomNavigation;;
    FragmentManager manager;
    FragmentSearchTopNavigation searchTopNavigation;
    FragmentContentSlider contentSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topNavigation = new FragmentTopNavigation();
        bottomNavigation = new FragmentBottomNavigation();
        searchTopNavigation = new FragmentSearchTopNavigation();
        contentSlider = new FragmentContentSlider();

        //setup the fragments
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentTop, topNavigation);
        transaction.add(R.id.fragmentBottom, bottomNavigation);
        transaction.add(R.id.fragmentContentSlider, contentSlider);
        transaction.commit();
    }
}