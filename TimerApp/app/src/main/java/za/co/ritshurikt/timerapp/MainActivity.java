package za.co.ritshurikt.timerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView timeView;
    Button startButton;
    Button stopButton;
    SeekBar durationSeekBar;
    MediaPlayer mediaPlayer;

    CountDownTimer countD;
    long maxMillis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeView    = (TextView) findViewById(R.id.timeView);
        startButton = (Button) findViewById(R.id.startButton);
        stopButton  = (Button) findViewById(R.id.stopButton);
        durationSeekBar = (SeekBar) findViewById(R.id.DurationSeekBar);
        mediaPlayer = MediaPlayer.create(this,R.raw.u_dyisa_team);

        durationSeekBar.setProgress(0); //make it start from zero
        durationSeekBar.setMax(100);  //Determines the length allowed

        durationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                maxMillis = (long) i*1000+100; //making it to milliseconds
                setTimeViewValue(maxMillis);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void setTimeViewValue(long millis){
        long seconds = millis/1000;
        @SuppressLint("DefaultLocale") String finalSeconds = String.format("%02d",seconds%60 );
        String finalTime = seconds/60 +":"+finalSeconds;
        timeView.setText(finalTime);
    }

    public void startTimer(View view){
        timer(maxMillis);
    }

    public void timer(long maxMillis){
        durationSeekBar.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        stopButton.setVisibility(View.VISIBLE);
        this.countD = new CountDownTimer(maxMillis,1000){
            public void onTick(long millisecondsUntilDone){
                setTimeViewValue(millisecondsUntilDone);
                if (millisecondsUntilDone<=10000 && !mediaPlayer.isPlaying()){
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.u_dyisa_team);
                    mediaPlayer.start();
                }

            }
            public void onFinish(){
                stopTimer(durationSeekBar);
            }
        };
        countD.start();
    }

    public void stopTimer(View view){
        durationSeekBar.setVisibility(View.VISIBLE);
        countD.cancel();
        startButton.setVisibility(View.VISIBLE);
        stopButton.setVisibility(View.GONE);
        if (mediaPlayer.isPlaying())
                mediaPlayer.stop();
    }
}