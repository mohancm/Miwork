package com.mohan.miwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a Clicklistner on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                Toast.makeText(view.getContext(),"open the list of numbers",Toast.LENGTH_SHORT).show();

                // Start new Activity
                startActivity(numbersIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a ClickListner on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                Toast.makeText(view.getContext(),"Open the list of Colors",Toast.LENGTH_SHORT).show();

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        // Set a OnClickListner on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                Toast.makeText(view.getContext(),"Open the List of Family Members",Toast.LENGTH_SHORT).show();

                // Start the FamilyActivity
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set an OnClickListner for that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                Toast.makeText(view.getContext(),"Open the List of Phrases", Toast.LENGTH_SHORT).show();

                // start PhrasesActivity
                startActivity(phrasesIntent);
            }
        });
    }
}
