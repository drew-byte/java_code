package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText1);
        textView = (TextView)findViewById(R.id.myTextView1);

        button.setOnClickListener(this);
    }
    public void onClick(View i)
    {
        if(i.getId() == R.id.button)
        {
            String textInEdit = editText.getText().toString();
            textView.setText(textInEdit);
        }
    }

}