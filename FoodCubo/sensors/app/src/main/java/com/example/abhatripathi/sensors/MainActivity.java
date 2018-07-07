package com.example.abhatripathi.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> allSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        Log.e("TAG","Number of sensors: " + allSensors.size());
        for(Sensor s : allSensors){
            Log.e("TAG","onCreate : ------------");
            Log.e("TAG","onCreate : "+ s.getName());
            Log.e("TAG","onCreate : "+ s.getVendor());
            Log.e("TAG","onCreate : "+ s.getVersion());
            Log.e("TAG","onCreate : "+ s.getMaximumRange());
        }
    }
}
