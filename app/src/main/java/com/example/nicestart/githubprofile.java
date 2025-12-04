package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class githubprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        WebView miVisorWeb;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_githubprofile);


        miVisorWeb = findViewById(R.id.vistaweb);

        miVisorWeb.getSettings().setJavaScriptEnabled(true);
        miVisorWeb.loadUrl("https://github.com/AL3X-AFK");
    }
}