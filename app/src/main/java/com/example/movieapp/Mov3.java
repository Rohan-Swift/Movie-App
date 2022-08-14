package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Mov3 extends AppCompatActivity {

    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mov3);

        b3= findViewById(R.id.button3);

        b3.setOnClickListener(view -> {
            startActivity(new Intent(Mov3.this, MainActivity.class));
            finish();
        });
    }
}