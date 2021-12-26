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

public class Second extends AppCompatActivity {
    EditText e1, e2;
    Button b2, b3;
    FirebaseAuth firebaseAuth;
    ProgressBar p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        p1 = (ProgressBar) findViewById(R.id.progressBar);
        firebaseAuth = FirebaseAuth.getInstance();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Second.this, Third.class);
                startActivity(b);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if (s1.isEmpty()) {
            e1.setError("please fill email");
            return;
        } else if (s2.isEmpty()) {
            e2.setError("please fill password");
            return;
        } else {
            firebaseAuth.signInWithEmailAndPassword(s1, s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Second.this, "login done", Toast.LENGTH_SHORT).show();
                        Intent y = new Intent(Second.this, Fourth.class);
                        startActivity(y);
                        finish();
                    } else {
                        Toast.makeText(Second.this, "login not done", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}