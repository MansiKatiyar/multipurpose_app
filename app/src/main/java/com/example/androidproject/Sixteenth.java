package com.example.androidproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
public class Sixteenth extends AppCompatActivity {
    Button b39,b40;
    VideoView v1;
    MediaController m3;
    Uri u1;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenth);
        b39 = (Button)findViewById(R.id.button39);
        b40 = (Button)findViewById(R.id.button40);
        v1 = (VideoView)findViewById(R.id.videoView);
        m3 = new MediaController(this);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent d = new Intent(Sixteenth.this,Fourth.class);
                startActivity(d);
                finish();
            } });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent r = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(r,0);
            } });
    } @Override protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        u1 = data.getData();
        v1.setVideoURI(u1);
        v1.setMediaController(m3);
        m3.setAnchorView(v1);
    v1.start(); } }