package com.dena.mirrativ.mirrativapi.otherfeatures.passbook.orb;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class OrbHistory {
    private final long createdAt;
    private final long expiresAt;
    private final String label;
    @c("diamond")
    private final long orb;
    private final int type;

    public OrbHistory(int i10, long j10, String str, long j11, long j12) {
        this.type = i10;
        this.orb = j10;
        this.label = str;
        this.createdAt = j11;
        this.expiresAt = j12;
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.orb;
    }

    public final String component3() {
        return this.label;
    }

    public final long component4() {
        return this.createdAt;
    }

    public final long component5() {
        return this.expiresAt;
    }

    public final OrbHistory copy(int i10, long j10, String str, long j11, long j12) {
        return new OrbHistory(i10, j10, str, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrbHistory) {
            OrbHistory orbHistory = (OrbHistory) obj;
            return this.type == orbHistory.type && this.orb == orbHistory.orb && p.c(this.label, orbHistory.label) && this.createdAt == orbHistory.createdAt && this.expiresAt == orbHistory.expiresAt;
        }
        return false;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getOrb() {
        return this.orb;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.type) * 31) + Long.hashCode(this.orb)) * 31;
        String str = this.label;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.expiresAt);
    }

    public String toString() {
        return "OrbHistory(type=" + this.type + ", orb=" + this.orb + ", label=" + this.label + ", createdAt=" + this.createdAt + ", expiresAt=" + this.expiresAt + ')';
    }
}
