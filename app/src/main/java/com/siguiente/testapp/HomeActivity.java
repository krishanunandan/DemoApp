package com.siguiente.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class HomeActivity extends AppCompatActivity {
    TextView nameTV;
    TextView homePhoneTV;
    TextView mobilePhoneTV;
    TextView emailTV;
    TextView addressTV;
    TextView zipCodeTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameTV = findViewById(R.id.nameTV);
        homePhoneTV = findViewById(R.id.homePhoneTV);
        mobilePhoneTV = findViewById(R.id.homeMobileTV);
        emailTV = findViewById(R.id.emailTV);
        addressTV = findViewById(R.id.addressTV);
        zipCodeTV = findViewById(R.id.zipCodeTV);

        String name = getIntent().getExtras().getString("Name");
        String email = getIntent().getExtras().getString("Email");
        String homePhone = getIntent().getExtras().getString("HomePhone");
        String mobilePhone = getIntent().getExtras().getString("MobilePhone");
        String address = getIntent().getExtras().getString("Address");
        String zipCode = getIntent().getExtras().getString("ZipCode");

        nameTV.setText(""+name);
        homePhoneTV.setText(""+homePhone);
        mobilePhoneTV.setText(""+mobilePhone);
        emailTV.setText(""+email);
        addressTV.setText(""+address);
        zipCodeTV.setText(""+zipCode);






    }
}