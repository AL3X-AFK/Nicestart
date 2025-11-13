package com.example.nicestart;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        ImageView backView = findViewById(R.id.backView);
        ImageView imProfile = findViewById(R.id.ivProfile);

        Glide.with(this)
                .load("https://cdn.pixabay.com/photo/2014/10/07/13/48/mountain-477832_1280.jpg")
                .centerCrop()
                .into(backView);

        Glide.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToRN9yjYthAmpbX0SSkTukfTnIf37im28mXo2Xx4Fl6Avf4WN24RzHay6tIRscaHvzDqI&usqp=CAU")
                .circleCrop()
                .into(imProfile);
    }
}