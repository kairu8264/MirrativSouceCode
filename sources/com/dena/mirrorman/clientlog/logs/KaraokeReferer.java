package com.dena.mirrorman.clientlog.logs;

import jo.h;
import jo.p;
import xm.e;
import ym.c;

/* loaded from: classes2.dex */
public final class KaraokeReferer {
    public static final int $stable = 0;
    @c("genre_id")
    private final String genreId;
    @c("genre_name")
    private final String genreName;
    @c("page_name")
    private final String pageName;
    @c("section")
    private final String section;
    @c("singer_id")
    private final String singerId;
    @c("singer_name")
    private final String singerName;

    public KaraokeReferer(String str, String str2, String str3, String str4, String str5, String str6) {
        p.h(str, "pageName");
        this.pageName = str;
        this.singerName = str2;
        this.singerId = str3;
        this.genreName = str4;
        this.genreId = str5;
        this.section = str6;
    }

    public final String getGenreId() {
        return this.genreId;
    }

    public final String getGenreName() {
        return this.genreName;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getSingerId() {
        return this.singerId;
    }

    public final String getSingerName() {
        return this.singerName;
    }

    public final String toJson() {
        String t10 = new e().t(this, KaraokeReferer.class);
        p.g(t10, "Gson().toJson(this, KaraokeReferer::class.java)");
        return t10;
    }

    public /* synthetic */ KaraokeReferer(String str, String str2, String str3, String str4, String str5, String str6, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) == 0 ? str6 : null);
    }
}
