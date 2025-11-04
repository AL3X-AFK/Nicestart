package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        /*ImageView logo = findViewById(R.id.logo);

        Animation myanim = AnimationUtils.loadAnimation(this, R.animator.class);
        logo.startAnimation(myanim);*/
    }

    public void openMain(View v){
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
}