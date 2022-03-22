package za.co.ritshurikt.multitable;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void generateTimesTable(int parentNo, int max,ListView productLV){
        ArrayList<Integer> productList = new ArrayList<Integer>();
        for (int j=1; j<=max; j++){
            productList.add(j*parentNo);
        }
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1,productList);
        productLV.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView productLV   = (ListView) findViewById(R.id.productListView);
        ArrayList<Integer> productList = new ArrayList<Integer>(asList(1,2,3,4,5,6,7,8,9,10));
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,productList);


        SeekBar parentNumber = (SeekBar) findViewById(R.id.numberSeekBar);
        parentNumber.setMax(9);
        parentNumber.setProgress(0);
        productLV.setAdapter(arrayAdapter);

        parentNumber.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                i+=1;
                generateTimesTable(i,20,productLV);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}