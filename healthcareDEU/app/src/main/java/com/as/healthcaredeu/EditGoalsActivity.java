package com.as.healthcaredeu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditGoalsActivity extends AppCompatActivity {
    EditText weightGoal;
    EditText stepCountGoal;
    Button save;
    Button cancel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_goals);
        save = findViewById(R.id.goalsSaveButton);
        cancel = findViewById(R.id.goalsCancelButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newWeightGoal = weightGoal.getText().toString();
                String newStepCountGoal = stepCountGoal.getText().toString();

                //Yeni verileri alip apiden database'e transfer islemleri
            }

        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditGoalsActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
