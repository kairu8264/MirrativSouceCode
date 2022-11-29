package com.dena.showroom.flvplayback.impl.publish;

import com.dena.showroom.flvplayback.Size;

/* loaded from: classes3.dex */
public class VideoEncoderSetting {

    /* renamed from: a  reason: collision with root package name */
    public final Size f26595a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26596b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26597c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26598d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26599e;

    /* loaded from: classes3.dex */
    public enum FillMode {
        ASPECT_FIT,
        ASPECT_FILL
    }

    public VideoEncoderSetting(Size size, int i10, int i11, int i12, boolean z10) {
        this.f26595a = size;
        this.f26596b = i10;
        this.f26597c = i11;
        this.f26598d = i12;
        this.f26599e = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoEncoderSetting videoEncoderSetting = (VideoEncoderSetting) obj;
        if (this.f26596b == videoEncoderSetting.f26596b && this.f26597c == videoEncoderSetting.f26597c && this.f26598d == videoEncoderSetting.f26598d) {
            if (this.f26599e == videoEncoderSetting.f26599e) {
                Size size = this.f26595a;
                Size size2 = videoEncoderSetting.f26595a;
                if (size != null) {
                    if (size.equals(size2)) {
                        return true;
                    }
                } else if (size2 == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getBps() {
        return this.f26596b;
    }

    public int getFps() {
        return this.f26597c;
    }

    public int getKeyframeInterval() {
        return this.f26598d;
    }

    public Size getResolution() {
        return this.f26595a;
    }

    public int hashCode() {
        Size size = this.f26595a;
        return ((((((((size != null ? size.hashCode() : 0) * 31) + this.f26596b) * 31) + this.f26597c) * 31) + this.f26598d) * 31) + (this.f26599e ? 1 : 0);
    }

    public boolean isUseCameraSize() {
        return this.f26599e;
    }

    public boolean mayUpdateCamera(VideoEncoderSetting videoEncoderSetting) {
        return (this.f26599e == videoEncoderSetting.f26599e && this.f26595a.equals(videoEncoderSetting.f26595a)) ? false : true;
    }
}
