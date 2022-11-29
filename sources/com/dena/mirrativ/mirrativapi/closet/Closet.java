package com.dena.mirrativ.mirrativapi.closet;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class Closet {
    private boolean active;
    private final String avatarBackgroundImageUrl;
    private final String avatarBodyImageUrl;
    private final String avatarFaceImageUrl;
    private final int closetId;
    private String name;
    private boolean nameEdit;
    private final String updatedAt;

    public Closet(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        p.h(str, "name");
        p.h(str2, "updatedAt");
        this.closetId = i10;
        this.name = str;
        this.updatedAt = str2;
        this.avatarFaceImageUrl = str3;
        this.avatarBodyImageUrl = str4;
        this.avatarBackgroundImageUrl = str5;
        this.active = z10;
        this.nameEdit = z11;
    }

    public final int component1() {
        return this.closetId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.avatarFaceImageUrl;
    }

    public final String component5() {
        return this.avatarBodyImageUrl;
    }

    public final String component6() {
        return this.avatarBackgroundImageUrl;
    }

    public final boolean component7() {
        return this.active;
    }

    public final boolean component8() {
        return this.nameEdit;
    }

    public final Closet copy(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        p.h(str, "name");
        p.h(str2, "updatedAt");
        return new Closet(i10, str, str2, str3, str4, str5, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Closet) {
            Closet closet = (Closet) obj;
            return this.closetId == closet.closetId && p.c(this.name, closet.name) && p.c(this.updatedAt, closet.updatedAt) && p.c(this.avatarFaceImageUrl, closet.avatarFaceImageUrl) && p.c(this.avatarBodyImageUrl, closet.avatarBodyImageUrl) && p.c(this.avatarBackgroundImageUrl, closet.avatarBackgroundImageUrl) && this.active == closet.active && this.nameEdit == closet.nameEdit;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getAvatarBackgroundImageUrl() {
        return this.avatarBackgroundImageUrl;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final String getAvatarFaceImageUrl() {
        return this.avatarFaceImageUrl;
    }

    public final int getClosetId() {
        return this.closetId;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNameEdit() {
        return this.nameEdit;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.closetId) * 31) + this.name.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        String str = this.avatarFaceImageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarBodyImageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarBackgroundImageUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.active;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode4 + i10) * 31;
        boolean z11 = this.nameEdit;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isUsed() {
        return !p.c(this.updatedAt, "0");
    }

    public final void setActive(boolean z10) {
        this.active = z10;
    }

    public final void setName(String str) {
        p.h(str, "<set-?>");
        this.name = str;
    }

    public final void setNameEdit(boolean z10) {
        this.nameEdit = z10;
    }

    public String toString() {
        return "Closet(closetId=" + this.closetId + ", name=" + this.name + ", updatedAt=" + this.updatedAt + ", avatarFaceImageUrl=" + this.avatarFaceImageUrl + ", avatarBodyImageUrl=" + this.avatarBodyImageUrl + ", avatarBackgroundImageUrl=" + this.avatarBackgroundImageUrl + ", active=" + this.active + ", nameEdit=" + this.nameEdit + ')';
    }

    public /* synthetic */ Closet(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i11, h hVar) {
        this(i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "0" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) == 0 ? str5 : null, (i11 & 64) != 0 ? false : z10, (i11 & 128) == 0 ? z11 : false);
    }
}
