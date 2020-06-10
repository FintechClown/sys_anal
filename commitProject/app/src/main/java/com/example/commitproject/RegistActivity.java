package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistActivity extends AppCompatActivity {
    Button regist_submit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        regist_submit_btn = (Button)findViewById(R.id.regist_submit_btn);
        regist_submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistActivity.this,"成功註冊",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegistActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
