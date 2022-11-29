package com.dena.mirrativ.mirrativapi.emomo.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftGachaItem implements Parcelable {
    public static final Parcelable.Creator<GiftGachaItem> CREATOR = new Creator();
    private final String condition;
    private final String description;
    private final int duplicatedPoint;
    private final GiftItemEffect effect;

    /* renamed from: id  reason: collision with root package name */
    private final String f21656id;
    private final String imageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isExchangedFragment;
    @b(BooleanTypeAdapter.class)
    private final boolean isNew;
    private final String lottery;
    private final String modalImageUrl;
    private final String name;
    private final String partTypeIconUrl;
    private final int rarity;
    private final int time;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<GiftGachaItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaItem createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new GiftGachaItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (GiftItemEffect) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaItem[] newArray(int i10) {
            return new GiftGachaItem[i10];
        }
    }

    public GiftGachaItem(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11, int i12, String str4, String str5, String str6, String str7, GiftItemEffect giftItemEffect, String str8) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "imageUrl");
        p.h(str3, "modalImageUrl");
        p.h(str4, "name");
        p.h(str5, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str7, "lottery");
        this.f21656id = str;
        this.imageUrl = str2;
        this.modalImageUrl = str3;
        this.duplicatedPoint = i10;
        this.isNew = z10;
        this.isExchangedFragment = z11;
        this.rarity = i11;
        this.time = i12;
        this.name = str4;
        this.description = str5;
        this.condition = str6;
        this.lottery = str7;
        this.effect = giftItemEffect;
        this.partTypeIconUrl = str8;
    }

    public final String component1() {
        return this.f21656id;
    }

    public final String component10() {
        return this.description;
    }

    public final String component11() {
        return this.condition;
    }

    public final String component12() {
        return this.lottery;
    }

    public final GiftItemEffect component13() {
        return this.effect;
    }

    public final String component14() {
        return this.partTypeIconUrl;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.modalImageUrl;
    }

    public final int component4() {
        return this.duplicatedPoint;
    }

    public final boolean component5() {
        return this.isNew;
    }

    public final boolean component6() {
        return this.isExchangedFragment;
    }

    public final int component7() {
        return this.rarity;
    }

    public final int component8() {
        return this.time;
    }

    public final String component9() {
        return this.name;
    }

    public final GiftGachaItem copy(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11, int i12, String str4, String str5, String str6, String str7, GiftItemEffect giftItemEffect, String str8) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "imageUrl");
        p.h(str3, "modalImageUrl");
        p.h(str4, "name");
        p.h(str5, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str7, "lottery");
        return new GiftGachaItem(str, str2, str3, i10, z10, z11, i11, i12, str4, str5, str6, str7, giftItemEffect, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaItem) {
            GiftGachaItem giftGachaItem = (GiftGachaItem) obj;
            return p.c(this.f21656id, giftGachaItem.f21656id) && p.c(this.imageUrl, giftGachaItem.imageUrl) && p.c(this.modalImageUrl, giftGachaItem.modalImageUrl) && this.duplicatedPoint == giftGachaItem.duplicatedPoint && this.isNew == giftGachaItem.isNew && this.isExchangedFragment == giftGachaItem.isExchangedFragment && this.rarity == giftGachaItem.rarity && this.time == giftGachaItem.time && p.c(this.name, giftGachaItem.name) && p.c(this.description, giftGachaItem.description) && p.c(this.condition, giftGachaItem.condition) && p.c(this.lottery, giftGachaItem.lottery) && p.c(this.effect, giftGachaItem.effect) && p.c(this.partTypeIconUrl, giftGachaItem.partTypeIconUrl);
        }
        return false;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDuplicatedPoint() {
        return this.duplicatedPoint;
    }

    public final GiftItemEffect getEffect() {
        return this.effect;
    }

    public final String getId() {
        return this.f21656id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLottery() {
        return this.lottery;
    }

    public final String getModalImageUrl() {
        return this.modalImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartTypeIconUrl() {
        return this.partTypeIconUrl;
    }

    public final int getRarity() {
        return this.rarity;
    }

    public final int getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f21656id.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.modalImageUrl.hashCode()) * 31) + Integer.hashCode(this.duplicatedPoint)) * 31;
        boolean z10 = this.isNew;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isExchangedFragment;
        int hashCode2 = (((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.time)) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str = this.condition;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.lottery.hashCode()) * 31;
        GiftItemEffect giftItemEffect = this.effect;
        int hashCode4 = (hashCode3 + (giftItemEffect == null ? 0 : giftItemEffect.hashCode())) * 31;
        String str2 = this.partTypeIconUrl;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isExchangedFragment() {
        return this.isExchangedFragment;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        return "GiftGachaItem(id=" + this.f21656id + ", imageUrl=" + this.imageUrl + ", modalImageUrl=" + this.modalImageUrl + ", duplicatedPoint=" + this.duplicatedPoint + ", isNew=" + this.isNew + ", isExchangedFragment=" + this.isExchangedFragment + ", rarity=" + this.rarity + ", time=" + this.time + ", name=" + this.name + ", description=" + this.description + ", condition=" + this.condition + ", lottery=" + this.lottery + ", effect=" + this.effect + ", partTypeIconUrl=" + this.partTypeIconUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f21656id);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.modalImageUrl);
        parcel.writeInt(this.duplicatedPoint);
        parcel.writeInt(this.isNew ? 1 : 0);
        parcel.writeInt(this.isExchangedFragment ? 1 : 0);
        parcel.writeInt(this.rarity);
        parcel.writeInt(this.time);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.condition);
        parcel.writeString(this.lottery);
        parcel.writeSerializable(this.effect);
        parcel.writeString(this.partTypeIconUrl);
    }

    public /* synthetic */ GiftGachaItem(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11, int i12, String str4, String str5, String str6, String str7, GiftItemEffect giftItemEffect, String str8, int i13, h hVar) {
        this(str, str2, str3, (i13 & 8) != 0 ? 0 : i10, z10, (i13 & 32) != 0 ? false : z11, i11, i12, str4, str5, str6, str7, giftItemEffect, str8);
    }
}
