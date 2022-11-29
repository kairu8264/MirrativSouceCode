package com.dena.showroom.flvplayback.profile;

/* loaded from: classes3.dex */
public class TrackProfile {

    /* renamed from: a  reason: collision with root package name */
    public final long f26639a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26640b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26641c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaInfo f26642d;

    public TrackProfile(long j10, long j11, int i10, MediaInfo mediaInfo) {
        this.f26639a = j10;
        this.f26640b = j11;
        this.f26641c = i10;
        this.f26642d = mediaInfo;
    }

    public int getBitrate() {
        return this.f26641c;
    }

    public long getDroppedSamples() {
        return this.f26639a;
    }

    public MediaInfo getMedia() {
        return this.f26642d;
    }

    public long getOverallSamples() {
        return this.f26640b;
    }
}
