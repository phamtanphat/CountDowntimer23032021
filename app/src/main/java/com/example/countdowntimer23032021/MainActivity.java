package com.example.countdowntimer23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher mImageSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageSwitcher = findViewById(R.id.imageSwitcher);
        

    }
}