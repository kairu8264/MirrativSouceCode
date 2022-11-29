package ai;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class as extends sh.a {
    public static final Parcelable.Creator<as> CREATOR = new cs();
    public final List<String> A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final String E;
    public final rw F;
    public final Location G;
    public final String H;
    public final Bundle I;
    public final Bundle J;
    public final List<String> K;
    public final String L;
    public final String M;
    @Deprecated
    public final boolean N;
    public final qr O;
    public final int P;
    public final String Q;
    public final List<String> R;
    public final int S;
    public final String T;

    /* renamed from: w  reason: collision with root package name */
    public final int f1983w;
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    public final long f1984x;

    /* renamed from: y  reason: collision with root package name */
    public final Bundle f1985y;
    @Deprecated

    /* renamed from: z  reason: collision with root package name */
    public final int f1986z;

    public as(int i10, long j10, Bundle bundle, int i11, List<String> list, boolean z10, int i12, boolean z11, String str, rw rwVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z12, qr qrVar, int i13, String str5, List<String> list3, int i14, String str6) {
        this.f1983w = i10;
        this.f1984x = j10;
        this.f1985y = bundle == null ? new Bundle() : bundle;
        this.f1986z = i11;
        this.A = list;
        this.B = z10;
        this.C = i12;
        this.D = z11;
        this.E = str;
        this.F = rwVar;
        this.G = location;
        this.H = str2;
        this.I = bundle2 == null ? new Bundle() : bundle2;
        this.J = bundle3;
        this.K = list2;
        this.L = str3;
        this.M = str4;
        this.N = z12;
        this.O = qrVar;
        this.P = i13;
        this.Q = str5;
        this.R = list3 == null ? new ArrayList<>() : list3;
        this.S = i14;
        this.T = str6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof as) {
            as asVar = (as) obj;
            return this.f1983w == asVar.f1983w && this.f1984x == asVar.f1984x && vj0.a(this.f1985y, asVar.f1985y) && this.f1986z == asVar.f1986z && rh.n.a(this.A, asVar.A) && this.B == asVar.B && this.C == asVar.C && this.D == asVar.D && rh.n.a(this.E, asVar.E) && rh.n.a(this.F, asVar.F) && rh.n.a(this.G, asVar.G) && rh.n.a(this.H, asVar.H) && vj0.a(this.I, asVar.I) && vj0.a(this.J, asVar.J) && rh.n.a(this.K, asVar.K) && rh.n.a(this.L, asVar.L) && rh.n.a(this.M, asVar.M) && this.N == asVar.N && this.P == asVar.P && rh.n.a(this.Q, asVar.Q) && rh.n.a(this.R, asVar.R) && this.S == asVar.S && rh.n.a(this.T, asVar.T);
        }
        return false;
    }

    public final int hashCode() {
        return rh.n.b(Integer.valueOf(this.f1983w), Long.valueOf(this.f1984x), this.f1985y, Integer.valueOf(this.f1986z), this.A, Boolean.valueOf(this.B), Integer.valueOf(this.C), Boolean.valueOf(this.D), this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, Boolean.valueOf(this.N), Integer.valueOf(this.P), this.Q, this.R, Integer.valueOf(this.S), this.T);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f1983w);
        sh.b.n(parcel, 2, this.f1984x);
        sh.b.e(parcel, 3, this.f1985y, false);
        sh.b.k(parcel, 4, this.f1986z);
        sh.b.s(parcel, 5, this.A, false);
        sh.b.c(parcel, 6, this.B);
        sh.b.k(parcel, 7, this.C);
        sh.b.c(parcel, 8, this.D);
        sh.b.q(parcel, 9, this.E, false);
        sh.b.p(parcel, 10, this.F, i10, false);
        sh.b.p(parcel, 11, this.G, i10, false);
        sh.b.q(parcel, 12, this.H, false);
        sh.b.e(parcel, 13, this.I, false);
        sh.b.e(parcel, 14, this.J, false);
        sh.b.s(parcel, 15, this.K, false);
        sh.b.q(parcel, 16, this.L, false);
        sh.b.q(parcel, 17, this.M, false);
        sh.b.c(parcel, 18, this.N);
        sh.b.p(parcel, 19, this.O, i10, false);
        sh.b.k(parcel, 20, this.P);
        sh.b.q(parcel, 21, this.Q, false);
        sh.b.s(parcel, 22, this.R, false);
        sh.b.k(parcel, 23, this.S);
        sh.b.q(parcel, 24, this.T, false);
        sh.b.b(parcel, a10);
    }
}
