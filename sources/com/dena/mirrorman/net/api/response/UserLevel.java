package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.UserLevelColor;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class UserLevel implements UserLevelColor, Parcelable, Serializable {
    private final int addExPoint;
    private final int exPoint;
    private final String helpPageUrl;
    private final int level;
    private final String levelBorderColorCode;
    private final String levelColorCode;
    private final List<String> levelGaugeColorCodes;
    private final String levelImageUrl;
    private final int nextLevelExPoint;
    private final String userLevelGiftPanelText;
    public static final Parcelable.Creator<UserLevel> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevel createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new UserLevel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLevel[] newArray(int i10) {
            return new UserLevel[i10];
        }
    }

    public UserLevel() {
        this(0, 0, 0, 0, null, null, null, null, null, null, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
    }

    public UserLevel(int i10, int i11, int i12, int i13, String str, String str2, String str3, List<String> list, String str4, String str5) {
        p.h(str, "levelImageUrl");
        p.h(str2, "levelColorCode");
        p.h(str3, "levelBorderColorCode");
        p.h(list, "levelGaugeColorCodes");
        p.h(str4, "helpPageUrl");
        p.h(str5, "userLevelGiftPanelText");
        this.level = i10;
        this.exPoint = i11;
        this.nextLevelExPoint = i12;
        this.addExPoint = i13;
        this.levelImageUrl = str;
        this.levelColorCode = str2;
        this.levelBorderColorCode = str3;
        this.levelGaugeColorCodes = list;
        this.helpPageUrl = str4;
        this.userLevelGiftPanelText = str5;
    }

    public final int component1() {
        return this.level;
    }

    public final String component10() {
        return this.userLevelGiftPanelText;
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
        return this.helpPageUrl;
    }

    public final UserLevel copy(int i10, int i11, int i12, int i13, String str, String str2, String str3, List<String> list, String str4, String str5) {
        p.h(str, "levelImageUrl");
        p.h(str2, "levelColorCode");
        p.h(str3, "levelBorderColorCode");
        p.h(list, "levelGaugeColorCodes");
        p.h(str4, "helpPageUrl");
        p.h(str5, "userLevelGiftPanelText");
        return new UserLevel(i10, i11, i12, i13, str, str2, str3, list, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLevel) {
            UserLevel userLevel = (UserLevel) obj;
            return this.level == userLevel.level && this.exPoint == userLevel.exPoint && this.nextLevelExPoint == userLevel.nextLevelExPoint && this.addExPoint == userLevel.addExPoint && p.c(this.levelImageUrl, userLevel.levelImageUrl) && p.c(getLevelColorCode(), userLevel.getLevelColorCode()) && p.c(getLevelBorderColorCode(), userLevel.getLevelBorderColorCode()) && p.c(getLevelGaugeColorCodes(), userLevel.getLevelGaugeColorCodes()) && p.c(this.helpPageUrl, userLevel.helpPageUrl) && p.c(this.userLevelGiftPanelText, userLevel.userLevelGiftPanelText);
        }
        return false;
    }

    public final int getAddExPoint() {
        return this.addExPoint;
    }

    public final int getExPoint() {
        return this.exPoint;
    }

    public final float getExPointPercentage() {
        return this.level + new BigDecimal(String.valueOf(this.exPoint / Math.max(1, this.nextLevelExPoint))).setScale(3, RoundingMode.DOWN).floatValue();
    }

    public final String getHelpPageUrl() {
        return this.helpPageUrl;
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

    public final String getUserLevelGiftPanelText() {
        return this.userLevelGiftPanelText;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.level) * 31) + Integer.hashCode(this.exPoint)) * 31) + Integer.hashCode(this.nextLevelExPoint)) * 31) + Integer.hashCode(this.addExPoint)) * 31) + this.levelImageUrl.hashCode()) * 31) + getLevelColorCode().hashCode()) * 31) + getLevelBorderColorCode().hashCode()) * 31) + getLevelGaugeColorCodes().hashCode()) * 31) + this.helpPageUrl.hashCode()) * 31) + this.userLevelGiftPanelText.hashCode();
    }

    public String toString() {
        return "UserLevel(level=" + this.level + ", exPoint=" + this.exPoint + ", nextLevelExPoint=" + this.nextLevelExPoint + ", addExPoint=" + this.addExPoint + ", levelImageUrl=" + this.levelImageUrl + ", levelColorCode=" + getLevelColorCode() + ", levelBorderColorCode=" + getLevelBorderColorCode() + ", levelGaugeColorCodes=" + getLevelGaugeColorCodes() + ", helpPageUrl=" + this.helpPageUrl + ", userLevelGiftPanelText=" + this.userLevelGiftPanelText + ')';
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
        parcel.writeString(this.helpPageUrl);
        parcel.writeString(this.userLevelGiftPanelText);
    }

    public /* synthetic */ UserLevel(int i10, int i11, int i12, int i13, String str, String str2, String str3, List list, String str4, String str5, int i14, h hVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) == 0 ? i13 : 0, (i14 & 16) != 0 ? "" : str, (i14 & 32) != 0 ? "FF000000" : str2, (i14 & 64) == 0 ? str3 : "FF000000", (i14 & 128) != 0 ? s.m("FF29CCB1", "FF29CCB1", "FF29CCB1") : list, (i14 & 256) != 0 ? "" : str4, (i14 & 512) == 0 ? str5 : "");
    }
}
