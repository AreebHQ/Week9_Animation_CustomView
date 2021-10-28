package com.leuenroo.week9_animation_customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class CirclesView extends AppCompatActivity {
MyCircle n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circles_view);

        n=(MyCircle) findViewById(R.id.cc);
    }

    public void rept(View view) {

        n.postInvalidate();
    }
}