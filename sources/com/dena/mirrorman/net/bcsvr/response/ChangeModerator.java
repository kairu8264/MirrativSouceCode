package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ChangeModerator {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isAppoint;
    private final String moderatorUserId;

    /* renamed from: t  reason: collision with root package name */
    private final int f26180t;

    public ChangeModerator(int i10, String str, boolean z10) {
        p.h(str, "moderatorUserId");
        this.f26180t = i10;
        this.moderatorUserId = str;
        this.isAppoint = z10;
    }

    public static /* synthetic */ ChangeModerator copy$default(ChangeModerator changeModerator, int i10, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = changeModerator.f26180t;
        }
        if ((i11 & 2) != 0) {
            str = changeModerator.moderatorUserId;
        }
        if ((i11 & 4) != 0) {
            z10 = changeModerator.isAppoint;
        }
        return changeModerator.copy(i10, str, z10);
    }

    public final int component1() {
        return this.f26180t;
    }

    public final String component2() {
        return this.moderatorUserId;
    }

    public final boolean component3() {
        return this.isAppoint;
    }

    public final ChangeModerator copy(int i10, String str, boolean z10) {
        p.h(str, "moderatorUserId");
        return new ChangeModerator(i10, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeModerator) {
            ChangeModerator changeModerator = (ChangeModerator) obj;
            return this.f26180t == changeModerator.f26180t && p.c(this.moderatorUserId, changeModerator.moderatorUserId) && this.isAppoint == changeModerator.isAppoint;
        }
        return false;
    }

    public final String getModeratorUserId() {
        return this.moderatorUserId;
    }

    public final int getT() {
        return this.f26180t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f26180t) * 31) + this.moderatorUserId.hashCode()) * 31;
        boolean z10 = this.isAppoint;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isAppoint() {
        return this.isAppoint;
    }

    public String toString() {
        return "ChangeModerator(t=" + this.f26180t + ", moderatorUserId=" + this.moderatorUserId + ", isAppoint=" + this.isAppoint + ')';
    }
}
