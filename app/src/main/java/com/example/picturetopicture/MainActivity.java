package com.example.picturetopicture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static String songOne =
            "https://www.sample-videos.com/video123/mp4/480/big_buck_bunny_480p_5mb.mp4";
    private static String songTwo =
            "https://www.sample-videos.com/video123/mp4/360/big_buck_bunny_360p_5mb.mp4";
    private static String songThree =
            "https://www.sample-videos.com/video123/mp4/240/big_buck_bunny_240p_10mb.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar tb = findViewById(R.id.toolbar);
//        setSupportActionBar(tb);
//        tb.setSubtitle("Picture in Picture");

        findViewById(R.id.video_one).setOnClickListener(onClickListener);
        findViewById(R.id.video_two).setOnClickListener(onClickListener);
        findViewById(R.id.video_three).setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.video_one: {
                            showSelectedVideo(songOne);
                            break;
                        }
                        case R.id.video_two: {
                            showSelectedVideo(songTwo);
                            break;
                        }
                        case R.id.video_three:
                            showSelectedVideo(songThree);
                            break;
                    }
                }
            };
    public void showSelectedVideo(String url){
        Intent i = new Intent();
        i.setClass(this, PictureInPictureActivity.class);
        i.putExtra("videoUrl", url);
        startActivity(i);
    }
}
