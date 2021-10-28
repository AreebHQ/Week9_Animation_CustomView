package com.leuenroo.week9_animation_customview;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class AnimationUI extends AppCompatActivity {
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_ui);

        iv= (ImageView) findViewById(R.id.rocket_iv);
        iv.setBackgroundResource(R.drawable.anim1);
        AnimationDrawable rocketAnimation = (AnimationDrawable) iv.getBackground();

        iv.setOnClickListener(view -> {
            if (rocketAnimation.isRunning()) {
                rocketAnimation.stop();
            }
            else {
                rocketAnimation.start();
            }
        });
        iv.setOnLongClickListener(view -> {
            ValueAnimator animator = ValueAnimator.ofFloat(0, 360);
            animator.setDuration(1000);
            animator.setInterpolator(new LinearInterpolator());

            animator.addUpdateListener(animation -> {
                float rotation = (float) animation.getAnimatedValue();
                iv.setRotation(rotation);
            });

            animator.start();

            return true;
        });





        ImageView iv2 = findViewById(R.id.rocket_iv2);
        iv2.setOnLongClickListener((v)->{

            Animation iv2anim = AnimationUtils.loadAnimation(this, R.anim.tween_anim);
            iv2.startAnimation(iv2anim);
            return true;
        });

    }
}