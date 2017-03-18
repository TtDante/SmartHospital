package com.example.a13456.smarthospital;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    public void function1(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Function_1.class);
        MainActivity.this.startActivity(intent);
    }
    public void function2(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Function_2.class);
        MainActivity.this.startActivity(intent);
    }
}
