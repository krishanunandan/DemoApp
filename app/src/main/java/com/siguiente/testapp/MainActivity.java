package com.siguiente.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText nameET;
    TextInputEditText homePhoneET;
    TextInputEditText mobilePhoneET;
    TextInputEditText emailET;
    TextInputEditText addressET;
    TextInputEditText zipCodeET;
    Button submitAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        homePhoneET = findViewById(R.id.homePhoneET);
        mobilePhoneET = findViewById(R.id.mobilePhoneET);
        emailET = findViewById(R.id.emailET);
        addressET = findViewById(R.id.addressET);
        zipCodeET = findViewById(R.id.zipCodeET);
        submitAction = findViewById(R.id.submitButton);


        submitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = nameET.getText().toString();
                String email = emailET.getText().toString();
                String homePhone = homePhoneET.getText().toString();
                String mobilePhone = mobilePhoneET.getText().toString();
                String address = addressET.getText().toString();
                String zipCode = zipCodeET.getText().toString();

                boolean isError = false;

                if (name.isEmpty()) {
                    isError = true;
                    nameET.setError("Name is Required");
                }

                if (email.isEmpty()) {
                    isError = true;
                    emailET.setError("Email is Required");
                }
                if (homePhone.isEmpty()) {
                    isError = true;
                    homePhoneET.setError("Home Phone is Required");
                }


                if (homePhone.equals(mobilePhone)) {
                    isError = true;
                    mobilePhoneET.setError("Phone number should be differ");
                }

                if (!isError) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email", email);
                    intent.putExtra("HomePhone", homePhone);
                    intent.putExtra("MobilePhone", mobilePhone);
                    intent.putExtra("Address", address);
                    intent.putExtra("ZipCode", zipCode);
                    startActivity(intent);
                }

            }
        });

    }

    public void validateField() {

    }
}