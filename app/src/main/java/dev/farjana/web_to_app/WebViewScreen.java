package dev.farjana.web_to_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewScreen extends AppCompatActivity {


    WebView webView;
    WebSettings webSettings;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_screen);

        webView = findViewById(R.id.webview);
        webSettings =  webView.getSettings();

        Intent receiverIntent = getIntent();
        String searchUrl = receiverIntent.getStringExtra("Url");

        webView.loadUrl(searchUrl);
        webView.setWebViewClient(new WebViewController());
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && this.webView.canGoBack()){
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}


  class WebViewController extends WebViewClient {

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

      @Override
      public void onLoadResource(WebView view, String url) {
          super.onLoadResource(view, url);
      }

      @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

      @Override
      public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
          return super.shouldOverrideUrlLoading(view, request);
      }
  }