package com.alarmclock.BoardCast;

import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

public class MyReceverBoardCast extends BroadcastReceiver {
    MediaPlayer mediaPlayer;


    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer=MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        Log.e("TAG", "onReceive: Start Alarm" );

    }
}
