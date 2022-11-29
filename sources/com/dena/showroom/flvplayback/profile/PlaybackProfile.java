package com.dena.showroom.flvplayback.profile;

import java.util.List;

/* loaded from: classes3.dex */
public class PlaybackProfile {

    /* renamed from: a  reason: collision with root package name */
    public final List<TrackProfile> f26636a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26637b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26638c;

    public PlaybackProfile(List<TrackProfile> list, long j10, long j11) {
        this.f26636a = list;
        this.f26637b = j10;
        this.f26638c = j11;
    }

    public long getDecoderDelay() {
        return this.f26638c;
    }

    public long getNetworkDelay() {
        return this.f26637b;
    }

    public List<TrackProfile> getTracks() {
        return this.f26636a;
    }
}
