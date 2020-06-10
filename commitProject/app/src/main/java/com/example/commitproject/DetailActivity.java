package com.example.commitproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity  {
    TextView tv_product1;
    TextView tv_product2;
    TextView tv_product3;
    Button pay_btn;
    Button back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv_product1 = (TextView)findViewById(R.id.tv_product1);
        tv_product2 = (TextView)findViewById(R.id.tv_product2);
        tv_product3 = (TextView)findViewById(R.id.tv_product3);
        pay_btn = (Button)findViewById(R.id.pay_btn);
        back_btn = (Button)findViewById(R.id.back_btn);

        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DetailActivity.this,PayListActivity.class);
                startActivity(intent1);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DetailActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });


        tv_product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(DetailActivity.this)
                .setTitle("方案一:100元")
                .setMessage("內含:\nA*1\nB*1")
                .setPositiveButton("加入", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"已加入",Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"取消",Toast.LENGTH_SHORT).show();
                    }
                }).create().show();
            }
        });

        tv_product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder  a = new AlertDialog.Builder(DetailActivity.this);
                a.setTitle("方案二:500元");
                a.setMessage("內含:\nA*1\nB*1\nC*1");
                a.setPositiveButton("加入", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"已加入",Toast.LENGTH_SHORT).show();
                    }
                });
                a.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"cancel",Toast.LENGTH_SHORT).show();
                    }
                });
                a.create().show();
            }
        });

        tv_product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder  a = new AlertDialog.Builder(DetailActivity.this);
                a.setTitle("方案三:1000元");
                a.setMessage("內含:\nA*1\nB*1\nC*1\nD*1");
                a.setPositiveButton("加入", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"已加入",Toast.LENGTH_SHORT).show();
                    }
                });
                a.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DetailActivity.this,"cancel",Toast.LENGTH_SHORT).show();
                    }
                });
                a.create().show();
            }
        });
    }
}
