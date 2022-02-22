package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
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

    public void checkFunction(View view) {
        EditText numberEV = findViewById(R.id.editTextNumber);
        String toastMessage;
        if(numberEV.getText().toString().isEmpty())
            toastMessage="Please enter a number";
        else {
            int userNumber = Integer.parseInt(numberEV.getText().toString());
            Triangular triInstance = new Triangular(userNumber);
            Square sqInstance = new Square(userNumber);

            toastMessage = String.format("The number %d is a neither a Triangular or Square Number",userNumber);
            if (triInstance.isTriangular())
                toastMessage = String.format("The number %d is a Triangular Number",userNumber);
            if (sqInstance.isSquare())
                toastMessage = String.format("The number %d is a Square Number",userNumber);
            if ((triInstance.isTriangular()) && (sqInstance.isSquare()))
                toastMessage = String.format("The number %d is both a Triangular and Square Number",userNumber);}

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }
}