package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        textOutput = findViewById(R.id.textView);
        textOutput.setText(getIntent().getExtras().getString("myKey"));
    }

}
