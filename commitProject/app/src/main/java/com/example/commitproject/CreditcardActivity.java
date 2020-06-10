package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreditcardActivity extends AppCompatActivity {
    Button pay_btn_credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditcard);
        pay_btn_credit = (Button)findViewById(R.id.pay_btn_credit);
        pay_btn_credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toast.makeText(CreditcardActivity.this,"成功",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreditcardActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
