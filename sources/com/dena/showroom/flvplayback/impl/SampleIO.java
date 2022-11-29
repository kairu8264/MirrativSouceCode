package com.dena.showroom.flvplayback.impl;

import android.util.Log;
import com.dena.showroom.flvplayback.ByteProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
abstract class SampleIO implements ByteProcessor {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f26546a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteBuffer f26547b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26548c;

    static {
        System.loadLibrary(Factory.TAG);
    }

    public SampleIO(long j10) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4096);
        this.f26546a = allocateDirect;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(4096);
        this.f26547b = allocateDirect2;
        this.f26548c = j10;
        allocateDirect2.clear();
        allocateDirect.clear();
        allocateDirect.flip();
        proceed(j10);
    }

    private static native void deleteOpaque(long j10);

    private static native int dequeueOutgoingBytes(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private static native void enqueueIncomingBytes(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private static native void proceed(long j10);

    public final boolean a() {
        if (this.f26546a.hasRemaining()) {
            return false;
        }
        long j10 = this.f26548c;
        ByteBuffer byteBuffer = this.f26546a;
        int dequeueOutgoingBytes = dequeueOutgoingBytes(j10, byteBuffer, 0, byteBuffer.capacity());
        if (dequeueOutgoingBytes == 0) {
            return false;
        }
        this.f26546a.position(0);
        this.f26546a.limit(dequeueOutgoingBytes);
        return true;
    }

    public final boolean b() {
        if (this.f26547b.position() == 0) {
            return false;
        }
        long j10 = this.f26548c;
        ByteBuffer byteBuffer = this.f26547b;
        enqueueIncomingBytes(j10, byteBuffer, 0, byteBuffer.position());
        this.f26547b.clear();
        return true;
    }

    public void finalize() {
        long j10 = this.f26548c;
        if (j10 != 0) {
            deleteOpaque(j10);
        }
        super.finalize();
    }

    @Override // com.dena.showroom.flvplayback.ByteProcessor
    public final ByteBuffer getIncomingBytes() {
        return this.f26547b;
    }

    @Override // com.dena.showroom.flvplayback.ByteProcessor
    public final ByteBuffer getOutgoingBytes() {
        return this.f26546a;
    }

    @Override // com.dena.showroom.flvplayback.ByteProcessor
    public final boolean proceed() {
        boolean b10 = b();
        boolean a10 = a();
        if (b10 || a10) {
            try {
                proceed(this.f26548c);
                return true;
            } catch (Exception e10) {
                Log.e(Factory.TAG, e10.getMessage());
                return true;
            }
        }
        return false;
    }
}
