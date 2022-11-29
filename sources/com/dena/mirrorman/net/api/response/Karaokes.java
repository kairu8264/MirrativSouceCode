package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class Karaokes {
    public static final int $stable = 8;
    private final int currentPage;
    private final List<Karaoke> karaokes;
    private final Integer nextPage;
    private final Integer previousPage;

    public Karaokes(List<Karaoke> list, Integer num, Integer num2, int i10) {
        p.h(list, "karaokes");
        this.karaokes = list;
        this.nextPage = num;
        this.previousPage = num2;
        this.currentPage = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Karaokes copy$default(Karaokes karaokes, List list, Integer num, Integer num2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = karaokes.karaokes;
        }
        if ((i11 & 2) != 0) {
            num = karaokes.nextPage;
        }
        if ((i11 & 4) != 0) {
            num2 = karaokes.previousPage;
        }
        if ((i11 & 8) != 0) {
            i10 = karaokes.currentPage;
        }
        return karaokes.copy(list, num, num2, i10);
    }

    public final List<Karaoke> component1() {
        return this.karaokes;
    }

    public final Integer component2() {
        return this.nextPage;
    }

    public final Integer component3() {
        return this.previousPage;
    }

    public final int component4() {
        return this.currentPage;
    }

    public final Karaokes copy(List<Karaoke> list, Integer num, Integer num2, int i10) {
        p.h(list, "karaokes");
        return new Karaokes(list, num, num2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Karaokes) {
            Karaokes karaokes = (Karaokes) obj;
            return p.c(this.karaokes, karaokes.karaokes) && p.c(this.nextPage, karaokes.nextPage) && p.c(this.previousPage, karaokes.previousPage) && this.currentPage == karaokes.currentPage;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final List<Karaoke> getKaraokes() {
        return this.karaokes;
    }

    public final Integer getNextPage() {
        return this.nextPage;
    }

    public final Integer getPreviousPage() {
        return this.previousPage;
    }

    public int hashCode() {
        int hashCode = this.karaokes.hashCode() * 31;
        Integer num = this.nextPage;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.previousPage;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "Karaokes(karaokes=" + this.karaokes + ", nextPage=" + this.nextPage + ", previousPage=" + this.previousPage + ", currentPage=" + this.currentPage + ')';
    }
}
