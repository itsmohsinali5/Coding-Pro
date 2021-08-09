package com.e.codingpro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView clover_img, bgimg;
    Animation round , blink, slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clover_img = findViewById(R.id.clover);
        bgimg = findViewById(R.id.bgapp);
        //round = AnimationUtils.loadAnimation(this, R.anim.round);
        blink = AnimationUtils.loadAnimation(this, R.anim.blink);

        clover_img.startAnimation(blink);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(MainActivity.this , FrontActivity.class);
                startActivity(a);
                finish();
            }
        },3000);
    }
}
