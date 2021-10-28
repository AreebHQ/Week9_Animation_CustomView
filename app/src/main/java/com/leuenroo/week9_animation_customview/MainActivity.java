package com.leuenroo.week9_animation_customview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takeMeto2(View view) {
        startActivity(new Intent(this, CirclesView.class));
    }

    public void takeMeto3(View view) {
        startActivity(new Intent(this, FastAnimation_SV.class));
    }

    public void takeMeto4(View view) {
        startActivity(new Intent(this, AnimationUI.class));
    }
}