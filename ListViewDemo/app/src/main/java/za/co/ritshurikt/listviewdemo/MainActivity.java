package za.co.ritshurikt.listviewdemo;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayList<String> myFriendList  = new ArrayList<String>(asList( "Hlulani","Timothy","LOLA"));

        myFriendList.add("Hlulani");
        myFriendList.add("Mesh");
        myFriendList.add("Mourinho");
        myFriendList.add("Skunk");
        myFriendList.add("TImomo");
        myFriendList.add("TIm");
        myFriendList.add("Goodwell");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriendList);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, myFriendList.get(i), Toast.LENGTH_LONG).show();
                myListView.setVisibility(View.GONE);
            }
        });

    }
}