package com.as.healthcaredeu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class SettingsActivity extends AppCompatActivity {

    private static String getEmailUrl = "http://20.62.111.133:80/api/get_email"; // Update with your API endpoint


    TextView displayName;
    TextView displayUsername;
    TextView displayEmail;
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


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        displayName = findViewById(R.id.textViewName);
        displayName.setText("Welcome, " + username);

        // Fetch the email corresponding to the username
        fetchEmail(username);

        displayUsername = findViewById(R.id.textViewUsername);
        displayUsername.setText(username);

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
                Intent intent = new Intent(SettingsActivity.this, DeleteAccActivity.class);
                startActivity(intent);
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

    private void fetchEmail(final String username) {
        JSONObject requestData = new JSONObject();
        try {
            requestData.put("username", username);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MyVolleyRequest.postRequest(getApplicationContext(), getEmailUrl, requestData, new MyVolleyRequest.VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                try {
                    JSONObject response = new JSONObject(result);
                    String email = response.getString("email");

                    // Display the email on the "Settings" page
                    TextView emailTextView = findViewById(R.id.textViewEmail);
                    emailTextView.setText("Email: " + email);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(String error) {
                // Handle error when fetching email
                Toast.makeText(SettingsActivity.this, "Error fetching email", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
