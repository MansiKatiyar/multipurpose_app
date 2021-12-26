package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.hbb20.CountryCodePicker;

public class Fifth extends AppCompatActivity {
    CountryCodePicker ccp;
    EditText e5;
    Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        e5 = (EditText) findViewById(R.id.editText5);
        b7 = (Button) findViewById(R.id.button7);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(e5);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(Fifth.this, Sixth.class);
                f.putExtra("mobile", ccp.getFullNumberWithPlus().trim());
                startActivity(f);
            }
        });
    }
}