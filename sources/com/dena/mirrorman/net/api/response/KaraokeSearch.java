package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class KaraokeSearch {
    public static final int $stable = 8;
    private final List<Karaoke> karaokes;
    private String keyward;
    private final List<Singer> singers;

    public KaraokeSearch(String str, List<Karaoke> list, List<Singer> list2) {
        p.h(str, "keyward");
        p.h(list, "karaokes");
        p.h(list2, "singers");
        this.keyward = str;
        this.karaokes = list;
        this.singers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KaraokeSearch copy$default(KaraokeSearch karaokeSearch, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = karaokeSearch.keyward;
        }
        if ((i10 & 2) != 0) {
            list = karaokeSearch.karaokes;
        }
        if ((i10 & 4) != 0) {
            list2 = karaokeSearch.singers;
        }
        return karaokeSearch.copy(str, list, list2);
    }

    public final String component1() {
        return this.keyward;
    }

    public final List<Karaoke> component2() {
        return this.karaokes;
    }

    public final List<Singer> component3() {
        return this.singers;
    }

    public final KaraokeSearch copy(String str, List<Karaoke> list, List<Singer> list2) {
        p.h(str, "keyward");
        p.h(list, "karaokes");
        p.h(list2, "singers");
        return new KaraokeSearch(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KaraokeSearch) {
            KaraokeSearch karaokeSearch = (KaraokeSearch) obj;
            return p.c(this.keyward, karaokeSearch.keyward) && p.c(this.karaokes, karaokeSearch.karaokes) && p.c(this.singers, karaokeSearch.singers);
        }
        return false;
    }

    public final List<Karaoke> getKaraokes() {
        return this.karaokes;
    }

    public final String getKeyward() {
        return this.keyward;
    }

    public final List<Singer> getSingers() {
        return this.singers;
    }

    public int hashCode() {
        return (((this.keyward.hashCode() * 31) + this.karaokes.hashCode()) * 31) + this.singers.hashCode();
    }

    public final void setKeyward(String str) {
        p.h(str, "<set-?>");
        this.keyward = str;
    }

    public String toString() {
        return "KaraokeSearch(keyward=" + this.keyward + ", karaokes=" + this.karaokes + ", singers=" + this.singers + ')';
    }

    public /* synthetic */ KaraokeSearch(String str, List list, List list2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, list, list2);
    }
}
