package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class twelfth extends AppCompatActivity {
    EditText e11, e12;
    TextView t2;
    Button b22, b23, b24, b25, b26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth);
        e11 = (EditText) findViewById(R.id.editText11);
        e12 = (EditText) findViewById(R.id.editText12);
        t2 = (TextView) findViewById(R.id.textView2);
        b22 = (Button) findViewById(R.id.button22);
        b23 = (Button) findViewById(R.id.button23);
        b24 = (Button) findViewById(R.id.button24);
        b25 = (Button) findViewById(R.id.button25);
        b26 = (Button) findViewById(R.id.button26);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e11.getText().toString();
                String s2 = e12.getText().toString();
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 + i2;
                String s3 = Integer.toString(i3);
                t2.setText(s3);
                Toast.makeText(twelfth.this, "the result is" + t2, Toast.LENGTH_SHORT).show();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s4 = e11.getText().toString();
                String s5 = e12.getText().toString();
                Integer i4 = Integer.parseInt(s4);
                Integer i5 = Integer.parseInt(s5);
                Integer i6 = i4 - i5;
                String s6 = Integer.toString(i6);
                t2.setText(s6);
                Toast.makeText(twelfth.this, "the result is" +
                        t2, Toast.LENGTH_SHORT).show();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s7 = e11.getText().toString();
                String s8 = e12.getText().toString();
                Integer i7 = Integer.parseInt(s7);
                Integer i8 = Integer.parseInt(s8);
                Integer i9 = i7 * i8;
                String s9 = Integer.toString(i9);
                t2.setText(s9);
                Toast.makeText(twelfth.this, "the result is" + t2, Toast.LENGTH_SHORT).show();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s10 = e11.getText().toString();
                String s11 = e12.getText().toString();
                Integer i10 = Integer.parseInt(s10);
                Integer i11 = Integer.parseInt(s11);
                Integer i12 = i10 / i11;
                String s12 = Integer.toString(i12);
                t2.setText(s12);
                Toast.makeText(twelfth.this, "the result is" + t2, Toast.LENGTH_SHORT).show();
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(twelfth.this, Fourth.class);
                startActivity(x);
                finish();
            }
        });
    }
}