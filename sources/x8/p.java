package x8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrorman.net.api.response.AnnouncementUrls;
import com.dena.mirrorman.net.api.response.App;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;
import pd.s;
import pd.v;
import ud.h2;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import wn.v;
import wo.q;
import wo.x;

/* loaded from: classes.dex */
public final class p extends q0 implements uo.q0 {
    public final ao.g A;
    public final e0<Boolean> B;
    public final LiveData<Boolean> C;
    public final e0<Boolean> D;
    public final LiveData<Boolean> E;
    public final e0<List<String>> F;
    public final LiveData<List<String>> G;
    public final e0<List<App.AppParams>> H;
    public final LiveData<List<App.AppParams>> I;
    public final e0<App.AppParams> J;
    public final LiveData<App.AppParams> K;
    public final e0<h2> L;
    public final LiveData<h2> M;
    public final e0<Boolean> N;
    public final LiveData<Boolean> O;
    public final q<v> P;
    public final e0<Boolean> Q;
    public final e0<Boolean> R;

    /* renamed from: y  reason: collision with root package name */
    public final String f59805y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f59806z;

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogStore$on$3", f = "HomeCatalogStore.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59807w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59807w;
            if (i10 == 0) {
                wn.m.b(obj);
                q qVar = p.this.P;
                v vVar = v.f59242a;
                this.f59807w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogStore$on$4", f = "HomeCatalogStore.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59809w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59809w;
            if (i10 == 0) {
                wn.m.b(obj);
                q qVar = p.this.P;
                v vVar = v.f59242a;
                this.f59809w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    public p(String str, q8.a aVar) {
        b0 b10;
        jo.p.h(str, "actionId");
        jo.p.h(aVar, "dispatcher");
        this.f59805y = str;
        this.f59806z = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.A = c10.plus(b10);
        e0<Boolean> e0Var = new e0<>(null);
        this.B = e0Var;
        this.C = e0Var;
        Boolean bool = Boolean.FALSE;
        e0<Boolean> e0Var2 = new e0<>(bool);
        this.D = e0Var2;
        this.E = e0Var2;
        e0<List<String>> e0Var3 = new e0<>(null);
        this.F = e0Var3;
        this.G = e0Var3;
        e0<List<App.AppParams>> e0Var4 = new e0<>(null);
        this.H = e0Var4;
        this.I = e0Var4;
        e0<App.AppParams> e0Var5 = new e0<>(null);
        this.J = e0Var5;
        this.K = e0Var5;
        e0<h2> e0Var6 = new e0<>(null);
        this.L = e0Var6;
        this.M = e0Var6;
        e0<Boolean> e0Var7 = new e0<>(bool);
        this.N = e0Var7;
        this.O = e0Var7;
        this.P = new q<>();
        e0<Boolean> e0Var8 = new e0<>(bool);
        this.Q = e0Var8;
        this.R = e0Var8;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f59806z.c(this);
        super.d();
    }

    public final LiveData<List<String>> g() {
        return this.G;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final LiveData<List<App.AppParams>> h() {
        return this.I;
    }

    public final LiveData<h2> i() {
        return this.M;
    }

    public final x<v> j() {
        return this.P.g();
    }

    public final LiveData<App.AppParams> k() {
        return this.K;
    }

    public final LiveData<Boolean> l() {
        return this.C;
    }

    public final LiveData<Boolean> m() {
        return this.E;
    }

    public final LiveData<Boolean> n() {
        return this.O;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.j jVar) {
        jo.p.h(jVar, "event");
        this.B.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f59805y, fVar.a())) {
            this.D.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        List<String> catalog;
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f59805y, dVar.a())) {
            if (dVar.c().getList().isEmpty() && dVar.d()) {
                this.D.p(Boolean.TRUE);
            }
            AnnouncementUrls announcementUrls = dVar.c().getAnnouncementUrls();
            if (announcementUrls == null || (catalog = announcementUrls.getCatalog()) == null) {
                return;
            }
            this.F.p(catalog);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.f fVar) {
        jo.p.h(fVar, "event");
        this.B.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.b bVar) {
        jo.p.h(bVar, "event");
        this.H.p(bVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r0 == true) goto L7;
     */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(pd.s.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            jo.p.h(r8, r0)
            androidx.lifecycle.LiveData<java.util.List<com.dena.mirrorman.net.api.response.App$AppParams>> r0 = r7.I
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L19
        L17:
            r0 = r2
            goto L3c
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L17
            java.lang.Object r3 = r0.next()
            com.dena.mirrorman.net.api.response.App$AppParams r3 = (com.dena.mirrorman.net.api.response.App.AppParams) r3
            java.lang.String r3 = r3.getAppId()
            com.dena.mirrorman.net.api.response.App$AppParams r4 = r8.a()
            java.lang.String r4 = r4.getAppId()
            boolean r3 = jo.p.c(r3, r4)
            if (r3 == 0) goto L1d
            r0 = r1
        L3c:
            if (r0 != r1) goto L3f
            goto L40
        L3f:
            r1 = r2
        L40:
            if (r1 != 0) goto L5f
            androidx.lifecycle.e0<java.util.List<com.dena.mirrorman.net.api.response.App$AppParams>> r0 = r7.H
            java.lang.Object r1 = r0.f()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L50
            java.util.List r1 = xn.s.k()
        L50:
            com.dena.mirrorman.net.api.response.App$AppParams r8 = r8.a()
            java.util.List r8 = xn.r.d(r8)
            java.util.List r8 = xn.a0.o0(r1, r8)
            r0.p(r8)
        L5f:
            r2 = 0
            r3 = 0
            x8.p$a r4 = new x8.p$a
            r8 = 0
            r4.<init>(r8)
            r5 = 3
            r6 = 0
            r1 = r7
            uo.j.d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.p.on(pd.s$a):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.d dVar) {
        jo.p.h(dVar, "event");
        this.J.p(dVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.c cVar) {
        jo.p.h(cVar, "event");
        this.L.p(cVar.a());
        this.N.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.a aVar) {
        jo.p.h(aVar, "event");
        this.N.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(v.e eVar) {
        jo.p.h(eVar, "event");
        this.R.p(Boolean.valueOf(eVar.a()));
    }
}
