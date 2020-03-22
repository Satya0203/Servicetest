package com.example.anew.servicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view)
    {
        Intent i=new Intent(this,Myser.class);
        startService(i);

    }

    public void stop(View view)
    {
        Intent ip=new Intent(this,Myser.class);
        stopService(ip);
    }
}
