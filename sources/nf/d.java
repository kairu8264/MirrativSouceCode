package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.d;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes3.dex */
public final class d extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final androidx.lifecycle.e0<List<String>> C;
    public final LiveData<List<String>> D;
    public final androidx.lifecycle.e0<List<App.AppParams>> E;
    public final LiveData<List<App.AppParams>> F;
    public final androidx.lifecycle.e0<List<App.AppParams>> G;
    public final LiveData<List<App.AppParams>> H;
    public final androidx.lifecycle.e0<Integer> I;
    public final LiveData<Integer> J;
    public final androidx.lifecycle.e0<String> K;
    public final LiveData<String> L;
    public final wo.q<wn.v> M;
    public final wo.q<MRError> N;
    public final wo.q<MRError> O;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42591y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f42592z;

    @co.f(c = "com.dena.mirrorman.store.ChooseMyAppsStore$on$3", f = "ChooseMyAppsStore.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42593w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42593w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = d.this.M;
                wn.v vVar = wn.v.f59242a;
                this.f42593w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ChooseMyAppsStore$on$4", f = "ChooseMyAppsStore.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42595w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d.h f42597y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d.h hVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42597y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42597y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42595w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = d.this.O;
                MRError a10 = this.f42597y.a();
                this.f42595w = 1;
                if (qVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ChooseMyAppsStore$on$5", f = "ChooseMyAppsStore.kt", l = {159}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42598w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d.f f42600y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d.f fVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42600y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42600y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42598w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = d.this.N;
                MRError a10 = this.f42600y.a();
                this.f42598w = 1;
                if (qVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public d(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f42591y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f42592z = c10.plus(b10);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<List<String>> e0Var2 = new androidx.lifecycle.e0<>(xn.s.k());
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<List<App.AppParams>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<List<App.AppParams>> e0Var4 = new androidx.lifecycle.e0<>(xn.s.k());
        this.G = e0Var4;
        this.H = e0Var4;
        androidx.lifecycle.e0<Integer> e0Var5 = new androidx.lifecycle.e0<>(null);
        this.I = e0Var5;
        this.J = e0Var5;
        androidx.lifecycle.e0<String> e0Var6 = new androidx.lifecycle.e0<>(null);
        this.K = e0Var6;
        this.L = e0Var6;
        this.M = new wo.q<>();
        this.N = new wo.q<>();
        this.O = new wo.q<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42591y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42592z;
    }

    public final LiveData<List<App.AppParams>> i() {
        return this.H;
    }

    public final LiveData<List<String>> j() {
        return this.D;
    }

    public final LiveData<String> k() {
        return this.L;
    }

    public final LiveData<Integer> l() {
        return this.J;
    }

    public final LiveData<List<App.AppParams>> m() {
        return this.F;
    }

    public final wo.x<MRError> n() {
        return this.N.g();
    }

    public final wo.x<wn.v> o() {
        return this.M.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.l lVar) {
        jo.p.h(lVar, "event");
        this.A.p(Boolean.TRUE);
        this.G.p(null);
        this.I.p(null);
    }

    public final wo.x<MRError> p() {
        return this.O.g();
    }

    public final LiveData<Boolean> q() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.k kVar) {
        jo.p.h(kVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(Boolean.FALSE);
        this.I.p(null);
        this.G.p(eVar.a().getApps());
        this.E.p(eVar.a().getApps());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.j jVar) {
        jo.p.h(jVar, "event");
        this.A.p(Boolean.FALSE);
        this.I.p(null);
        this.G.p(this.F.f());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.a aVar) {
        jo.p.h(aVar, "event");
        androidx.lifecycle.e0<List<String>> e0Var = this.C;
        ArrayList arrayList = new ArrayList();
        List<String> f10 = this.C.f();
        if (f10 != null) {
            jo.p.g(f10, "value");
            for (String str : f10) {
                arrayList.add(str);
            }
        }
        arrayList.add(aVar.a());
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.n nVar) {
        jo.p.h(nVar, "event");
        androidx.lifecycle.e0<List<String>> e0Var = this.C;
        ArrayList arrayList = new ArrayList();
        List<String> f10 = this.C.f();
        if (f10 != null) {
            jo.p.g(f10, "value");
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : f10) {
                if (!jo.p.c((String) obj, nVar.a())) {
                    arrayList2.add(obj);
                }
            }
            for (String str : arrayList2) {
                arrayList.add(str);
            }
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.i iVar) {
        jo.p.h(iVar, "event");
        if (iVar.a().getNextPage() == 0) {
            this.A.p(Boolean.FALSE);
        }
        this.I.p(Integer.valueOf(iVar.a().getNextPage()));
        this.G.p(iVar.a().getApps());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.m mVar) {
        jo.p.h(mVar, "event");
        this.K.p(mVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.c cVar) {
        jo.p.h(cVar, "event");
        if (cVar.a().getNextPage() == 0) {
            this.A.p(Boolean.FALSE);
        }
        this.I.p(Integer.valueOf(cVar.a().getNextPage()));
        androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.G;
        List<App.AppParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, cVar.a().getApps()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(Boolean.FALSE);
        this.I.p(null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.h hVar) {
        jo.p.h(hVar, "event");
        this.A.p(Boolean.FALSE);
        this.G.p(null);
        this.I.p(null);
        uo.l.d(this, null, null, new b(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.f fVar) {
        jo.p.h(fVar, "event");
        this.G.p(null);
        uo.l.d(this, null, null, new c(fVar, null), 3, null);
    }
}
