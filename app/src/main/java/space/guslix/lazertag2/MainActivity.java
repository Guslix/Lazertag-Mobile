package space.guslix.lazertag2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast backToast;
    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNewTour = findViewById(R.id.button_new_tour);
        buttonNewTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, TeamsActivity2.class);
                    startActivity(intent);
                    finish();
                } catch(Exception e){
                    //don't fail please
                }
            }
        });

        Button buttonListTour = findViewById(R.id.button_list_tour);
        buttonListTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                    finish();
                } catch(Exception e){
                    //don't fail please
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() <= backPressedTime + 2000){
            backToast.cancel();
            super.onBackPressed();
        } else {
            backToast = Toast.makeText(getBaseContext(), R.string.back_toast_exit, Toast.LENGTH_SHORT);
            backToast.show();
            backPressedTime = System.currentTimeMillis();
        }
    }
}