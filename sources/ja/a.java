package ja;

import h0.p0;
import h0.w1;
import io.q;
import jo.p;
import m2.s;
import wn.v;
import x0.f;
import y.d1;
import y.g1;
import y.z0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37268a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static q<z0, l0.i, Integer, v> f37269b = s0.c.c(-1841250278, false, C0496a.f37270w);

    /* renamed from: ja.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0496a extends jo.q implements q<z0, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0496a f37270w = new C0496a();

        public C0496a() {
            super(3);
        }

        public final void a(z0 z0Var, l0.i iVar, int i10) {
            p.h(z0Var, "$this$Button");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            f1.d c10 = v1.e.c(k.ic_live_white, iVar, 0);
            f.a aVar = x0.f.f59359u;
            p0.a(c10, null, d1.v(aVar, m2.g.l(8), m2.g.l(14)), 0L, iVar, 440, 8);
            g1.a(d1.u(aVar, m2.g.l(2)), iVar, 6);
            w1.c(v1.f.b(n.text_live, iVar, 0), null, 0L, s.d(9), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 3072, 0, 65526);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final q<z0, l0.i, Integer, v> a() {
        return f37269b;
    }
}
