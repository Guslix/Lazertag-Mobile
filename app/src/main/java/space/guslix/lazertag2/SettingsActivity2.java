package space.guslix.lazertag2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);

        Button back = findViewById(R.id.settings_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(SettingsActivity2.this, TeamsActivity2.class);
                    startActivity(i);
                    finish();
                } catch(Exception e) {
                    //milky chance
                }
            }
        });
        Button ok = findViewById(R.id.settings_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(SettingsActivity2.this, TeamsActivity.class);
                    startActivity(i);
                    finish();
                } catch(Exception e){
                    //contest is open!
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent i = new Intent(SettingsActivity2.this, TeamsActivity2.class);
            startActivity(i);
            finish();
        } catch(Exception e){
            //hello world!
        }
    }
}