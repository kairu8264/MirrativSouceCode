package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class Pose {
    public static final int $stable = 0;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f26159id;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimited;
    private final String value;

    public Pose(int i10, String str, String str2, boolean z10) {
        p.h(str, "value");
        p.h(str2, "iconUrl");
        this.f26159id = i10;
        this.value = str;
        this.iconUrl = str2;
        this.isLimited = z10;
    }

    public static /* synthetic */ Pose copy$default(Pose pose, int i10, String str, String str2, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pose.f26159id;
        }
        if ((i11 & 2) != 0) {
            str = pose.value;
        }
        if ((i11 & 4) != 0) {
            str2 = pose.iconUrl;
        }
        if ((i11 & 8) != 0) {
            z10 = pose.isLimited;
        }
        return pose.copy(i10, str, str2, z10);
    }

    public final int component1() {
        return this.f26159id;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final boolean component4() {
        return this.isLimited;
    }

    public final Pose copy(int i10, String str, String str2, boolean z10) {
        p.h(str, "value");
        p.h(str2, "iconUrl");
        return new Pose(i10, str, str2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pose) {
            Pose pose = (Pose) obj;
            return this.f26159id == pose.f26159id && p.c(this.value, pose.value) && p.c(this.iconUrl, pose.iconUrl) && this.isLimited == pose.isLimited;
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f26159id;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f26159id) * 31) + this.value.hashCode()) * 31) + this.iconUrl.hashCode()) * 31;
        boolean z10 = this.isLimited;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isLimited() {
        return this.isLimited;
    }

    public String toString() {
        return "Pose(id=" + this.f26159id + ", value=" + this.value + ", iconUrl=" + this.iconUrl + ", isLimited=" + this.isLimited + ')';
    }
}
