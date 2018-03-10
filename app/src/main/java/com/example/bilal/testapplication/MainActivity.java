package com.example.bilal.testapplication;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.bilal.testapplication.service.MyIntentService;
import com.example.bilal.testapplication.service.MyService;

public class MainActivity extends AppCompatActivity {

    TextView startService, stopService, startIntentService, stopIntentService,
            statusTextView, intentStatusTextView;

    Intent lastStartedIntent;
    Intent lastIntentService;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService = (TextView) findViewById(R.id.startService);
        stopService = (TextView) findViewById(R.id.stopService);
        startIntentService = (TextView) findViewById(R.id.startIntentService);
        stopIntentService = (TextView) findViewById(R.id.stopIntentService);
        statusTextView = (TextView) findViewById(R.id.statusTextView);
        intentStatusTextView = (TextView) findViewById(R.id.intentStatusTextView);


        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastStartedIntent = new Intent(MainActivity.this, MyService.class);
                startService(lastStartedIntent);
            }
        });


        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });


        startIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastIntentService = new Intent(MainActivity.this, MyIntentService.class);
                startService(lastIntentService);
            }
        });

        stopIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(lastIntentService);
            }
        });


        int j = 5;
        for (int i = 0; i < j; i++) {
            if (i <= j--)
                System.out.print((i * j) + " ");
        }


        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[1]);

        // array size 0
        int[] arr2 = new int[0];


        int[][] array = new int[0][5];
        int[][] array1 = new int[1][];
        int[] array2[] = new int[1][5];
        //     int[][] array3 = new int[][5];


        double d = 100.04;
        //  float f = d;
        //  System.out.println("Float value "+f);
    }

    // ENUM
    enum Color {              // class Color

        RED,                    //public static final Color RED = new Color();
        GREEN,                 //public static final Color GREEN = new Color();
        BLUE;

        int number;

        public void call() {
        }

   //      internally above enum Color is converted to
   static class Colors
{
     public static final Colors RED = new Colors();
     public static final Colors BLUE = new Colors();
     public static final Colors GREEN = new Colors();
}

//        public void move();

    }


    public void androidMethod() {

        //BitmapFactory.decodeByteArray()

        // Driver method
        Color c1 = Color.RED;
        System.out.println(c1);
        c1 = Color.BLUE;
        if (c1 == Color.GREEN) {
            Log.i(TAG, "androidMethod: green");
        }
        //
        Color arr[] = Color.values();

        // enum with loop
        for (Color col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }
        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));




    }


}
