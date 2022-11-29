package com.dena.mirrativ.mirrativapi.emomo.event;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftGachaUserBasic implements Parcelable {
    public static final Parcelable.Creator<GiftGachaUserBasic> CREATOR = new Creator();
    private final String name;
    private final String profileImageUrl;
    private final int userId;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<GiftGachaUserBasic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaUserBasic createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new GiftGachaUserBasic(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaUserBasic[] newArray(int i10) {
            return new GiftGachaUserBasic[i10];
        }
    }

    public GiftGachaUserBasic(int i10, String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        this.userId = i10;
        this.name = str;
        this.profileImageUrl = str2;
    }

    public static /* synthetic */ GiftGachaUserBasic copy$default(GiftGachaUserBasic giftGachaUserBasic, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftGachaUserBasic.userId;
        }
        if ((i11 & 2) != 0) {
            str = giftGachaUserBasic.name;
        }
        if ((i11 & 4) != 0) {
            str2 = giftGachaUserBasic.profileImageUrl;
        }
        return giftGachaUserBasic.copy(i10, str, str2);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profileImageUrl;
    }

    public final GiftGachaUserBasic copy(int i10, String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        return new GiftGachaUserBasic(i10, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaUserBasic) {
            GiftGachaUserBasic giftGachaUserBasic = (GiftGachaUserBasic) obj;
            return this.userId == giftGachaUserBasic.userId && p.c(this.name, giftGachaUserBasic.name) && p.c(this.profileImageUrl, giftGachaUserBasic.profileImageUrl);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "GiftGachaUserBasic(userId=" + this.userId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.userId);
        parcel.writeString(this.name);
        parcel.writeString(this.profileImageUrl);
    }
}
