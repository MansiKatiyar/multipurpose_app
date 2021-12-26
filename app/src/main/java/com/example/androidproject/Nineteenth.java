package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
public class Nineteenth extends AppCompatActivity {
    Button b49;
    RadioButton r1,r2,r3,r4;
    static int score = 0;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteenth);
        b49 = (Button)findViewById(R.id.button49);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        b49.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(r1.isChecked()){
                    ++score;
                }else{
                    --score;
                }
                Intent j = new Intent(Nineteenth.this,Twentieth.class);
                startActivity(j);
                finish();
            } });
    } }