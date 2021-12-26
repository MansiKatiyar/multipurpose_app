package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button b1, b9, b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, Second.class);
                startActivity(m);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Fifth.class);
                startActivity(a);
                finish();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, Seventh.class);
                startActivity(x);
                finish();
            }
        });
    }
}
