package com.dena.mirrorman.net.api.response.notice;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class NewsNotice {
    public static final int $stable = 8;
    private final long createdAt;

    /* renamed from: id  reason: collision with root package name */
    private String f26175id;
    private final String imageUrl;
    private boolean isNew;
    private final String text;
    private final String title;
    private final String url;

    public NewsNotice(String str, String str2, long j10, String str3, String str4, String str5, boolean z10) {
        p.h(str, "title");
        p.h(str2, "text");
        p.h(str3, "imageUrl");
        p.h(str4, "url");
        p.h(str5, TtmlNode.ATTR_ID);
        this.title = str;
        this.text = str2;
        this.createdAt = j10;
        this.imageUrl = str3;
        this.url = str4;
        this.f26175id = str5;
        this.isNew = z10;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.url;
    }

    public final String component6() {
        return this.f26175id;
    }

    public final boolean component7() {
        return this.isNew;
    }

    public final NewsNotice copy(String str, String str2, long j10, String str3, String str4, String str5, boolean z10) {
        p.h(str, "title");
        p.h(str2, "text");
        p.h(str3, "imageUrl");
        p.h(str4, "url");
        p.h(str5, TtmlNode.ATTR_ID);
        return new NewsNotice(str, str2, j10, str3, str4, str5, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NewsNotice) {
            NewsNotice newsNotice = (NewsNotice) obj;
            return p.c(this.title, newsNotice.title) && p.c(this.text, newsNotice.text) && this.createdAt == newsNotice.createdAt && p.c(this.imageUrl, newsNotice.imageUrl) && p.c(this.url, newsNotice.url) && p.c(this.f26175id, newsNotice.f26175id) && this.isNew == newsNotice.isNew;
        }
        return false;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f26175id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + this.imageUrl.hashCode()) * 31) + this.url.hashCode()) * 31) + this.f26175id.hashCode()) * 31;
        boolean z10 = this.isNew;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setId(String str) {
        p.h(str, "<set-?>");
        this.f26175id = str;
    }

    public final void setNew(boolean z10) {
        this.isNew = z10;
    }

    public String toString() {
        return "NewsNotice(title=" + this.title + ", text=" + this.text + ", createdAt=" + this.createdAt + ", imageUrl=" + this.imageUrl + ", url=" + this.url + ", id=" + this.f26175id + ", isNew=" + this.isNew + ')';
    }

    public /* synthetic */ NewsNotice(String str, String str2, long j10, String str3, String str4, String str5, boolean z10, int i10, h hVar) {
        this(str, str2, j10, str3, str4, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? false : z10);
    }
}
