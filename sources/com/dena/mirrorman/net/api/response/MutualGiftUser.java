package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftUser implements Parcelable {
    private final String name;
    private final String profileImageUrl;
    public static final Parcelable.Creator<MutualGiftUser> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<MutualGiftUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MutualGiftUser createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new MutualGiftUser(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MutualGiftUser[] newArray(int i10) {
            return new MutualGiftUser[i10];
        }
    }

    public MutualGiftUser(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        this.name = str;
        this.profileImageUrl = str2;
    }

    public static /* synthetic */ MutualGiftUser copy$default(MutualGiftUser mutualGiftUser, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mutualGiftUser.name;
        }
        if ((i10 & 2) != 0) {
            str2 = mutualGiftUser.profileImageUrl;
        }
        return mutualGiftUser.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.profileImageUrl;
    }

    public final MutualGiftUser copy(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        return new MutualGiftUser(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualGiftUser) {
            MutualGiftUser mutualGiftUser = (MutualGiftUser) obj;
            return p.c(this.name, mutualGiftUser.name) && p.c(this.profileImageUrl, mutualGiftUser.profileImageUrl);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "MutualGiftUser(name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.profileImageUrl);
    }
}
