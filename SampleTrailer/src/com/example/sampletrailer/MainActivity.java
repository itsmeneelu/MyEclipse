package com.example.sampletrailer;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView tap;
    WebView webView;
    
    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
        this.tap = ((TextView)findViewById(R.id.textView1));
        this.webView = ((WebView)findViewById(R.id.webView2));
        this.webView.getSettings().setJavaScriptEnabled(true);

        //this one calls the url that is placed in our server.
        this.webView.loadUrl("http://test-ads.peel.com/foryou?country=us&userid=200014788&counter=25");
        
        //you can comment any of these above or below to check the compatibility of our need
        
        // this one calls the videos3.jsp file that is placed in our projects assets.
        //this.webView.loadUrl("file:///android_asset/videos3.jsp");

        this.tap.setOnClickListener(new View.OnClickListener()
                                    {
            public void onClick(View paramAnonymousView)
            {
                Intent localIntent = new Intent(MainActivity.this, MyVideoView.class);
                MainActivity.this.startActivity(localIntent);
            }
        });
    }
    
    public boolean onCreateOptionsMenu(Menu paramMenu)
    {
        getMenuInflater().inflate(R.menu.activity_main, paramMenu);
        return true;
    }
}