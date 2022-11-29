package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class GroupShotBackground {
    public static final int $stable = 0;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f26154id;
    private final String imageUrl;

    public GroupShotBackground(int i10, String str, String str2) {
        p.h(str, "iconUrl");
        p.h(str2, "imageUrl");
        this.f26154id = i10;
        this.iconUrl = str;
        this.imageUrl = str2;
    }

    public static /* synthetic */ GroupShotBackground copy$default(GroupShotBackground groupShotBackground, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = groupShotBackground.f26154id;
        }
        if ((i11 & 2) != 0) {
            str = groupShotBackground.iconUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = groupShotBackground.imageUrl;
        }
        return groupShotBackground.copy(i10, str, str2);
    }

    public final int component1() {
        return this.f26154id;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final GroupShotBackground copy(int i10, String str, String str2) {
        p.h(str, "iconUrl");
        p.h(str2, "imageUrl");
        return new GroupShotBackground(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotBackground) {
            GroupShotBackground groupShotBackground = (GroupShotBackground) obj;
            return this.f26154id == groupShotBackground.f26154id && p.c(this.iconUrl, groupShotBackground.iconUrl) && p.c(this.imageUrl, groupShotBackground.imageUrl);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f26154id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f26154id) * 31) + this.iconUrl.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "GroupShotBackground(id=" + this.f26154id + ", iconUrl=" + this.iconUrl + ", imageUrl=" + this.imageUrl + ')';
    }
}
