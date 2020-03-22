package com.example.anew.servicetest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class Myser extends Service
{
    MediaPlayer mp=new MediaPlayer();
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        mp=MediaPlayer.create(this,R.raw.abc);
    }

    @Override
    public void onDestroy()
    {

        super.onDestroy();
        mp.stop();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        mp.start();
        return super.onStartCommand(intent, flags, startId);
        
    }
}
