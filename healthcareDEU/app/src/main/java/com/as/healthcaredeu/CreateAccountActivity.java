package com.as.healthcaredeu;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import org.json.JSONException;
import org.json.JSONObject;


public class CreateAccountActivity extends AppCompatActivity {
    private static String url = "http://20.62.111.133:80/api/createacc";//****Put your  URL here******
    private String POST = "POST";
    private String GET = "GET";
    Button signUp;

    EditText usernameText;


    EditText passwordtext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        signUp = findViewById(R.id.signUp);
        usernameText = findViewById(R.id.usernameText);
        passwordtext = findViewById(R.id.passwordText);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accUsername = (usernameText.getText().toString());

                String accPassword = (passwordtext.getText().toString());


                Account newAccount = new Account(accUsername, accPassword);

                JSONObject requestData = new JSONObject();
                try {
                    requestData.put("username", accUsername);
                    requestData.put("password", accPassword);

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

                MyVolleyRequest.postRequest(getApplicationContext(), url, requestData, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {

                    }

                    @Override
                    public void onError(String error) {

                    }
                });


            }
        });


    }


}









