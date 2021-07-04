package com.example.sketsaid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ArtActivity extends AppCompatActivity {
    FragmentTopNavigationBack topNavigation;
    FragmentArtDisplay artDisplay;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            topNavigation = new FragmentTopNavigationBack();
            artDisplay = new FragmentArtDisplay();

            manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragmentTop, topNavigation);
            transaction.replace(R.id.fragmentContent, artDisplay);
            transaction.commit();
        }
    }
}
