package com.dawn.viewslidinglayoutdawn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by 90449 on 2017/6/30.
 */

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView webView = (WebView) this.findViewById(R.id.webView);
        webView.loadUrl("https://github.com/baiqingsong/ViewSlidingLayoutDawn");
    }
}
