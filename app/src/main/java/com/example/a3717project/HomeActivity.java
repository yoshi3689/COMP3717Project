package com.example.a3717project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button enterTrip = findViewById(R.id.btnTrip);
        enterTrip.setOnClickListener( view -> {
            Intent enterTripIntent = new Intent(this, EnterTripTypeActivity.class);
            startActivity(enterTripIntent);
        });

        Button viewTrip = findViewById(R.id.btnOthers);
        viewTrip.setOnClickListener( view -> {
            Intent viewTripIntent = new Intent(this, ViewerActivity.class);
            startActivity(viewTripIntent);
        });
    }
}