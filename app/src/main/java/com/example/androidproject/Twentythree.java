package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
public class Twentythree extends AppCompatActivity {
    Button b53,b54,b55;
    Vibrator v2;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentythree);
        b53 = (Button)findViewById(R.id.button53);
        b54 = (Button)findViewById(R.id.button54);
        v2 = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        b53.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                if(Build.VERSION.SDK_INT>26){ v2.vibrate(8000);
                }else{ v2.vibrate(8000);
                } } });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent s = new Intent(Twentythree.this,Eighteenth.class);
                startActivity(s);
                finish();
            } });
    } }