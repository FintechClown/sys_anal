package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RefundActivity extends AppCompatActivity {
    TextView textView61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund);
        textView61 = (TextView)findViewById(R.id.textView61);
    }
}
