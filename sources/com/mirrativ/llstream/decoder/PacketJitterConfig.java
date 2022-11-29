package com.mirrativ.llstream.decoder;

import android.util.Log;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jo.h;
import po.n;

/* loaded from: classes4.dex */
public final class PacketJitterConfig {
    public static final long BUFFER_QUEUE_TIME_DEC_UNIT = 50;
    public static final long BUFFER_QUEUE_TIME_INC_UNIT = 250;
    public static final Companion Companion = new Companion(null);
    public static final long GAP_TIME_DEC_UNIT = 1;
    public static final long GAP_TIME_INC_UNIT = 1;
    public static final long MAX_BUFFER_QUEUE_TIME_MS = 3000;
    public static final long MAX_GAP_ADJUST_TIME_MS = 600;
    public static final long MIN_GAP_ADJUST_TIME_MS = 100;
    private final AtomicBoolean notAcceptableClient = new AtomicBoolean(false);
    private final AtomicLong bufferQueueTime = new AtomicLong(100);
    private final AtomicLong initialBufferQueueTime = new AtomicLong(100);
    private final AtomicLong avRenderingGapPTS = new AtomicLong(DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS);
    private final AtomicLong clearRequestDisplayBuffer = new AtomicLong(0);
    private final AtomicLong avRenderingSkipGapMs = new AtomicLong(1000);
    private final AtomicLong remainingScheduledBufferSize = new AtomicLong(0);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementAVRenderingSkipGap$lambda-3  reason: not valid java name */
    public static final long m23decrementAVRenderingSkipGap$lambda3(long j10) {
        return j10 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementBufferQueueTime$lambda-1  reason: not valid java name */
    public static final long m24decrementBufferQueueTime$lambda1(long j10) {
        return j10 - 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: incrementAVRenderingSkipGap$lambda-2  reason: not valid java name */
    public static final long m25incrementAVRenderingSkipGap$lambda2(long j10) {
        return j10 + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: incrementBufferQueueTime$lambda-0  reason: not valid java name */
    public static final long m26incrementBufferQueueTime$lambda0(long j10) {
        return j10 + 250;
    }

    public final long decrementAVRenderingSkipGap() {
        if (this.avRenderingSkipGapMs.get() > 100) {
            this.avRenderingSkipGapMs.updateAndGet(e.f28249a);
        }
        if (Log.isLoggable("PacketJitterConfig", 2)) {
            StringBuilder a10 = a.a("video rendering skipGap = ");
            a10.append(this.avRenderingSkipGapMs.get());
            Log.v("PacketJitterConfig", a10.toString());
        }
        return this.avRenderingSkipGapMs.get();
    }

    public final long decrementBufferQueueTime() {
        if (this.initialBufferQueueTime.get() < this.bufferQueueTime.get()) {
            this.bufferQueueTime.updateAndGet(c.f28247a);
        }
        this.notAcceptableClient.compareAndSet(true, false);
        return this.bufferQueueTime.get();
    }

    public final long getAVGapAdjustmentTimeMs() {
        return n.j(n.e(this.avRenderingGapPTS.get() / 1000, 0L), 600L);
    }

    public final boolean getAudioBufferUnderrun() {
        return this.remainingScheduledBufferSize.get() < 1;
    }

    public final AtomicLong getAvRenderingGapPTS() {
        return this.avRenderingGapPTS;
    }

    public final AtomicLong getAvRenderingSkipGapMs() {
        return this.avRenderingSkipGapMs;
    }

    public final AtomicLong getBufferQueueTime() {
        return this.bufferQueueTime;
    }

    public final AtomicLong getClearRequestDisplayBuffer() {
        return this.clearRequestDisplayBuffer;
    }

    public final AtomicLong getInitialBufferQueueTime() {
        return this.initialBufferQueueTime;
    }

    public final AtomicBoolean getNotAcceptableClient() {
        return this.notAcceptableClient;
    }

    public final long getNotAcceptableVideoDelayFromAudioMs() {
        return n.e(this.bufferQueueTime.get(), 500L);
    }

    public final AtomicLong getRemainingScheduledBufferSize() {
        return this.remainingScheduledBufferSize;
    }

    public final long incrementAVRenderingSkipGap() {
        if (this.avRenderingSkipGapMs.get() < 600) {
            this.avRenderingSkipGapMs.updateAndGet(d.f28248a);
        }
        if (Log.isLoggable("PacketJitterConfig", 2)) {
            StringBuilder a10 = a.a("video rendering skipGap = ");
            a10.append(this.avRenderingSkipGapMs.get());
            Log.v("PacketJitterConfig", a10.toString());
        }
        return this.avRenderingSkipGapMs.get();
    }

    public final long incrementBufferQueueTime() {
        if (this.bufferQueueTime.get() < MAX_BUFFER_QUEUE_TIME_MS) {
            this.bufferQueueTime.updateAndGet(b.f28246a);
        } else {
            this.notAcceptableClient.compareAndSet(false, true);
        }
        return this.bufferQueueTime.get();
    }

    public final long requestDisplayBuffer() {
        return this.clearRequestDisplayBuffer.incrementAndGet();
    }

    public final void resetBufferQueueTime() {
        this.bufferQueueTime.set(this.initialBufferQueueTime.get());
    }

    public final boolean resetRequestDisplayBuffer() {
        if (5 < this.clearRequestDisplayBuffer.get()) {
            this.clearRequestDisplayBuffer.set(0L);
            return true;
        }
        return false;
    }

    public final void setBufferQueueTime(long j10) {
        this.bufferQueueTime.set(j10);
        this.initialBufferQueueTime.set(j10);
    }
}
