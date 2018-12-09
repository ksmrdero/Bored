package com.example.android.bored;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(generateString());

            }
        });
    }

    private String generateString() {
        String[] array = {"Try a food you don't like", "Learn to greet someone in a new language",
                "Paint the first thing you see", "Listen to your favorite album", "Take your dog on a walk",
                    "Catch up on world news", "Go to a local thrift shop", "Start a collection",
                    "Start a daily journal", "Rearrange and organize your room", "Memorize the fifty states and their capitals",
                    "Make a scrapbook", "Do something nice for someone you care about", "Learn origami",
                    "Donate to a charity", "Bake something new", "Volunteer at a senior center", "Take a class at your local community center",
                    "Donate blood", "Learn a new instrument", "Buy a new house decoration", "Volunteer at your local food shelter"};
        Random random = new Random();
        int index = random.nextInt(array.length);
        return(array[index]);
    }


}
