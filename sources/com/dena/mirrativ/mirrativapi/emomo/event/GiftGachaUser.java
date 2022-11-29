package com.dena.mirrativ.mirrativapi.emomo.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.ArrayList;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftGachaUser implements Parcelable {
    public static final Parcelable.Creator<GiftGachaUser> CREATOR = new Creator();
    private final int duplicatedPoint;
    private final List<GiftGachaItem> items;
    private final int maxDuplicatedPoint;
    private final GiftGachaUserBasic user;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<GiftGachaUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaUser createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            GiftGachaUserBasic createFromParcel = GiftGachaUserBasic.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i10 = 0; i10 != readInt3; i10++) {
                arrayList.add(GiftGachaItem.CREATOR.createFromParcel(parcel));
            }
            return new GiftGachaUser(createFromParcel, readInt, readInt2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGachaUser[] newArray(int i10) {
            return new GiftGachaUser[i10];
        }
    }

    public GiftGachaUser(GiftGachaUserBasic giftGachaUserBasic, int i10, int i11, List<GiftGachaItem> list) {
        p.h(giftGachaUserBasic, MRLog.TARGET_TYPE_USER);
        p.h(list, "items");
        this.user = giftGachaUserBasic;
        this.duplicatedPoint = i10;
        this.maxDuplicatedPoint = i11;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftGachaUser copy$default(GiftGachaUser giftGachaUser, GiftGachaUserBasic giftGachaUserBasic, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            giftGachaUserBasic = giftGachaUser.user;
        }
        if ((i12 & 2) != 0) {
            i10 = giftGachaUser.duplicatedPoint;
        }
        if ((i12 & 4) != 0) {
            i11 = giftGachaUser.maxDuplicatedPoint;
        }
        if ((i12 & 8) != 0) {
            list = giftGachaUser.items;
        }
        return giftGachaUser.copy(giftGachaUserBasic, i10, i11, list);
    }

    public final int calculateEndProgress() {
        int calculatePreviousDuplicatedPoint = calculatePreviousDuplicatedPoint();
        int i10 = 0;
        for (GiftGachaItem giftGachaItem : this.items) {
            i10 += giftGachaItem.getDuplicatedPoint();
        }
        return calculatePreviousDuplicatedPoint + i10;
    }

    public final int calculatePreviousDuplicatedPoint() {
        int i10 = this.duplicatedPoint;
        for (GiftGachaItem giftGachaItem : this.items) {
            i10 -= giftGachaItem.getDuplicatedPoint();
            if (i10 < 0) {
                i10 += this.maxDuplicatedPoint;
            }
        }
        return i10;
    }

    public final GiftGachaUserBasic component1() {
        return this.user;
    }

    public final int component2() {
        return this.duplicatedPoint;
    }

    public final int component3() {
        return this.maxDuplicatedPoint;
    }

    public final List<GiftGachaItem> component4() {
        return this.items;
    }

    public final GiftGachaUser copy(GiftGachaUserBasic giftGachaUserBasic, int i10, int i11, List<GiftGachaItem> list) {
        p.h(giftGachaUserBasic, MRLog.TARGET_TYPE_USER);
        p.h(list, "items");
        return new GiftGachaUser(giftGachaUserBasic, i10, i11, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaUser) {
            GiftGachaUser giftGachaUser = (GiftGachaUser) obj;
            return p.c(this.user, giftGachaUser.user) && this.duplicatedPoint == giftGachaUser.duplicatedPoint && this.maxDuplicatedPoint == giftGachaUser.maxDuplicatedPoint && p.c(this.items, giftGachaUser.items);
        }
        return false;
    }

    public final int getDuplicatedPoint() {
        return this.duplicatedPoint;
    }

    public final List<GiftGachaItem> getItems() {
        return this.items;
    }

    public final int getMaxDuplicatedPoint() {
        return this.maxDuplicatedPoint;
    }

    public final GiftGachaUserBasic getUser() {
        return this.user;
    }

    public int hashCode() {
        return (((((this.user.hashCode() * 31) + Integer.hashCode(this.duplicatedPoint)) * 31) + Integer.hashCode(this.maxDuplicatedPoint)) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "GiftGachaUser(user=" + this.user + ", duplicatedPoint=" + this.duplicatedPoint + ", maxDuplicatedPoint=" + this.maxDuplicatedPoint + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        this.user.writeToParcel(parcel, i10);
        parcel.writeInt(this.duplicatedPoint);
        parcel.writeInt(this.maxDuplicatedPoint);
        List<GiftGachaItem> list = this.items;
        parcel.writeInt(list.size());
        for (GiftGachaItem giftGachaItem : list) {
            giftGachaItem.writeToParcel(parcel, i10);
        }
    }
}
