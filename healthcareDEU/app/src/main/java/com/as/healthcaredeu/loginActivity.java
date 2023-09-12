package com.as.healthcaredeu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class loginActivity extends AppCompatActivity {

    EditText usernameLogin;
    EditText passwordLogin;
    Button signInButton;
    private static String url = "http://20.62.111.133:80/api/login";//****Put your  URL here******
    private String POST = "POST";
    private String GET = "GET";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        usernameLogin = findViewById(R.id.usernameLogin);
        passwordLogin = findViewById(R.id.passwordLogin);
        signInButton = findViewById(R.id.signInButton);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accUsername = (usernameLogin.getText().toString());

                String accPassword = (passwordLogin.getText().toString());
                //if(accUsername == "alper" && accPassword == "123"){
                    Intent intent = new Intent(loginActivity.this,GraphActivity.class);
                    startActivity(intent);
               // }
/*                MyVolleyRequest.getRequest(getApplicationContext(), url, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                        // Handle a successful response here
                        // The 'result' parameter contains the response data as a string
                    }

                    @Override
                    public void onError(String error) {
                        // Handle an error here
                        // For example, display an error message to the user
                        Toast.makeText(getApplicationContext(), "Error: " + error, Toast.LENGTH_SHORT).show();
                    }
                });*/




            }
        });

    }
}

