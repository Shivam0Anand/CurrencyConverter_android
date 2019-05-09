package com.shivam.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA MESSAGE");
        TextView textView = findViewById(R.id.currencyName);
        textView.setText(message);
    }
}
