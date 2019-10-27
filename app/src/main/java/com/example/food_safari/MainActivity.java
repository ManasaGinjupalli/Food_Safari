package com.example.food_safari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    DatabaseOfFoodSafari myFoodSafari;
    Button b;
    Intent b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFoodSafari = new DatabaseOfFoodSafari(this);
        b= (Button)findViewById(R.id.LoginBTN);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               b1 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(b1);

            }
        });

    }


}
