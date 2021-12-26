package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Tenth extends AppCompatActivity {
    EditText e10;
    Button b16, b17;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        e10 = (EditText) findViewById(R.id.editText10);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        ts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.9f);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e10.getText().toString();
                ts.speak("the answer is" + s1, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Tenth.this, Fourth.class);
                startActivity(q);
                finish();
            }
        });
    }
}