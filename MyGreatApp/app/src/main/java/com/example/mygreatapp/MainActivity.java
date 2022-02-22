package com.example.mygreatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        EditText namedEditText = findViewById(R.id.nameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        namedEditText.setBackgroundColor(Color.WHITE);
        Log.i("Info","The Button has been pressed");
        Log.i("Password",passwordEditText.getText().toString());
        Log.i("Username",namedEditText.getText().toString());
        Toast.makeText(this, "We are Logged In", Toast.LENGTH_SHORT).show();
    }
}