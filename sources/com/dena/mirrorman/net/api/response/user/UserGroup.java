package com.dena.mirrorman.net.api.response.user;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class UserGroup {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private final String f26178id;
    private final List<String> imageUrls;
    private final String name;
    private final int userNum;

    public UserGroup() {
        this(null, null, null, 0, 15, null);
    }

    public UserGroup(String str, String str2, List<String> list, int i10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "name");
        p.h(list, "imageUrls");
        this.f26178id = str;
        this.name = str2;
        this.imageUrls = list;
        this.userNum = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserGroup copy$default(UserGroup userGroup, String str, String str2, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userGroup.f26178id;
        }
        if ((i11 & 2) != 0) {
            str2 = userGroup.name;
        }
        if ((i11 & 4) != 0) {
            list = userGroup.imageUrls;
        }
        if ((i11 & 8) != 0) {
            i10 = userGroup.userNum;
        }
        return userGroup.copy(str, str2, list, i10);
    }

    public final String component1() {
        return this.f26178id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<String> component3() {
        return this.imageUrls;
    }

    public final int component4() {
        return this.userNum;
    }

    public final UserGroup copy(String str, String str2, List<String> list, int i10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "name");
        p.h(list, "imageUrls");
        return new UserGroup(str, str2, list, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserGroup) {
            UserGroup userGroup = (UserGroup) obj;
            return p.c(this.f26178id, userGroup.f26178id) && p.c(this.name, userGroup.name) && p.c(this.imageUrls, userGroup.imageUrls) && this.userNum == userGroup.userNum;
        }
        return false;
    }

    public final String getId() {
        return this.f26178id;
    }

    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUserNum() {
        return this.userNum;
    }

    public int hashCode() {
        return (((((this.f26178id.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrls.hashCode()) * 31) + Integer.hashCode(this.userNum);
    }

    public String toString() {
        return "UserGroup(id=" + this.f26178id + ", name=" + this.name + ", imageUrls=" + this.imageUrls + ", userNum=" + this.userNum + ')';
    }

    public /* synthetic */ UserGroup(String str, String str2, List list, int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? s.k() : list, (i11 & 8) != 0 ? 0 : i10);
    }
}
