package com.dena.mirrorman.net.fme;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class FmeData {
    public static final int $stable = 8;
    private final List<FmeEventTiming> eventTimings;
    private final String fileId;
    private final FmeInfo info;
    private final FmeLyrics lyrics;

    public FmeData(String str, FmeInfo fmeInfo, FmeLyrics fmeLyrics, List<FmeEventTiming> list) {
        p.h(str, "fileId");
        p.h(fmeInfo, "info");
        p.h(fmeLyrics, "lyrics");
        p.h(list, "eventTimings");
        this.fileId = str;
        this.info = fmeInfo;
        this.lyrics = fmeLyrics;
        this.eventTimings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FmeData copy$default(FmeData fmeData, String str, FmeInfo fmeInfo, FmeLyrics fmeLyrics, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fmeData.fileId;
        }
        if ((i10 & 2) != 0) {
            fmeInfo = fmeData.info;
        }
        if ((i10 & 4) != 0) {
            fmeLyrics = fmeData.lyrics;
        }
        if ((i10 & 8) != 0) {
            list = fmeData.eventTimings;
        }
        return fmeData.copy(str, fmeInfo, fmeLyrics, list);
    }

    public final String component1() {
        return this.fileId;
    }

    public final FmeInfo component2() {
        return this.info;
    }

    public final FmeLyrics component3() {
        return this.lyrics;
    }

    public final List<FmeEventTiming> component4() {
        return this.eventTimings;
    }

    public final FmeData copy(String str, FmeInfo fmeInfo, FmeLyrics fmeLyrics, List<FmeEventTiming> list) {
        p.h(str, "fileId");
        p.h(fmeInfo, "info");
        p.h(fmeLyrics, "lyrics");
        p.h(list, "eventTimings");
        return new FmeData(str, fmeInfo, fmeLyrics, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FmeData) {
            FmeData fmeData = (FmeData) obj;
            return p.c(this.fileId, fmeData.fileId) && p.c(this.info, fmeData.info) && p.c(this.lyrics, fmeData.lyrics) && p.c(this.eventTimings, fmeData.eventTimings);
        }
        return false;
    }

    public final List<FmeEventTiming> getEventTimings() {
        return this.eventTimings;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final FmeInfo getInfo() {
        return this.info;
    }

    public final FmeLyrics getLyrics() {
        return this.lyrics;
    }

    public int hashCode() {
        return (((((this.fileId.hashCode() * 31) + this.info.hashCode()) * 31) + this.lyrics.hashCode()) * 31) + this.eventTimings.hashCode();
    }

    public String toString() {
        return "FmeData(fileId=" + this.fileId + ", info=" + this.info + ", lyrics=" + this.lyrics + ", eventTimings=" + this.eventTimings + ')';
    }
}
