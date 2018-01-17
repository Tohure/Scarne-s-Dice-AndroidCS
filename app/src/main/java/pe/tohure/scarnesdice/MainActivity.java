package pe.tohure.scarnesdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int userOverallScore;
    private int userTurnScore;
    private int computerOverallScore;
    private int computerTurnScore;

    private ImageView imgDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        imgDice = findViewById(R.id.imgDice);
    }

    public void onClickRoll(View view) {
        
        int value = new Random().nextInt(6) + 1;

        switch (value) {
            case 1:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                break;
            case 2:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                break;
            case 3:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                break;
            case 4:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                break;
            case 5:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                break;
            case 6:
                imgDice.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                break;
        }
    }
}
