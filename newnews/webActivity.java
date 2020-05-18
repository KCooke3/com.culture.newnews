package com.culture.newnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webActivity extends AppCompatActivity {

    WebView myWWW;

    @Override
    public void onBackPressed() {
        if (myWWW.canGoBack()){
            myWWW.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        myWWW = findViewById(R.id.myWWW);

        Intent intent = getIntent();
        String webSite = intent.getStringExtra("links");


        myWWW.setWebViewClient(new WebViewClient());
        myWWW.loadUrl(webSite);

        WebSettings webSettings = myWWW.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }




}
