package com.google.android.gms.ads.internal.overlay;

import ai.ey1;
import ai.i51;
import ai.nc1;
import ai.nq2;
import ai.or;
import ai.pp1;
import ai.q20;
import ai.rp0;
import ai.s20;
import ai.zj0;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import sh.a;
import sh.b;
import wg.j;
import xg.e;
import xg.p;
import xg.q;
import xg.x;
import yg.v0;
import yh.a;

/* loaded from: classes3.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new p();
    public final s20 A;
    @RecentlyNonNull
    public final String B;
    public final boolean C;
    @RecentlyNonNull
    public final String D;
    public final x E;
    public final int F;
    public final int G;
    @RecentlyNonNull
    public final String H;
    public final zj0 I;
    @RecentlyNonNull
    public final String J;
    public final j K;
    public final q20 L;
    @RecentlyNonNull
    public final String M;
    public final ey1 N;
    public final pp1 O;
    public final nq2 P;
    public final v0 Q;
    @RecentlyNonNull
    public final String R;
    @RecentlyNonNull
    public final String S;
    public final i51 T;
    public final nc1 U;

    /* renamed from: w  reason: collision with root package name */
    public final e f27150w;

    /* renamed from: x  reason: collision with root package name */
    public final or f27151x;

    /* renamed from: y  reason: collision with root package name */
    public final q f27152y;

    /* renamed from: z  reason: collision with root package name */
    public final rp0 f27153z;

    public AdOverlayInfoParcel(or orVar, q qVar, q20 q20Var, s20 s20Var, x xVar, rp0 rp0Var, boolean z10, int i10, String str, zj0 zj0Var, nc1 nc1Var) {
        this.f27150w = null;
        this.f27151x = orVar;
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.L = q20Var;
        this.A = s20Var;
        this.B = null;
        this.C = z10;
        this.D = null;
        this.E = xVar;
        this.F = i10;
        this.G = 3;
        this.H = str;
        this.I = zj0Var;
        this.J = null;
        this.K = null;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = nc1Var;
    }

    @RecentlyNonNull
    public static AdOverlayInfoParcel p(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.p(parcel, 2, this.f27150w, i10, false);
        b.j(parcel, 3, yh.b.h1(this.f27151x).asBinder(), false);
        b.j(parcel, 4, yh.b.h1(this.f27152y).asBinder(), false);
        b.j(parcel, 5, yh.b.h1(this.f27153z).asBinder(), false);
        b.j(parcel, 6, yh.b.h1(this.A).asBinder(), false);
        b.q(parcel, 7, this.B, false);
        b.c(parcel, 8, this.C);
        b.q(parcel, 9, this.D, false);
        b.j(parcel, 10, yh.b.h1(this.E).asBinder(), false);
        b.k(parcel, 11, this.F);
        b.k(parcel, 12, this.G);
        b.q(parcel, 13, this.H, false);
        b.p(parcel, 14, this.I, i10, false);
        b.q(parcel, 16, this.J, false);
        b.p(parcel, 17, this.K, i10, false);
        b.j(parcel, 18, yh.b.h1(this.L).asBinder(), false);
        b.q(parcel, 19, this.M, false);
        b.j(parcel, 20, yh.b.h1(this.N).asBinder(), false);
        b.j(parcel, 21, yh.b.h1(this.O).asBinder(), false);
        b.j(parcel, 22, yh.b.h1(this.P).asBinder(), false);
        b.j(parcel, 23, yh.b.h1(this.Q).asBinder(), false);
        b.q(parcel, 24, this.R, false);
        b.q(parcel, 25, this.S, false);
        b.j(parcel, 26, yh.b.h1(this.T).asBinder(), false);
        b.j(parcel, 27, yh.b.h1(this.U).asBinder(), false);
        b.b(parcel, a10);
    }

    public AdOverlayInfoParcel(or orVar, q qVar, q20 q20Var, s20 s20Var, x xVar, rp0 rp0Var, boolean z10, int i10, String str, String str2, zj0 zj0Var, nc1 nc1Var) {
        this.f27150w = null;
        this.f27151x = orVar;
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.L = q20Var;
        this.A = s20Var;
        this.B = str2;
        this.C = z10;
        this.D = str;
        this.E = xVar;
        this.F = i10;
        this.G = 3;
        this.H = null;
        this.I = zj0Var;
        this.J = null;
        this.K = null;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = nc1Var;
    }

    public AdOverlayInfoParcel(or orVar, q qVar, x xVar, rp0 rp0Var, int i10, zj0 zj0Var, String str, j jVar, String str2, String str3, String str4, i51 i51Var) {
        this.f27150w = null;
        this.f27151x = null;
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.L = null;
        this.A = null;
        this.B = str2;
        this.C = false;
        this.D = str3;
        this.E = null;
        this.F = i10;
        this.G = 1;
        this.H = null;
        this.I = zj0Var;
        this.J = str;
        this.K = jVar;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = str4;
        this.T = i51Var;
        this.U = null;
    }

    public AdOverlayInfoParcel(or orVar, q qVar, x xVar, rp0 rp0Var, boolean z10, int i10, zj0 zj0Var, nc1 nc1Var) {
        this.f27150w = null;
        this.f27151x = orVar;
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.L = null;
        this.A = null;
        this.B = null;
        this.C = z10;
        this.D = null;
        this.E = xVar;
        this.F = i10;
        this.G = 2;
        this.H = null;
        this.I = zj0Var;
        this.J = null;
        this.K = null;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = nc1Var;
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, zj0 zj0Var, String str4, j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f27150w = eVar;
        this.f27151x = (or) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder));
        this.f27152y = (q) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder2));
        this.f27153z = (rp0) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder3));
        this.L = (q20) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder6));
        this.A = (s20) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder4));
        this.B = str;
        this.C = z10;
        this.D = str2;
        this.E = (x) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder5));
        this.F = i10;
        this.G = i11;
        this.H = str3;
        this.I = zj0Var;
        this.J = str4;
        this.K = jVar;
        this.M = str5;
        this.R = str6;
        this.N = (ey1) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder7));
        this.O = (pp1) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder8));
        this.P = (nq2) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder9));
        this.Q = (v0) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder10));
        this.S = str7;
        this.T = (i51) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder11));
        this.U = (nc1) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder12));
    }

    public AdOverlayInfoParcel(e eVar, or orVar, q qVar, x xVar, zj0 zj0Var, rp0 rp0Var, nc1 nc1Var) {
        this.f27150w = eVar;
        this.f27151x = orVar;
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.L = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = null;
        this.E = xVar;
        this.F = -1;
        this.G = 4;
        this.H = null;
        this.I = zj0Var;
        this.J = null;
        this.K = null;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = nc1Var;
    }

    public AdOverlayInfoParcel(q qVar, rp0 rp0Var, int i10, zj0 zj0Var) {
        this.f27152y = qVar;
        this.f27153z = rp0Var;
        this.F = 1;
        this.I = zj0Var;
        this.f27150w = null;
        this.f27151x = null;
        this.L = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = null;
        this.E = null;
        this.G = 1;
        this.H = null;
        this.J = null;
        this.K = null;
        this.M = null;
        this.R = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.S = null;
        this.T = null;
        this.U = null;
    }

    public AdOverlayInfoParcel(rp0 rp0Var, zj0 zj0Var, v0 v0Var, ey1 ey1Var, pp1 pp1Var, nq2 nq2Var, String str, String str2, int i10) {
        this.f27150w = null;
        this.f27151x = null;
        this.f27152y = null;
        this.f27153z = rp0Var;
        this.L = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = null;
        this.E = null;
        this.F = i10;
        this.G = 5;
        this.H = null;
        this.I = zj0Var;
        this.J = null;
        this.K = null;
        this.M = str;
        this.R = str2;
        this.N = ey1Var;
        this.O = pp1Var;
        this.P = nq2Var;
        this.Q = v0Var;
        this.S = null;
        this.T = null;
        this.U = null;
    }
}
