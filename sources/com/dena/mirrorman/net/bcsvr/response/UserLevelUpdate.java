package com.dena.mirrorman.net.bcsvr.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.UserLevelColor;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UserLevelUpdate implements UserLevelColor, Parcelable {
    private final int addExPoint;
    private final int exPoint;
    private final int level;
    private final String levelBorderColorCode;
    private final String levelColorCode;
    private final List<String> levelGaugeColorCodes;
    private final String levelImageUrl;
    private final int nextLevelExPoint;
    private final List<UserLevelUnlock> unlocks;
    @c("u")
    private final String userId;
    private final String userLevelGiftPanelText;
    public static final Parcelable.Creator<UserLevelUpdate> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserLevelUpdate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevelUpdate createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString4 = parcel.readString();
            int readInt5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt5);
            for (int i10 = 0; i10 != readInt5; i10++) {
                arrayList.add(UserLevelUnlock.CREATOR.createFromParcel(parcel));
            }
            return new UserLevelUpdate(readInt, readInt2, readInt3, readInt4, readString, readString2, readString3, createStringArrayList, readString4, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevelUpdate[] newArray(int i10) {
            return new UserLevelUpdate[i10];
        }
    }

    public UserLevelUpdate(int i10, int i11, int i12, int i13, String str, String str2, String str3, List<String> list, String str4, List<UserLevelUnlock> list2, String str5) {
        p.h(str, "levelImageUrl");
        p.h(str2, "levelColorCode");
        p.h(str3, "levelBorderColorCode");
        p.h(list, "levelGaugeColorCodes");
        p.h(str4, "userLevelGiftPanelText");
        p.h(list2, "unlocks");
        p.h(str5, "userId");
        this.level = i10;
        this.exPoint = i11;
        this.nextLevelExPoint = i12;
        this.addExPoint = i13;
        this.levelImageUrl = str;
        this.levelColorCode = str2;
        this.levelBorderColorCode = str3;
        this.levelGaugeColorCodes = list;
        this.userLevelGiftPanelText = str4;
        this.unlocks = list2;
        this.userId = str5;
    }

    public final int component1() {
        return this.level;
    }

    public final List<UserLevelUnlock> component10() {
        return this.unlocks;
    }

    public final String component11() {
        return this.userId;
    }

    public final int component2() {
        return this.exPoint;
    }

    public final int component3() {
        return this.nextLevelExPoint;
    }

    public final int component4() {
        return this.addExPoint;
    }

    public final String component5() {
        return this.levelImageUrl;
    }

    public final String component6() {
        return getLevelColorCode();
    }

    public final String component7() {
        return getLevelBorderColorCode();
    }

    public final List<String> component8() {
        return getLevelGaugeColorCodes();
    }

    public final String component9() {
        return this.userLevelGiftPanelText;
    }

    public final UserLevelUpdate copy(int i10, int i11, int i12, int i13, String str, String str2, String str3, List<String> list, String str4, List<UserLevelUnlock> list2, String str5) {
        p.h(str, "levelImageUrl");
        p.h(str2, "levelColorCode");
        p.h(str3, "levelBorderColorCode");
        p.h(list, "levelGaugeColorCodes");
        p.h(str4, "userLevelGiftPanelText");
        p.h(list2, "unlocks");
        p.h(str5, "userId");
        return new UserLevelUpdate(i10, i11, i12, i13, str, str2, str3, list, str4, list2, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLevelUpdate) {
            UserLevelUpdate userLevelUpdate = (UserLevelUpdate) obj;
            return this.level == userLevelUpdate.level && this.exPoint == userLevelUpdate.exPoint && this.nextLevelExPoint == userLevelUpdate.nextLevelExPoint && this.addExPoint == userLevelUpdate.addExPoint && p.c(this.levelImageUrl, userLevelUpdate.levelImageUrl) && p.c(getLevelColorCode(), userLevelUpdate.getLevelColorCode()) && p.c(getLevelBorderColorCode(), userLevelUpdate.getLevelBorderColorCode()) && p.c(getLevelGaugeColorCodes(), userLevelUpdate.getLevelGaugeColorCodes()) && p.c(this.userLevelGiftPanelText, userLevelUpdate.userLevelGiftPanelText) && p.c(this.unlocks, userLevelUpdate.unlocks) && p.c(this.userId, userLevelUpdate.userId);
        }
        return false;
    }

    public final int getAddExPoint() {
        return this.addExPoint;
    }

    public final int getExPoint() {
        return this.exPoint;
    }

    public final int getLevel() {
        return this.level;
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public int getLevelBorderColor() {
        return UserLevelColor.DefaultImpls.getLevelBorderColor(this);
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public String getLevelBorderColorCode() {
        return this.levelBorderColorCode;
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public int getLevelColor() {
        return UserLevelColor.DefaultImpls.getLevelColor(this);
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public String getLevelColorCode() {
        return this.levelColorCode;
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public List<String> getLevelGaugeColorCodes() {
        return this.levelGaugeColorCodes;
    }

    @Override // com.dena.mirrorman.net.api.response.UserLevelColor
    public int[] getLevelGaugeColors() {
        return UserLevelColor.DefaultImpls.getLevelGaugeColors(this);
    }

    public final String getLevelImageUrl() {
        return this.levelImageUrl;
    }

    public final int getNextLevelExPoint() {
        return this.nextLevelExPoint;
    }

    public final List<UserLevelUnlock> getUnlocks() {
        return this.unlocks;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserLevelGiftPanelText() {
        return this.userLevelGiftPanelText;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.level) * 31) + Integer.hashCode(this.exPoint)) * 31) + Integer.hashCode(this.nextLevelExPoint)) * 31) + Integer.hashCode(this.addExPoint)) * 31) + this.levelImageUrl.hashCode()) * 31) + getLevelColorCode().hashCode()) * 31) + getLevelBorderColorCode().hashCode()) * 31) + getLevelGaugeColorCodes().hashCode()) * 31) + this.userLevelGiftPanelText.hashCode()) * 31) + this.unlocks.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "UserLevelUpdate(level=" + this.level + ", exPoint=" + this.exPoint + ", nextLevelExPoint=" + this.nextLevelExPoint + ", addExPoint=" + this.addExPoint + ", levelImageUrl=" + this.levelImageUrl + ", levelColorCode=" + getLevelColorCode() + ", levelBorderColorCode=" + getLevelBorderColorCode() + ", levelGaugeColorCodes=" + getLevelGaugeColorCodes() + ", userLevelGiftPanelText=" + this.userLevelGiftPanelText + ", unlocks=" + this.unlocks + ", userId=" + this.userId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.level);
        parcel.writeInt(this.exPoint);
        parcel.writeInt(this.nextLevelExPoint);
        parcel.writeInt(this.addExPoint);
        parcel.writeString(this.levelImageUrl);
        parcel.writeString(this.levelColorCode);
        parcel.writeString(this.levelBorderColorCode);
        parcel.writeStringList(this.levelGaugeColorCodes);
        parcel.writeString(this.userLevelGiftPanelText);
        List<UserLevelUnlock> list = this.unlocks;
        parcel.writeInt(list.size());
        for (UserLevelUnlock userLevelUnlock : list) {
            userLevelUnlock.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.userId);
    }
}
