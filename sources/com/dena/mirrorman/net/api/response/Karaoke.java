package com.dena.mirrorman.net.api.response;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class Karaoke implements Serializable {
    public static final int $stable = 8;
    private final List<String> genreIds;

    /* renamed from: id  reason: collision with root package name */
    private final int f26155id;
    private final int playingTime;
    private final String singerId;
    private final String singerName;
    private final String title;

    public Karaoke(int i10, String str, int i11, String str2, String str3, List<String> list) {
        p.h(str, "title");
        p.h(str2, "singerId");
        p.h(str3, "singerName");
        p.h(list, "genreIds");
        this.f26155id = i10;
        this.title = str;
        this.playingTime = i11;
        this.singerId = str2;
        this.singerName = str3;
        this.genreIds = list;
    }

    public static /* synthetic */ Karaoke copy$default(Karaoke karaoke, int i10, String str, int i11, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = karaoke.f26155id;
        }
        if ((i12 & 2) != 0) {
            str = karaoke.title;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            i11 = karaoke.playingTime;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = karaoke.singerId;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = karaoke.singerName;
        }
        String str6 = str3;
        List<String> list2 = list;
        if ((i12 & 32) != 0) {
            list2 = karaoke.genreIds;
        }
        return karaoke.copy(i10, str4, i13, str5, str6, list2);
    }

    public final int component1() {
        return this.f26155id;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.playingTime;
    }

    public final String component4() {
        return this.singerId;
    }

    public final String component5() {
        return this.singerName;
    }

    public final List<String> component6() {
        return this.genreIds;
    }

    public final Karaoke copy(int i10, String str, int i11, String str2, String str3, List<String> list) {
        p.h(str, "title");
        p.h(str2, "singerId");
        p.h(str3, "singerName");
        p.h(list, "genreIds");
        return new Karaoke(i10, str, i11, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Karaoke) {
            Karaoke karaoke = (Karaoke) obj;
            return this.f26155id == karaoke.f26155id && p.c(this.title, karaoke.title) && this.playingTime == karaoke.playingTime && p.c(this.singerId, karaoke.singerId) && p.c(this.singerName, karaoke.singerName) && p.c(this.genreIds, karaoke.genreIds);
        }
        return false;
    }

    public final List<String> getGenreIds() {
        return this.genreIds;
    }

    public final int getId() {
        return this.f26155id;
    }

    public final int getPlayingTime() {
        return this.playingTime;
    }

    public final String getSingerId() {
        return this.singerId;
    }

    public final String getSingerName() {
        return this.singerName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f26155id) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.playingTime)) * 31) + this.singerId.hashCode()) * 31) + this.singerName.hashCode()) * 31) + this.genreIds.hashCode();
    }

    public String toString() {
        return "Karaoke(id=" + this.f26155id + ", title=" + this.title + ", playingTime=" + this.playingTime + ", singerId=" + this.singerId + ", singerName=" + this.singerName + ", genreIds=" + this.genreIds + ')';
    }
}
