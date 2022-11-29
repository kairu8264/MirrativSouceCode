package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class td0 extends sh.a {
    public static final Parcelable.Creator<td0> CREATOR = new ud0();
    public final String A;
    public final String A0;
    public final ApplicationInfo B;
    public final Bundle B0;
    public final PackageInfo C;
    public final String D;
    public final String E;
    public final String F;
    public final zj0 G;
    public final Bundle H;
    public final int I;
    public final List<String> J;
    public final Bundle K;
    public final boolean L;
    public final int M;
    public final int N;
    public final float O;
    public final String P;
    public final long Q;
    public final String R;
    public final List<String> S;
    public final String T;
    public final a00 U;
    public final List<String> V;
    public final long W;
    public final String X;
    public final float Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f10235a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f10236b0;

    /* renamed from: c0  reason: collision with root package name */
    public final String f10237c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f10238d0;

    /* renamed from: e0  reason: collision with root package name */
    public final String f10239e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f10240f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f10241g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f10242h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f10243i0;

    /* renamed from: j0  reason: collision with root package name */
    public final tv f10244j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f10245k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Bundle f10246l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f10247m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f10248n0;

    /* renamed from: o0  reason: collision with root package name */
    public final String f10249o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f10250p0;

    /* renamed from: q0  reason: collision with root package name */
    public final List<Integer> f10251q0;

    /* renamed from: r0  reason: collision with root package name */
    public final String f10252r0;

    /* renamed from: s0  reason: collision with root package name */
    public final List<String> f10253s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f10254t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f10255u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f10256v0;

    /* renamed from: w  reason: collision with root package name */
    public final int f10257w;

    /* renamed from: w0  reason: collision with root package name */
    public final boolean f10258w0;

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f10259x;

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList<String> f10260x0;

    /* renamed from: y  reason: collision with root package name */
    public final as f10261y;

    /* renamed from: y0  reason: collision with root package name */
    public final String f10262y0;

    /* renamed from: z  reason: collision with root package name */
    public final fs f10263z;

    /* renamed from: z0  reason: collision with root package name */
    public final n50 f10264z0;

    public td0(int i10, Bundle bundle, as asVar, fs fsVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zj0 zj0Var, Bundle bundle2, int i11, List<String> list, Bundle bundle3, boolean z10, int i12, int i13, float f10, String str5, long j10, String str6, List<String> list2, String str7, a00 a00Var, List<String> list3, long j11, String str8, float f11, boolean z11, int i14, int i15, boolean z12, String str9, String str10, boolean z13, int i16, Bundle bundle4, String str11, tv tvVar, boolean z14, Bundle bundle5, String str12, String str13, String str14, boolean z15, List<Integer> list4, String str15, List<String> list5, int i17, boolean z16, boolean z17, boolean z18, ArrayList<String> arrayList, String str16, n50 n50Var, String str17, Bundle bundle6) {
        List<String> unmodifiableList;
        List<String> unmodifiableList2;
        this.f10257w = i10;
        this.f10259x = bundle;
        this.f10261y = asVar;
        this.f10263z = fsVar;
        this.A = str;
        this.B = applicationInfo;
        this.C = packageInfo;
        this.D = str2;
        this.E = str3;
        this.F = str4;
        this.G = zj0Var;
        this.H = bundle2;
        this.I = i11;
        this.J = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.V = unmodifiableList;
        this.K = bundle3;
        this.L = z10;
        this.M = i12;
        this.N = i13;
        this.O = f10;
        this.P = str5;
        this.Q = j10;
        this.R = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.S = unmodifiableList2;
        this.T = str7;
        this.U = a00Var;
        this.W = j11;
        this.X = str8;
        this.Y = f11;
        this.f10238d0 = z11;
        this.Z = i14;
        this.f10235a0 = i15;
        this.f10236b0 = z12;
        this.f10237c0 = str9;
        this.f10239e0 = str10;
        this.f10240f0 = z13;
        this.f10241g0 = i16;
        this.f10242h0 = bundle4;
        this.f10243i0 = str11;
        this.f10244j0 = tvVar;
        this.f10245k0 = z14;
        this.f10246l0 = bundle5;
        this.f10247m0 = str12;
        this.f10248n0 = str13;
        this.f10249o0 = str14;
        this.f10250p0 = z15;
        this.f10251q0 = list4;
        this.f10252r0 = str15;
        this.f10253s0 = list5;
        this.f10254t0 = i17;
        this.f10255u0 = z16;
        this.f10256v0 = z17;
        this.f10258w0 = z18;
        this.f10260x0 = arrayList;
        this.f10262y0 = str16;
        this.f10264z0 = n50Var;
        this.A0 = str17;
        this.B0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f10257w);
        sh.b.e(parcel, 2, this.f10259x, false);
        sh.b.p(parcel, 3, this.f10261y, i10, false);
        sh.b.p(parcel, 4, this.f10263z, i10, false);
        sh.b.q(parcel, 5, this.A, false);
        sh.b.p(parcel, 6, this.B, i10, false);
        sh.b.p(parcel, 7, this.C, i10, false);
        sh.b.q(parcel, 8, this.D, false);
        sh.b.q(parcel, 9, this.E, false);
        sh.b.q(parcel, 10, this.F, false);
        sh.b.p(parcel, 11, this.G, i10, false);
        sh.b.e(parcel, 12, this.H, false);
        sh.b.k(parcel, 13, this.I);
        sh.b.s(parcel, 14, this.J, false);
        sh.b.e(parcel, 15, this.K, false);
        sh.b.c(parcel, 16, this.L);
        sh.b.k(parcel, 18, this.M);
        sh.b.k(parcel, 19, this.N);
        sh.b.h(parcel, 20, this.O);
        sh.b.q(parcel, 21, this.P, false);
        sh.b.n(parcel, 25, this.Q);
        sh.b.q(parcel, 26, this.R, false);
        sh.b.s(parcel, 27, this.S, false);
        sh.b.q(parcel, 28, this.T, false);
        sh.b.p(parcel, 29, this.U, i10, false);
        sh.b.s(parcel, 30, this.V, false);
        sh.b.n(parcel, 31, this.W);
        sh.b.q(parcel, 33, this.X, false);
        sh.b.h(parcel, 34, this.Y);
        sh.b.k(parcel, 35, this.Z);
        sh.b.k(parcel, 36, this.f10235a0);
        sh.b.c(parcel, 37, this.f10236b0);
        sh.b.q(parcel, 39, this.f10237c0, false);
        sh.b.c(parcel, 40, this.f10238d0);
        sh.b.q(parcel, 41, this.f10239e0, false);
        sh.b.c(parcel, 42, this.f10240f0);
        sh.b.k(parcel, 43, this.f10241g0);
        sh.b.e(parcel, 44, this.f10242h0, false);
        sh.b.q(parcel, 45, this.f10243i0, false);
        sh.b.p(parcel, 46, this.f10244j0, i10, false);
        sh.b.c(parcel, 47, this.f10245k0);
        sh.b.e(parcel, 48, this.f10246l0, false);
        sh.b.q(parcel, 49, this.f10247m0, false);
        sh.b.q(parcel, 50, this.f10248n0, false);
        sh.b.q(parcel, 51, this.f10249o0, false);
        sh.b.c(parcel, 52, this.f10250p0);
        sh.b.m(parcel, 53, this.f10251q0, false);
        sh.b.q(parcel, 54, this.f10252r0, false);
        sh.b.s(parcel, 55, this.f10253s0, false);
        sh.b.k(parcel, 56, this.f10254t0);
        sh.b.c(parcel, 57, this.f10255u0);
        sh.b.c(parcel, 58, this.f10256v0);
        sh.b.c(parcel, 59, this.f10258w0);
        sh.b.s(parcel, 60, this.f10260x0, false);
        sh.b.q(parcel, 61, this.f10262y0, false);
        sh.b.p(parcel, 63, this.f10264z0, i10, false);
        sh.b.q(parcel, 64, this.A0, false);
        sh.b.e(parcel, 65, this.B0, false);
        sh.b.b(parcel, a10);
    }
}
