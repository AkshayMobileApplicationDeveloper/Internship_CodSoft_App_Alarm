package com.alarmclock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alarmclock.BoardCast.MyReceverBoardCast;

public class MainActivity extends AppCompatActivity {
    AlarmManager alarmManager;
    EditText idEditTime;
    Button button;
    PendingIntent pendingIntent;
    static final int ALARM_REQ_CODES=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        idEditTime = findViewById(R.id.idEditTime);
        button =findViewById(R.id.Btn_id);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "onClick: "+idEditTime.getText().toString()  );
                int time =Integer.parseInt(idEditTime.getText().toString());
                Log.d("TAG", "onClick: "+time);
                long    triggleTime =System.currentTimeMillis()+(time*1000);

                Intent iBroadCast=new Intent(getApplicationContext(), MyReceverBoardCast.class);

                pendingIntent=PendingIntent.getBroadcast(getApplicationContext(),ALARM_REQ_CODES,iBroadCast,PendingIntent.FLAG_UPDATE_CURRENT);
                alarmManager.set(AlarmManager.RTC_WAKEUP,triggleTime,pendingIntent);


            }

        });


    }
}