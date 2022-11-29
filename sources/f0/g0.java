package f0;

import c1.f1;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31400a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f0.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0325a extends jo.q implements io.l<List<? extends e2.d>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e2.f f31401w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<e2.a0, wn.v> f31402x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0325a(e2.f fVar, io.l<? super e2.a0, wn.v> lVar) {
                super(1);
                this.f31401w = fVar;
                this.f31402x = lVar;
            }

            public final void a(List<? extends e2.d> list) {
                jo.p.h(list, "it");
                g0.f31400a.f(list, this.f31401w, this.f31402x);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(List<? extends e2.d> list) {
                a(list);
                return wn.v.f59242a;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e2.g0 b(long j10, e2.g0 g0Var) {
            jo.p.h(g0Var, "transformed");
            a.C1037a c1037a = new a.C1037a(g0Var.b());
            c1037a.b(new y1.v(0L, 0L, (d2.x) null, (d2.u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, j2.f.f37083b.d(), (f1) null, 12287, (jo.h) null), g0Var.a().b(y1.b0.n(j10)), g0Var.a().b(y1.b0.i(j10)));
            return new e2.g0(c1037a.h(), g0Var.a());
        }

        public final void c(c1.w wVar, e2.a0 a0Var, e2.t tVar, y1.z zVar, c1.s0 s0Var) {
            int b10;
            int b11;
            jo.p.h(wVar, "canvas");
            jo.p.h(a0Var, "value");
            jo.p.h(tVar, "offsetMapping");
            jo.p.h(zVar, "textLayoutResult");
            jo.p.h(s0Var, "selectionPaint");
            if (!y1.b0.h(a0Var.g()) && (b10 = tVar.b(y1.b0.l(a0Var.g()))) != (b11 = tVar.b(y1.b0.k(a0Var.g())))) {
                wVar.w(zVar.y(b10, b11), s0Var);
            }
            y1.a0.f61062a.a(wVar, zVar);
        }

        public final wn.p<Integer, Integer, y1.z> d(d0 d0Var, long j10, m2.q qVar, y1.z zVar) {
            jo.p.h(d0Var, "textDelegate");
            jo.p.h(qVar, "layoutDirection");
            y1.z l10 = d0Var.l(j10, qVar, zVar);
            return new wn.p<>(Integer.valueOf(m2.o.g(l10.A())), Integer.valueOf(m2.o.f(l10.A())), l10);
        }

        public final void e(e2.f0 f0Var, e2.f fVar, io.l<? super e2.a0, wn.v> lVar) {
            jo.p.h(f0Var, "textInputSession");
            jo.p.h(fVar, "editProcessor");
            jo.p.h(lVar, "onValueChange");
            lVar.invoke(e2.a0.d(fVar.c(), null, 0L, null, 3, null));
            f0Var.a();
        }

        public final void f(List<? extends e2.d> list, e2.f fVar, io.l<? super e2.a0, wn.v> lVar) {
            lVar.invoke(fVar.a(list));
        }

        public final e2.f0 g(e2.c0 c0Var, e2.a0 a0Var, e2.f fVar, e2.m mVar, io.l<? super e2.a0, wn.v> lVar, io.l<? super e2.l, wn.v> lVar2) {
            jo.p.h(c0Var, "textInputService");
            jo.p.h(a0Var, "value");
            jo.p.h(fVar, "editProcessor");
            jo.p.h(mVar, "imeOptions");
            jo.p.h(lVar, "onValueChange");
            jo.p.h(lVar2, "onImeActionPerformed");
            return h(c0Var, a0Var, fVar, mVar, lVar, lVar2);
        }

        public final e2.f0 h(e2.c0 c0Var, e2.a0 a0Var, e2.f fVar, e2.m mVar, io.l<? super e2.a0, wn.v> lVar, io.l<? super e2.l, wn.v> lVar2) {
            jo.p.h(c0Var, "textInputService");
            jo.p.h(a0Var, "value");
            jo.p.h(fVar, "editProcessor");
            jo.p.h(mVar, "imeOptions");
            jo.p.h(lVar, "onValueChange");
            jo.p.h(lVar2, "onImeActionPerformed");
            return c0Var.c(a0Var, mVar, new C0325a(fVar, lVar), lVar2);
        }

        public final void i(long j10, t0 t0Var, e2.f fVar, e2.t tVar, io.l<? super e2.a0, wn.v> lVar) {
            jo.p.h(t0Var, "textLayoutResult");
            jo.p.h(fVar, "editProcessor");
            jo.p.h(tVar, "offsetMapping");
            jo.p.h(lVar, "onValueChange");
            lVar.invoke(e2.a0.d(fVar.c(), null, y1.c0.a(tVar.a(t0.h(t0Var, j10, false, 2, null))), null, 5, null));
        }
    }
}
