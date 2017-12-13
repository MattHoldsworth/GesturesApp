package com.example.matt.gesturesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {


    private TextView mattysmessage;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mattysmessage = findViewById(R.id.mattystext);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        mattysmessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mattysmessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        mattysmessage.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        mattysmessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        mattysmessage.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        mattysmessage.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        mattysmessage.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        mattysmessage.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mattysmessage.setText("onFling");
        return true;
    }
}
