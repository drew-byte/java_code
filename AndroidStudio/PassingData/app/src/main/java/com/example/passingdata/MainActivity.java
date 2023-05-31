package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        Intent myIntent = new Intent(MainActivity.this,SecondScreen.class);
        myIntent.putExtra("myKey" , editText.getText().toString());
        startActivity(myIntent);
    }

}