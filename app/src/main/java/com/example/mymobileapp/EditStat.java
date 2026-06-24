package com.example.mymobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditStat extends AppCompatActivity {

    ImageView iv_close;
    Button btn_video, btn_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit_stat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iv_close = findViewById(R.id.iv_close);
        btn_video = findViewById(R.id.btn_video);
        btn_camera = findViewById(R.id.btn_camera);

        iv_close.setOnClickListener(v -> {
            finish();
        });

        btn_video.setOnClickListener(v -> {
            Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(i);
        });

        btn_camera.setOnClickListener(v -> {
            Intent i = new Intent("android.media.action.VIDEO_CAPTURE");
            startActivity(i);
        });
    }
//    for Gemini: Intent i = new Intent(Intent.ACTION_VOICE_COMMAND);
}