package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean hasMessages(int i10) {
        return this.handler.hasMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i10) {
        return this.handler.obtainMessage(i10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.handler.postDelayed(runnable, j10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int i10) {
        this.handler.removeMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int i10) {
        return this.handler.sendEmptyMessage(i10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.handler.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i10, int i11) {
        return this.handler.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i10, Object obj) {
        return this.handler.obtainMessage(i10, obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i10, int i11, int i12) {
        return this.handler.obtainMessage(i10, i11, i12);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i10, int i11, int i12, Object obj) {
        return this.handler.obtainMessage(i10, i11, i12, obj);
    }
}
