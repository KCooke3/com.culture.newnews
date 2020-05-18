package com.culture.newnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    ImageButton APbutton;
    ImageButton WSJbutton;
    ImageButton RTbutton;

    String[] urls = new String[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "204627421", false);
        setContentView(R.layout.activity_main);
        StartAppAd.disableSplash();


        ImageButton APbutton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton WSJbutton = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton RTbutton = (ImageButton) findViewById(R.id.imageButton3);

        urls[0] = "https://apnews.com";
        urls[1] = "https://wsj.com";
        urls[2] = "https://mobile.reuters.com";



        APbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webActivity.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);

            }
        });

        WSJbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webActivity.class);
                intent.putExtra("links", urls[1]);
                startActivity(intent);

            }
        });

        RTbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webActivity.class);
                intent.putExtra("links", urls[2]);
                startActivity(intent);

            }
        });



    }


}
