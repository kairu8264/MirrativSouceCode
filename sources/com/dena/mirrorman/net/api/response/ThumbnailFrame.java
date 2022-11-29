package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class ThumbnailFrame {
    public static final int $stable = 0;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f26161id;
    private final String leftThumbnailImageUrl;
    private final String rightThumbnailAnimationUrl;
    private final String rightThumbnailImageUrl;

    public ThumbnailFrame(int i10, String str, String str2, String str3, String str4) {
        p.h(str, "iconUrl");
        p.h(str2, "leftThumbnailImageUrl");
        p.h(str3, "rightThumbnailAnimationUrl");
        p.h(str4, "rightThumbnailImageUrl");
        this.f26161id = i10;
        this.iconUrl = str;
        this.leftThumbnailImageUrl = str2;
        this.rightThumbnailAnimationUrl = str3;
        this.rightThumbnailImageUrl = str4;
    }

    public static /* synthetic */ ThumbnailFrame copy$default(ThumbnailFrame thumbnailFrame, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = thumbnailFrame.f26161id;
        }
        if ((i11 & 2) != 0) {
            str = thumbnailFrame.iconUrl;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = thumbnailFrame.leftThumbnailImageUrl;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = thumbnailFrame.rightThumbnailAnimationUrl;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = thumbnailFrame.rightThumbnailImageUrl;
        }
        return thumbnailFrame.copy(i10, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f26161id;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.leftThumbnailImageUrl;
    }

    public final String component4() {
        return this.rightThumbnailAnimationUrl;
    }

    public final String component5() {
        return this.rightThumbnailImageUrl;
    }

    public final ThumbnailFrame copy(int i10, String str, String str2, String str3, String str4) {
        p.h(str, "iconUrl");
        p.h(str2, "leftThumbnailImageUrl");
        p.h(str3, "rightThumbnailAnimationUrl");
        p.h(str4, "rightThumbnailImageUrl");
        return new ThumbnailFrame(i10, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThumbnailFrame) {
            ThumbnailFrame thumbnailFrame = (ThumbnailFrame) obj;
            return this.f26161id == thumbnailFrame.f26161id && p.c(this.iconUrl, thumbnailFrame.iconUrl) && p.c(this.leftThumbnailImageUrl, thumbnailFrame.leftThumbnailImageUrl) && p.c(this.rightThumbnailAnimationUrl, thumbnailFrame.rightThumbnailAnimationUrl) && p.c(this.rightThumbnailImageUrl, thumbnailFrame.rightThumbnailImageUrl);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f26161id;
    }

    public final String getLeftThumbnailImageUrl() {
        return this.leftThumbnailImageUrl;
    }

    public final String getRightThumbnailAnimationUrl() {
        return this.rightThumbnailAnimationUrl;
    }

    public final String getRightThumbnailImageUrl() {
        return this.rightThumbnailImageUrl;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f26161id) * 31) + this.iconUrl.hashCode()) * 31) + this.leftThumbnailImageUrl.hashCode()) * 31) + this.rightThumbnailAnimationUrl.hashCode()) * 31) + this.rightThumbnailImageUrl.hashCode();
    }

    public String toString() {
        return "ThumbnailFrame(id=" + this.f26161id + ", iconUrl=" + this.iconUrl + ", leftThumbnailImageUrl=" + this.leftThumbnailImageUrl + ", rightThumbnailAnimationUrl=" + this.rightThumbnailAnimationUrl + ", rightThumbnailImageUrl=" + this.rightThumbnailImageUrl + ')';
    }
}
