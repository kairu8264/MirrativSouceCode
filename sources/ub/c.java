package ub;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final int A;
    public final String B;

    /* renamed from: w  reason: collision with root package name */
    public final int f54716w;

    /* renamed from: x  reason: collision with root package name */
    public final int f54717x;

    /* renamed from: y  reason: collision with root package name */
    public final int f54718y;

    /* renamed from: z  reason: collision with root package name */
    public final int f54719z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new c(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12, int i13, int i14, String str) {
        this.f54716w = i10;
        this.f54717x = i11;
        this.f54718y = i12;
        this.f54719z = i13;
        this.A = i14;
        this.B = str;
    }

    public final String a() {
        return this.B;
    }

    public final int b() {
        return this.f54718y;
    }

    public final int c() {
        return this.f54719z;
    }

    public final int d() {
        return this.f54716w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f54717x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f54716w == cVar.f54716w && this.f54717x == cVar.f54717x && this.f54718y == cVar.f54718y && this.f54719z == cVar.f54719z && this.A == cVar.A && p.c(this.B, cVar.B);
        }
        return false;
    }

    public final int f() {
        return this.A;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f54716w) * 31) + Integer.hashCode(this.f54717x)) * 31) + Integer.hashCode(this.f54718y)) * 31) + Integer.hashCode(this.f54719z)) * 31) + Integer.hashCode(this.A)) * 31;
        String str = this.B;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RankingPrizeData(ranking=" + this.f54716w + ", rankingGrade=" + this.f54717x + ", cashRate=" + this.f54718y + ", coinRate=" + this.f54719z + ", rankingMonth=" + this.A + ", avatarBodyImageUrl=" + this.B + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f54716w);
        parcel.writeInt(this.f54717x);
        parcel.writeInt(this.f54718y);
        parcel.writeInt(this.f54719z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
    }
}
