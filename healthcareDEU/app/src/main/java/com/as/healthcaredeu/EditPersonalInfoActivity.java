package com.as.healthcaredeu;

import static com.as.healthcaredeu.loginActivity.usernameOfAccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class EditPersonalInfoActivity extends AppCompatActivity {
    EditText editAge;

    Spinner genderDropdown;
    Button save;
    Button cancel;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_personal_info);
        editAge = findViewById(R.id.editTextAge);
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
               // String height =

/*                JSONObject requestData = new JSONObject();
                try {
                    requestData.put("username",usernameOfAccount);
                    requestData.put("name", newAccUsername);
                    requestData.put("password", newAccPassword);
                    requestData.put("email",newAccEmail);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }*/
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
