package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

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
        Log.i("Info","Button Pressed");
        EditText nameEditText  = findViewById(R.id.nameEditText);
        String nameStr = nameEditText.getText().toString();
        Log.i("Name",nameEditText.getText().toString());
        Toast.makeText(this, "Hello "+nameStr, Toast.LENGTH_SHORT).show();
    }
}