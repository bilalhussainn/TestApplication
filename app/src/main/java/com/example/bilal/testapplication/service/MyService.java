package com.example.bilal.testapplication.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by bilal on 04/03/18.
 */

public class MyService extends Service {

    public static final String TAG ="MyService";
    Runnable runnable;
    Handler handler;
    int count;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: called");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "onStartCommand: flags "+flags);
        Log.i(TAG, "onStartCommand: startId "+startId);


       /* new Thread(new Runnable() {
            @Override
            public void run() {


                startService(new Intent());

            }
        });*/

        runnable = new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: called "+count);
                count++;
                handler.postDelayed(runnable,1000);
            }
        };

         handler = new Handler();
        handler.postDelayed(runnable,0);


        return super.onStartCommand(intent, flags, startId);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind: called");




        return null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: called");

        handler.removeCallbacks(runnable);

    }
}
