package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class country_details_page extends AppCompatActivity {
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details_page);
        textView = findViewById(R.id.aboutId);
        textView.setText(R.string.about_us);
    }
}