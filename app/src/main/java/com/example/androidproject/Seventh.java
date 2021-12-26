package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import org.jetbrains.annotations.NotNull;

public class Seventh extends AppCompatActivity {
    SignInButton signInButton;
    GoogleSignInClient googleSignInClient;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        signInButton = (SignInButton) findViewById(R.id.signin);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("1068807725386-qpp2u4ug5rie0mnu5iovqp0hdch47k9g.apps.googleusercontent.com").build();
        googleSignInClient = GoogleSignIn.getClient(Seventh.this, googleSignInOptions);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = googleSignInClient.getSignInIntent();
                startActivityForResult(i, 100);
            }
        });
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            Intent i = new Intent(Seventh.this, Eight.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            Task<GoogleSignInAccount> signInAccountTask = GoogleSignIn.getSignedInAccountFromIntent(data);
            if (signInAccountTask.isSuccessful()) {
                Toast.makeText(Seventh.this, "sign in successfull", Toast.LENGTH_SHORT).show();
                try {
                    GoogleSignInAccount googleSignInAccount = signInAccountTask.getResult(ApiException.class);
                    if (googleSignInAccount != null) {
                        AuthCredential authCredential = GoogleAuthProvider.getCredential(googleSignInAccount.getIdToken(), null);
                        firebaseAuth.signInWithCredential(authCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Seventh.this, "firebase database update", Toast.LENGTH_SHORT).show();
                                    Intent j = new Intent(Seventh.this, Eight.class);
                                    startActivity(j);
                                } else {
                                    Toast.makeText(Seventh.this, "database not updated", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                } catch (ApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}