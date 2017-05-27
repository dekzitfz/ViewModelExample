package id.dekz.viewmodelexample;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.os.SystemClock;
import android.os.Bundle;
import android.util.Log;
import android.widget.Chronometer;

public class MainActivity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init ViewModel
        TimerViewModel viewModel = ViewModelProviders.of(this)
                .get(TimerViewModel.class);

        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);

        if(viewModel.getStart() == null){
            // jika start pada viewmodel belum diset,
            // itu viewmodel baru, set dulu dengan waktu sekarang
            Long start = SystemClock.elapsedRealtime();
            viewModel.setStart(start);
            chronometer.setBase(start);
        }else{
            //jika start menyimpan value, set ke chronometer
            Log.d("start",""+viewModel.getStart());
            chronometer.setBase(viewModel.getStart());
        }

        chronometer.start();
    }
}
