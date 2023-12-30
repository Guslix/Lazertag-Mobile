package space.guslix.lazertag2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TeamsActivity extends AppCompatActivity {
    private Toast backToast;
    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        Button change = findViewById(R.id.change_teams);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, TeamsActivity2.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i wanna sleep
                }
            }
        });
        Button settings = findViewById(R.id.change_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, SettingsActivity2.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //bluewater
                }
            }
        });

        Button to_teams = findViewById(R.id.t_teams);
        to_teams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, TeamsActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_games = findViewById(R.id.t_games);
        to_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, ScheduleActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_standings = findViewById(R.id.t_standings);
        to_standings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, StandingsActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //i like to move it, move it
                }
            }
        });
        Button to_main = findViewById(R.id.t_exit);
        to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity.this, MainActivity.class);
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
                Intent i = new Intent(TeamsActivity.this, MainActivity.class);
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