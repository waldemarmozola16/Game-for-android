package com.waldemarexample.testing.game;

import android.content.Context;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

public abstract class GameView extends SurfaceView implements SurfaceHolder.Callback {

    public GameView(Context context) {
        super(context);

        getHolder().addCallback(this);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {


    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }


    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    public void update() {

    }

}

