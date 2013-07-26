package com.example.sampletrailer;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewWebViewClient extends WebViewClient
{
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}