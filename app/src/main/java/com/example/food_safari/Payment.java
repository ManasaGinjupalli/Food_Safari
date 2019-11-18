package com.example.food_safari;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Payment extends AppCompatActivity {
    FirebaseAuth mFirebaseAuth;
    DatabaseReference reff;
    TextView payDisp,payTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        payDisp=findViewById(R.id.paymentDisplayTV);
        payTotal=findViewById(R.id.paymentTotalTV);

        setContentView(R.layout.activity_payment);
    }
}
