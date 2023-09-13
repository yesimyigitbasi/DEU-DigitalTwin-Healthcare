package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class EditPersonalInfoActivity extends AppCompatActivity {
    String editpersinfoUrl = "http://20.62.111.133:80/api/editpersinfo";

    EditText editAge;
    EditText editHeight;
    Spinner genderDropdown;
    Button save;
    Button cancel;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_personal_info);
        editAge = findViewById(R.id.editTextAge);
        editHeight = findViewById(R.id.editTextHeight);
        Spinner genderDropdown = findViewById(R.id.spinnerGender);
        String[] items = new String[]{"Female", "Male", "Prefer not to say"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        genderDropdown.setAdapter(adapter);
        save = findViewById(R.id.saveBtn);
        cancel = findViewById(R.id.cancelBtn);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age = editAge.getText().toString();
                String height = editHeight.getText().toString();
                String gender = genderDropdown.getSelectedItem().toString();


                JSONObject requestData = new JSONObject();
                try {
                    requestData.put("username",usernameOfAccount);
                    requestData.put("age", age);
                    requestData.put("height", height);
                    requestData.put("gender",gender);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }


                MyVolleyRequest.postRequest(getApplicationContext(), editpersinfoUrl, requestData, new MyVolleyRequest.VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                        // Handle successful login, e.g., store user session or navigate to HomeScreenActivity
                        Intent intent = new Intent(EditPersonalInfoActivity.this, SettingsActivity.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onError(String error) {
                        // Handle login error, e.g., show an error message to the user
                    }
                });
            }


        });


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditPersonalInfoActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
