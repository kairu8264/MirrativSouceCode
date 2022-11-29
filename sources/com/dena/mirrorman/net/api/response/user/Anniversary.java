package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import ym.b;

/* loaded from: classes2.dex */
public final class Anniversary implements Serializable {
    public static final int $stable = 8;
    private int count;
    @b(AnniversaryTypeAdapter.class)
    private AnniversaryType type;

    public Anniversary(AnniversaryType anniversaryType, int i10) {
        this.type = anniversaryType;
        this.count = i10;
    }

    public static /* synthetic */ Anniversary copy$default(Anniversary anniversary, AnniversaryType anniversaryType, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            anniversaryType = anniversary.type;
        }
        if ((i11 & 2) != 0) {
            i10 = anniversary.count;
        }
        return anniversary.copy(anniversaryType, i10);
    }

    public final AnniversaryType component1() {
        return this.type;
    }

    public final int component2() {
        return this.count;
    }

    public final Anniversary copy(AnniversaryType anniversaryType, int i10) {
        return new Anniversary(anniversaryType, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Anniversary) {
            Anniversary anniversary = (Anniversary) obj;
            return this.type == anniversary.type && this.count == anniversary.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final AnniversaryType getType() {
        return this.type;
    }

    public int hashCode() {
        AnniversaryType anniversaryType = this.type;
        return ((anniversaryType == null ? 0 : anniversaryType.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public final void setType(AnniversaryType anniversaryType) {
        this.type = anniversaryType;
    }

    public String toString() {
        return "Anniversary(type=" + this.type + ", count=" + this.count + ')';
    }
}
