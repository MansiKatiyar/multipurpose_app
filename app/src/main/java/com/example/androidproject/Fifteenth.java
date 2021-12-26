package com.example.androidproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Fifteenth extends AppCompatActivity {
    ImageView iv;
    Button b36, b37;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            Bitmap bm = (Bitmap) data.getExtras().get("data");
            iv.setImageBitmap(bm);
        } else {
            Toast.makeText(Fifteenth.this, "not captured", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteenth);
        b36 = (Button) findViewById(R.id.button36);
        b37 = (Button) findViewById(R.id.button37);
        iv = (ImageView) findViewById(R.id.imageView4);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(o, 10);
            }
        });

        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(Fifteenth.this, Fourth.class);
                startActivity(f);
                finish();
            }
        });
    }
}