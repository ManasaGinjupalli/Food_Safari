package com.example.food_safari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button medBTN, mongBTN, indBTN, MexiBTN, splOfBTN, splDish, trackBTN, bckBtn;
    Intent b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        medBTN = findViewById(R.id.medbtn);
        medBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1 = new Intent(Home.this, Restaurant.class);
                startActivity(b1);



            }
        });
        bckBtn = findViewById(R.id.backBTN);
        bckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2 = new Intent(Home.this, LoginActivity.class);
                startActivity(b2);
            }
        });


    }

}
