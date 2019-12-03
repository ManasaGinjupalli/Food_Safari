package com.example.food_safari;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Sign_Up extends AppCompatActivity {

    EditText emailId, password, fullName, address, phonenum;
    Button btnSignUp;
    FirebaseAuth mFirebaseAuth;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.EmailET);
        password = findViewById(R.id.login_password_et);
        fullName = findViewById(R.id.NameET);
        address = findViewById(R.id.EditAddressET);
        phonenum = findViewById(R.id.phoneET);
        btnSignUp = findViewById(R.id.RegisterBTN);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailId.getText().toString();
                String pwd = password.getText().toString();
                String fname = fullName.getText().toString();
                String adds = address.getText().toString();
                String number = phonenum.getText().toString();
                if (email.isEmpty() && pwd.isEmpty() && fname.isEmpty() && adds.isEmpty() && number.isEmpty()) {
                    Toast.makeText(Sign_Up.this, "Fields Are Empty!", Toast.LENGTH_SHORT).show();
                } else if (pwd.isEmpty()) {
                    password.setError("Please enter your password");
                    password.requestFocus();
                } else if (fname.isEmpty()) {
                    fullName.setError("Please enter first name");
                    fullName.requestFocus();
                } else if (adds.isEmpty()) {
                    address.setError("Please enter address");
                    address.requestFocus();
                } else if (number.isEmpty()) {
                    phonenum.setError("Please enter phone number");
                    phonenum.requestFocus();
                } else if (email.isEmpty()) {
                    emailId.setError("Please enter email id");
                    emailId.requestFocus();
                } else if (!(email.isEmpty() && pwd.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(Sign_Up.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(Sign_Up.this, "SignUp Unsuccessful, Please Try Again", Toast.LENGTH_SHORT).show();
                            } else {
                                String user_id = mFirebaseAuth.getCurrentUser().getUid();
                                String email = emailId.getText().toString();
                                String pwd = password.getText().toString();
                                String fname = fullName.getText().toString();
                                String adds = address.getText().toString();
                                String number = phonenum.getText().toString();
                                reff = FirebaseDatabase.getInstance().getReference().child("details").child(user_id);

                                //String name, String email, String password, String address, String phonenumber
                                reff.setValue(new User(fname, email, pwd, adds, number));

                                fullName.setText("");
                                address.setText("");
                                phonenum.setText("");
                                emailId.setText("");
                                password.setText("");


                                startActivity(new Intent(Sign_Up.this, LoginActivity.class));
                            }
                        }
                    });

                }
            }
        });
    }
}
