package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thirteen extends AppCompatActivity {
    Button b28, b29, b30;
    BluetoothAdapter ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
        b28 = (Button) findViewById(R.id.button28);
        b29 = (Button) findViewById(R.id.button29);
        b30 = (Button) findViewById(R.id.button30);
        ba = BluetoothAdapter.getDefaultAdapter();
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.enable();
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.disable();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Thirteen.this, Fourth.class);
                startActivity(t);
                finish();
            }
        });
    }
}