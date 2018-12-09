package com.example.android.bored;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    Button click2;
    public static TextView data;
    public static TextView data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.button);
        data = (TextView) findViewById(R.id.fetcheddata);



        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView title = (TextView) findViewById(R.id.textView);
                title.setVisibility((title.getVisibility() == View.INVISIBLE)
                        ? View.INVISIBLE : View.INVISIBLE);
                fetchData process = new fetchData();
                process.execute();
            }
        });

        click2 = (Button) findViewById(R.id.button2);
        data2 = (TextView) findViewById(R.id.fetchedfriends);

        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView title = (TextView) findViewById(R.id.textView);
                title.setVisibility((title.getVisibility() == View.INVISIBLE)
                        ? View.INVISIBLE : View.INVISIBLE);
                fetchFriends process = new fetchFriends();
                process.execute();
            }
        });
    }
}
