package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
public class Twentyfour extends AppCompatActivity {
    EditText e15,e16;
    Button b55,b57;
    SmsManager smsManager;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyfour);
        e15 = (EditText)findViewById(R.id.editText15);
        e16 = (EditText)findViewById(R.id.editText16);
        b55 = (Button)findViewById(R.id.button55);
        b57 = (Button)findViewById(R.id.button57);
        b57.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent r = new Intent(Twentyfour.this,Eighteenth.class);
                startActivity(r);
                finish();
            } });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED){
                        sendSMS();
                    }else{
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                    } }
} });
    }
    private void sendSMS(){ String s1 = e15.getText().toString(); String s2 = e16.getText().toString();
    try {
        smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(s1, null, s2, null, null);
        Toast.makeText(Twentyfour.this, "message is sent", Toast.LENGTH_SHORT).show();
    }catch(Exception e){
        e.printStackTrace();
        Toast.makeText(Twentyfour.this,"Failed to send the message",Toast.LENGTH_SHORT).show();
    } } }