package com.dena.showroom.flvplayback.profile;

import com.dena.showroom.flvplayback.Size;
import com.dena.showroom.flvplayback.profile.MediaInfo;

/* loaded from: classes3.dex */
public class VideoInfo extends MediaInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f26643a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f26644b;

    public VideoInfo(int i10, Size size) {
        MediaInfo.Kind kind = MediaInfo.Kind.VIDEO;
        this.f26643a = i10;
        this.f26644b = size;
    }

    public int getFrameRate() {
        return this.f26643a;
    }

    public Size getResolution() {
        return this.f26644b;
    }
}
