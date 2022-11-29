package z;

import java.util.List;
import q1.q0;

/* loaded from: classes.dex */
public final class b0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f62159a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62160b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f62161c;

    /* renamed from: d  reason: collision with root package name */
    public final int f62162d;

    /* renamed from: e  reason: collision with root package name */
    public final int f62163e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62164f;

    /* renamed from: g  reason: collision with root package name */
    public final int f62165g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f62166h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a0> f62167i;

    /* renamed from: j  reason: collision with root package name */
    public final o f62168j;

    /* renamed from: k  reason: collision with root package name */
    public final long f62169k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f62170l;

    public b0(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List<a0> list, o oVar, long j10) {
        this.f62159a = i10;
        this.f62160b = i11;
        this.f62161c = obj;
        this.f62162d = i12;
        this.f62163e = i13;
        this.f62164f = i14;
        this.f62165g = i15;
        this.f62166h = z10;
        this.f62167i = list;
        this.f62168j = oVar;
        this.f62169k = j10;
        int i16 = i();
        boolean z11 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= i16) {
                break;
            } else if (c(i17) != null) {
                z11 = true;
                break;
            } else {
                i17++;
            }
        }
        this.f62170l = z11;
    }

    public /* synthetic */ b0(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List list, o oVar, long j10, jo.h hVar) {
        this(i10, i11, obj, i12, i13, i14, i15, z10, list, oVar, j10);
    }

    @Override // z.n
    public int a() {
        return this.f62162d;
    }

    @Override // z.n
    public int b() {
        return this.f62159a;
    }

    public final u.c0<m2.k> c(int i10) {
        Object b10 = this.f62167i.get(i10).b();
        if (b10 instanceof u.c0) {
            return (u.c0) b10;
        }
        return null;
    }

    public final boolean d() {
        return this.f62170l;
    }

    public Object e() {
        return this.f62161c;
    }

    public final int f(int i10) {
        return g(this.f62167i.get(i10).c());
    }

    public final int g(q0 q0Var) {
        return this.f62166h ? q0Var.f0() : q0Var.r0();
    }

    @Override // z.n
    public int getIndex() {
        return this.f62160b;
    }

    public final long h(int i10) {
        return this.f62167i.get(i10).a();
    }

    public final int i() {
        return this.f62167i.size();
    }

    public final int j() {
        return this.f62163e;
    }

    public final void k(q0.a aVar) {
        long h10;
        jo.p.h(aVar, "scope");
        int i10 = i();
        for (int i11 = 0; i11 < i10; i11++) {
            q0 c10 = this.f62167i.get(i11).c();
            int g10 = this.f62164f - g(c10);
            int i12 = this.f62165g;
            if (c(i11) != null) {
                h10 = this.f62168j.b(e(), i11, g10, i12, h(i11));
            } else {
                h10 = h(i11);
            }
            if (this.f62166h) {
                long j10 = this.f62169k;
                q0.a.x(aVar, c10, m2.l.a(m2.k.j(h10) + m2.k.j(j10), m2.k.k(h10) + m2.k.k(j10)), 0.0f, null, 6, null);
            } else {
                long j11 = this.f62169k;
                q0.a.t(aVar, c10, m2.l.a(m2.k.j(h10) + m2.k.j(j11), m2.k.k(h10) + m2.k.k(j11)), 0.0f, null, 6, null);
            }
        }
    }
}
