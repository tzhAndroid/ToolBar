package com.talentprogramming.homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView tvName;
    Button btnSubmit;
    final int REQUEST_CODE = 1001;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        tvName = findViewById(R.id.textView1);
        tvName.setText("TextView");
        btnSubmit = findViewById(R.id.nextBtn);

        btnSubmit.setOnClickListener(view -> {
            Intent i = new Intent(FirstActivity.this, SecondActivity.class);
            startActivityForResult(i, REQUEST_CODE);
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE && data != null) {
            tvName.setText(data.getStringExtra("name"));

        }
    }
}