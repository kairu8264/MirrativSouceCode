package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRatingStatusSeason implements Parcelable {
    public static final Parcelable.Creator<SeasonRatingStatusSeason> CREATOR = new Creator();
    private final int classEnd;
    private final int classId;
    private final int classStart;
    private final int current;
    private final int month;
    private final String seasonDuration;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonRatingStatusSeason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingStatusSeason createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new SeasonRatingStatusSeason(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingStatusSeason[] newArray(int i10) {
            return new SeasonRatingStatusSeason[i10];
        }
    }

    public SeasonRatingStatusSeason(int i10, int i11, int i12, int i13, int i14, String str) {
        p.h(str, "seasonDuration");
        this.classId = i10;
        this.classStart = i11;
        this.classEnd = i12;
        this.current = i13;
        this.month = i14;
        this.seasonDuration = str;
    }

    public static /* synthetic */ SeasonRatingStatusSeason copy$default(SeasonRatingStatusSeason seasonRatingStatusSeason, int i10, int i11, int i12, int i13, int i14, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = seasonRatingStatusSeason.classId;
        }
        if ((i15 & 2) != 0) {
            i11 = seasonRatingStatusSeason.classStart;
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = seasonRatingStatusSeason.classEnd;
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = seasonRatingStatusSeason.current;
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            i14 = seasonRatingStatusSeason.month;
        }
        int i19 = i14;
        if ((i15 & 32) != 0) {
            str = seasonRatingStatusSeason.seasonDuration;
        }
        return seasonRatingStatusSeason.copy(i10, i16, i17, i18, i19, str);
    }

    public final int component1() {
        return this.classId;
    }

    public final int component2() {
        return this.classStart;
    }

    public final int component3() {
        return this.classEnd;
    }

    public final int component4() {
        return this.current;
    }

    public final int component5() {
        return this.month;
    }

    public final String component6() {
        return this.seasonDuration;
    }

    public final SeasonRatingStatusSeason copy(int i10, int i11, int i12, int i13, int i14, String str) {
        p.h(str, "seasonDuration");
        return new SeasonRatingStatusSeason(i10, i11, i12, i13, i14, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRatingStatusSeason) {
            SeasonRatingStatusSeason seasonRatingStatusSeason = (SeasonRatingStatusSeason) obj;
            return this.classId == seasonRatingStatusSeason.classId && this.classStart == seasonRatingStatusSeason.classStart && this.classEnd == seasonRatingStatusSeason.classEnd && this.current == seasonRatingStatusSeason.current && this.month == seasonRatingStatusSeason.month && p.c(this.seasonDuration, seasonRatingStatusSeason.seasonDuration);
        }
        return false;
    }

    public final int getClassEnd() {
        return this.classEnd;
    }

    public final int getClassId() {
        return this.classId;
    }

    public final int getClassStart() {
        return this.classStart;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMonth() {
        return this.month;
    }

    public final String getSeasonDuration() {
        return this.seasonDuration;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.classId) * 31) + Integer.hashCode(this.classStart)) * 31) + Integer.hashCode(this.classEnd)) * 31) + Integer.hashCode(this.current)) * 31) + Integer.hashCode(this.month)) * 31) + this.seasonDuration.hashCode();
    }

    public String toString() {
        return "SeasonRatingStatusSeason(classId=" + this.classId + ", classStart=" + this.classStart + ", classEnd=" + this.classEnd + ", current=" + this.current + ", month=" + this.month + ", seasonDuration=" + this.seasonDuration + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.classId);
        parcel.writeInt(this.classStart);
        parcel.writeInt(this.classEnd);
        parcel.writeInt(this.current);
        parcel.writeInt(this.month);
        parcel.writeString(this.seasonDuration);
    }
}
