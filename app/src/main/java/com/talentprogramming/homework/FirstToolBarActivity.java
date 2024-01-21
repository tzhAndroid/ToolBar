package com.talentprogramming.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FirstToolBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tool_bar);

        Button button = (Button) findViewById(R.id.btnAdd);
        Button emqButton = (Button) findViewById(R.id.btnEnquiry);
        button.setOnClickListener(view -> {
            Intent i = new Intent(FirstToolBarActivity.this, SecondToolBarActivity.class);
            startActivity(i);
        });
        emqButton.setOnClickListener(view -> {
            Intent i = new Intent(FirstToolBarActivity.this, ThirdToolBarActivity.class);
            startActivity(i);
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.tBfirst);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Welcome !!!");

    }
}