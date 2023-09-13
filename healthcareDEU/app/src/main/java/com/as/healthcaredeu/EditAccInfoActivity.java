package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class EditAccInfoActivity extends AppCompatActivity {
    EditText editName;
    EditText editEmail;
    EditText editPassword;
    Button save;
    Button cancel;
    private static String url = "http://20.62.111.133:80/api/editaccinfo";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_acc_info);
        editName = findViewById(R.id.editTextName);
        editEmail = findViewById(R.id.editTextEmail);
        editPassword = findViewById(R.id.editTextPassword);
        save = findViewById(R.id.accInfoSave);
        cancel = findViewById(R.id.accInfoCancel);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newAccUsername = (editName.getText().toString());
                String newAccEmail = (editEmail.getText().toString());
                String newAccPassword = (editPassword.getText().toString());

                JSONObject requestData = new JSONObject();
                try {
                    requestData.put("username",usernameOfAccount);
                    requestData.put("name", newAccUsername);
                    requestData.put("password", newAccPassword);
                    requestData.put("email",newAccEmail);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                MyVolleyRequest.postRequest(getApplicationContext(), url, requestData, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                       // Intent intent = new Intent(EditAccInfoActivity.this,SettingsActivity.class);
                       // startActivity(intent);
                    }

                    @Override
                    public void onError(String error) {
                        editName.getText().clear();
                        editEmail.getText().clear();
                        editPassword.getText().clear();

                    }
                });

            }
        });


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditAccInfoActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

}
