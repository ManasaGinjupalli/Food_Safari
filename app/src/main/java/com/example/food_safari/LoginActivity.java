package com.example.food_safari;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
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
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    EditText userName;
    EditText userPwd;
    FirebaseAuth firebaseAuth;
    Button loginBTN,forgotBTN;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = findViewById(R.id.loginEmail);
        userPwd = findViewById(R.id.loginPassword);
        loginBTN = findViewById(R.id.loginBTN);
        forgotBTN=findViewById(R.id.ForgotBTN);
        firebaseAuth = FirebaseAuth.getInstance();


        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if (firebaseUser != null) {
                    Toast.makeText(LoginActivity.this, "you are logged in", Toast.LENGTH_SHORT).show();
                    Intent b1 = new Intent(LoginActivity.this, Home.class);
                    startActivity(b1);
                } else {
                    Toast.makeText(LoginActivity.this, "PLease login", Toast.LENGTH_SHORT).show();
                }

            }
        };

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailid = userName.getText().toString();
                String passwd = userPwd.getText().toString();
                if (emailid.isEmpty()) {
                    userName.setError("Enter the email");
                    userName.requestFocus();
                } else if (passwd.isEmpty()) {
                    userPwd.setError("Enter the password");
                    userPwd.requestFocus();
                } else if (emailid.isEmpty() && passwd.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "fields are empty", Toast.LENGTH_SHORT).show();

                } else if (!(emailid.isEmpty() && passwd.isEmpty())) {
                    firebaseAuth.signInWithEmailAndPassword(emailid, passwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Loginerror try again", Toast.LENGTH_SHORT).show();
                            } else {
                                Intent b1 = new Intent(LoginActivity.this, Home.class);
                                startActivity(b1);
                            }
                        }
                    });

                } else {
                    Toast.makeText(LoginActivity.this, "Error occured", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgotBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(LoginActivity.this, ForgotPassword.class);
                startActivity(b1);

            }
        });
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
////        firebaseAuth.addAuthStateListener(authStateListener);
//    }

//    public void LogWelcomeBTN(View v) {
//        SharedPreferences myData = getSharedPreferences("save", Context.MODE_PRIVATE);

//        String email = myData.getString("email", "");
//        String pwd = myData.getString("password", "");
//        if (!email.equals("") && !pwd.equals("")) {
//            if (email.equalsIgnoreCase(userName.getText().toString()) && pwd.equalsIgnoreCase(userPwd.getText().toString())) {
//                Intent b1 = new Intent(this, LoginWelcome.class);
//                startActivity(b1);
//            } else {
//                Toast.makeText(getApplicationContext(), "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
//            }
//        } else {
//            Toast.makeText(getApplicationContext(), "NO DATA FOUND", Toast.LENGTH_SHORT).show();
//
//        }

//    }
}
