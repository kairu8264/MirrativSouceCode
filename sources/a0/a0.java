package a0;

import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final s0 f7a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f8b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int b(Object obj, int i10, l lVar) {
            Integer num;
            return obj == null ? i10 : ((i10 >= lVar.d() || !jo.p.c(obj, lVar.e(i10))) && (num = lVar.c().get(obj)) != null) ? e.b(num.intValue()) : i10;
        }
    }

    public a0(int i10, int i11) {
        s0 e10;
        s0 e11;
        e10 = z1.e(e.a(e.b(i10)), null, 2, null);
        this.f7a = e10;
        e11 = z1.e(Integer.valueOf(i11), null, 2, null);
        this.f8b = e11;
    }

    public final int a() {
        return ((e) this.f7a.getValue()).g();
    }

    public final int b() {
        return ((Number) this.f8b.getValue()).intValue();
    }

    public final void c(int i10, int i11) {
        f(i10, i11);
        this.f10d = null;
    }

    public final void d(int i10) {
        this.f7a.setValue(e.a(i10));
    }

    public final void e(int i10) {
        this.f8b.setValue(Integer.valueOf(i10));
    }

    public final void f(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            if (!e.d(i10, a())) {
                d(i10);
            }
            if (i11 != b()) {
                e(i11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public final void g(v vVar) {
        g0[] b10;
        g0 g0Var;
        g0[] b11;
        g0 g0Var2;
        jo.p.h(vVar, "measureResult");
        i0 g10 = vVar.g();
        this.f10d = (g10 == null || (b11 = g10.b()) == null || (g0Var2 = (g0) xn.o.G(b11)) == null) ? null : g0Var2.c();
        if (this.f9c || vVar.a() > 0) {
            this.f9c = true;
            int h10 = vVar.h();
            int i10 = 0;
            if (((float) h10) >= 0.0f) {
                v0.h a10 = v0.h.f56484e.a();
                try {
                    v0.h k10 = a10.k();
                    i0 g11 = vVar.g();
                    if (g11 != null && (b10 = g11.b()) != null && (g0Var = (g0) xn.o.G(b10)) != null) {
                        i10 = g0Var.b();
                    }
                    f(e.b(i10), h10);
                    wn.v vVar2 = wn.v.f59242a;
                    a10.r(k10);
                    return;
                } finally {
                    a10.d();
                }
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + h10 + ')').toString());
        }
    }

    public final void h(l lVar) {
        jo.p.h(lVar, "itemProvider");
        v0.h a10 = v0.h.f56484e.a();
        try {
            v0.h k10 = a10.k();
            f(f6e.b(this.f10d, a(), lVar), b());
            wn.v vVar = wn.v.f59242a;
            a10.r(k10);
        } finally {
            a10.d();
        }
    }
}
