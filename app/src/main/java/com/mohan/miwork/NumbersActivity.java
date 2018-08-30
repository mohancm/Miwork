package com.mohan.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Add Array of Numbers
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Verify the contents of the ArrayList by printing out each element to the logs to the log
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 0: " + words.get(9));
    }
}
