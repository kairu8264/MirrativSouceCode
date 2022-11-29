package jf;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w implements Parcelable {

    /* renamed from: w  reason: collision with root package name */
    public final String f38022w;

    /* renamed from: x  reason: collision with root package name */
    public final String f38023x;

    /* renamed from: y  reason: collision with root package name */
    public final String f38024y;

    /* renamed from: z  reason: collision with root package name */
    public final String f38025z;
    public static final Parcelable.Creator<w> CREATOR = new a();
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final w createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new w(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final w[] newArray(int i10) {
            return new w[i10];
        }
    }

    public w(String str, String str2, String str3, String str4) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "appIconUrl");
        jo.p.h(str3, "appTitle");
        jo.p.h(str4, "shortTitle");
        this.f38022w = str;
        this.f38023x = str2;
        this.f38024y = str3;
        this.f38025z = str4;
    }

    public final String a() {
        return this.f38023x;
    }

    public final String b() {
        return this.f38022w;
    }

    public final String c() {
        return this.f38024y;
    }

    public final String d() {
        return this.f38025z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return jo.p.c(this.f38022w, wVar.f38022w) && jo.p.c(this.f38023x, wVar.f38023x) && jo.p.c(this.f38024y, wVar.f38024y) && jo.p.c(this.f38025z, wVar.f38025z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f38022w.hashCode() * 31) + this.f38023x.hashCode()) * 31) + this.f38024y.hashCode()) * 31) + this.f38025z.hashCode();
    }

    public String toString() {
        return "LiveAppSetting(appId=" + this.f38022w + ", appIconUrl=" + this.f38023x + ", appTitle=" + this.f38024y + ", shortTitle=" + this.f38025z + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f38022w);
        parcel.writeString(this.f38023x);
        parcel.writeString(this.f38024y);
        parcel.writeString(this.f38025z);
    }
}
