package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PayListActivity extends AppCompatActivity {
    TextView tv_delete_paylist;
    TextView tv_price_paylist;
    TextView tv_title_paylist;
    TextView tv_sum;
    Button pay_btn_paylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_list);
        tv_delete_paylist = (TextView)findViewById(R.id.tv_delete_paylist);
        tv_title_paylist = (TextView)findViewById(R.id.tv_title_paylist);
        tv_price_paylist = (TextView)findViewById(R.id.tv_price_paylist);
        tv_sum = (TextView)findViewById(R.id.tv_sum);
        pay_btn_paylist = (Button)findViewById(R.id.pay_btn_paylist);

        tv_delete_paylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_title_paylist.setVisibility(TextView.INVISIBLE);
                tv_price_paylist.setVisibility(TextView.INVISIBLE);
                tv_delete_paylist.setVisibility(TextView.INVISIBLE);
                tv_sum.setText("500");
            }
        });
        pay_btn_paylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayListActivity.this,CreditcardActivity.class);
                startActivity(intent);
            }
        });
    }
}
