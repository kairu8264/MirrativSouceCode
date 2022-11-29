package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRatingLiveResultClass implements Parcelable {
    public static final Parcelable.Creator<SeasonRatingLiveResultClass> CREATOR = new Creator();
    private final int classEnd;
    private final int classId;
    private final int classStart;
    private final int end;
    private final int start;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonRatingLiveResultClass> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResultClass createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new SeasonRatingLiveResultClass(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResultClass[] newArray(int i10) {
            return new SeasonRatingLiveResultClass[i10];
        }
    }

    public SeasonRatingLiveResultClass(int i10, int i11, int i12, int i13, int i14) {
        this.classId = i10;
        this.start = i11;
        this.end = i12;
        this.classStart = i13;
        this.classEnd = i14;
    }

    public static /* synthetic */ SeasonRatingLiveResultClass copy$default(SeasonRatingLiveResultClass seasonRatingLiveResultClass, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = seasonRatingLiveResultClass.classId;
        }
        if ((i15 & 2) != 0) {
            i11 = seasonRatingLiveResultClass.start;
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = seasonRatingLiveResultClass.end;
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = seasonRatingLiveResultClass.classStart;
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            i14 = seasonRatingLiveResultClass.classEnd;
        }
        return seasonRatingLiveResultClass.copy(i10, i16, i17, i18, i14);
    }

    public final int component1() {
        return this.classId;
    }

    public final int component2() {
        return this.start;
    }

    public final int component3() {
        return this.end;
    }

    public final int component4() {
        return this.classStart;
    }

    public final int component5() {
        return this.classEnd;
    }

    public final SeasonRatingLiveResultClass copy(int i10, int i11, int i12, int i13, int i14) {
        return new SeasonRatingLiveResultClass(i10, i11, i12, i13, i14);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRatingLiveResultClass) {
            SeasonRatingLiveResultClass seasonRatingLiveResultClass = (SeasonRatingLiveResultClass) obj;
            return this.classId == seasonRatingLiveResultClass.classId && this.start == seasonRatingLiveResultClass.start && this.end == seasonRatingLiveResultClass.end && this.classStart == seasonRatingLiveResultClass.classStart && this.classEnd == seasonRatingLiveResultClass.classEnd;
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

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.classId) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + Integer.hashCode(this.classStart)) * 31) + Integer.hashCode(this.classEnd);
    }

    public String toString() {
        return "SeasonRatingLiveResultClass(classId=" + this.classId + ", start=" + this.start + ", end=" + this.end + ", classStart=" + this.classStart + ", classEnd=" + this.classEnd + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.classId);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeInt(this.classStart);
        parcel.writeInt(this.classEnd);
    }
}
