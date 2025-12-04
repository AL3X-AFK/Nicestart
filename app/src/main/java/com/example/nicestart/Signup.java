package com.example.nicestart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.MaterialToolbar;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        VideoView backgroundVideo = findViewById(R.id.backgroundVideo);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_fondo;
        Uri videoUri = Uri.parse(videoPath);
        backgroundVideo.setVideoURI(videoUri);

        backgroundVideo.setOnPreparedListener(mp -> {
            mp.setLooping(true);     // Bucle infinito
            mp.setVolume(0f, 0f);    // Sin sonido
        });

//        backgroundVideo.start();
//        ImageView mSea = findViewById(R.id.backView);
//
//        Glide.with(this)
//                .load("https://cdn.pixabay.com/photo/2019/11/21/08/32/bright-4642061_1280.jpg")
//                .centerCrop()
//                .placeholder(R.drawable.gradient)
//                .into(mSea);

    }

    public void openMain(View v){
        Intent intent = new Intent(Signup.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void openLogin(View v){
        Intent intent = new Intent(Signup.this, Login.class);
        startActivity(intent);
    }
}