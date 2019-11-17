package com.example.food_safari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button signIn, create;
    Intent b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn = findViewById(R.id.login_signin_btn);

        signIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                b1 = new Intent(LoginActivity.this, Home.class);
                startActivity(b1);

            }
        });

        ImageButton backBTN = findViewById(R.id.imageButton);
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
        create = findViewById(R.id.login_create_acc_btn);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2 = new Intent(LoginActivity.this, Sign_Up.class);
                startActivity(b2);
            }
        });
    }
}
