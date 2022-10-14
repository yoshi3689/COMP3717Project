package com.example.a3717project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EnterTripTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_trip_type);
        Button findFlight = findViewById(R.id.btnFlight);
        findFlight.setOnClickListener( view -> {
            Intent findFlightIntent = new Intent(this, FindFlightActivity.class);
            startActivity(findFlightIntent);
        });
    }
}