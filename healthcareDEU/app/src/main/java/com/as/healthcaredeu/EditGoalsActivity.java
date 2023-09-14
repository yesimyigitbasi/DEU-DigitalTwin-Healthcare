package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class EditGoalsActivity extends AppCompatActivity {
    String url = "http://20.62.111.133:80/api/edittargetinfo";
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
        weightGoal = findViewById(R.id.editTextWeight);
        stepCountGoal = findViewById(R.id.editTextStepCount);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String newWeigthGoal = (weightGoal.getText().toString());
                String newStepCountGoal = (stepCountGoal.getText().toString());

                JSONObject requestData = new JSONObject();
                try {
                    requestData.put("username",usernameOfAccount);
                    requestData.put("targetweight", newWeigthGoal);
                    requestData.put("targetsteps", newStepCountGoal);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                MyVolleyRequest.postRequest(getApplicationContext(), url, requestData, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                         Intent intent = new Intent(EditGoalsActivity.this,SettingsActivity.class);
                         startActivity(intent);
                    }

                    @Override
                    public void onError(String error) {
                        weightGoal.getText().clear();
                        stepCountGoal.getText().clear();

                    }
                });
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
