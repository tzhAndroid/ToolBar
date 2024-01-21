package com.talentprogramming.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText edittextResult;
    Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edittextResult = findViewById(R.id.edittextName);
        btnBack = findViewById(R.id.buttonBack);

        btnBack.setOnClickListener(view -> {
            Intent i = new Intent(SecondActivity.this,FirstActivity.class);
            i.putExtra("name",edittextResult.getText().toString());
            setResult(RESULT_OK,i);
            finish();
        });



    }
}