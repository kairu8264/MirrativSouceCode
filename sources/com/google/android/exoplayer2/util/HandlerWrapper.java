package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public interface HandlerWrapper {
    Looper getLooper();

    boolean hasMessages(int i10);

    Message obtainMessage(int i10);

    Message obtainMessage(int i10, int i11, int i12);

    Message obtainMessage(int i10, int i11, int i12, Object obj);

    Message obtainMessage(int i10, Object obj);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j10);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);

    boolean sendEmptyMessageDelayed(int i10, int i11);
}
