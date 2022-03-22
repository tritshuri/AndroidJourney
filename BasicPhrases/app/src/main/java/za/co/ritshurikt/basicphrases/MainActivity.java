package za.co.ritshurikt.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playSound(View view){

        String tagName = view.getTag().toString();
        Log.i("ButtonClicked",tagName);
        switch(tagName.toLowerCase(Locale.ROOT)){
            case "button2":
                mediaPlayer = MediaPlayer.create(this,R.raw.u_hanya_kanwe_remix);
                break;
            case "button3":
                mediaPlayer = MediaPlayer.create(this,R.raw.u_dyisa_ream_remix);
                break;
            case "button4":
                mediaPlayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
                break;
            case "button5":
                mediaPlayer = MediaPlayer.create(this,R.raw.goodevening);
                break;
            case "button6":
                mediaPlayer = MediaPlayer.create(this,R.raw.howareyou);
                break;
            case "button7":
                mediaPlayer = MediaPlayer.create(this,R.raw.ilivein);
                break;
            case "button8":
                mediaPlayer = MediaPlayer.create(this,R.raw.mynameis);
                break;
            default:
                mediaPlayer = MediaPlayer.create(this,R.raw.please);
                break;
        }
        mediaPlayer.start();
    }
}