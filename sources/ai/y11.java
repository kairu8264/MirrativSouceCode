package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class y11<T> {

    /* renamed from: a  reason: collision with root package name */
    public final fu1 f12391a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f12392b;

    /* renamed from: c  reason: collision with root package name */
    public final cq2 f12393c;

    /* renamed from: d  reason: collision with root package name */
    public final jv0 f12394d;

    /* renamed from: e  reason: collision with root package name */
    public final j22<T> f12395e;

    /* renamed from: f  reason: collision with root package name */
    public final ea1 f12396f;

    /* renamed from: g  reason: collision with root package name */
    public sl2 f12397g;

    /* renamed from: h  reason: collision with root package name */
    public final kv1 f12398h;

    /* renamed from: i  reason: collision with root package name */
    public final a41 f12399i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f12400j;

    /* renamed from: k  reason: collision with root package name */
    public final yu1 f12401k;

    /* renamed from: l  reason: collision with root package name */
    public final vy1 f12402l;

    public y11(fu1 fu1Var, yl2 yl2Var, cq2 cq2Var, jv0 jv0Var, j22<T> j22Var, ea1 ea1Var, sl2 sl2Var, kv1 kv1Var, a41 a41Var, Executor executor, yu1 yu1Var, vy1 vy1Var) {
        this.f12391a = fu1Var;
        this.f12392b = yl2Var;
        this.f12393c = cq2Var;
        this.f12394d = jv0Var;
        this.f12395e = j22Var;
        this.f12396f = ea1Var;
        this.f12397g = sl2Var;
        this.f12398h = kv1Var;
        this.f12399i = a41Var;
        this.f12400j = executor;
        this.f12401k = yu1Var;
        this.f12402l = vy1Var;
    }

    public final s43<sl2> b(s43<ie0> s43Var) {
        sl2 sl2Var = this.f12397g;
        if (sl2Var != null) {
            cq2 cq2Var = this.f12393c;
            return np2.a(j43.a(sl2Var), wp2.SERVER_TRANSACTION, cq2Var).i();
        }
        wg.t.j().e();
        return this.f12393c.e(wp2.SERVER_TRANSACTION, s43Var).c(t11.c(this.f12401k)).i();
    }

    public final s43<sl2> c() {
        as asVar = this.f12392b.f12650d;
        if (asVar.T == null && asVar.O == null) {
            return b(this.f12399i.b());
        }
        cq2 cq2Var = this.f12393c;
        return np2.a(this.f12391a.c(), wp2.SERVER_TRANSACTION, cq2Var).i();
    }

    public final s43<T> d(s43<sl2> s43Var) {
        tp2 c10 = this.f12393c.e(wp2.RENDERER, s43Var).b(new fp2(this) { // from class: ai.u11

            /* renamed from: a  reason: collision with root package name */
            public final y11 f10557a;

            {
                this.f10557a = this;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                sl2 sl2Var = (sl2) obj;
                this.f10557a.k(sl2Var);
                return sl2Var;
            }
        }).c(this.f12395e);
        if (!((Boolean) ft.c().c(ox.O3)).booleanValue()) {
            c10 = c10.h(((Integer) ft.c().c(ox.P3)).intValue(), TimeUnit.SECONDS);
        }
        return c10.i();
    }

    public final ea1 e() {
        return this.f12396f;
    }

    public final s43<ie0> f(final rn2 rn2Var) {
        hp2 i10 = this.f12393c.e(wp2.GET_CACHE_KEY, this.f12399i.b()).c(new p33(this, rn2Var) { // from class: ai.v11

            /* renamed from: a  reason: collision with root package name */
            public final y11 f10914a;

            /* renamed from: b  reason: collision with root package name */
            public final rn2 f10915b;

            {
                this.f10914a = this;
                this.f10915b = rn2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f10914a.j(this.f10915b, (ie0) obj);
            }
        }).i();
        j43.p(i10, new w11(this), this.f12400j);
        return i10;
    }

    public final s43<Void> g(ie0 ie0Var) {
        hp2 i10 = this.f12393c.e(wp2.NOTIFY_CACHE_HIT, this.f12398h.b(ie0Var)).i();
        j43.p(i10, new x11(this), this.f12400j);
        return i10;
    }

    public final sr h(Throwable th2) {
        return tm2.b(th2, this.f12402l);
    }

    public final void i(sl2 sl2Var) {
        this.f12397g = sl2Var;
    }

    public final /* synthetic */ s43 j(rn2 rn2Var, ie0 ie0Var) throws Exception {
        ie0Var.E = rn2Var;
        return this.f12398h.a(ie0Var);
    }

    public final /* synthetic */ sl2 k(sl2 sl2Var) throws Exception {
        this.f12394d.a(sl2Var);
        return sl2Var;
    }
}
