package com.as.healthcaredeu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditAccInfoActivity extends AppCompatActivity {
    EditText editUsername;
    EditText editEmail;
    EditText editPassword;
    Button save;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_acc_info);
        editUsername = findViewById(R.id.editTextUsername);
        editEmail = findViewById(R.id.editTextEmail);
        editPassword = findViewById(R.id.editTextPassword);
        save = findViewById(R.id.accInfoSave);
        cancel = findViewById(R.id.accInfoCancel);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newAccUsername = (editUsername.getText().toString());
                String newAccEmail = (editEmail.getText().toString());
                String newAccPassword = (editPassword.getText().toString());
            }
        });
    }

}
