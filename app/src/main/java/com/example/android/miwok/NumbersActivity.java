package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Adding TextView for each entry in words
        for(int i = 0; i < words.size(); i++)
        {
            //Creating TextView
            TextView wordView = new TextView(this);
            //Setting text to be an entry in words
            wordView.setText(words.get(i));
            //Adding that view to the rootView
            rootView.addView(wordView);
        }

    }
}
