package rh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class m extends sh.a {
    public static final Parcelable.Creator<m> CREATOR = new i0();
    public final long A;
    public final String B;
    public final String C;
    public final int D;
    public final int E;

    /* renamed from: w  reason: collision with root package name */
    public final int f51475w;

    /* renamed from: x  reason: collision with root package name */
    public final int f51476x;

    /* renamed from: y  reason: collision with root package name */
    public final int f51477y;

    /* renamed from: z  reason: collision with root package name */
    public final long f51478z;

    public m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f51475w = i10;
        this.f51476x = i11;
        this.f51477y = i12;
        this.f51478z = j10;
        this.A = j11;
        this.B = str;
        this.C = str2;
        this.D = i13;
        this.E = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f51475w);
        sh.b.k(parcel, 2, this.f51476x);
        sh.b.k(parcel, 3, this.f51477y);
        sh.b.n(parcel, 4, this.f51478z);
        sh.b.n(parcel, 5, this.A);
        sh.b.q(parcel, 6, this.B, false);
        sh.b.q(parcel, 7, this.C, false);
        sh.b.k(parcel, 8, this.D);
        sh.b.k(parcel, 9, this.E);
        sh.b.b(parcel, a10);
    }
}
