package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftReward implements Parcelable {
    private final String ImageUrl;
    private final String title;
    public static final Parcelable.Creator<MutualGiftReward> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<MutualGiftReward> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MutualGiftReward createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new MutualGiftReward(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MutualGiftReward[] newArray(int i10) {
            return new MutualGiftReward[i10];
        }
    }

    public MutualGiftReward(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "ImageUrl");
        this.title = str;
        this.ImageUrl = str2;
    }

    public static /* synthetic */ MutualGiftReward copy$default(MutualGiftReward mutualGiftReward, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mutualGiftReward.title;
        }
        if ((i10 & 2) != 0) {
            str2 = mutualGiftReward.ImageUrl;
        }
        return mutualGiftReward.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.ImageUrl;
    }

    public final MutualGiftReward copy(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "ImageUrl");
        return new MutualGiftReward(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualGiftReward) {
            MutualGiftReward mutualGiftReward = (MutualGiftReward) obj;
            return p.c(this.title, mutualGiftReward.title) && p.c(this.ImageUrl, mutualGiftReward.ImageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.ImageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.ImageUrl.hashCode();
    }

    public String toString() {
        return "MutualGiftReward(title=" + this.title + ", ImageUrl=" + this.ImageUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.ImageUrl);
    }
}
