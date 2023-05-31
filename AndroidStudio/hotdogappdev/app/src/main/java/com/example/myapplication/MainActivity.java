package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final Character[] one = {'a', 'j', 's'},
            two = {'b', 'k', 't'},
            three = {'c', 'l', 'u'},
            four = {'d', 'm', 'v'},
           five = {'e', 'n', 'w'},
           six = {'f', 'o', 'x'},
           seven = {'g', 'p', 'y'},
           eight = {'h', 'q', 'z'},
           nine = {'i', 'r'};

    Button button;
    EditText myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        myText = findViewById(R.id.editTextPersonName);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(MainActivity.this, SecondScreen.class);

        String oldText = myText.getText().toString().toLowerCase();
        String newText = discoverPersonality(calculateName(oldText.chars().mapToObj(c -> (char)c).toArray(Character[]::new)));

        myIntent.putExtra("myKey", newText);
        startActivity(myIntent);
    }

    public int calculateName(Character[] nameInChar) {
        int ctr = 0;
        for (Character c : nameInChar) {
            if (inArray(c, one)){
                ctr += 1;
            } else if (inArray(c, two)) {
                ctr += 2;
            } else if (inArray(c, three)) {
                ctr += 3;
            } else if (inArray(c, four)) {
                ctr += 4;
            } else if (inArray(c, five)) {
                ctr += 5;
            } else if (inArray(c, six)) {
                ctr += 6;
            } else if (inArray(c, seven)) {
                ctr += 7;
            } else if (inArray(c, eight)) {
                ctr += 8;
            } else if (inArray(c, nine)) {
                ctr += 9;
            } else {
                ctr += 0;
            }
        }
        return ctr;
    }

    public boolean inArray(Character n, Character[] letters) {
        for (Character letter : letters) {
            if (n.equals(letter)) {
                return true;
            }
        }
        return false;
    }

    public String discoverPersonality(int ctr) {
        String[] numerologyMeanings = {
                "Initiator of action, pioneering, leading, independent, attaining, individualistic",
                "Cooperation, adaptability, consideration of others, partnering, mediating",
                "Expression, verbalization, socialization, the arts, the joy of living",
                "Values foundation, order, service, struggle against limits, steady growth",
                "Expansiveness, visionary, adventure, the constructive use of freedom",
                "Responsibility, protection, nurturing, community, balance, sympathy",
                "Analysis, understanding, knowledge, awareness, studious, meditating",
                "Practical endeavors, status-oriented, power-seeking, high-material goals",
                "Humanitarian, giving nature, selflessness, obligations, creative expression",
                "Higher spiritual plane, intuitive, illumination, idealist, a dreamer",
                "The Master Builder, large endeavors, powerful force, leadership"
        };

        if (ctr == 11) {
            return numerologyMeanings[9];
        } else if (ctr == 22 || ctr == 33) {
            return numerologyMeanings[10];
        }

        int n = 0;
        String numStr = Integer.toString(ctr);
        for(int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            n += digit;
        }
        System.out.println("Sum of digits of " + ctr + " is " + n);

       if(n == 1){
            return numerologyMeanings[0];
        } else if (n == 2) {
            return numerologyMeanings[1];
        } else if (n == 3) {
            return numerologyMeanings[2];
        } else if (n == 4) {
            return numerologyMeanings[3];
        } else if (n == 5) {
            return numerologyMeanings[4];
        } else if (n == 6) {
            return numerologyMeanings[5];
        } else if (n == 7) {
            return numerologyMeanings[6];
        } else if (n == 8) {
            return numerologyMeanings[7];
        } else if (n == 9) {
            return numerologyMeanings[8];
        }
        return "failed";
    }
}