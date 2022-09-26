package com.magers.hw3ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlum = (Button) findViewById(R.id.buttonPlum);
        buttonPlum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv_1 = findViewById(R.id.tv_1);
                tv_1.setVisibility(View.VISIBLE);

                TextView tv_2 = findViewById(R.id.tv_2);
                tv_2.setVisibility(View.INVISIBLE);

                TextView tv_3 = findViewById(R.id.tv_3);
                tv_3.setVisibility(View.INVISIBLE);
            }
        });
        Button buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv_2 = findViewById(R.id.tv_2);
                tv_2.setVisibility(View.VISIBLE);

                TextView tv_1 = findViewById(R.id.tv_1);
                tv_1.setVisibility(View.INVISIBLE);

                TextView tv_3 = findViewById(R.id.tv_3);
                tv_3.setVisibility(View.INVISIBLE);
            }
        });
        Button buttonGold = (Button) findViewById(R.id.buttonGold);
        buttonGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv_3 = findViewById(R.id.tv_3);
                tv_3.setVisibility(View.VISIBLE);

                TextView tv_1 = findViewById(R.id.tv_1);
                tv_1.setVisibility(View.INVISIBLE);

                TextView tv_2 = findViewById(R.id.tv_2);
                tv_2.setVisibility(View.INVISIBLE);
            }
        });
    }
}