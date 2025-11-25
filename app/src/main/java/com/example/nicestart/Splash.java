package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.logging.Logger;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        setContentView(R.layout.activity_splash);

//        ImageView icon = findViewById(R.id.icon);

//        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.transformx2);
//        icon.startAnimation(myAnim);

        openApp();


        ImageView mSea = findViewById(R.id.backView);

        Glide.with(this)
                .load("https://images.pexels.com/photos/63340/pexels-photo-63340.jpeg")
//                .transition(DrawableTransitionOptions.withCrossFade(100))
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(mSea);
    }

    public void openApp(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 5000);
    }
}