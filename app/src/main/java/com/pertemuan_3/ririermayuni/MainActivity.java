package com.pertemuan_3.ririermayuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(.layout.activity_main);
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,
                "Application On star",Toast.LENGTH_SHORT).show();
        {
        @Override
                protected void OnStop() {
            super.onStop();
            Toast.makeText(this, "Application on Stop", Toast.LENGTH_SHORT).show();
        }
            @Override
                protected void OnRestart(); {
                super.onRestart();
                Toast.makeText(this, "Application on Restart",Toast.LENGTH_SHORT).show();
                }
                @Override
            protected void OnResume() {
            super.onResume();
            Toast.makeText(this, "Application on Resume", Toast.LENGTH_SHORT.).show();
        }
        @Override
            protected void OnPause() {
            super.onPause();
            Toast.makeText(this, "Application on Pause", Toast.LENGTH_SHORT).show();
        }
        @Override
            protected void OnDestroy() {
            super.onDestroy();
            Toast.makeText(this, "Application on Destroy ", Toast.LENGTH_SHORT).show();
        }

