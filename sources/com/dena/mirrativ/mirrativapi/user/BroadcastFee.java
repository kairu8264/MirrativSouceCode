package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingRankType;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class BroadcastFee implements Parcelable {
    public static final Parcelable.Creator<BroadcastFee> CREATOR = new Creator();
    private final int cash;
    private final int cashUnit;
    @b(SeasonRatingRankType.TypeAdapter.class)
    private final SeasonRatingRankType classId;
    private final boolean isMax;
    private final String liveDuration;
    private final int timeCount;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BroadcastFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastFee createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new BroadcastFee(parcel.readString(), parcel.readInt(), parcel.readInt(), SeasonRatingRankType.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastFee[] newArray(int i10) {
            return new BroadcastFee[i10];
        }
    }

    public BroadcastFee(String str, int i10, int i11, SeasonRatingRankType seasonRatingRankType, int i12, boolean z10) {
        p.h(str, "liveDuration");
        p.h(seasonRatingRankType, "classId");
        this.liveDuration = str;
        this.cashUnit = i10;
        this.timeCount = i11;
        this.classId = seasonRatingRankType;
        this.cash = i12;
        this.isMax = z10;
    }

    public static /* synthetic */ BroadcastFee copy$default(BroadcastFee broadcastFee, String str, int i10, int i11, SeasonRatingRankType seasonRatingRankType, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = broadcastFee.liveDuration;
        }
        if ((i13 & 2) != 0) {
            i10 = broadcastFee.cashUnit;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = broadcastFee.timeCount;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            seasonRatingRankType = broadcastFee.classId;
        }
        SeasonRatingRankType seasonRatingRankType2 = seasonRatingRankType;
        if ((i13 & 16) != 0) {
            i12 = broadcastFee.cash;
        }
        int i16 = i12;
        if ((i13 & 32) != 0) {
            z10 = broadcastFee.isMax;
        }
        return broadcastFee.copy(str, i14, i15, seasonRatingRankType2, i16, z10);
    }

    public final String component1() {
        return this.liveDuration;
    }

    public final int component2() {
        return this.cashUnit;
    }

    public final int component3() {
        return this.timeCount;
    }

    public final SeasonRatingRankType component4() {
        return this.classId;
    }

    public final int component5() {
        return this.cash;
    }

    public final boolean component6() {
        return this.isMax;
    }

    public final BroadcastFee copy(String str, int i10, int i11, SeasonRatingRankType seasonRatingRankType, int i12, boolean z10) {
        p.h(str, "liveDuration");
        p.h(seasonRatingRankType, "classId");
        return new BroadcastFee(str, i10, i11, seasonRatingRankType, i12, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BroadcastFee) {
            BroadcastFee broadcastFee = (BroadcastFee) obj;
            return p.c(this.liveDuration, broadcastFee.liveDuration) && this.cashUnit == broadcastFee.cashUnit && this.timeCount == broadcastFee.timeCount && this.classId == broadcastFee.classId && this.cash == broadcastFee.cash && this.isMax == broadcastFee.isMax;
        }
        return false;
    }

    public final int getCash() {
        return this.cash;
    }

    public final int getCashUnit() {
        return this.cashUnit;
    }

    public final SeasonRatingRankType getClassId() {
        return this.classId;
    }

    public final String getLiveDuration() {
        return this.liveDuration;
    }

    public final int getTimeCount() {
        return this.timeCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.liveDuration.hashCode() * 31) + Integer.hashCode(this.cashUnit)) * 31) + Integer.hashCode(this.timeCount)) * 31) + this.classId.hashCode()) * 31) + Integer.hashCode(this.cash)) * 31;
        boolean z10 = this.isMax;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isMax() {
        return this.isMax;
    }

    public String toString() {
        return "BroadcastFee(liveDuration=" + this.liveDuration + ", cashUnit=" + this.cashUnit + ", timeCount=" + this.timeCount + ", classId=" + this.classId + ", cash=" + this.cash + ", isMax=" + this.isMax + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.liveDuration);
        parcel.writeInt(this.cashUnit);
        parcel.writeInt(this.timeCount);
        parcel.writeString(this.classId.name());
        parcel.writeInt(this.cash);
        parcel.writeInt(this.isMax ? 1 : 0);
    }
}
