package com.example.createyourown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        EditText username = findViewById(R.id.editText4);
        EditText password = findViewById(R.id.editText5);


    }

    public void signup(View view){
        Intent in = new Intent(getApplicationContext(),Signup.class);
        Context context = getApplicationContext();
        startActivity(in);
    }
}
