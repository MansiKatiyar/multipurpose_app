package com.example.androidproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourteen extends AppCompatActivity {
    Button b31, b32, b33;
    CameraManager cm;
    private boolean torch = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        b31 = (Button) findViewById(R.id.button31);
        b32 = (Button) findViewById(R.id.button32);
        b33 = (Button) findViewById(R.id.button33);
        cm = (CameraManager) getSystemService(CAMERA_SERVICE);
        b31.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String s1 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s1, true);
                    torch = false;
                } catch (CameraAccessException e) {
                }
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String s2 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s2, false);
                    torch = false;
                } catch (CameraAccessException e) {
                }
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Fourteen.this, Fourth.class);
                startActivity(s);
                finish();
            }
        });
    }
}