package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Mov2 extends AppCompatActivity {

    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mov2);

        b2= findViewById(R.id.button2);

        b2.setOnClickListener(view -> {
            startActivity(new Intent(Mov2.this, MainActivity.class));
            finish();
        });
    }
}