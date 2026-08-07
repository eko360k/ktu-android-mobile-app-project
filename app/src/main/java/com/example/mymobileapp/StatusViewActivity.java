package com.example.mymobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.imageview.ShapeableImageView;

public class StatusViewActivity extends AppCompatActivity {

    ImageButton btn_back;
    ShapeableImageView siv_fullscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_status_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        siv_fullscreen = findViewById(R.id.siv_fullscreen);
        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(v -> {
            finish();
        });


        // 2. GET THE IMAGE FROM THE INTENT (The fix)
        // This catches the "resId" we sent from MainActivity
        int imageId = getIntent().getIntExtra("resId", 0);

        // 3. SET THE IMAGE TO THE VIEW
        if (imageId != 0) {
            siv_fullscreen.setImageResource(imageId);
        }

    }
}