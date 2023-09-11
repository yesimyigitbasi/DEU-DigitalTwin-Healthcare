package com.as.healthcaredeu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    Button accInfo;
    Button persInfo;
    Button goals;
    Button signOut;
    Button deleteAcc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        accInfo = findViewById(R.id.accInfoEdit);
        persInfo = findViewById(R.id.personalInfoEdit);
        goals = findViewById(R.id.goalsEdit);
        signOut = findViewById(R.id.signOutBtn);
        deleteAcc = findViewById(R.id.deleteAccBtn);
        accInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, EditAccInfoActivity.class);
                startActivity(intent);
            }
        });
        persInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, EditPersonalInfoActivity.class);
                startActivity(intent);
            }
        });
        persInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, EditGoalsActivity.class);
                startActivity(intent);
            }
        });
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, SignOutActivity.class);
                startActivity(intent);
            }
        });
        deleteAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, DeleteAccActivity.class);
                startActivity(intent);
            }
        });
    }
}
