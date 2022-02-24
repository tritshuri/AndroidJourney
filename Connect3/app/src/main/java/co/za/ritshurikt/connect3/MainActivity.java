package co.za.ritshurikt.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 0:Red player 1:Yellow 2:empty

    int activePlayer = 0;
    boolean gameWon = false;
    int[] gameState = {2,2,2,2,2,2,2,2,2};
    int[] []winningPos = {{0,1,2},{2,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void dropIn(View view){
        Button restartButton = (Button) findViewById(R.id.button);
        restartButton.setAlpha(0);
        ImageView counter = (ImageView) view;
        if (gameState[Integer.parseInt(counter.getTag().toString())] ==2 && !gameWon){
            counter.setTranslationY(-1000);
            gameState[Integer.parseInt(counter.getTag().toString())] = activePlayer;
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.red);
                activePlayer = 1;

            } else {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1000).rotation(3600).setDuration(1000);

            for (int[] winPos : winningPos) {
                if (gameState[winPos[0]] == gameState[winPos[1]] && gameState[winPos[1]] == gameState[winPos[2]] && gameState[winPos[0]] != 2) {
                    String winner = "";
                    if (activePlayer == 1)
                        winner = "Red";
                    else
                        winner = "Yellow";
                    gameWon=true;
                    restartButton.setAlpha(1);

                    Toast.makeText(this, winner + " Player has won, Hooray", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void restartFunction(View view){
        Button restartButton = (Button) findViewById(R.id.button);
        androidx.gridlayout.widget.GridLayout allObjects = (androidx.gridlayout.widget.GridLayout) findViewById(R.id.gridLayout);
        restartButton.setAlpha(0);
        for (int i=0; i<gameState.length; i++){
            gameState[i]=2;
        }
        for( int i=0; i<allObjects.getChildCount();i++){
            ImageView counter = (ImageView) allObjects.getChildAt(i);
            counter.setImageDrawable(null);
        }
        gameWon=false;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button restartButton = (Button) findViewById(R.id.button);
        restartButton.setAlpha(0);
    }
}