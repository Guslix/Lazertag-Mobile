package space.guslix.lazertag2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TeamsActivity2 extends AppCompatActivity {
    private Toast backToast;
    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams2);

        Button next = findViewById(R.id.t2_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity2.this, SettingsActivity2.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //QARTOSHQA
                }
            }
        });

        Button cancel = findViewById(R.id.t2_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(TeamsActivity2.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (Exception e){
                    //clbuttic
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() - backPressedTime <= 2000){
            backToast.cancel();
            try {
                Intent i = new Intent(TeamsActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            } catch(Exception e){
                //schnossel
            }
        } else {
            backToast = Toast.makeText(getBaseContext(), R.string.back_toast_cancel, Toast.LENGTH_SHORT);
            backToast.show();
            backPressedTime = System.currentTimeMillis();
        }
    }
}