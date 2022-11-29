package a0;

import java.util.ArrayList;
import q1.q0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f99a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f100b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f101c;

    /* renamed from: d  reason: collision with root package name */
    public final int f102d;

    /* renamed from: e  reason: collision with root package name */
    public final int f103e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f104f;

    /* renamed from: g  reason: collision with root package name */
    public final m2.q f105g;

    /* renamed from: h  reason: collision with root package name */
    public final int f106h;

    /* renamed from: i  reason: collision with root package name */
    public final int f107i;

    /* renamed from: j  reason: collision with root package name */
    public final q0[] f108j;

    /* renamed from: k  reason: collision with root package name */
    public final j f109k;

    /* renamed from: l  reason: collision with root package name */
    public final long f110l;

    /* renamed from: m  reason: collision with root package name */
    public final int f111m;

    /* renamed from: n  reason: collision with root package name */
    public final int f112n;

    public g0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, m2.q qVar, int i13, int i14, q0[] q0VarArr, j jVar, long j10) {
        this.f99a = i10;
        this.f100b = obj;
        this.f101c = z10;
        this.f102d = i11;
        this.f103e = i12;
        this.f104f = z11;
        this.f105g = qVar;
        this.f106h = i13;
        this.f107i = i14;
        this.f108j = q0VarArr;
        this.f109k = jVar;
        this.f110l = j10;
        int i15 = 0;
        for (q0 q0Var : q0VarArr) {
            i15 = Math.max(i15, this.f101c ? q0Var.f0() : q0Var.r0());
        }
        this.f111m = i15;
        this.f112n = i15 + this.f103e;
    }

    public /* synthetic */ g0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, m2.q qVar, int i13, int i14, q0[] q0VarArr, j jVar, long j10, jo.h hVar) {
        this(i10, obj, z10, i11, i12, z11, qVar, i13, i14, q0VarArr, jVar, j10);
    }

    public final int a() {
        return this.f102d;
    }

    public final int b() {
        return this.f99a;
    }

    public final Object c() {
        return this.f100b;
    }

    public final int d() {
        return this.f111m;
    }

    public final int e() {
        return this.f112n;
    }

    public final x f(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long a10;
        long a11;
        long a12;
        int i17;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f101c;
        int i18 = z10 ? i13 : i12;
        int i19 = this.f104f ? (i18 - i10) - this.f111m : i10;
        int i20 = (z10 && this.f105g == m2.q.Rtl) ? ((z10 ? i12 : i13) - i11) - this.f102d : i11;
        if (z10) {
            a10 = m2.l.a(i20, i19);
        } else {
            a10 = m2.l.a(i19, i20);
        }
        int L = this.f104f ? xn.o.L(this.f108j) : 0;
        while (true) {
            boolean z11 = this.f104f;
            boolean z12 = true;
            if (!z11 ? L >= this.f108j.length : L < 0) {
                z12 = false;
            }
            if (!z12) {
                break;
            }
            arrayList.add(z11 ? 0 : arrayList.size(), new w(a10, this.f108j[L], this.f108j[L].d(), null));
            L = this.f104f ? L - 1 : L + 1;
        }
        if (this.f101c) {
            a11 = m2.l.a(i11, i10);
        } else {
            a11 = m2.l.a(i10, i11);
        }
        long j10 = a11;
        int i21 = this.f99a;
        Object obj = this.f100b;
        if (this.f101c) {
            a12 = m2.p.a(this.f102d, this.f111m);
        } else {
            a12 = m2.p.a(this.f111m, this.f102d);
        }
        long j11 = a12;
        int i22 = this.f103e;
        boolean z13 = this.f104f;
        if (!z13) {
            i17 = this.f106h;
        } else {
            i17 = this.f107i;
        }
        return new x(j10, a10, i21, obj, i14, i15, j11, i16, i22, -i17, i18 + (!z13 ? this.f107i : this.f106h), this.f101c, arrayList, this.f109k, this.f110l, null);
    }
}
