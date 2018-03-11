package com.example.bilal.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class SampleActivity extends AppCompatActivity {

    @BindView(R.id.textView) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        textView.setText("Sample Activity");

///
    }



    public void call(){

        String a  ="test";
        String b  ="test2";

        String branch2 = "test word";
        String branch1="";


    }

}
