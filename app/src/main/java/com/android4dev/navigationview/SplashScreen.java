package com.android4dev.navigationview;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by jaysingh on 3/9/16.
 */
public class SplashScreen extends Activity
{

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);


//        mMediaPlayer = MediaPlayer.create(SplashScreen.this, R.raw.splash_music);
//        mMediaPlayer.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //finally is used so that it is always executed.
                finally {
                    Intent mainActivity = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(mainActivity);
                }
            }
        });
        thread.start();
    }


//    @Override
//    protected void onPause() {
//        super.onPause();
//        mMediaPlayer.stop();
//        mMediaPlayer=null;
//        finish();
//
//    }
}
