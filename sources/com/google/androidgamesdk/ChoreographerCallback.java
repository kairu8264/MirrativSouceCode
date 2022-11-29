package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;

/* loaded from: classes3.dex */
public class ChoreographerCallback implements Choreographer.FrameCallback {
    private static final String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private b mLooper;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public Handler f27928w;

        public b() {
        }

        public /* synthetic */ b(ChoreographerCallback choreographerCallback, byte b10) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Log.i(ChoreographerCallback.LOG_TAG, "Starting looper thread");
            Looper.prepare();
            this.f27928w = new Handler();
            Looper.loop();
            Log.i(ChoreographerCallback.LOG_TAG, "Terminating looper thread");
        }
    }

    public ChoreographerCallback(long j10) {
        this.mCookie = j10;
        b bVar = new b(this, (byte) 0);
        this.mLooper = bVar;
        bVar.start();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        nOnChoreographer(this.mCookie, j10);
    }

    public native void nOnChoreographer(long j10, long j11);

    public void postFrameCallback() {
        this.mLooper.f27928w.post(new a());
    }

    public void postFrameCallbackDelayed(long j10) {
        Choreographer.getInstance().postFrameCallbackDelayed(this, j10);
    }

    public void terminate() {
        this.mLooper.f27928w.getLooper().quit();
    }
}
