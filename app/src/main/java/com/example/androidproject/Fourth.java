package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Fourth extends AppCompatActivity {
    Button b6, b12, b13, b18, b19, b27, b34, b35, b38, b41,b65;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b6 = (Button) findViewById(R.id.button6);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b27 = (Button) findViewById(R.id.button27);
        b34 = (Button) findViewById(R.id.button34);
        b35 = (Button) findViewById(R.id.button35);
        b38 = (Button) findViewById(R.id.button38);
        b41 = (Button) findViewById(R.id.button41);
        b65 = (Button)findViewById(R.id.button65);
        firebaseAuth = FirebaseAuth.getInstance();
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                Intent h = new Intent(Fourth.this, Eighteenth.class);
                startActivity(h);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                Intent h = new Intent(Fourth.this, Ninth.class);
                startActivity(h);
                finish();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fourth.this, Tenth.class);
                startActivity(i);
                finish();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Fourth.this, Eleventh.class);
                startActivity(l);
                finish();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Fourth.this, twelfth.class);
                startActivity(j);
                finish();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Fourth.this, Thirteen.class);
                startActivity(p);
                finish();
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(Fourth.this, Fourteen.class);
                startActivity(u);
                finish();
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Fourth.this, Fifteenth.class);
                startActivity(y);
                finish();
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Fourth.this, Sixteenth.class);
                startActivity(e);
                finish();
            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Fourth.this, Seventeenth.class);
                startActivity(t);
                finish();
            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fourth.this, MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}