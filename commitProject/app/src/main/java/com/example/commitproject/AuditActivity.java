package com.example.commitproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AuditActivity extends AppCompatActivity {
    TextView tv32,tv42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit);
        tv32 = (TextView)findViewById(R.id.tv32);
        tv42 = (TextView)findViewById(R.id.tv42);
        tv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder  a = new AlertDialog.Builder(AuditActivity.this);
                a.setTitle("待審核專案:飛天水壺");
                a.setMessage("提案人:王廣\n專案內容:........\n目標金額:93萬9090\n聯絡方式:.....");
                a.setPositiveButton("核准", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AuditActivity.this,"已通知資訊部上架",Toast.LENGTH_SHORT).show();
                    }
                });
                a.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AuditActivity.this,"cancel",Toast.LENGTH_SHORT).show();
                    }
                });
                a.create().show();
            }
        });
    }
}
