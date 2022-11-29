package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.YellRankType;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class YelledUser implements Parcelable {
    private final String catalogLabelImageUrl;
    private final String name;
    private final int order;
    private final String profileImageUrl;
    private final String userId;
    private final int yellLevel;
    @b(YellRankType.TypeAdapter.class)
    private final YellRankType yellRank;
    public static final Parcelable.Creator<YelledUser> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<YelledUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YelledUser createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new YelledUser(parcel.readInt(), YellRankType.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YelledUser[] newArray(int i10) {
            return new YelledUser[i10];
        }
    }

    public YelledUser(int i10, YellRankType yellRankType, int i11, String str, String str2, String str3, String str4) {
        p.h(yellRankType, "yellRank");
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(str4, "userId");
        this.order = i10;
        this.yellRank = yellRankType;
        this.yellLevel = i11;
        this.name = str;
        this.profileImageUrl = str2;
        this.catalogLabelImageUrl = str3;
        this.userId = str4;
    }

    public static /* synthetic */ YelledUser copy$default(YelledUser yelledUser, int i10, YellRankType yellRankType, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = yelledUser.order;
        }
        if ((i12 & 2) != 0) {
            yellRankType = yelledUser.yellRank;
        }
        YellRankType yellRankType2 = yellRankType;
        if ((i12 & 4) != 0) {
            i11 = yelledUser.yellLevel;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str = yelledUser.name;
        }
        String str5 = str;
        if ((i12 & 16) != 0) {
            str2 = yelledUser.profileImageUrl;
        }
        String str6 = str2;
        if ((i12 & 32) != 0) {
            str3 = yelledUser.catalogLabelImageUrl;
        }
        String str7 = str3;
        if ((i12 & 64) != 0) {
            str4 = yelledUser.userId;
        }
        return yelledUser.copy(i10, yellRankType2, i13, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.order;
    }

    public final YellRankType component2() {
        return this.yellRank;
    }

    public final int component3() {
        return this.yellLevel;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.profileImageUrl;
    }

    public final String component6() {
        return this.catalogLabelImageUrl;
    }

    public final String component7() {
        return this.userId;
    }

    public final YelledUser copy(int i10, YellRankType yellRankType, int i11, String str, String str2, String str3, String str4) {
        p.h(yellRankType, "yellRank");
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(str4, "userId");
        return new YelledUser(i10, yellRankType, i11, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YelledUser) {
            YelledUser yelledUser = (YelledUser) obj;
            return this.order == yelledUser.order && this.yellRank == yelledUser.yellRank && this.yellLevel == yelledUser.yellLevel && p.c(this.name, yelledUser.name) && p.c(this.profileImageUrl, yelledUser.profileImageUrl) && p.c(this.catalogLabelImageUrl, yelledUser.catalogLabelImageUrl) && p.c(this.userId, yelledUser.userId);
        }
        return false;
    }

    public final String getCatalogLabelImageUrl() {
        return this.catalogLabelImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final YellRankType getYellRank() {
        return this.yellRank;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.order) * 31) + this.yellRank.hashCode()) * 31) + Integer.hashCode(this.yellLevel)) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31;
        String str = this.catalogLabelImageUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "YelledUser(order=" + this.order + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ", catalogLabelImageUrl=" + this.catalogLabelImageUrl + ", userId=" + this.userId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.order);
        parcel.writeString(this.yellRank.name());
        parcel.writeInt(this.yellLevel);
        parcel.writeString(this.name);
        parcel.writeString(this.profileImageUrl);
        parcel.writeString(this.catalogLabelImageUrl);
        parcel.writeString(this.userId);
    }
}
