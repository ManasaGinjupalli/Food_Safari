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

        signIn = findViewById(R.id.Sign_In_BTN);

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
        create = findViewById(R.id.createbtn);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2 = new Intent(LoginActivity.this, Sign_Up.class);
                startActivity(b2);
            }
        });

    }





}
class User{
    private int User_ID;
    private String User_Name;
    private String User_Email;
    private String User_Password;

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_Password(String user_Password) {
        this.User_Email = user_Password;
    }

    public void setUser_Email(String user_Email) {
        this.User_Email = user_Email;
    }

    public void setUser_Name(String user_Name) {
        this.User_Name = user_Name;
    }

    public void setUser_ID(int user_ID) {
        this.User_ID = user_ID;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public String getUser_Email() {
        return User_Email;
    }

    public String getUser_Name() {
        return User_Name;
    }
}