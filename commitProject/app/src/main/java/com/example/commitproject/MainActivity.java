package com.example.commitproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.login_item:
                Intent intent2 = new Intent(this,LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.regist_item:
                Intent intent3 = new Intent(this,RegistActivity.class);
                startActivity(intent3);
                break;
            case R.id.history_item:
                Intent intent4 = new Intent(this,HistoryActivity.class);
                startActivity(intent4);
                //Toast.makeText(MainActivity.this,"請先登入呦",Toast.LENGTH_LONG).show();
                break;
            case R.id.refund_item:
                Intent intent5 = new Intent(this,RefundActivity.class);
                startActivity(intent5);
                //Toast.makeText(MainActivity.this,"請先登入呦",Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,DetailActivity.class);
        switch (id){
            case R.id.tv1:
            case R.id.tv2:
                //Intent intent = new Intent(this,DetailActivity.class);
                startActivity(intent);
                break;
        }
    }
}
