package com.deinvesa.taxi.taxiya;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Index extends AppCompatActivity {
    // Set the duration of the splash screen
    private static final long SPLASH_SCREEN_DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        //TIPO DE FUENTE
        String carpetaFuente = "fonts/Moonlight.ttf";

        TextView vistaFuente = (TextView) findViewById(R.id.textView2);

        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

        if (vistaFuente != null) {
            vistaFuente.setTypeface(fuente);
        }

        /*TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Start the next activity
                Intent mainIntent = new Intent().setClass(
                        Index.this, Logueo_App.class);
                startActivity(mainIntent);

                // Close the activity so the user won't able to go back this
                // activity pressing Back button
                finish();
            }
        };

        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);*/
    }
}
