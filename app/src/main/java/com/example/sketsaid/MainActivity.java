package com.example.sketsaid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.View;
import com.example.sketsaid.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    public static final String SEARCH_STRING = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchCharacter(View view) {
        Intent intent = new Intent(this, commission.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(SEARCH_STRING, message);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(SEARCH_STRING, message);
        startActivity(intent);
    }
}