package com.example.sketsaid;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    FragmentTopNavigation topNavigation;
    FragmentBottomNavigation bottomNavigation;
    FragmentManager manager;
    FragmentSearchTopNavigation searchTopNavigation;
    FragmentContentArt contentArt;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            topNavigation = new FragmentTopNavigation();
            bottomNavigation = new FragmentBottomNavigation();
            searchTopNavigation = new FragmentSearchTopNavigation();
            contentArt = new FragmentContentArt();

            //setup the fragments
            manager = getSupportFragmentManager();
            transaction = manager.beginTransaction();
            transaction.add(R.id.fragmentTop, topNavigation);
            transaction.add(R.id.fragmentBottom, bottomNavigation);
            transaction.add(R.id.fragmentContent, contentArt);
            transaction.commit();
        }
    }

    private FirebaseUser user;

    @Override
    public void onStart(){
        //check if the user has logged in
        super.onStart();
        user = FirebaseAuth.getInstance().getCurrentUser();
        topNavigation.checkLoginState();
    }
}