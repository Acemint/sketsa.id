package com.example.sketsaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import com.example.sketsaid.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomView;
    Button loginButton;
    public static final String MOVE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.page_1:
                            break;
                        case R.id.page_2:
                            moveToArtSearch(this);
                            break;
                        case R.id.page_3:
                            break;
                    }
                    return false;
                }
            }
        );
    }

    public void moveToArtSearch(BottomNavigationView.OnNavigationItemSelectedListener view) {
        Intent intent = new Intent(this, Commission.class);
        intent.putExtra(MOVE, "");
        startActivity(intent);
    }

    public void moveToLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(MOVE, "Login");
        startActivity(intent);
    }
}