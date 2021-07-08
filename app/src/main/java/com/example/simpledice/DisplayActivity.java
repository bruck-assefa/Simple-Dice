package com.example.simpledice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    int side = 0;
    int count = 0;

    LinearLayout ll;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_rolls);

        ll = findViewById(R.id.displayLayout);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);



        Intent mIntent = getIntent();
        side = mIntent.getIntExtra("side", 0);
        count = mIntent.getIntExtra("count", 0);

        String s1 = String.valueOf(side);
        String s2 = String.valueOf(count);
        

/*        t1.setText(String.valueOf(side));
        t2.setText(String.valueOf(count));*/

        //Adding 2 TextViews
/*        for (int i = 1; i <= 2; i++) {
            TextView textView = new TextView(this);
            textView.setText("TextView " + String.valueOf(i));
            ll.addView(textView);
        }*/





    }
}
