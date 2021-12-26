package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Third extends AppCompatActivity {
    EditText e3, e4;
    Button b4, b5;
    ProgressBar p2;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        p2 = (ProgressBar) findViewById(R.id.progressBar2);
        firebaseAuth = FirebaseAuth.getInstance();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Third.this, Second.class);
                startActivity(c);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });
    }

    private void createUser() {
        String s1 = e3.getText().toString();
        String s2 = e4.getText().toString();
        if (s1.isEmpty()) {
            e3.setError("please fill email");
            return;
        } else if (s2.isEmpty()) {
            e4.setError("please fill password");
            return;
        } else {
            firebaseAuth.createUserWithEmailAndPassword(s1, s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Third.this, "registered successfully", Toast.LENGTH_SHORT).show();
                        Intent z = new Intent(Third.this, Second.class);
                        startActivity(z);
                        finish();
                    } else {
                        Toast.makeText(Third.this, "registration not done", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}