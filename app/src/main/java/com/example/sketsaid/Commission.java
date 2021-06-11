package com.example.sketsaid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.View;
import com.example.sketsaid.ui.login.LoginActivity;

public class Commission extends AppCompatActivity {
    public static final String SEARCH_STRING = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commission);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(Commission.SEARCH_STRING);
        if(!message.isEmpty()){
            EditText searchBar = findViewById(R.id.searchBar);
            searchBar.setText(message);
        }
    }

    public void searchCharacter(View view) {
        Intent intent = new Intent(this, Commission.class);
        EditText editText = (EditText) findViewById(R.id.searchBar);
        String message = editText.getText().toString();
        intent.putExtra(SEARCH_STRING, message);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(SEARCH_STRING, "Login");
        startActivity(intent);
    }
}