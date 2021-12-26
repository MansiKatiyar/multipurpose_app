package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Ninth extends AppCompatActivity {
    Button b14,b15;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_ninth);
        b14 = (Button)findViewById(R.id.button14);
        b15 = (Button)findViewById(R.id.button15);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(Ninth.this,"hi how are you",Toast.LENGTH_SHORT).show(); } });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent j = new Intent(Ninth.this,Fourth.class);
                startActivity(j);
                finish();
            } });
    } }