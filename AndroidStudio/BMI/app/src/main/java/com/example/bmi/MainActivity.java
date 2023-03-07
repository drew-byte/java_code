package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Calculate(View v)
    {


            EditText et1 = (EditText)findViewById(R.id.editTextNumber);
            EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
            TextView et3 = (TextView) findViewById(R.id.textView3);
            TextView et4 = (TextView) findViewById(R.id.textView4);

            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());
            int result = n2/(n1*n1);
            String display = " ";
            if(result>18.5)
            {
                display = "Underweight";
            }
            else if(result>=18.5 && result<25)
            {
                display = "Healthy Weight";
            }
            else if(result>=25 && result<30)
            {
                display = "Overweight";
            }
            else
            {
                display = "Obese";
            }
            et3.setText(result);
            et4.setText(display);




    }
}