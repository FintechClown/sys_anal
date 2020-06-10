package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RecallActivity extends AppCompatActivity {
    EditText edt_email;
    Button send_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recall);
        edt_email = (EditText)findViewById(R.id.edt_email);
        send_btn = (Button)findViewById(R.id.send_btn);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecallActivity.this,"成功寄出",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RecallActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
