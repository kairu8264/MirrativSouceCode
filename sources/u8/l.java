package u8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrorman.net.api.response.Graph;
import io.p;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;
import pd.n;
import ud.h2;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import wn.m;
import wn.v;
import wo.q;
import wo.x;

/* loaded from: classes.dex */
public final class l extends q0 implements uo.q0 {
    public final ao.g A;
    public final e0<Boolean> B;
    public final LiveData<Boolean> C;
    public final e0<Boolean> D;
    public final LiveData<Boolean> E;
    public final e0<Graph.UrgeUserList> F;
    public final LiveData<Graph.UrgeUserList> G;
    public final q<v> H;
    public final q<v> I;
    public final e0<h2> J;
    public final LiveData<h2> K;
    public final e0<Boolean> L;
    public final LiveData<Boolean> M;

    /* renamed from: y  reason: collision with root package name */
    public final String f54625y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f54626z;

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogStore$on$1", f = "FollowCatalogStore.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54627w;

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
            int i10 = this.f54627w;
            if (i10 == 0) {
                m.b(obj);
                q qVar = l.this.I;
                v vVar = v.f59242a;
                this.f54627w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogStore$on$2", f = "FollowCatalogStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54629w;

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
            int i10 = this.f54629w;
            if (i10 == 0) {
                m.b(obj);
                q qVar = l.this.H;
                v vVar = v.f59242a;
                this.f54629w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public l(String str, q8.a aVar) {
        b0 b10;
        jo.p.h(str, "actionId");
        jo.p.h(aVar, "dispatcher");
        this.f54625y = str;
        this.f54626z = aVar;
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
        e0<Graph.UrgeUserList> e0Var3 = new e0<>(null);
        this.F = e0Var3;
        this.G = e0Var3;
        this.H = new q<>();
        this.I = new q<>();
        e0<h2> e0Var4 = new e0<>(null);
        this.J = e0Var4;
        this.K = e0Var4;
        e0<Boolean> e0Var5 = new e0<>(bool);
        this.L = e0Var5;
        this.M = e0Var5;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f54626z.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final x<v> h() {
        return this.H.g();
    }

    public final LiveData<h2> i() {
        return this.K;
    }

    public final x<v> j() {
        return this.I.g();
    }

    public final LiveData<Graph.UrgeUserList> k() {
        return this.G;
    }

    public final LiveData<Boolean> l() {
        return this.C;
    }

    public final LiveData<Boolean> m() {
        return this.M;
    }

    public final LiveData<Boolean> n() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n.e eVar) {
        jo.p.h(eVar, "event");
        this.B.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f54625y, fVar.a())) {
            this.D.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f54625y, dVar.a())) {
            if (dVar.c().getList().isEmpty() && dVar.d()) {
                this.D.p(Boolean.TRUE);
            }
            uo.l.d(this, null, null, new a(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n.d dVar) {
        jo.p.h(dVar, "event");
        this.F.p(dVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n.c cVar) {
        jo.p.h(cVar, "event");
        this.J.p(cVar.a());
        this.L.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(n.b bVar) {
        jo.p.h(bVar, "event");
        this.L.p(Boolean.FALSE);
    }
}
