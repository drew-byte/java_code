package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class SecondScreen extends  AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        textView = findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().getString("myKey"));
    }
}
