package com.example.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean hueyIsShowing = true;
    public void fade(View view){

        ImageView imageView = findViewById(R.id.rileyView);
        ImageView imageView2 = findViewById(R.id.hueyView);
        if (hueyIsShowing){
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            hueyIsShowing=false;
            Toast.makeText(this, "Riley Pic has been pressed", Toast.LENGTH_SHORT).show();
        }
        else{
            imageView2.animate().alpha(0).setDuration(2000);
            imageView.animate().alpha(1).setDuration(2000);
            imageView.animate().translationYBy(100).setDuration(2022);

            hueyIsShowing=true;
            Toast.makeText(this, "Huey Pic has been pressed", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}