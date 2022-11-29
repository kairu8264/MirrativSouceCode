package com.dena.showroom.flvplayback.impl.util;

import android.os.SystemClock;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public class BitrateCounter {

    /* renamed from: a  reason: collision with root package name */
    public long f26605a;

    /* renamed from: b  reason: collision with root package name */
    public long f26606b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<a> f26607c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26608d;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f26609a;

        /* renamed from: b  reason: collision with root package name */
        public final long f26610b;

        public a(long j10, long j11) {
            this.f26609a = j10;
            this.f26610b = j11;
        }
    }

    public BitrateCounter() {
        this(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
    }

    public double bps() {
        return (this.f26606b / this.f26608d) * 1000.0d * 8.0d;
    }

    public void update(long j10, long j11) {
        long j12 = this.f26605a;
        if (j12 > j10) {
            j10 = j12;
        }
        while (this.f26607c.size() > 0 && this.f26607c.peek().f26609a < j10 - this.f26608d) {
            this.f26606b -= this.f26607c.removeFirst().f26610b;
        }
        this.f26605a = j10;
        this.f26606b += j11;
        this.f26607c.addLast(new a(j10, j11));
    }

    public BitrateCounter(long j10) {
        this.f26605a = 0L;
        this.f26606b = 0L;
        this.f26607c = new ArrayDeque<>();
        this.f26608d = j10;
    }

    public void update(long j10) {
        update(SystemClock.uptimeMillis(), j10);
    }
}
