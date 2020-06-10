package com.example.commitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button = (Button)findViewById(R.id.button2);
        EditText tv =(EditText)findViewById(R.id.editText6);

        final String str = tv.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.equals("王廣")) {
                    Toast.makeText(Main3Activity.this, "成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main3Activity.this, "失敗", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
