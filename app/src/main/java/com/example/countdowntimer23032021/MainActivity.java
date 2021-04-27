package com.example.countdowntimer23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher mImageSwitcher;
    Button mBtnStart;
    String[] mArrNameImages = {"hinh1","hinh2","hinh3","hinh4","hinh5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageSwitcher = findViewById(R.id.imageSwitcher);
        mBtnStart = findViewById(R.id.buttonStart);

        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                int idImage = getResources().getIdentifier(mArrNameImages[0],"drawable",getPackageName());
                imageView.setImageResource(idImage);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return imageView;
            }
        });
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer countDownTimer = new CountDownTimer(5200 , 1000) {
                    @Override
                    public void onTick(long l) {
                        if ( l >= 1000){
//                            mImageSwitcher.setImageResource();
                        }
                    }

                    @Override
                    public void onFinish() {

                    }
                };

                countDownTimer.start();
            }
        });
    }
}