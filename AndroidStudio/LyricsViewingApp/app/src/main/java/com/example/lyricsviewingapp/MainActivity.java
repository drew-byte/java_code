package com.example.lyricsviewingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
                {
                    Intent myIntent = new Intent(MainActivity.this,SecondScreen.class);
                    startActivity(myIntent);
                }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent myIntent2 = new Intent(MainActivity.this,ThirdScreen.class);
                startActivity(myIntent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent myIntent3 = new Intent(MainActivity.this,FourthScreen.class);
                startActivity(myIntent3);
            }
        });

    }



}