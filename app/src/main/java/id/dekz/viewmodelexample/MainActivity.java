package id.dekz.viewmodelexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);

        chronometer.start();
    }
}
