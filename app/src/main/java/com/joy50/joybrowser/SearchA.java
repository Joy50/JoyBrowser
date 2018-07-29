package com.joy50.joybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchA extends AppCompatActivity {

    String value,protocol="https://www.google.fi/search?q=";
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        value=getIntent().getExtras().getString("Val");
        String value1=protocol+value;
        webView=(WebView)findViewById(R.id.w2);
        WebSettings ws=webView.getSettings();
        ws.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(protocol);
    }
}
