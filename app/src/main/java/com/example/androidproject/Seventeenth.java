package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import android.widget.EditText;
public class Seventeenth extends AppCompatActivity {
    WebView w1;
    Button b42,b43;
    EditText e12;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);
        b42 = (Button)findViewById(R.id.button42);
        b43 = (Button)findViewById(R.id.button43);
        e12 = (EditText)findViewById(R.id.editText12);
        w1 = (WebView)findViewById(R.id.webView);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String s1 = e12.getText().toString();
                w1.loadUrl(s1);
            } });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent w = new Intent(Seventeenth.this,Fourth.class);
                startActivity(w);
                finish();
            } });
    } }