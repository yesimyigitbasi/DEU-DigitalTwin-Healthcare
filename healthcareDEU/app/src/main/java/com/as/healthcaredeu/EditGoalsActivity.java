package com.as.healthcaredeu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditGoalsActivity extends AppCompatActivity {
    EditText weightGoal;
    EditText stepCountGoal;
    Button save;
    Button cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_goals);
    }
}
