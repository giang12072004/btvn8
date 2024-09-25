package com.example.cf_bai2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn_c,btn_f,btn_clear;
    EditText edt_c,edt_f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt_c=findViewById(R.id.edt_c);
        edt_f=findViewById(R.id.edt_f);
        btn_c=findViewById(R.id.btn_c);
        btn_f=findViewById(R.id.btn_f);
        btn_clear=findViewById(R.id.btn_clear);
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(edt_c.getText().toString());
                float c=(a*9/5)+32;
                edt_f.setText(c+"");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float b=Float.parseFloat(edt_f.getText().toString());
                float c=(b-32)*5/9;
                edt_c.setText(c+"");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_c.setText("");
                edt_f.setText("");
            }
        });
    }
}