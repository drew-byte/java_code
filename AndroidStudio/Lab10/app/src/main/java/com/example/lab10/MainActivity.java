package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText editText,editText2,editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        Intent myIntent = new Intent(MainActivity.this,SecondScreen.class);
        myIntent.putExtra("myKey" , editText.getText().toString());
        myIntent.putExtra("myKey1" , editText2.getText().toString());
        myIntent.putExtra("myKey2" , editText3.getText().toString());
        myIntent.putExtra("myKey3" , editText4.getText().toString());
        startActivity(myIntent);
    }

}