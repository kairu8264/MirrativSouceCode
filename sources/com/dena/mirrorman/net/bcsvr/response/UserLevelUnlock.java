package com.dena.mirrorman.net.bcsvr.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class UserLevelUnlock implements Parcelable {
    private final String itemImageUrl;
    private final String itemName;
    private final int level;
    private final String nextItemName;
    private final int nextLevel;
    public static final Parcelable.Creator<UserLevelUnlock> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserLevelUnlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevelUnlock createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new UserLevelUnlock(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevelUnlock[] newArray(int i10) {
            return new UserLevelUnlock[i10];
        }
    }

    public UserLevelUnlock(int i10, String str, String str2, String str3, int i11) {
        p.h(str, "itemName");
        p.h(str2, "itemImageUrl");
        p.h(str3, "nextItemName");
        this.level = i10;
        this.itemName = str;
        this.itemImageUrl = str2;
        this.nextItemName = str3;
        this.nextLevel = i11;
    }

    public static /* synthetic */ UserLevelUnlock copy$default(UserLevelUnlock userLevelUnlock, int i10, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = userLevelUnlock.level;
        }
        if ((i12 & 2) != 0) {
            str = userLevelUnlock.itemName;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = userLevelUnlock.itemImageUrl;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = userLevelUnlock.nextItemName;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            i11 = userLevelUnlock.nextLevel;
        }
        return userLevelUnlock.copy(i10, str4, str5, str6, i11);
    }

    public final int component1() {
        return this.level;
    }

    public final String component2() {
        return this.itemName;
    }

    public final String component3() {
        return this.itemImageUrl;
    }

    public final String component4() {
        return this.nextItemName;
    }

    public final int component5() {
        return this.nextLevel;
    }

    public final UserLevelUnlock copy(int i10, String str, String str2, String str3, int i11) {
        p.h(str, "itemName");
        p.h(str2, "itemImageUrl");
        p.h(str3, "nextItemName");
        return new UserLevelUnlock(i10, str, str2, str3, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLevelUnlock) {
            UserLevelUnlock userLevelUnlock = (UserLevelUnlock) obj;
            return this.level == userLevelUnlock.level && p.c(this.itemName, userLevelUnlock.itemName) && p.c(this.itemImageUrl, userLevelUnlock.itemImageUrl) && p.c(this.nextItemName, userLevelUnlock.nextItemName) && this.nextLevel == userLevelUnlock.nextLevel;
        }
        return false;
    }

    public final boolean getHasNextGradeLevel() {
        return this.nextLevel > 0;
    }

    public final String getItemImageUrl() {
        return this.itemImageUrl;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getNextItemName() {
        return this.nextItemName;
    }

    public final int getNextLevel() {
        return this.nextLevel;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.level) * 31) + this.itemName.hashCode()) * 31) + this.itemImageUrl.hashCode()) * 31) + this.nextItemName.hashCode()) * 31) + Integer.hashCode(this.nextLevel);
    }

    public String toString() {
        return "UserLevelUnlock(level=" + this.level + ", itemName=" + this.itemName + ", itemImageUrl=" + this.itemImageUrl + ", nextItemName=" + this.nextItemName + ", nextLevel=" + this.nextLevel + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.level);
        parcel.writeString(this.itemName);
        parcel.writeString(this.itemImageUrl);
        parcel.writeString(this.nextItemName);
        parcel.writeInt(this.nextLevel);
    }
}
