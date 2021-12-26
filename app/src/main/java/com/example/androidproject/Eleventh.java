package com.example.androidproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Eleventh extends AppCompatActivity {
    Button b20,b21,b48; MediaPlayer mp;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_eleventh);
        b20 = (Button)findViewById(R.id.button20);
        b21 = (Button)findViewById(R.id.button21);
        b48 = (Button)findViewById(R.id.button48);
        mp = MediaPlayer.create(this,R.raw.s);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                mp.start();
            } });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                mp.pause();
            } });
        b48.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent m = new Intent(Eleventh.this,Fourth.class);
                startActivity(m);
                finish();
            } });
    } }