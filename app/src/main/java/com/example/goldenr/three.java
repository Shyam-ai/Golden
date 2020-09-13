package com.example.goldenr;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class three extends AppCompatActivity {
    VideoView VideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        VideoView = findViewById(R.id.video_view);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(VideoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video1);
        VideoView.setMediaController(mediaController);
        VideoView.setVideoURI(uri);
        VideoView.start();
    }
}