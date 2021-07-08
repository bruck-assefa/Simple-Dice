package com.example.simpledice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class RollActivity extends AppCompatActivity {

    Spinner s1, s2;
    Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_rolls);


        final List<Integer> sidesList =  new ArrayList<>();
        sidesList.add(2);
        sidesList.add(4);
        sidesList.add(6);
        sidesList.add(8);
        sidesList.add(10);
        sidesList.add(12);
        sidesList.add(20);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, sidesList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sidesItems = findViewById(R.id.sideSpinner);
        sidesItems.setAdapter(adapter);

        final List<Integer> countList =  new ArrayList<>();
        countList.add(1);
        countList.add(2);
        countList.add(3);
        countList.add(4);
        countList.add(5);
        countList.add(6);

        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, countList);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner countItems = findViewById(R.id.countSpinner);
        countItems.setAdapter(adapter2);


        roll = findViewById(R.id.rollButton);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displayIntent = new Intent(RollActivity.this, DisplayActivity.class);
                displayIntent.putExtra("side", sidesList.get(sidesItems.getSelectedItemPosition()));
                displayIntent.putExtra("count", countList.get(countItems.getSelectedItemPosition()));
                startActivity(displayIntent);
            }
        });

    }
}
