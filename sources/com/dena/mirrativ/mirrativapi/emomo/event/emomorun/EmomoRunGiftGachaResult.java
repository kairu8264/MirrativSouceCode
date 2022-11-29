package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunGiftGachaResult implements Parcelable {
    public static final Parcelable.Creator<EmomoRunGiftGachaResult> CREATOR = new Creator();
    private final String elementImageUrl;
    private final String headlineImageUrl;
    private final String specialEffectSpan;
    private final GiftGachaUser streamer;
    private final GiftGachaUser viewer;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<EmomoRunGiftGachaResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmomoRunGiftGachaResult createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            Parcelable.Creator<GiftGachaUser> creator = GiftGachaUser.CREATOR;
            return new EmomoRunGiftGachaResult(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmomoRunGiftGachaResult[] newArray(int i10) {
            return new EmomoRunGiftGachaResult[i10];
        }
    }

    public EmomoRunGiftGachaResult(GiftGachaUser giftGachaUser, GiftGachaUser giftGachaUser2, String str, String str2, String str3) {
        p.h(giftGachaUser, "streamer");
        p.h(giftGachaUser2, MRLog.TARGET_TYPE_VIEWER);
        p.h(str, "headlineImageUrl");
        p.h(str2, "elementImageUrl");
        this.streamer = giftGachaUser;
        this.viewer = giftGachaUser2;
        this.headlineImageUrl = str;
        this.elementImageUrl = str2;
        this.specialEffectSpan = str3;
    }

    public static /* synthetic */ EmomoRunGiftGachaResult copy$default(EmomoRunGiftGachaResult emomoRunGiftGachaResult, GiftGachaUser giftGachaUser, GiftGachaUser giftGachaUser2, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            giftGachaUser = emomoRunGiftGachaResult.streamer;
        }
        if ((i10 & 2) != 0) {
            giftGachaUser2 = emomoRunGiftGachaResult.viewer;
        }
        GiftGachaUser giftGachaUser3 = giftGachaUser2;
        if ((i10 & 4) != 0) {
            str = emomoRunGiftGachaResult.headlineImageUrl;
        }
        String str4 = str;
        if ((i10 & 8) != 0) {
            str2 = emomoRunGiftGachaResult.elementImageUrl;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = emomoRunGiftGachaResult.specialEffectSpan;
        }
        return emomoRunGiftGachaResult.copy(giftGachaUser, giftGachaUser3, str4, str5, str3);
    }

    public final GiftGachaUser component1() {
        return this.streamer;
    }

    public final GiftGachaUser component2() {
        return this.viewer;
    }

    public final String component3() {
        return this.headlineImageUrl;
    }

    public final String component4() {
        return this.elementImageUrl;
    }

    public final String component5() {
        return this.specialEffectSpan;
    }

    public final EmomoRunGiftGachaResult copy(GiftGachaUser giftGachaUser, GiftGachaUser giftGachaUser2, String str, String str2, String str3) {
        p.h(giftGachaUser, "streamer");
        p.h(giftGachaUser2, MRLog.TARGET_TYPE_VIEWER);
        p.h(str, "headlineImageUrl");
        p.h(str2, "elementImageUrl");
        return new EmomoRunGiftGachaResult(giftGachaUser, giftGachaUser2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGiftGachaResult) {
            EmomoRunGiftGachaResult emomoRunGiftGachaResult = (EmomoRunGiftGachaResult) obj;
            return p.c(this.streamer, emomoRunGiftGachaResult.streamer) && p.c(this.viewer, emomoRunGiftGachaResult.viewer) && p.c(this.headlineImageUrl, emomoRunGiftGachaResult.headlineImageUrl) && p.c(this.elementImageUrl, emomoRunGiftGachaResult.elementImageUrl) && p.c(this.specialEffectSpan, emomoRunGiftGachaResult.specialEffectSpan);
        }
        return false;
    }

    public final String getElementImageUrl() {
        return this.elementImageUrl;
    }

    public final String getHeadlineImageUrl() {
        return this.headlineImageUrl;
    }

    public final String getSpecialEffectSpan() {
        return this.specialEffectSpan;
    }

    public final GiftGachaUser getStreamer() {
        return this.streamer;
    }

    public final GiftGachaUser getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        int hashCode = ((((((this.streamer.hashCode() * 31) + this.viewer.hashCode()) * 31) + this.headlineImageUrl.hashCode()) * 31) + this.elementImageUrl.hashCode()) * 31;
        String str = this.specialEffectSpan;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EmomoRunGiftGachaResult(streamer=" + this.streamer + ", viewer=" + this.viewer + ", headlineImageUrl=" + this.headlineImageUrl + ", elementImageUrl=" + this.elementImageUrl + ", specialEffectSpan=" + this.specialEffectSpan + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        this.streamer.writeToParcel(parcel, i10);
        this.viewer.writeToParcel(parcel, i10);
        parcel.writeString(this.headlineImageUrl);
        parcel.writeString(this.elementImageUrl);
        parcel.writeString(this.specialEffectSpan);
    }
}
