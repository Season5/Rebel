package com.example.jaykayitare.rebel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashScreen extends AppCompatActivity  {

    String LOG_TAG = "splash";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "STARTED ON CREATE");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Log.d(LOG_TAG, "LAYOUT SET");
        //transit to another activity the activity here
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    Log.d(LOG_TAG, "SLEEPING");
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Log.d(LOG_TAG, "STARTING NEW ACTIVITY");
                    Intent intent = new Intent(getBaseContext(),App_Activity.class);
                    startActivity(intent);
                    Log.d(LOG_TAG, "ACTIVITY STARTED");
                    finish();
                }
            }
        };
        timerThread.start();
    }

}

