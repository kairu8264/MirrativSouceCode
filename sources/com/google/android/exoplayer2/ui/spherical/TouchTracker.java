package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.ui.spherical.OrientationListener;

/* loaded from: classes3.dex */
class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public static final float MAX_PITCH_DEGREES = 45.0f;
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final float pxPerDegrees;
    private SingleTapListener singleTapListener;
    private final PointF previousTouchPointPx = new PointF();
    private final PointF accumulatedTouchOffsetDegrees = new PointF();
    private volatile float roll = 3.1415927f;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onScrollChange(PointF pointF);
    }

    public TouchTracker(Context context, Listener listener, float f10) {
        this.listener = listener;
        this.pxPerDegrees = f10;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // com.google.android.exoplayer2.ui.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f10) {
        this.roll = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y10 = motionEvent2.getY();
        PointF pointF = this.previousTouchPointPx;
        float f12 = (y10 - pointF.y) / this.pxPerDegrees;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.roll;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.accumulatedTouchOffsetDegrees;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        SingleTapListener singleTapListener = this.singleTapListener;
        if (singleTapListener != null) {
            return singleTapListener.onSingleTapUp(motionEvent);
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public void setSingleTapListener(SingleTapListener singleTapListener) {
        this.singleTapListener = singleTapListener;
    }
}
