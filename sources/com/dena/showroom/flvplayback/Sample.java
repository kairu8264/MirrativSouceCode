package com.dena.showroom.flvplayback;

/* loaded from: classes3.dex */
public class Sample {
    public static final long MEDIA_FLAG_CODEC_AAC = 512;
    public static final long MEDIA_FLAG_CODEC_H264 = 256;
    public static final long MEDIA_FLAG_CODEC_MASK = 65280;
    public static final long MEDIA_FLAG_IS_CONFIG = 1;
    public static final long MEDIA_FLAG_IS_SYNC = 2;
    public static final long MEDIA_FLAG_IS_TERMINAL = 4;
    public static final int TRACK_NO_AUDIO = 2;
    public static final int TRACK_NO_VIDEO = 1;

    /* renamed from: a  reason: collision with root package name */
    public final long f26412a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26413b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26414c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26415d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26416e;

    public Sample(long j10, long j11, long j12, int i10) {
        this(-1L, j10, j11, j12, i10);
    }

    public long baseClock() {
        return this.f26412a;
    }

    public long dts() {
        return this.f26414c;
    }

    public long getCodec() {
        return this.f26415d & MEDIA_FLAG_CODEC_MASK;
    }

    public long getFlag() {
        return this.f26415d;
    }

    public int getSize() {
        return this.f26416e;
    }

    public boolean isConfig() {
        return (this.f26415d & 1) != 0;
    }

    public long pts() {
        return this.f26413b;
    }

    public Sample withTimestamp(long j10, long j11) {
        return new Sample(this.f26412a, j10, j11, this.f26415d, this.f26416e);
    }

    public Sample(long j10, long j11, long j12, long j13, int i10) {
        this.f26412a = j10;
        this.f26413b = j11;
        this.f26414c = j12;
        this.f26415d = j13;
        this.f26416e = i10;
    }
}
