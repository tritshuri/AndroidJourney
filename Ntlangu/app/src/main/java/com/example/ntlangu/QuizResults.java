package com.example.ntlangu;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
//Outcome
public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView baloonsView = findViewById(R.id.imageView2);
        baloonsView.setTranslationY(1000);
        baloonsView.animate().translationYBy(-1000).setDuration(20000);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewBtn);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getcorrectAnsewrsText = getIntent().getIntExtra("correct",0);
        final int getincorrectAnswersText = getIntent().getIntExtra("incorrect",0);

        correctAnswers.setText("U kume: "+String.valueOf(getcorrectAnsewrsText));
        incorrectAnswers.setText("U tsandzekile: "+String.valueOf(getincorrectAnswersText));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}