package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveCaptureImageResponse {
    public static final int $stable = 8;
    private final String imageUrl;
    private final Status status;

    public LiveCaptureImageResponse(Status status, String str) {
        p.h(status, "status");
        p.h(str, "imageUrl");
        this.status = status;
        this.imageUrl = str;
    }

    public static /* synthetic */ LiveCaptureImageResponse copy$default(LiveCaptureImageResponse liveCaptureImageResponse, Status status, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveCaptureImageResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = liveCaptureImageResponse.imageUrl;
        }
        return liveCaptureImageResponse.copy(status, str);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final LiveCaptureImageResponse copy(Status status, String str) {
        p.h(status, "status");
        p.h(str, "imageUrl");
        return new LiveCaptureImageResponse(status, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCaptureImageResponse) {
            LiveCaptureImageResponse liveCaptureImageResponse = (LiveCaptureImageResponse) obj;
            return p.c(this.status, liveCaptureImageResponse.status) && p.c(this.imageUrl, liveCaptureImageResponse.imageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "LiveCaptureImageResponse(status=" + this.status + ", imageUrl=" + this.imageUrl + ')';
    }

    public /* synthetic */ LiveCaptureImageResponse(Status status, String str, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? "" : str);
    }
}
