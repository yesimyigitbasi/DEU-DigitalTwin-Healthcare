package com.as.healthcaredeu;

import org.json.JSONObject;
import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class GraphActivity extends AppCompatActivity implements SensorEventListener{

    private static String getUserInfoUrl = "http://20.62.111.133:80/api/get_user_info";
    private static String getbmiUrl = "http://20.62.111.133:80/api/bmi";
    private static String getWeightUrl = "http://20.62.111.133:80/api/get_weight";

    int stepCount = 0;
    int targetStepCount = 0; // Declare it at the class level
    ImageView statisticsButton;
    ImageView notificationButton;
    ImageView settingsButton;

    LineChart weightGraph;
    BarChart stepsBar;
    TextView displayWeight;
    TextView displayName;

    TextView stepCounter;
    SensorManager sensorManager;
    Sensor mStepCounter;
    boolean isCounterSensorPresent;
    TextView bmi;

    private LineChart lineChart;
    private RequestQueue requestQueue;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        statisticsButton = findViewById(R.id.statisticsButton);
        notificationButton = findViewById(R.id.notificationButton);
        settingsButton = findViewById(R.id.settingsButton);
        bmi = findViewById(R.id.textViewBmi);
        displayWeight = findViewById(R.id.textViewWeight);

        // Retrieve the username from SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        displayName = findViewById(R.id.textViewName);
        displayName.setText("Welcome, " + username);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        stepCounter = findViewById(R.id.currentStepCount);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        // Start the StepResetService when your app starts
        Intent serviceIntent = new Intent(this, StepResetService.class);
        startService(serviceIntent);

        fetchUserInfo(username);

        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER) != null) {
            mStepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
            isCounterSensorPresent = true;
        } else {
            stepCounter.setText("Step Sensor is not present");
            isCounterSensorPresent = false;
        }

        getWeight(username);
        bmiCalc(username);

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GraphActivity.this,GraphActivity.class);
                startActivity(intent);
            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GraphActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });


        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GraphActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor == mStepCounter) {
            stepCount = (int) sensorEvent.values[0];
            stepCounter.setText(String.valueOf(stepCount));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onResume() {
        super.onResume();
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null){
            sensorManager.registerListener(this, mStepCounter, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }
    @Override
    public void onPause() {
        super.onPause();
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null){
            sensorManager.unregisterListener(this, mStepCounter);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    private void fetchUserInfo(final String username) {
        JSONObject requestData = new JSONObject();
        try {
            requestData.put("username", username);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MyVolleyRequest.postRequest(getApplicationContext(), getUserInfoUrl, requestData, new MyVolleyRequest.VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                try {
                    JSONObject response = new JSONObject(result);
                    //String targetWeight = response.getString("targetweight");
                    String targetSteps = response.getString("targetsteps");

                    targetStepCount = Integer.parseInt(targetSteps);
                    float progress = (float) stepCount / targetStepCount;
                    CircularProgressBar circularProgressBar = findViewById(R.id.progress_circular);

                    // Set the progress to the CircularProgressBar
                    circularProgressBar.setProgress(progress * 100); // Progress should be in the range 0-100

                    //TextView targetWeightTextView = findViewById(R.id.weightGoal);
                    TextView targetStepsTextView = findViewById(R.id.stepCountGoal);

                    //targetWeightTextView.setText(targetWeight + " kg");
                    targetStepsTextView.setText(targetSteps + " steps");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onError(String error) {
                // Handle error when fetching user information
                Toast.makeText(GraphActivity.this, "Error fetching user information", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void bmiCalc(String username){
        JSONObject requestData = new JSONObject();
        try {
            requestData.put("username", username);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MyVolleyRequest.postRequest(getApplicationContext(), getbmiUrl, requestData, new MyVolleyRequest.VolleyCallback() {
            @Override
            public void onSuccess(String result)  {

                try {
                    JSONObject response = new JSONObject(result);
                    String bmitext = response.getString("message");

                    bmi.setText(bmitext);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onError(String error) {
                // Handle error when fetching user information
                bmi.setText("null");
            }
        });

    }

    private void getWeight(String username){
        JSONObject requestData = new JSONObject();
        try {
            requestData.put("username", username);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MyVolleyRequest.postRequest(getApplicationContext(), getWeightUrl, requestData, new MyVolleyRequest.VolleyCallback() {
            @Override
            public void onSuccess(String result)  {

                try {
                    JSONObject response = new JSONObject(result);
                    String weighttext = response.getString("message");
                   // weighttext = weighttext.replace(("\"", "\\\\\"");
                    displayWeight.setText(weighttext);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onError(String error) {
                // Handle error when fetching user information
                displayWeight.setText("null");
            }
        });

    }
    class Veri {
        private String anahtar1;
        private String anahtar2;

        // Getter ve Setter metodları
    }
}


