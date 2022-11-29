package z;

import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62189e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final s0 f62190a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f62191b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f62192c;

    /* renamed from: d  reason: collision with root package name */
    public Object f62193d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int b(Object obj, int i10, q qVar) {
            Integer num;
            return obj == null ? i10 : ((i10 >= qVar.d() || !jo.p.c(obj, qVar.e(i10))) && (num = qVar.c().get(obj)) != null) ? b.b(num.intValue()) : i10;
        }
    }

    public e0(int i10, int i11) {
        s0 e10;
        s0 e11;
        e10 = z1.e(b.a(b.b(i10)), null, 2, null);
        this.f62190a = e10;
        e11 = z1.e(Integer.valueOf(i11), null, 2, null);
        this.f62191b = e11;
    }

    public final int a() {
        return ((b) this.f62190a.getValue()).g();
    }

    public final int b() {
        return ((Number) this.f62191b.getValue()).intValue();
    }

    public final void c(int i10, int i11) {
        f(i10, i11);
        this.f62193d = null;
    }

    public final void d(int i10) {
        this.f62190a.setValue(b.a(i10));
    }

    public final void e(int i10) {
        this.f62191b.setValue(Integer.valueOf(i10));
    }

    public final void f(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            if (!b.d(i10, a())) {
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

    public final void g(x xVar) {
        jo.p.h(xVar, "measureResult");
        i0 h10 = xVar.h();
        this.f62193d = h10 != null ? h10.c() : null;
        if (this.f62192c || xVar.a() > 0) {
            this.f62192c = true;
            int i10 = xVar.i();
            if (((float) i10) >= 0.0f) {
                v0.h a10 = v0.h.f56484e.a();
                try {
                    v0.h k10 = a10.k();
                    i0 h11 = xVar.h();
                    f(b.b(h11 != null ? h11.b() : 0), i10);
                    wn.v vVar = wn.v.f59242a;
                    a10.r(k10);
                    return;
                } finally {
                    a10.d();
                }
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
        }
    }

    public final void h(q qVar) {
        jo.p.h(qVar, "itemProvider");
        v0.h a10 = v0.h.f56484e.a();
        try {
            v0.h k10 = a10.k();
            f(f62189e.b(this.f62193d, a(), qVar), b());
            wn.v vVar = wn.v.f59242a;
            a10.r(k10);
        } finally {
            a10.d();
        }
    }
}
