package com.example.food_safari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatabaseOfFoodSafari myFoodSafari;
    Button loginBtn, signBTN;
    Intent b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFoodSafari = new DatabaseOfFoodSafari(this);
        loginBtn = findViewById(R.id.LoginBTN);

        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                b1 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(b1);

            }
        });


        signBTN = findViewById(R.id.SignUpBTN);

        signBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                b2 = new Intent(MainActivity.this, Sign_Up.class);
                startActivity(b2);

            }
        });

    }


}
