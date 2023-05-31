package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity{
    TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);


        textView.setText("Hello, "+getIntent().getExtras().getString("myKey"));
        textView2.setText("Your Email is "+getIntent().getExtras().getString("myKey2"));
        textView3.setText("And your password is "+getIntent().getExtras().getString("myKey3"));

    }
}
