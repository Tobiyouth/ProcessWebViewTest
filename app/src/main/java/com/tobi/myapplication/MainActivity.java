package com.tobi.myapplication;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void two(View view) {
        MainActivity.this.startActivity(new Intent(MainActivity.this, Main2Activity.class));

    }

    public void three(View view) {
        MainActivity.this.startActivity(new Intent(MainActivity.this, Main3Activity.class));

    }
}
