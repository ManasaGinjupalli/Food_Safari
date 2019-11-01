package com.example.food_safari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    Button pastaBTN, peproniBTN, back;
    Intent b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        pastaBTN = findViewById(R.id.PastaBTN);
        pastaBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1 = new Intent(Menu.this, Cart.class);
                startActivity(b1);
            }
        });


        back = findViewById(R.id.backAGBTN);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3 = new Intent(Menu.this, Restaurant.class);
                startActivity(b3);
            }
        });
    }
}
