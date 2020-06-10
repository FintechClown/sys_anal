package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt_account,edt_password;
    Button submit_btn;
    TextView tv_forget,tv_regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_account = (EditText)findViewById(R.id.edt_account);
        edt_password = (EditText)findViewById(R.id.edt_password);
        submit_btn = (Button)findViewById(R.id.submit_btn);
        tv_forget = (TextView)findViewById(R.id.tv_forget);
        tv_regist = (TextView)findViewById(R.id.tv_regist);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edt_account.getText().toString();
                String password = edt_password.getText().toString();
                if((id.equals("王廣") && password.equals("123"))){
                    Toast.makeText(LoginActivity.this,"成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else if((id.equals("audit") && password.equals("123"))){
                    Toast.makeText(LoginActivity.this,"歡迎審核人員",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,AuditActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"失敗",Toast.LENGTH_SHORT).show();
                    edt_account.setText("");
                    edt_password.setText("");
                }
            }
        });
        tv_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RecallActivity.class);
                startActivity(intent);
            }
        });
        tv_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegistActivity.class);
                startActivity(intent);
            }
        });

    }
}
