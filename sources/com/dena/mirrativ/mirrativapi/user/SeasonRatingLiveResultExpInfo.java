package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRatingLiveResultExpInfo implements Parcelable {
    public static final Parcelable.Creator<SeasonRatingLiveResultExpInfo> CREATOR = new Creator();
    private final int acquiredScore;
    private final int count;
    private final boolean overflow;
    private final float scorePerCount;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonRatingLiveResultExpInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResultExpInfo createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new SeasonRatingLiveResultExpInfo(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResultExpInfo[] newArray(int i10) {
            return new SeasonRatingLiveResultExpInfo[i10];
        }
    }

    public SeasonRatingLiveResultExpInfo(int i10, float f10, int i11, boolean z10) {
        this.count = i10;
        this.scorePerCount = f10;
        this.acquiredScore = i11;
        this.overflow = z10;
    }

    public static /* synthetic */ SeasonRatingLiveResultExpInfo copy$default(SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, int i10, float f10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = seasonRatingLiveResultExpInfo.count;
        }
        if ((i12 & 2) != 0) {
            f10 = seasonRatingLiveResultExpInfo.scorePerCount;
        }
        if ((i12 & 4) != 0) {
            i11 = seasonRatingLiveResultExpInfo.acquiredScore;
        }
        if ((i12 & 8) != 0) {
            z10 = seasonRatingLiveResultExpInfo.overflow;
        }
        return seasonRatingLiveResultExpInfo.copy(i10, f10, i11, z10);
    }

    public final int component1() {
        return this.count;
    }

    public final float component2() {
        return this.scorePerCount;
    }

    public final int component3() {
        return this.acquiredScore;
    }

    public final boolean component4() {
        return this.overflow;
    }

    public final SeasonRatingLiveResultExpInfo copy(int i10, float f10, int i11, boolean z10) {
        return new SeasonRatingLiveResultExpInfo(i10, f10, i11, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRatingLiveResultExpInfo) {
            SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo = (SeasonRatingLiveResultExpInfo) obj;
            return this.count == seasonRatingLiveResultExpInfo.count && p.c(Float.valueOf(this.scorePerCount), Float.valueOf(seasonRatingLiveResultExpInfo.scorePerCount)) && this.acquiredScore == seasonRatingLiveResultExpInfo.acquiredScore && this.overflow == seasonRatingLiveResultExpInfo.overflow;
        }
        return false;
    }

    public final int getAcquiredScore() {
        return this.acquiredScore;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getOverflow() {
        return this.overflow;
    }

    public final float getScorePerCount() {
        return this.scorePerCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.count) * 31) + Float.hashCode(this.scorePerCount)) * 31) + Integer.hashCode(this.acquiredScore)) * 31;
        boolean z10 = this.overflow;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "SeasonRatingLiveResultExpInfo(count=" + this.count + ", scorePerCount=" + this.scorePerCount + ", acquiredScore=" + this.acquiredScore + ", overflow=" + this.overflow + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.count);
        parcel.writeFloat(this.scorePerCount);
        parcel.writeInt(this.acquiredScore);
        parcel.writeInt(this.overflow ? 1 : 0);
    }
}
