package com.example.sketsaid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    public static final String MOVE = null;
    FragmentTopNavigation topNavigation;
    FragmentBottomNavigation bottomNavigation;;
    FragmentManager manager;
    FragmentSearchTopNavigation searchTopNavigation;
    FragmentContentArt contentArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topNavigation = new FragmentTopNavigation();
        bottomNavigation = new FragmentBottomNavigation();
        searchTopNavigation = new FragmentSearchTopNavigation();
        contentArt = new FragmentContentArt();

        //setup the fragments
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentTop, topNavigation);
        transaction.add(R.id.fragmentBottom, bottomNavigation);
        transaction.add(R.id.fragmentContent, contentArt);
        transaction.commit();
    }
}