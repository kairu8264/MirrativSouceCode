package com.dena.mirrorman.net.api.response.live;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveOwnedCustomResolutions {
    public static final int $stable = 8;

    /* renamed from: h  reason: collision with root package name */
    private String f26169h;

    /* renamed from: l  reason: collision with root package name */
    private String f26170l;

    /* renamed from: m  reason: collision with root package name */
    private String f26171m;

    public LiveOwnedCustomResolutions() {
        this(null, null, null, 7, null);
    }

    public LiveOwnedCustomResolutions(String str, String str2, String str3) {
        this.f26169h = str;
        this.f26171m = str2;
        this.f26170l = str3;
    }

    public static /* synthetic */ LiveOwnedCustomResolutions copy$default(LiveOwnedCustomResolutions liveOwnedCustomResolutions, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveOwnedCustomResolutions.f26169h;
        }
        if ((i10 & 2) != 0) {
            str2 = liveOwnedCustomResolutions.f26171m;
        }
        if ((i10 & 4) != 0) {
            str3 = liveOwnedCustomResolutions.f26170l;
        }
        return liveOwnedCustomResolutions.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f26169h;
    }

    public final String component2() {
        return this.f26171m;
    }

    public final String component3() {
        return this.f26170l;
    }

    public final LiveOwnedCustomResolutions copy(String str, String str2, String str3) {
        return new LiveOwnedCustomResolutions(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveOwnedCustomResolutions) {
            LiveOwnedCustomResolutions liveOwnedCustomResolutions = (LiveOwnedCustomResolutions) obj;
            return p.c(this.f26169h, liveOwnedCustomResolutions.f26169h) && p.c(this.f26171m, liveOwnedCustomResolutions.f26171m) && p.c(this.f26170l, liveOwnedCustomResolutions.f26170l);
        }
        return false;
    }

    public final String getH() {
        return this.f26169h;
    }

    public final String getL() {
        return this.f26170l;
    }

    public final String getM() {
        return this.f26171m;
    }

    public int hashCode() {
        String str = this.f26169h;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26171m;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26170l;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setH(String str) {
        this.f26169h = str;
    }

    public final void setL(String str) {
        this.f26170l = str;
    }

    public final void setM(String str) {
        this.f26171m = str;
    }

    public String toString() {
        return "LiveOwnedCustomResolutions(h=" + this.f26169h + ", m=" + this.f26171m + ", l=" + this.f26170l + ')';
    }

    public /* synthetic */ LiveOwnedCustomResolutions(String str, String str2, String str3, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
