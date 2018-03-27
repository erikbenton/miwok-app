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

        TextView wordView1  = new TextView(this);
        TextView wordView2  = new TextView(this);
        TextView wordView3  = new TextView(this);
        TextView wordView4  = new TextView(this);
        TextView wordView5  = new TextView(this);
        TextView wordView6  = new TextView(this);
        TextView wordView7  = new TextView(this);
        TextView wordView8  = new TextView(this);
        TextView wordView9  = new TextView(this);
        TextView wordView10 = new TextView(this);

        wordView1.setText(words.get(0));
        wordView2.setText(words.get(1));
        wordView3.setText(words.get(2));
        wordView4.setText(words.get(3));
        wordView5.setText(words.get(4));
        wordView6.setText(words.get(5));
        wordView7.setText(words.get(6));
        wordView8.setText(words.get(7));
        wordView9.setText(words.get(8));
        wordView10.setText(words.get(9));

        rootView.addView(wordView1);
        rootView.addView(wordView2);
        rootView.addView(wordView3);
        rootView.addView(wordView4);
        rootView.addView(wordView5);
        rootView.addView(wordView6);
        rootView.addView(wordView7);
        rootView.addView(wordView8);
        rootView.addView(wordView9);
        rootView.addView(wordView10);
    }
}
