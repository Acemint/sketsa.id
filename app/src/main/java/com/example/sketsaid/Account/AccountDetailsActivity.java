package com.example.sketsaid.Account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.example.sketsaid.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountDetailsActivity extends AppCompatActivity {
    FragmentTopNavigationBack topNavigationBack;
    FragmentBottomNavigation bottomNavigation;
    FragmentAccountDetailsContent contentAccountDetails;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            topNavigationBack = new FragmentTopNavigationBack();
            bottomNavigation = new FragmentBottomNavigation();
            contentAccountDetails = new FragmentAccountDetailsContent();

            //setup the fragments
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentTop, topNavigationBack);
            transaction.replace(R.id.fragmentContent, contentAccountDetails);
            transaction.commit();
        }
    }
}
