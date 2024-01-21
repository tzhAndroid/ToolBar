package com.talentprogramming.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;

public class SecondToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_tool_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tBSecond);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24);


        getSupportActionBar().setTitle("Add Student");
    }

    public boolean onOptionsItemSelected(MenuItem back){
        switch (back.getItemId()){
            case android.R.id.home:

                finish();
                return true;
        }
        return  super.onOptionsItemSelected(back);
    }
}