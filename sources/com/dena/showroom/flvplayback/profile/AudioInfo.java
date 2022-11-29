package com.dena.showroom.flvplayback.profile;

import com.dena.showroom.flvplayback.profile.MediaInfo;

/* loaded from: classes3.dex */
public class AudioInfo extends MediaInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f26633a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26634b;

    public AudioInfo(int i10, int i11) {
        MediaInfo.Kind kind = MediaInfo.Kind.AUDIO;
        this.f26633a = i10;
        this.f26634b = i11;
    }

    public int getChannelCount() {
        return this.f26634b;
    }

    public int getSamplingRate() {
        return this.f26633a;
    }
}
