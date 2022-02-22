package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertFunction(View view){
        double zarAmount, nairaAmount;
        EditText amount = findViewById(R.id.amountEditText);
        nairaAmount = Double.parseDouble(amount.getText().toString());
        zarAmount= nairaAmount/27.43;
        Toast.makeText(this, zarAmount+"", Toast.LENGTH_LONG).show();
    }
}