package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random randGen = new Random();
    int randNumber     = randGen.nextInt(20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void guessFunction(View view){
        EditText numberNV = findViewById(R.id.editTextNumber);
        int userNumber = Integer.parseInt(numberNV.getText().toString());

            if(userNumber<randNumber)
                Toast.makeText(this, "Go Higher", Toast.LENGTH_SHORT).show();
            else if (userNumber>randNumber)
                Toast.makeText(this, "Guess lower", Toast.LENGTH_SHORT).show();
            else{
                Toast.makeText(this, "Yaaaaay You got it Baby", Toast.LENGTH_SHORT).show();
                Button submitButton = findViewById(R.id.submitButton);
                submitButton.setText("Let us Go Again");
                }
    }
}