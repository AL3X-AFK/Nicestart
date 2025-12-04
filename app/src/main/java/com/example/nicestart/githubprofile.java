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

        //Busca el toolbar
        MaterialToolbar toolbar = findViewById(R.id.topAppBar);

        //Establece la Toolbar como ActionBar
        setSupportActionBar(toolbar);

        //Define la acción de la flecha
        toolbar.setNavigationOnClickListener(v -> {
            Intent intent = new Intent(githubprofile.this, MainActivity.class);
            startActivity(intent);
        });


        miVisorWeb = findViewById(R.id.vistaweb);

        miVisorWeb.getSettings().setJavaScriptEnabled(true);
        miVisorWeb.loadUrl("https://github.com/AL3X-AFK");
    }
}