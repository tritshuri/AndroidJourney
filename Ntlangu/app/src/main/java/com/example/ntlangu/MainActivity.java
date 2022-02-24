package com.example.ntlangu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicname = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final ConstraintLayout Bibele = findViewById(R.id.Bibele);
        final ConstraintLayout Tidrama = findViewById(R.id.tidrama);
        final ConstraintLayout Tinsimu = findViewById(R.id.tinsimu);
        final ConstraintLayout Mikandziyiso = findViewById(R.id.mikandziyiso);

        final Button startBtn = findViewById(R.id.startBtn);

        Bibele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicname = "Bibele";

                Bibele.setBackgroundResource(R.drawable.round_back_stroke10);

                Tidrama.setBackgroundResource(R.drawable.round_back_white10);
                Tinsimu.setBackgroundResource(R.drawable.round_back_white10);
                Mikandziyiso.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Tidrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicname = "Tidrama";

                Tidrama.setBackgroundResource(R.drawable.round_back_stroke10);

                Bibele.setBackgroundResource(R.drawable.round_back_white10);
                Tinsimu.setBackgroundResource(R.drawable.round_back_white10);
                Mikandziyiso.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        Tinsimu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicname = "Tinsimu";

                Tinsimu.setBackgroundResource(R.drawable.round_back_stroke10);

                Bibele.setBackgroundResource(R.drawable.round_back_white10);
                Tidrama.setBackgroundResource(R.drawable.round_back_white10);
                Mikandziyiso.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Mikandziyiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicname = "Mikandziyiso";

                Mikandziyiso.setBackgroundResource(R.drawable.round_back_stroke10);

                Bibele.setBackgroundResource(R.drawable.round_back_white10);
                Tidrama.setBackgroundResource(R.drawable.round_back_white10);
                Tinsimu.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicname.isEmpty())
                    Toast.makeText(MainActivity.this, "Ndzi kombela u hlawula nhlokomhaka", Toast.LENGTH_SHORT).show();

                else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicname);
                    startActivity(intent);
                }
            }
        });

    }
}