package a1;

import a1.t;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<s> f341a = r1.c.a(a.f342w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<s> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f342w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final s invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f343w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.l lVar) {
            super(1);
            this.f343w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusProperties");
            c1Var.a().b("scope", this.f343w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f344w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar) {
            super(0);
            this.f344w = jVar;
        }

        public final void a() {
            s j10 = this.f344w.j();
            if (j10 != null) {
                j10.b(this.f344w.i());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public static final void a(p pVar) {
        jo.p.h(pVar, "<this>");
        pVar.k(true);
        t.a aVar = t.f348b;
        pVar.r(aVar.a());
        pVar.s(aVar.a());
        pVar.i(aVar.a());
        pVar.m(aVar.a());
        pVar.l(aVar.a());
        pVar.t(aVar.a());
        pVar.p(aVar.a());
        pVar.n(aVar.a());
    }

    public static final x0.f b(x0.f fVar, io.l<? super p, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "scope");
        return fVar.L(new s(lVar, a1.c() ? new b(lVar) : a1.a()));
    }

    public static final r1.f<s> c() {
        return f341a;
    }

    public static final void d(j jVar) {
        s1.a0 snapshotObserver;
        jo.p.h(jVar, "<this>");
        s1.p r10 = jVar.r();
        if (r10 == null) {
            return;
        }
        a(jVar.i());
        s1.y t02 = r10.z1().t0();
        if (t02 != null && (snapshotObserver = t02.getSnapshotObserver()) != null) {
            snapshotObserver.e(jVar, j.M.a(), new c(jVar));
        }
        e(jVar, jVar.i());
    }

    public static final void e(j jVar, p pVar) {
        jo.p.h(jVar, "<this>");
        jo.p.h(pVar, "properties");
        if (pVar.o()) {
            z.a(jVar);
        } else {
            z.e(jVar);
        }
    }
}
