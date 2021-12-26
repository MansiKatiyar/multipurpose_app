package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
public class Twentyone extends AppCompatActivity {
    Button b51;
    RadioButton r5,r10,r11,r12;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);
        b51 = (Button)findViewById(R.id.button51);
        r5 = (RadioButton)findViewById(R.id.radioButton5);
        r10 = (RadioButton)findViewById(R.id.radioButton10);
        r11 = (RadioButton)findViewById(R.id.radioButton11);
        r12 = (RadioButton)findViewById(R.id.radioButton12);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(r5.isChecked()){
                    ++Nineteenth.score;
                }else{
                    --Nineteenth.score;
                }
                Intent r = new Intent(Twentyone.this,Twentytwo.class);
                startActivity(r);
                finish();
            } });
    } }