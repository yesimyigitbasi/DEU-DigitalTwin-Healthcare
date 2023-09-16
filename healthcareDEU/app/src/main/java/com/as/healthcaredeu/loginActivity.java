package com.as.healthcaredeu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import org.json.JSONException;
import org.json.JSONObject;

public class loginActivity extends AppCompatActivity {
    private static String loginUrl = "http://20.62.111.133:80/api/login";
    public static String usernameOfAccount;
    Button loginButton;
    EditText usernameText;
    EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        loginButton = findViewById(R.id.signInButton);
        usernameText = findViewById(R.id.usernameLogin);
        passwordText = findViewById(R.id.passwordLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameText.getText().toString();
                String password = passwordText.getText().toString();

                JSONObject loginData = new JSONObject();
                try {
                    loginData.put("username", username);
                    loginData.put("password", password);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

                MyVolleyRequest.postRequest(getApplicationContext(), loginUrl, loginData, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                        // Handle successful login
                        String username = usernameText.getText().toString();

                        // Store the username in SharedPreferences
                        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username", username);
                        editor.apply();

                        Intent intent = new Intent(loginActivity.this, GraphActivity.class);
                        startActivity(intent);
                        usernameOfAccount = usernameText.getText().toString();                    }

                    @Override
                    public void onError(String error) {
                        // Handle login error, e.g., show an error message to the user
                    }
                });
            }
        });
    }
}
