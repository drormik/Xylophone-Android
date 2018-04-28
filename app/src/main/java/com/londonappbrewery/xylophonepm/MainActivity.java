package com.londonappbrewery.xylophonepm;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool mSoundpool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
 //       mSoundpool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds

    //    mCSoundId=mSoundpool.load(getApplicationContext(), );
    }

    // TODO: Add the play methods triggered by the buttons

    public void playC(View view) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note1_c);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });


//mediaPlayer.start();
//        mediaPlayer.release();

//        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() ) {
//            @Override
//            public void onPrepared (MediaPlayer mp){
//                mp.start();
//            }
//        } ;
//        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() ) {
//            @Override
//            public void OnCompletion(MediaPlayer mediaPlayer){
//                mp.release();
//            }
//        }
    }

    public void playD(View v){

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note2_d);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    public void playE(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note3_e);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    public void playF(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note4_f);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    public void playG(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note5_g);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    public void playA(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note6_a);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    public void playB(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.note7_b);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}
