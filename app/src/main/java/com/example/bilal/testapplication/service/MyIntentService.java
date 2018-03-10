package com.example.bilal.testapplication.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bilal on 04/03/18.
 */

public class MyIntentService extends IntentService {

    public static final String TAG = "MyIntentService";

    public MyIntentService(){
        super("MyIntentService");
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService(String name) {
        super(name);
    }

    @Override
    public void setIntentRedelivery(boolean enabled) {
        super.setIntentRedelivery(enabled);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy: called");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {


        try {
            throw new Exception("Hello ");
        }catch(Exception e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.println("World");
        }

       /* try {
            throw new IOException("Hello");
        }catch(IOException | Exception e) {
            System.out.println(e.getMessage());
        }*/

       //Collections.binarySearch(new ArrayList<Integer>(),5,Compar)

    }





    interface  interfacees{

        public String data ="";
        public void call();

    }




    /*    public static void main(String args[]){
        System.out.println(toString());
    }*/



    interface Foo{
        int x = 10;
    }


        public static void main(String[] args) {
            int l = Foo.x ;
            System.out.println(Foo.x);

        }


}

