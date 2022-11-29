package ai;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class rn2 extends sh.a {
    public static final Parcelable.Creator<rn2> CREATOR = new sn2();
    public final int A;
    public final int B;
    public final int C;
    public final String D;
    public final int E;
    public final int F;
    public final int[] G;
    public final int[] H;
    public final int I;

    /* renamed from: w  reason: collision with root package name */
    public final on2[] f9513w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f9514x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9515y;

    /* renamed from: z  reason: collision with root package name */
    public final on2 f9516z;

    public rn2(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        on2[] values = on2.values();
        this.f9513w = values;
        int[] a10 = pn2.a();
        this.G = a10;
        int[] a11 = qn2.a();
        this.H = a11;
        this.f9514x = null;
        this.f9515y = i10;
        this.f9516z = values[i10];
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = str;
        this.E = i14;
        this.I = a10[i14];
        this.F = i15;
        int i16 = a11[i15];
    }

    public static rn2 p(on2 on2Var, Context context) {
        if (on2Var == on2.Rewarded) {
            return new rn2(context, on2Var, ((Integer) ft.c().c(ox.H4)).intValue(), ((Integer) ft.c().c(ox.N4)).intValue(), ((Integer) ft.c().c(ox.P4)).intValue(), (String) ft.c().c(ox.R4), (String) ft.c().c(ox.J4), (String) ft.c().c(ox.L4));
        } else if (on2Var == on2.Interstitial) {
            return new rn2(context, on2Var, ((Integer) ft.c().c(ox.I4)).intValue(), ((Integer) ft.c().c(ox.O4)).intValue(), ((Integer) ft.c().c(ox.Q4)).intValue(), (String) ft.c().c(ox.S4), (String) ft.c().c(ox.K4), (String) ft.c().c(ox.M4));
        } else if (on2Var == on2.AppOpen) {
            return new rn2(context, on2Var, ((Integer) ft.c().c(ox.V4)).intValue(), ((Integer) ft.c().c(ox.X4)).intValue(), ((Integer) ft.c().c(ox.Y4)).intValue(), (String) ft.c().c(ox.T4), (String) ft.c().c(ox.U4), (String) ft.c().c(ox.W4));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f9515y);
        sh.b.k(parcel, 2, this.A);
        sh.b.k(parcel, 3, this.B);
        sh.b.k(parcel, 4, this.C);
        sh.b.q(parcel, 5, this.D, false);
        sh.b.k(parcel, 6, this.E);
        sh.b.k(parcel, 7, this.F);
        sh.b.b(parcel, a10);
    }

    public rn2(Context context, on2 on2Var, int i10, int i11, int i12, String str, String str2, String str3) {
        this.f9513w = on2.values();
        this.G = pn2.a();
        this.H = qn2.a();
        this.f9514x = context;
        this.f9515y = on2Var.ordinal();
        this.f9516z = on2Var;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.I = i13;
        this.E = i13 - 1;
        "onAdClosed".equals(str3);
        this.F = 0;
    }
}
