package space.guslix.lazertag2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StandingsActivity extends AppCompatActivity {
    private Toast backToast;
    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standings);

        Button to_teams = findViewById(R.id.s_teams);
        to_teams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(StandingsActivity.this, TeamsActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_games = findViewById(R.id.s_games);
        to_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(StandingsActivity.this, ScheduleActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_standings = findViewById(R.id.s_standings);
        to_standings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(StandingsActivity.this, StandingsActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_main = findViewById(R.id.s_exit);
        to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(StandingsActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() - backPressedTime <= 2000){
            backToast.cancel();
            try {
                Intent i = new Intent(StandingsActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            } catch(Exception e){
                //Happy New Year!!!
            }
        } else {
            backToast = Toast.makeText(getBaseContext(), R.string.back_toast_to_main, Toast.LENGTH_SHORT);
            backToast.show();
            backPressedTime = System.currentTimeMillis();
        }
    }
}