package com.example.simpledice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    int side = 0;
    int count = 0;

    LinearLayout ll;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_rolls);

        ll = findViewById(R.id.displayLayout);



        Intent mIntent = getIntent();
        side = mIntent.getIntExtra("side", 0);
        count = mIntent.getIntExtra("count", 0);


        Dice d = new Dice(side, count);
        int rolls[] = d.allRolls();


        for (int i = 0; i < rolls.length; i++) {
            TextView textView = new TextView(this);
            textView.setText("Dice " + (i+1) + ": " + String.valueOf(rolls[i]));
            ll.addView(textView);
        }
        TextView textView = new TextView(this);
        textView.setText("Sum: " + d.sum());
        ll.addView(textView);

        back = new Button(this);
        back.setText("Roll Again");
        ll.addView(back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displayIntent = new Intent(DisplayActivity.this, RollActivity.class);
                startActivity(displayIntent);
            }
        });






    }
}
