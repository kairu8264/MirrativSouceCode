package jf;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final int f37964z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final String f37965w;

    /* renamed from: x  reason: collision with root package name */
    public final String f37966x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f37967y;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final p0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new p0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final p0[] newArray(int i10) {
            return new p0[i10];
        }
    }

    public p0(String str, String str2, boolean z10) {
        jo.p.h(str, "hostLiveId");
        jo.p.h(str2, "ownerName");
        this.f37965w = str;
        this.f37966x = str2;
        this.f37967y = z10;
    }

    public final String a() {
        return this.f37965w;
    }

    public final String b() {
        return this.f37966x;
    }

    public final boolean c() {
        return this.f37967y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return jo.p.c(this.f37965w, p0Var.f37965w) && jo.p.c(this.f37966x, p0Var.f37966x) && this.f37967y == p0Var.f37967y;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f37965w.hashCode() * 31) + this.f37966x.hashCode()) * 31;
        boolean z10 = this.f37967y;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ReconnectCollabInfo(hostLiveId=" + this.f37965w + ", ownerName=" + this.f37966x + ", isReconnecting=" + this.f37967y + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f37965w);
        parcel.writeString(this.f37966x);
        parcel.writeInt(this.f37967y ? 1 : 0);
    }
}
