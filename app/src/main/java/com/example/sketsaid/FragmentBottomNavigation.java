package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentBottomNavigation extends Fragment {
    BottomNavigationView bottomNav;

    public FragmentBottomNavigation(){
        super(R.layout.fragment_bottom_navigation);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_navigation, container, false);
        bottomNav = (BottomNavigationView) view.findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.page_2);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()){
                    case R.id.page_1:
                        moveToLogin();
                        break;
                    case R.id.page_2:
                        goToSearchBar();
                        break;
                    case R.id.page_3:
//                      checkLogin();
                        break;
                }
                return true;
            }
        });
        return view;
    }


    public void moveToLogin() {
        FragmentTopNavigation topNavigation = new FragmentTopNavigation();
        FragmentManager manager = getParentFragmentManager();
        manager.beginTransaction().replace(R.id.fragmentTop, topNavigation).commit();
    }

    public void goToSearchBar(){
        FragmentSearchTopNavigation searchTopNavigation = new FragmentSearchTopNavigation();
        FragmentManager manager = getParentFragmentManager();
        manager.beginTransaction().replace(R.id.fragmentTop, searchTopNavigation).commit();
    }
}
