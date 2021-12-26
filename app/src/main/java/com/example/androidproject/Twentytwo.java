package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Twentytwo extends AppCompatActivity {
    TextView t11;
    Button b52;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentytwo);
        t11 = (TextView)findViewById(R.id.textView11);
        b52 = (Button)findViewById(R.id.button52);
        t11.setText("your score is"+Nineteenth.score);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent j = new Intent(Twentytwo.this,Eighteenth.class);
                startActivity(j);
                finish();
            } });
    } }