package com.leuenroo.week9_animation_customview.SurfaceView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class BounceSurfaceView extends SurfaceView
        implements SurfaceHolder.Callback {

    private AnimationThread mAnimThread;

    public BounceSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mAnimThread = new AnimationThread(holder);
        mAnimThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format,
                               int width, int height) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        mAnimThread.stopThread();
    }
}