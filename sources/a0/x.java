package a0;

import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: a  reason: collision with root package name */
    public final long f252a;

    /* renamed from: b  reason: collision with root package name */
    public final long f253b;

    /* renamed from: c  reason: collision with root package name */
    public final int f254c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f255d;

    /* renamed from: e  reason: collision with root package name */
    public final int f256e;

    /* renamed from: f  reason: collision with root package name */
    public final int f257f;

    /* renamed from: g  reason: collision with root package name */
    public final long f258g;

    /* renamed from: h  reason: collision with root package name */
    public final int f259h;

    /* renamed from: i  reason: collision with root package name */
    public final int f260i;

    /* renamed from: j  reason: collision with root package name */
    public final int f261j;

    /* renamed from: k  reason: collision with root package name */
    public final int f262k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f263l;

    /* renamed from: m  reason: collision with root package name */
    public final List<w> f264m;

    /* renamed from: n  reason: collision with root package name */
    public final j f265n;

    /* renamed from: o  reason: collision with root package name */
    public final long f266o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f267p;

    public x(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List<w> list, j jVar, long j13) {
        this.f252a = j10;
        this.f253b = j11;
        this.f254c = i10;
        this.f255d = obj;
        this.f256e = i11;
        this.f257f = i12;
        this.f258g = j12;
        this.f259h = i13;
        this.f260i = i14;
        this.f261j = i15;
        this.f262k = i16;
        this.f263l = z10;
        this.f264m = list;
        this.f265n = jVar;
        this.f266o = j13;
        int q10 = q();
        boolean z11 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= q10) {
                break;
            } else if (e(i17) != null) {
                z11 = true;
                break;
            } else {
                i17++;
            }
        }
        this.f267p = z11;
    }

    public /* synthetic */ x(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List list, j jVar, long j13, jo.h hVar) {
        this(j10, j11, i10, obj, i11, i12, j12, i13, i14, i15, i16, z10, list, jVar, j13);
    }

    @Override // a0.i
    public long a() {
        return this.f258g;
    }

    @Override // a0.i
    public int b() {
        return this.f256e;
    }

    @Override // a0.i
    public int c() {
        return this.f257f;
    }

    @Override // a0.i
    public long d() {
        return this.f252a;
    }

    public final u.c0<m2.k> e(int i10) {
        Object a10 = this.f264m.get(i10).a();
        if (a10 instanceof u.c0) {
            return (u.c0) a10;
        }
        return null;
    }

    public final int f() {
        return this.f263l ? m2.k.j(d()) : m2.k.k(d());
    }

    public final int g() {
        return this.f263l ? m2.o.g(a()) : m2.o.f(a());
    }

    @Override // a0.i
    public int getIndex() {
        return this.f254c;
    }

    public final boolean h() {
        return this.f267p;
    }

    public Object i() {
        return this.f255d;
    }

    public final int j() {
        return this.f259h;
    }

    public final int k() {
        return this.f260i + this.f259h;
    }

    public final int l(long j10) {
        return this.f263l ? m2.k.k(j10) : m2.k.j(j10);
    }

    public final int m(int i10) {
        return n(this.f264m.get(i10).b());
    }

    public final int n(q0 q0Var) {
        return this.f263l ? q0Var.f0() : q0Var.r0();
    }

    public final int o() {
        return this.f260i + (this.f263l ? m2.o.f(a()) : m2.o.g(a()));
    }

    public final long p() {
        return this.f253b;
    }

    public final int q() {
        return this.f264m.size();
    }

    public final void r(q0.a aVar) {
        long j10;
        jo.p.h(aVar, "scope");
        int q10 = q();
        for (int i10 = 0; i10 < q10; i10++) {
            q0 b10 = this.f264m.get(i10).b();
            int n10 = this.f261j - n(b10);
            int i11 = this.f262k;
            if (e(i10) != null) {
                j10 = this.f265n.c(i(), i10, n10, i11, this.f253b);
            } else {
                j10 = this.f253b;
            }
            if (l(j10) > n10 && l(j10) < i11) {
                if (this.f263l) {
                    long j11 = this.f266o;
                    q0.a.x(aVar, b10, m2.l.a(m2.k.j(j10) + m2.k.j(j11), m2.k.k(j10) + m2.k.k(j11)), 0.0f, null, 6, null);
                } else {
                    long j12 = this.f266o;
                    q0.a.t(aVar, b10, m2.l.a(m2.k.j(j10) + m2.k.j(j12), m2.k.k(j10) + m2.k.k(j12)), 0.0f, null, 6, null);
                }
            }
        }
    }
}
