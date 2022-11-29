package com.dena.mirrorman.net.bcsvr.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class RankingUser implements Parcelable {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    @c("burl")
    private final String badgeUrl;
    @c("iurl")
    private final String iconUrl;
    @c("u")
    private final String userId;

    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<RankingUser> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RankingUser createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new RankingUser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RankingUser[] newArray(int i10) {
            return new RankingUser[i10];
        }
    }

    public RankingUser(String str, String str2, String str3) {
        this.userId = str;
        this.iconUrl = str2;
        this.badgeUrl = str3;
    }

    public static /* synthetic */ RankingUser copy$default(RankingUser rankingUser, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rankingUser.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = rankingUser.iconUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = rankingUser.badgeUrl;
        }
        return rankingUser.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.badgeUrl;
    }

    public final RankingUser copy(String str, String str2, String str3) {
        return new RankingUser(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RankingUser) {
            RankingUser rankingUser = (RankingUser) obj;
            return p.c(this.userId, rankingUser.userId) && p.c(this.iconUrl, rankingUser.iconUrl) && p.c(this.badgeUrl, rankingUser.badgeUrl);
        }
        return false;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RankingUser(userId=" + this.userId + ", iconUrl=" + this.iconUrl + ", badgeUrl=" + this.badgeUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "parcel");
        parcel.writeString(this.userId);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.badgeUrl);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RankingUser(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        p.h(parcel, "parcel");
    }
}
