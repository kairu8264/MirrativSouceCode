package k9;

import android.os.Parcel;
import android.os.Parcelable;
import c1.c0;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public final long A;
    public final long B;

    /* renamed from: w  reason: collision with root package name */
    public final long f38472w;

    /* renamed from: x  reason: collision with root package name */
    public final long f38473x;

    /* renamed from: y  reason: collision with root package name */
    public final long f38474y;

    /* renamed from: z  reason: collision with root package name */
    public final long f38475z;
    public static final Parcelable.Creator<a> CREATOR = new C0538a();
    public static final int C = 8;

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0538a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            b bVar = b.f38476a;
            return new a(bVar.a(parcel), bVar.a(parcel), bVar.a(parcel), bVar.a(parcel), bVar.a(parcel), bVar.a(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f38472w = j10;
        this.f38473x = j11;
        this.f38474y = j12;
        this.f38475z = j13;
        this.A = j14;
        this.B = j15;
    }

    public /* synthetic */ a(long j10, long j11, long j12, long j13, long j14, long j15, h hVar) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public final long a() {
        return this.f38472w;
    }

    public final long b() {
        return this.f38474y;
    }

    public final long c() {
        return this.f38475z;
    }

    public final long d() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return c0.m(this.f38472w, aVar.f38472w) && c0.m(this.f38473x, aVar.f38473x) && c0.m(this.f38474y, aVar.f38474y) && c0.m(this.f38475z, aVar.f38475z) && c0.m(this.A, aVar.A) && c0.m(this.B, aVar.B);
        }
        return false;
    }

    public final long f() {
        return this.f38473x;
    }

    public int hashCode() {
        return (((((((((c0.s(this.f38472w) * 31) + c0.s(this.f38473x)) * 31) + c0.s(this.f38474y)) * 31) + c0.s(this.f38475z)) * 31) + c0.s(this.A)) * 31) + c0.s(this.B);
    }

    public String toString() {
        return "ButtonColor(backgroundColor=" + ((Object) c0.t(this.f38472w)) + ", textColor=" + ((Object) c0.t(this.f38473x)) + ", borderColor=" + ((Object) c0.t(this.f38474y)) + ", disabledBackgroundColor=" + ((Object) c0.t(this.f38475z)) + ", disabledTextColor=" + ((Object) c0.t(this.A)) + ", disabledBorderColor=" + ((Object) c0.t(this.B)) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        b bVar = b.f38476a;
        bVar.b(this.f38472w, parcel, i10);
        bVar.b(this.f38473x, parcel, i10);
        bVar.b(this.f38474y, parcel, i10);
        bVar.b(this.f38475z, parcel, i10);
        bVar.b(this.A, parcel, i10);
        bVar.b(this.B, parcel, i10);
    }

    public /* synthetic */ a(long j10, long j11, long j12, long j13, long j14, long j15, int i10, h hVar) {
        this((i10 & 1) != 0 ? o9.b.f44283a.a().w() : j10, (i10 & 2) != 0 ? o9.b.f44283a.a().B() : j11, (i10 & 4) != 0 ? o9.b.f44283a.a().B() : j12, (i10 & 8) != 0 ? o9.b.f44283a.a().q() : j13, (i10 & 16) != 0 ? o9.b.f44283a.a().B() : j14, (i10 & 32) != 0 ? o9.b.f44283a.a().q() : j15, null);
    }
}
