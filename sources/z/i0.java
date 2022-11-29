package z;

import java.util.ArrayList;
import q1.q0;
import x0.a;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f62252a;

    /* renamed from: b  reason: collision with root package name */
    public final q0[] f62253b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62254c;

    /* renamed from: d  reason: collision with root package name */
    public final a.b f62255d;

    /* renamed from: e  reason: collision with root package name */
    public final a.c f62256e;

    /* renamed from: f  reason: collision with root package name */
    public final m2.q f62257f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f62258g;

    /* renamed from: h  reason: collision with root package name */
    public final int f62259h;

    /* renamed from: i  reason: collision with root package name */
    public final int f62260i;

    /* renamed from: j  reason: collision with root package name */
    public final o f62261j;

    /* renamed from: k  reason: collision with root package name */
    public final int f62262k;

    /* renamed from: l  reason: collision with root package name */
    public final long f62263l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f62264m;

    /* renamed from: n  reason: collision with root package name */
    public final int f62265n;

    /* renamed from: o  reason: collision with root package name */
    public final int f62266o;

    /* renamed from: p  reason: collision with root package name */
    public final int f62267p;

    public i0(int i10, q0[] q0VarArr, boolean z10, a.b bVar, a.c cVar, m2.q qVar, boolean z11, int i11, int i12, o oVar, int i13, long j10, Object obj) {
        this.f62252a = i10;
        this.f62253b = q0VarArr;
        this.f62254c = z10;
        this.f62255d = bVar;
        this.f62256e = cVar;
        this.f62257f = qVar;
        this.f62258g = z11;
        this.f62259h = i11;
        this.f62260i = i12;
        this.f62261j = oVar;
        this.f62262k = i13;
        this.f62263l = j10;
        this.f62264m = obj;
        int i14 = 0;
        int i15 = 0;
        for (q0 q0Var : q0VarArr) {
            i14 += this.f62254c ? q0Var.f0() : q0Var.r0();
            i15 = Math.max(i15, !this.f62254c ? q0Var.f0() : q0Var.r0());
        }
        this.f62265n = i14;
        this.f62266o = i14 + this.f62262k;
        this.f62267p = i15;
    }

    public /* synthetic */ i0(int i10, q0[] q0VarArr, boolean z10, a.b bVar, a.c cVar, m2.q qVar, boolean z11, int i11, int i12, o oVar, int i13, long j10, Object obj, jo.h hVar) {
        this(i10, q0VarArr, z10, bVar, cVar, qVar, z11, i11, i12, oVar, i13, j10, obj);
    }

    public final int a() {
        return this.f62267p;
    }

    public final int b() {
        return this.f62252a;
    }

    public final Object c() {
        return this.f62264m;
    }

    public final int d() {
        return this.f62265n;
    }

    public final int e() {
        return this.f62266o;
    }

    public final b0 f(int i10, int i11, int i12) {
        long a10;
        ArrayList arrayList = new ArrayList();
        int i13 = this.f62254c ? i12 : i11;
        boolean z10 = this.f62258g;
        int i14 = z10 ? (i13 - i10) - this.f62265n : i10;
        int L = z10 ? xn.o.L(this.f62253b) : 0;
        while (true) {
            boolean z11 = this.f62258g;
            boolean z12 = true;
            if (!z11 ? L >= this.f62253b.length : L < 0) {
                z12 = false;
            }
            if (z12) {
                q0 q0Var = this.f62253b[L];
                int size = z11 ? 0 : arrayList.size();
                if (this.f62254c) {
                    a.b bVar = this.f62255d;
                    if (bVar != null) {
                        a10 = m2.l.a(bVar.a(q0Var.r0(), i11, this.f62257f), i14);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    a.c cVar = this.f62256e;
                    if (cVar != null) {
                        a10 = m2.l.a(i14, cVar.a(q0Var.f0(), i12));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j10 = a10;
                i14 += this.f62254c ? q0Var.f0() : q0Var.r0();
                arrayList.add(size, new a0(j10, q0Var, this.f62253b[L].d(), null));
                L = this.f62258g ? L - 1 : L + 1;
            } else {
                return new b0(i10, this.f62252a, this.f62264m, this.f62265n, this.f62266o, -(!z11 ? this.f62259h : this.f62260i), i13 + (!z11 ? this.f62260i : this.f62259h), this.f62254c, arrayList, this.f62261j, this.f62263l, null);
            }
        }
    }
}
