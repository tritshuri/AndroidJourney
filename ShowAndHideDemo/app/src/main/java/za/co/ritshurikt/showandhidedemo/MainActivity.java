package za.co.ritshurikt.showandhidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textview = (TextView) findViewById(R.id.myTextView);
    }

    public void showButton(View view){
           textview.setVisibility(View.VISIBLE);
    }

    public void hideButton(View view){
        textview.setVisibility(View.GONE);
    }
}