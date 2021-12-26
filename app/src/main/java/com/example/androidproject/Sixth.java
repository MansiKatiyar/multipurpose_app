package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Sixth extends AppCompatActivity {
    EditText e6;
    Button b8;
    String phone;
    String otp;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        phone = getIntent().getStringExtra("mobile").toString();
        e6 = (EditText) findViewById(R.id.editText6);
        b8 = (Button) findViewById(R.id.button8);
        firebaseAuth = FirebaseAuth.getInstance();
        getOtp();
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e6.getText().toString().isEmpty()) {
                    Toast.makeText(Sixth.this, "please enter otp", Toast.LENGTH_SHORT).show();
                } else {
                    if (e6.getText().toString().length() != 6) {
                        Toast.makeText(Sixth.this, "invalid otp", Toast.LENGTH_SHORT).show();
                    } else {
                        PhoneAuthCredential credential =
                                PhoneAuthProvider.getCredential(otp, e6.getText().toString());
                        signInWithPhoneAuthCredential(credential);
                    }
                }
            }
        });
    }

    private void getOtp() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phone, 60, TimeUnit.SECONDS, this, new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onCodeSent(@NonNull @org.jetbrains.annotations.NotNull String s, @NonNull @org.jetbrains.annotations.NotNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                otp = s;
            }

            @Override
            public void onVerificationCompleted(@NonNull @org.jetbrains.annotations.NotNull PhoneAuthCredential phoneAuthCredential) {
                signInWithPhoneAuthCredential(phoneAuthCredential);
            }

            @Override
            public void onVerificationFailed(@NonNull @org.jetbrains.annotations.NotNull FirebaseException e) {
                Toast.makeText(Sixth.this, "otp mismatch", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Sixth.this, "login done", Toast.LENGTH_SHORT).show();
                    Intent j = new Intent(Sixth.this, Fourth.class);
                    startActivity(j);
                    finish();
                } else {
                    Toast.makeText(Sixth.this, "not done", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}