package ub;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String A;

    /* renamed from: w  reason: collision with root package name */
    public final int f54712w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54713x;

    /* renamed from: y  reason: collision with root package name */
    public final String f54714y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54715z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, String str4) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(str4, "linkUrl");
        this.f54712w = i10;
        this.f54713x = str;
        this.f54714y = str2;
        this.f54715z = str3;
        this.A = str4;
    }

    public final String a() {
        return this.f54715z;
    }

    public final int b() {
        return this.f54712w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f54712w == bVar.f54712w && p.c(this.f54713x, bVar.f54713x) && p.c(this.f54714y, bVar.f54714y) && p.c(this.f54715z, bVar.f54715z) && p.c(this.A, bVar.A);
        }
        return false;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f54712w) * 31) + this.f54713x.hashCode()) * 31) + this.f54714y.hashCode()) * 31) + this.f54715z.hashCode()) * 31) + this.A.hashCode();
    }

    public String toString() {
        return "NewTermsOfServiceData(versionId=" + this.f54712w + ", title=" + this.f54713x + ", description=" + this.f54714y + ", imageUrl=" + this.f54715z + ", linkUrl=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f54712w);
        parcel.writeString(this.f54713x);
        parcel.writeString(this.f54714y);
        parcel.writeString(this.f54715z);
        parcel.writeString(this.A);
    }
}
