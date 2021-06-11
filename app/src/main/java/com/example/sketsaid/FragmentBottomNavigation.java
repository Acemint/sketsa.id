package com.example.sketsaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentBottomNavigation extends Fragment {
    public static final String MOVE = null;
    BottomNavigationView bottomNav;

    public FragmentBottomNavigation(){
        super(R.layout.fragment_bottom_navigation);
//        bottomNav.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.page_1:
//                        break;
//                    case R.id.page_2:
////                        moveToArtSearch(this);
//                        break;
//                    case R.id.page_3:
//                        break;
//                }
//                return false;
//            }
//        });
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_main, container, false);
//    }

//    public void moveToArtSearch(BottomNavigationView.OnNavigationItemSelectedListener view) {
//        Intent intent = new Intent(super.getActivity(), Commission.class);
//        intent.putExtra(MOVE, "");
//        startActivity(intent);
//    }
}
