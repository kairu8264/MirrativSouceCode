package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class Singers {
    public static final int $stable = 8;
    private final int currentPage;
    private final Integer nextPage;
    private final Integer previousPage;
    private final List<Singer> singers;

    public Singers(List<Singer> list, Integer num, Integer num2, int i10) {
        p.h(list, "singers");
        this.singers = list;
        this.nextPage = num;
        this.previousPage = num2;
        this.currentPage = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Singers copy$default(Singers singers, List list, Integer num, Integer num2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = singers.singers;
        }
        if ((i11 & 2) != 0) {
            num = singers.nextPage;
        }
        if ((i11 & 4) != 0) {
            num2 = singers.previousPage;
        }
        if ((i11 & 8) != 0) {
            i10 = singers.currentPage;
        }
        return singers.copy(list, num, num2, i10);
    }

    public final List<Singer> component1() {
        return this.singers;
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

    public final Singers copy(List<Singer> list, Integer num, Integer num2, int i10) {
        p.h(list, "singers");
        return new Singers(list, num, num2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Singers) {
            Singers singers = (Singers) obj;
            return p.c(this.singers, singers.singers) && p.c(this.nextPage, singers.nextPage) && p.c(this.previousPage, singers.previousPage) && this.currentPage == singers.currentPage;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final Integer getNextPage() {
        return this.nextPage;
    }

    public final Integer getPreviousPage() {
        return this.previousPage;
    }

    public final List<Singer> getSingers() {
        return this.singers;
    }

    public int hashCode() {
        int hashCode = this.singers.hashCode() * 31;
        Integer num = this.nextPage;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.previousPage;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "Singers(singers=" + this.singers + ", nextPage=" + this.nextPage + ", previousPage=" + this.previousPage + ", currentPage=" + this.currentPage + ')';
    }
}
