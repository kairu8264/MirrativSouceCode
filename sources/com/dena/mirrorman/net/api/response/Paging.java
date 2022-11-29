package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public final class Paging {
    public static final int $stable = 0;
    private final int currentPage;
    private final int nextPage;

    public Paging() {
        this(0, 0, 3, null);
    }

    public Paging(int i10, int i11) {
        this.nextPage = i10;
        this.currentPage = i11;
    }

    public static /* synthetic */ Paging copy$default(Paging paging, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = paging.nextPage;
        }
        if ((i12 & 2) != 0) {
            i11 = paging.currentPage;
        }
        return paging.copy(i10, i11);
    }

    public final int component1() {
        return this.nextPage;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final Paging copy(int i10, int i11) {
        return new Paging(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Paging) {
            Paging paging = (Paging) obj;
            return this.nextPage == paging.nextPage && this.currentPage == paging.currentPage;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public int hashCode() {
        return (Integer.hashCode(this.nextPage) * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "Paging(nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ')';
    }

    public /* synthetic */ Paging(int i10, int i11, int i12, h hVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
