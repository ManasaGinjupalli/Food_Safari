package com.example.food_safari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button signIn;
    Intent b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn= (Button)findViewById(R.id.Sign_In_BTN);

        signIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                b1 = new Intent(LoginActivity.this, Home.class);
                startActivity(b1);

            }
        });
    }





}
