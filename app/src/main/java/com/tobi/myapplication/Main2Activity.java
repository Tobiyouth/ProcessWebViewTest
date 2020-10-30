package com.tobi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.File;

public class Main2Activity extends AppCompatActivity {

    private WebView wv1,wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();

    }

    private void initView() {
        wv1 = findViewById(R.id.web_view2);
        wv2 = findViewById(R.id.web_view21);

        WebSettings webSettings = wv1.getSettings();
        webSettings.setJavaScriptEnabled(true); // 是否开启JS支持
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true); // 是否允许JS打开新窗口

        webSettings.setUseWideViewPort(true); // 缩放至屏幕大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕大小
        webSettings.setSupportZoom(true); // 是否支持缩放
        webSettings.setBuiltInZoomControls(true); // 是否支持缩放变焦，前提是支持缩放
        webSettings.setDisplayZoomControls(false); // 是否隐藏缩放控件

        webSettings.setAllowFileAccess(true); // 是否允许访问文件
        webSettings.setDomStorageEnabled(true); // 是否节点缓存
        webSettings.setDatabaseEnabled(true); // 是否数据缓存
        webSettings.setAppCacheEnabled(true); // 是否应用缓存
        webSettings.setAppCachePath(new File(getExternalCacheDir(), "one").getAbsolutePath()); // 设置缓存路径

        webSettings.setMediaPlaybackRequiresUserGesture(false); // 是否要手势触发媒体
        webSettings.setStandardFontFamily("sans-serif"); // 设置字体库格式
        webSettings.setFixedFontFamily("monospace"); // 设置字体库格式
        webSettings.setSansSerifFontFamily("sans-serif"); // 设置字体库格式
        webSettings.setSerifFontFamily("sans-serif"); // 设置字体库格式
        webSettings.setCursiveFontFamily("cursive"); // 设置字体库格式
        webSettings.setFantasyFontFamily("fantasy"); // 设置字体库格式
        webSettings.setTextZoom(100); // 设置文本缩放的百分比
        webSettings.setMinimumFontSize(8); // 设置文本字体的最小值(1~72)
        webSettings.setDefaultFontSize(16); // 设置文本字体默认的大小

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setDefaultTextEncodingName("UTF-8");
        webSettings.setNeedInitialFocus(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setBlockNetworkLoads(true);

        wv1.loadUrl("file:///android_asset/help.html");


        WebSettings webSettings2 = wv2.getSettings();
        webSettings2.setJavaScriptEnabled(true); // 是否开启JS支持
        webSettings2.setJavaScriptCanOpenWindowsAutomatically(true); // 是否允许JS打开新窗口
        webSettings2.setUseWideViewPort(true); // 缩放至屏幕大小
        webSettings2.setLoadWithOverviewMode(true); // 缩放至屏幕大小
        webSettings2.setSupportZoom(true); // 是否支持缩放
        webSettings2.setBuiltInZoomControls(true); // 是否支持缩放变焦，前提是支持缩放
        webSettings2.setDisplayZoomControls(false); // 是否隐藏缩放控件
        webSettings2.setAllowFileAccess(true); // 是否允许访问文件
        webSettings2.setDomStorageEnabled(true); // 是否节点缓存
        webSettings2.setDatabaseEnabled(true); // 是否数据缓存
        webSettings2.setAppCacheEnabled(true); // 是否应用缓存
        webSettings2.setAppCachePath(new File(getExternalCacheDir(), "one").getAbsolutePath()); // 设置缓存路径
        webSettings2.setMediaPlaybackRequiresUserGesture(false); // 是否要手势触发媒体
        webSettings2.setStandardFontFamily("sans-serif"); // 设置字体库格式
        webSettings2.setFixedFontFamily("monospace"); // 设置字体库格式
        webSettings2.setSansSerifFontFamily("sans-serif"); // 设置字体库格式
        webSettings2.setSerifFontFamily("sans-serif"); // 设置字体库格式
        webSettings2.setCursiveFontFamily("cursive"); // 设置字体库格式
        webSettings2.setFantasyFontFamily("fantasy"); // 设置字体库格式
        webSettings2.setTextZoom(100); // 设置文本缩放的百分比
        webSettings2.setMinimumFontSize(8); // 设置文本字体的最小值(1~72)
        webSettings2.setDefaultFontSize(16); // 设置文本字体默认的大小
        webSettings2.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings2.setLoadsImagesAutomatically(true);
        webSettings2.setDefaultTextEncodingName("UTF-8");
        webSettings2.setNeedInitialFocus(true);
        webSettings2.setGeolocationEnabled(true);
        webSettings2.setBlockNetworkLoads(true);


        wv2.loadUrl("file:///android_asset/help.html");
    }


}
