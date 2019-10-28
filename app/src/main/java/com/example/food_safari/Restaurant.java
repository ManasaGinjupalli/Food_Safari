package com.example.food_safari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurant extends AppCompatActivity {
Button AGBTN,PAG,bk;
Intent b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        AGBTN=findViewById(R.id.AGbtn);
        AGBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=new Intent(Restaurant.this,Menu.class);
                startActivity(b1);
            }
        });

        PAG=findViewById(R.id.PagliaBtn);
        PAG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2=new Intent(Restaurant.this,Menu.class);
                startActivity(b2);

            }
        });

        bk=findViewById(R.id.backResBTN);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 b3=new Intent(Restaurant.this,Home.class);
                 startActivity(b3);

            }
        });
    }

}
