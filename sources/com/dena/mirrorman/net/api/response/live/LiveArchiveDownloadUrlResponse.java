package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveArchiveDownloadUrlResponse {
    public static final int $stable = 8;
    private String filename;
    private String mimetype;
    private Status status;
    private String url;

    public LiveArchiveDownloadUrlResponse(Status status, String str, String str2, String str3) {
        p.h(status, "status");
        p.h(str, "url");
        p.h(str2, "filename");
        p.h(str3, "mimetype");
        this.status = status;
        this.url = str;
        this.filename = str2;
        this.mimetype = str3;
    }

    public static /* synthetic */ LiveArchiveDownloadUrlResponse copy$default(LiveArchiveDownloadUrlResponse liveArchiveDownloadUrlResponse, Status status, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveArchiveDownloadUrlResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = liveArchiveDownloadUrlResponse.url;
        }
        if ((i10 & 4) != 0) {
            str2 = liveArchiveDownloadUrlResponse.filename;
        }
        if ((i10 & 8) != 0) {
            str3 = liveArchiveDownloadUrlResponse.mimetype;
        }
        return liveArchiveDownloadUrlResponse.copy(status, str, str2, str3);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.filename;
    }

    public final String component4() {
        return this.mimetype;
    }

    public final LiveArchiveDownloadUrlResponse copy(Status status, String str, String str2, String str3) {
        p.h(status, "status");
        p.h(str, "url");
        p.h(str2, "filename");
        p.h(str3, "mimetype");
        return new LiveArchiveDownloadUrlResponse(status, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveArchiveDownloadUrlResponse) {
            LiveArchiveDownloadUrlResponse liveArchiveDownloadUrlResponse = (LiveArchiveDownloadUrlResponse) obj;
            return p.c(this.status, liveArchiveDownloadUrlResponse.status) && p.c(this.url, liveArchiveDownloadUrlResponse.url) && p.c(this.filename, liveArchiveDownloadUrlResponse.filename) && p.c(this.mimetype, liveArchiveDownloadUrlResponse.mimetype);
        }
        return false;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.url.hashCode()) * 31) + this.filename.hashCode()) * 31) + this.mimetype.hashCode();
    }

    public final void setFilename(String str) {
        p.h(str, "<set-?>");
        this.filename = str;
    }

    public final void setMimetype(String str) {
        p.h(str, "<set-?>");
        this.mimetype = str;
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "LiveArchiveDownloadUrlResponse(status=" + this.status + ", url=" + this.url + ", filename=" + this.filename + ", mimetype=" + this.mimetype + ')';
    }

    public /* synthetic */ LiveArchiveDownloadUrlResponse(Status status, String str, String str2, String str3, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3);
    }
}
