package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
public class Twentieth extends AppCompatActivity {
    Button b50;
    RadioButton r6,r7,r8,r9;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentieth);
        b50 = (Button)findViewById(R.id.button50);
        r6= (RadioButton)findViewById(R.id.radioButton6);
        r7 = (RadioButton)findViewById(R.id.radioButton7);
        r8 = (RadioButton)findViewById(R.id.radioButton8);
        r9 = (RadioButton)findViewById(R.id.radioButton9);
        b50.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(r6.isChecked()){
                    ++Nineteenth.score;
                }else{
                    --Nineteenth.score;
                }
                Intent h = new Intent(Twentieth.this,Twentyone.class);
                startActivity(h);
                finish();
            } });
    } }