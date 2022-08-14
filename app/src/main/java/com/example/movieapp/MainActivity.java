package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView c1, c2, c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1= findViewById(R.id.card1);
        c2= findViewById(R.id.card2);
        c3= findViewById(R.id.card3);

        c1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Mov4.class));
            finish();
        });

        c2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Mov2.class));
            finish();
        });

        c3.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Mov3.class));
            finish();
        });
    }
}