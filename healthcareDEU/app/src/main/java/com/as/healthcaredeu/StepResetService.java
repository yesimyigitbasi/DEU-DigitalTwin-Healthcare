package com.as.healthcaredeu;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.preference.PreferenceManager;
import androidx.annotation.Nullable;

public class StepResetService extends Service {
    private SensorManager sensorManager;
    private Sensor mStepCounter;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER) != null) {
            mStepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
            sensorManager.registerListener(sensorEventListener, mStepCounter, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    private final SensorEventListener sensorEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            // Handle sensor events (increment step count, update UI, etc.)
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        sensorManager.unregisterListener(sensorEventListener, mStepCounter);
    }

    // Add logic here to reset step count at midnight using SharedPreferences
    private void resetStepCountIfNeeded() {
        // Get the current date and time
        // Compare with the last reset date stored in SharedPreferences
        // If it's a new day (midnight), reset the step count and update SharedPreferences
    }
}
