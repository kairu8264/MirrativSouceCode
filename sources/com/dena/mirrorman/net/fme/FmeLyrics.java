package com.dena.mirrorman.net.fme;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class FmeLyrics {
    public static final int $stable = 8;
    private final List<String> colors;
    private final List<FmeLyricsData> lyricsDataList;

    public FmeLyrics(List<String> list, List<FmeLyricsData> list2) {
        p.h(list, "colors");
        p.h(list2, "lyricsDataList");
        this.colors = list;
        this.lyricsDataList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FmeLyrics copy$default(FmeLyrics fmeLyrics, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = fmeLyrics.colors;
        }
        if ((i10 & 2) != 0) {
            list2 = fmeLyrics.lyricsDataList;
        }
        return fmeLyrics.copy(list, list2);
    }

    public final List<String> component1() {
        return this.colors;
    }

    public final List<FmeLyricsData> component2() {
        return this.lyricsDataList;
    }

    public final FmeLyrics copy(List<String> list, List<FmeLyricsData> list2) {
        p.h(list, "colors");
        p.h(list2, "lyricsDataList");
        return new FmeLyrics(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FmeLyrics) {
            FmeLyrics fmeLyrics = (FmeLyrics) obj;
            return p.c(this.colors, fmeLyrics.colors) && p.c(this.lyricsDataList, fmeLyrics.lyricsDataList);
        }
        return false;
    }

    public final List<String> getColors() {
        return this.colors;
    }

    public final List<FmeLyricsData> getLyricsDataList() {
        return this.lyricsDataList;
    }

    public int hashCode() {
        return (this.colors.hashCode() * 31) + this.lyricsDataList.hashCode();
    }

    public String toString() {
        return "FmeLyrics(colors=" + this.colors + ", lyricsDataList=" + this.lyricsDataList + ')';
    }
}
