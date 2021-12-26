package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class Eight extends AppCompatActivity {
    ImageView i1;
    TextView t1;
    Button b11;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        i1 = (ImageView) findViewById(R.id.imageView2);
        t1 = (TextView) findViewById(R.id.textView);
        b11 = (Button) findViewById(R.id.button11);
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            Glide.with(Eight.this).load(firebaseUser.getPhotoUrl()).into(i1);
            t1.setText(firebaseUser.getDisplayName());
        }
        googleSignInClient = GoogleSignIn.getClient(Eight.this, GoogleSignInOptions.DEFAULT_SIGN_IN);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Eight.this, "Logout", Toast.LENGTH_SHORT).show();
                            firebaseAuth.signOut();
                            finish();
                        }
                    }
                });
            }
        });
    }
}