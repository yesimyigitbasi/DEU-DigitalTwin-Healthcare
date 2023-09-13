package com.as.healthcaredeu;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.jjoe64.graphview.GraphView;

import java.util.ArrayList;

public class GraphActivity extends AppCompatActivity {
    ImageView statisticsButton;
    ImageView notificationButton;
    ImageView settingsButton;

    LineChart weightGraph;
    BarChart stepsBar;


    BarDataSet weightGraphDataSet,stepsGraphDataSet;
    String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        statisticsButton = findViewById(R.id.statisticsButton);
        notificationButton = findViewById(R.id.notificationButton);
        settingsButton = findViewById(R.id.settingsButton);
        weightGraph = findViewById(R.id.weightGraph);
        stepsBar = findViewById(R.id.StepBarChart);




        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1, 60));
        entries.add(new Entry(2, 61));
        entries.add(new Entry(3, 62));
        entries.add(new Entry(4, 63));
        entries.add(new Entry(5, 64));


        LineDataSet dataSet = new LineDataSet(entries, "Weight Data");
        dataSet.setLineWidth(2f);
        dataSet.setValueTextSize(12f);
        dataSet.setColor(Color.BLACK);


        XAxis xAxis = weightGraph.getXAxis();




        LineData lineData = new LineData(dataSet);
        weightGraph.setData(lineData);
        weightGraph.invalidate();



        ArrayList<BarEntry> entriesStep = new ArrayList<>();
        entriesStep.add(new BarEntry(1, 5000));
        entriesStep.add(new BarEntry(2, 7500));
        entriesStep.add(new BarEntry(3, 6000));
        entriesStep.add(new BarEntry(4, 8000));
        entriesStep.add(new BarEntry(5, 7000));

        BarDataSet dataSet2 = new BarDataSet(entriesStep, "Step Data");
        dataSet2.setColor(Color.BLACK);



        BarData barData = new BarData(dataSet2);
        stepsBar.setData(barData);
        stepsBar.invalidate();

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
}
