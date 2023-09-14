package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class SettingsActivity extends AppCompatActivity {

    TextView displayUsername;
    TextView displayPassword;
    TextView displayAge;
    TextView displayHeight;
    TextView displayGender;
    TextView displayTargetWeight;
    TextView displayTargetStep;
    ImageView statisticsButton;
    ImageView notificationButton;
    ImageView settingsButton;
    ImageView accInfo;
    ImageView persInfo;
    ImageView goals;
    Button signOut;
    Button deleteAcc;
    String url = "http://20.62.111.133:80/api/deleteacc";



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        displayUsername = findViewById(R.id.textViewUsername);
        displayPassword = findViewById(R.id.textViewEmail);
        displayAge = findViewById(R.id.textViewAge);
        displayHeight = findViewById(R.id.textViewHeight);
        displayGender = findViewById(R.id.textViewGender);
        displayTargetStep = findViewById(R.id.textViewTargetStep);
        displayTargetWeight = findViewById(R.id.textViewTargetWeight);

        accInfo = findViewById(R.id.editaccButton);
        persInfo = findViewById(R.id.editpersonButton);
        goals = findViewById(R.id.editgoalButton);
        signOut = findViewById(R.id.signOutBtn);
        deleteAcc = findViewById(R.id.deleteAccBtn);

        statisticsButton = findViewById(R.id.statisticsButton2);
        notificationButton = findViewById(R.id.notificationButton2);
        settingsButton = findViewById(R.id.settingsButton2);
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
        goals.setOnClickListener(new View.OnClickListener() {
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
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SettingsActivity.this);
                alertDialogBuilder.setTitle("IMPORTANT!");
                alertDialogBuilder.setMessage("Are you sure you want to delete your account?");
                alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                        JSONObject requestData = new JSONObject();
                        try {
                            requestData.put("username",usernameOfAccount);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }

                        MyVolleyRequest.postRequest(getApplicationContext(), url, requestData, new MyVolleyRequest.VolleyCallback() {
                            @Override
                            public void onSuccess(String result) {
                                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                                startActivity(intent);
                            }

                            @Override
                            public void onError(String error) {


                            }
                        });
                        dialog.dismiss();
                    }
                });

                alertDialogBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // You can add code here to handle the Cancel button click
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, GraphActivity.class);
                startActivity(intent);
            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
