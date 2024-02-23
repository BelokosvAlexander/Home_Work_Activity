package com.example.myapplication11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewPassword = findViewById(R.id.textViewPassword);

        textViewEmail.setText("Email: " + email);
        textViewPassword.setText("Password: " + password);
    }
}