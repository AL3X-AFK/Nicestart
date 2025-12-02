package com.example.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.MaterialToolbar;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        setContentView(R.layout.activity_profile);

        //Busca el toolbar
        MaterialToolbar toolbar = findViewById(R.id.topAppBar);

        //Establece la Toolbar como ActionBar
        setSupportActionBar(toolbar);

        //Define la acción de la flecha
        toolbar.setNavigationOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent);
        });

        ImageView imProfile = findViewById(R.id.ivProfile);


        Glide.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToRN9yjYthAmpbX0SSkTukfTnIf37im28mXo2Xx4Fl6Avf4WN24RzHay6tIRscaHvzDqI&usqp=CAU")
                .circleCrop()
                .into(imProfile);
    }
}