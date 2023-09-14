package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class DeleteAccActivity  extends AppCompatActivity {

    String url = "http://20.62.111.133:80/api/deleteacc";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONObject requestData = new JSONObject();
        try {
            requestData.put("username",usernameOfAccount);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        MyVolleyRequest.postRequest(getApplicationContext(), url, requestData, new MyVolleyRequest.VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                Intent intent = new Intent(DeleteAccActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(String error) {


            }
        });
    }
}
