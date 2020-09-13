   package com.example.goldenr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

   public class four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.archimedes-lab.org/atelier.html?https://www.archimedes-lab.org/nombredor.html");
    }
}