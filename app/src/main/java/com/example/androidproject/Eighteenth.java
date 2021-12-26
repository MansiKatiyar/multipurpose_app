package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Eighteenth extends AppCompatActivity {
    Button b44,b45,b47,b46,b56,b58;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth);
        b44 = (Button)findViewById(R.id.button44);
        b45 = (Button)findViewById(R.id.button45);
        b47 = (Button)findViewById(R.id.button47);
        b46 = (Button)findViewById(R.id.button46);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent g = new Intent(Eighteenth.this,Twentythree.class);
                startActivity(g);
                finish();
            } });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent k = new Intent(Eighteenth.this,Nineteenth.class);
                startActivity(k);
                finish();
            }
});
        b47.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent q = new Intent(Eighteenth.this,Fourth.class);
                startActivity(q);
                finish();
            } });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent z = new Intent(Eighteenth.this,Twentyfour.class);
                startActivity(z);
                finish();
            } });

    } }