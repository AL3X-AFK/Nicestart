package com.example.nicestart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        VideoView backgroundVideo = findViewById(R.id.backgroundVideo);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_fondo;
        Uri videoUri = Uri.parse(videoPath);
        backgroundVideo.setVideoURI(videoUri);

        backgroundVideo.setOnPreparedListener(mp -> {
            mp.setLooping(true);     // Bucle infinito
            mp.setVolume(0f, 0f);    // Sin sonido
        });

        backgroundVideo.start();


//        ImageView mSea = findViewById(R.id.backView);
//
//        Glide.with(this)
//                .load("https://cdn.pixabay.com/photo/2022/07/14/05/56/jellyfish-7320516_1280.jpg")
//                .centerCrop()
//                .transition(DrawableTransitionOptions.withCrossFade(1000))
//                .into(mSea);


    }

    public void openMain(View v){
        Intent intent = new Intent(Login.this, MainActivity.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(intent);
    }

    public void openSignup(View v){
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }

}