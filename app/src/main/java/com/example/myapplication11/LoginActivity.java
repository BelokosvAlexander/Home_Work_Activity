package com.example.myapplication11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                openNextActivity(email, password);
                // Проверка логина и пароля
//                if (isValidCredentials(email, password)) {
//                    openNextActivity(email, password);
//                } else {
//                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }

//    private boolean isValidCredentials(String email, String password) {
//        // Проверка введенных данных, например, сравнение с заранее заданными значениями
//        return email.equals("example@example.com") && password.equals("password123");
//    }

    private void openNextActivity(String email, String password) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}