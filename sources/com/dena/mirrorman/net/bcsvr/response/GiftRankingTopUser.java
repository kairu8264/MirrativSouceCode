package com.dena.mirrorman.net.bcsvr.response;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftRankingTopUser {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeUrl;
    @c("iurl")
    private final String iconUrl;

    /* renamed from: t  reason: collision with root package name */
    private final int f26184t;
    @c("u")
    private final String userId;

    public GiftRankingTopUser(int i10, String str, String str2, String str3) {
        this.f26184t = i10;
        this.userId = str;
        this.iconUrl = str2;
        this.badgeUrl = str3;
    }

    public static /* synthetic */ GiftRankingTopUser copy$default(GiftRankingTopUser giftRankingTopUser, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftRankingTopUser.f26184t;
        }
        if ((i11 & 2) != 0) {
            str = giftRankingTopUser.userId;
        }
        if ((i11 & 4) != 0) {
            str2 = giftRankingTopUser.iconUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = giftRankingTopUser.badgeUrl;
        }
        return giftRankingTopUser.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.f26184t;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.badgeUrl;
    }

    public final GiftRankingTopUser copy(int i10, String str, String str2, String str3) {
        return new GiftRankingTopUser(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingTopUser) {
            GiftRankingTopUser giftRankingTopUser = (GiftRankingTopUser) obj;
            return this.f26184t == giftRankingTopUser.f26184t && p.c(this.userId, giftRankingTopUser.userId) && p.c(this.iconUrl, giftRankingTopUser.iconUrl) && p.c(this.badgeUrl, giftRankingTopUser.badgeUrl);
        }
        return false;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getT() {
        return this.f26184t;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f26184t) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GiftRankingTopUser(t=" + this.f26184t + ", userId=" + this.userId + ", iconUrl=" + this.iconUrl + ", badgeUrl=" + this.badgeUrl + ')';
    }
}
