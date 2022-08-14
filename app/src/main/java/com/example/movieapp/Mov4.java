package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Mov4 extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mov4);

        b1= findViewById(R.id.button1);

        b1.setOnClickListener(view -> {
            startActivity(new Intent(Mov4.this, MainActivity.class));
            finish();
        });
    }
}