package com.example.user.game;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button help = (Button) findViewById(R.id.help);
        Button play = (Button) findViewById(R.id.play);
        Button rate = (Button) findViewById(R.id.rate);
        // get the rating set by the user
        help.setOnClickListener(this);
        rate.setOnClickListener(this);
        play.setOnClickListener(this);
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.sound1);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }
    @Override
    public void onClick(View v) {
        mMediaPlayer.stop();
        switch(v.getId()) {
            case R.id.help:
                Intent goToEasy = new Intent();
                goToEasy.setClass(this, HelpActivity.class);
                startActivity(goToEasy);
                break;
            case R.id.play:
                Intent goToMedium = new Intent();
                goToMedium.setClass(this, PlayMenu.class);
                startActivity(goToMedium);
                break;
            case R.id.rate:
                Intent goToHard = new Intent();
                goToHard.setClass(this, RateActivity.class);
                startActivity(goToHard);
                break;
        }
    }
}
