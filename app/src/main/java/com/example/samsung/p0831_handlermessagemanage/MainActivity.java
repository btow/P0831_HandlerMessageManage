package com.example.samsung.p0831_handlermessagemanage;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    Handler handler;

    Handler.Callback hc = new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            Log.d(LOG_TAG, "what = " + msg.what);
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler(hc);
        sendMessages();
    }

    private void sendMessages() {
        Log.d(LOG_TAG, "Send messages");
        handler.sendEmptyMessageDelayed(1, 1000);
        handler.sendEmptyMessageDelayed(2, 2000);
        handler.sendEmptyMessageDelayed(3, 3000);
    }
}
