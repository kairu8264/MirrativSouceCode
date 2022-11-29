package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class Genre {
    public static final int $stable = 0;
    private final String bannerBigImageUrl;
    private final String bannerSmallImageUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f26149id;
    private final String name;
    private final String textImageUrl;

    public Genre(String str, String str2, String str3, String str4, String str5) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "textImageUrl");
        p.h(str3, "bannerSmallImageUrl");
        p.h(str4, "bannerBigImageUrl");
        p.h(str5, "name");
        this.f26149id = str;
        this.textImageUrl = str2;
        this.bannerSmallImageUrl = str3;
        this.bannerBigImageUrl = str4;
        this.name = str5;
    }

    public static /* synthetic */ Genre copy$default(Genre genre, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = genre.f26149id;
        }
        if ((i10 & 2) != 0) {
            str2 = genre.textImageUrl;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = genre.bannerSmallImageUrl;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = genre.bannerBigImageUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = genre.name;
        }
        return genre.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.f26149id;
    }

    public final String component2() {
        return this.textImageUrl;
    }

    public final String component3() {
        return this.bannerSmallImageUrl;
    }

    public final String component4() {
        return this.bannerBigImageUrl;
    }

    public final String component5() {
        return this.name;
    }

    public final Genre copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "textImageUrl");
        p.h(str3, "bannerSmallImageUrl");
        p.h(str4, "bannerBigImageUrl");
        p.h(str5, "name");
        return new Genre(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Genre) {
            Genre genre = (Genre) obj;
            return p.c(this.f26149id, genre.f26149id) && p.c(this.textImageUrl, genre.textImageUrl) && p.c(this.bannerSmallImageUrl, genre.bannerSmallImageUrl) && p.c(this.bannerBigImageUrl, genre.bannerBigImageUrl) && p.c(this.name, genre.name);
        }
        return false;
    }

    public final String getBannerBigImageUrl() {
        return this.bannerBigImageUrl;
    }

    public final String getBannerSmallImageUrl() {
        return this.bannerSmallImageUrl;
    }

    public final String getId() {
        return this.f26149id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTextImageUrl() {
        return this.textImageUrl;
    }

    public int hashCode() {
        return (((((((this.f26149id.hashCode() * 31) + this.textImageUrl.hashCode()) * 31) + this.bannerSmallImageUrl.hashCode()) * 31) + this.bannerBigImageUrl.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "Genre(id=" + this.f26149id + ", textImageUrl=" + this.textImageUrl + ", bannerSmallImageUrl=" + this.bannerSmallImageUrl + ", bannerBigImageUrl=" + this.bannerBigImageUrl + ", name=" + this.name + ')';
    }
}
