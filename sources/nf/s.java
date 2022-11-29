package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import ha.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.z;
import uo.r0;

/* loaded from: classes3.dex */
public final class s extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<wn.k<String, AppUserDetailResponse>> A;
    public final LiveData<wn.k<String, AppUserDetailResponse>> B;
    public final wo.q<MRError> C;
    public final wo.q<wn.v> D;
    public final wo.q<MRError> E;
    public final wo.q<MRError> F;
    public final wo.q<MRError> G;
    public final androidx.lifecycle.e0<List<App.AppParams>> H;
    public final LiveData<List<App.AppParams>> I;
    public final wo.f<MRError> J;
    public final androidx.lifecycle.e0<Integer> K;
    public final LiveData<Integer> L;
    public final androidx.lifecycle.e0<Boolean> M;
    public final LiveData<Boolean> N;
    public final androidx.lifecycle.e0<String> O;
    public final LiveData<String> P;
    public final androidx.lifecycle.e0<String> Q;
    public final LiveData<String> R;
    public final androidx.lifecycle.e0<App.AppParams> S;
    public final LiveData<App.AppParams> T;
    public final androidx.lifecycle.e0<ha.a> U;
    public final LiveData<ha.a> V;
    public final androidx.lifecycle.e0<Boolean> W;
    public final LiveData<Boolean> X;
    public final androidx.lifecycle.e0<Boolean> Y;
    public final LiveData<Boolean> Z;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43230y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43231z;

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$1", f = "LiveAppSettingStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43232w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z.i f43234y;

        public a(z.i iVar, ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43234y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f43232w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q unused = s.this.C;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$2", f = "LiveAppSettingStore.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43235w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z.m f43237y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z.m mVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43237y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43237y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43235w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = s.this.F;
                MRError a10 = this.f43237y.a();
                this.f43235w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$3", f = "LiveAppSettingStore.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43238w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z.g f43240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z.g gVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43240y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43240y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43238w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = s.this.G;
                MRError a10 = this.f43240y.a();
                this.f43238w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$4", f = "LiveAppSettingStore.kt", l = {143}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43241w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43241w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = s.this.D;
                wn.v vVar = wn.v.f59242a;
                this.f43241w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$5", f = "LiveAppSettingStore.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43243w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z.k f43245y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z.k kVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f43245y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f43245y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43243w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = s.this.E;
                MRError a10 = this.f43245y.a();
                this.f43243w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.LiveAppSettingStore$on$6", f = "LiveAppSettingStore.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43246w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z.a f43248y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z.a aVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43248y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43248y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43246w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = s.this.J;
                MRError a10 = this.f43248y.a();
                this.f43246w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public s(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43230y = aVar;
        this.f43231z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<wn.k<String, AppUserDetailResponse>> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        this.C = new wo.q<>();
        this.D = new wo.q<>();
        this.E = new wo.q<>();
        this.F = new wo.q<>();
        this.G = new wo.q<>();
        androidx.lifecycle.e0<List<App.AppParams>> e0Var2 = new androidx.lifecycle.e0<>(xn.s.k());
        this.H = e0Var2;
        this.I = e0Var2;
        this.J = wo.g.a(-2);
        androidx.lifecycle.e0<Integer> e0Var3 = new androidx.lifecycle.e0<>(null);
        this.K = e0Var3;
        this.L = e0Var3;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(bool);
        this.M = e0Var4;
        this.N = e0Var4;
        androidx.lifecycle.e0<String> e0Var5 = new androidx.lifecycle.e0<>(null);
        this.O = e0Var5;
        this.P = e0Var5;
        androidx.lifecycle.e0<String> e0Var6 = new androidx.lifecycle.e0<>(null);
        this.Q = e0Var6;
        this.R = e0Var6;
        androidx.lifecycle.e0<App.AppParams> e0Var7 = new androidx.lifecycle.e0<>(null);
        this.S = e0Var7;
        this.T = e0Var7;
        androidx.lifecycle.e0<ha.a> e0Var8 = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.U = e0Var8;
        this.V = e0Var8;
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.W = e0Var9;
        this.X = e0Var9;
        androidx.lifecycle.e0<Boolean> e0Var10 = new androidx.lifecycle.e0<>(bool);
        this.Y = e0Var10;
        this.Z = e0Var10;
    }

    public final LiveData<Boolean> A() {
        return this.Z;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.f43230y.c(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43231z.getCoroutineContext();
    }

    public final LiveData<wn.k<String, AppUserDetailResponse>> l() {
        return this.B;
    }

    public final LiveData<Boolean> m() {
        return this.X;
    }

    public final LiveData<List<App.AppParams>> n() {
        return this.I;
    }

    public final wo.x<MRError> o() {
        return this.J.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.j jVar) {
        jo.p.h(jVar, "event");
        throw null;
    }

    public final wo.x<MRError> p() {
        return this.G.g();
    }

    public final wo.x<MRError> q() {
        return this.C.g();
    }

    public final wo.x<MRError> r() {
        return this.E.g();
    }

    public final wo.x<MRError> s() {
        return this.F.g();
    }

    public final LiveData<App.AppParams> t() {
        return this.T;
    }

    public final LiveData<Integer> u() {
        return this.L;
    }

    public final LiveData<String> v() {
        return this.R;
    }

    public final LiveData<String> w() {
        return this.P;
    }

    public final LiveData<ha.a> x() {
        return this.V;
    }

    public final wo.x<wn.v> y() {
        return this.D.g();
    }

    public final LiveData<Boolean> z() {
        return this.N;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new a(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.n nVar) {
        ArrayList arrayList;
        Object obj;
        jo.p.h(nVar, "event");
        this.A.p(wn.q.a(nVar.a(), nVar.b()));
        List<App.AppParams> f10 = this.H.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), nVar.a())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            appParams.setAppUserDetail(nVar.b());
            List<App.AppParams> f11 = this.H.f();
            if (f11 != null) {
                arrayList = new ArrayList(xn.t.u(f11, 10));
                for (App.AppParams appParams2 : f11) {
                    if (jo.p.c(appParams2.getAppId(), nVar.a())) {
                        appParams2 = appParams;
                    }
                    arrayList.add(appParams2);
                }
            }
            this.H.p(arrayList);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new b(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.h hVar) {
        ArrayList arrayList;
        Object obj;
        jo.p.h(hVar, "event");
        List<App.AppParams> f10 = this.H.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), hVar.a())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            appParams.setAppUserDetail(null);
            List<App.AppParams> f11 = this.H.f();
            if (f11 != null) {
                arrayList = new ArrayList(xn.t.u(f11, 10));
                for (App.AppParams appParams2 : f11) {
                    if (jo.p.c(appParams2.getAppId(), hVar.a())) {
                        appParams2 = appParams;
                    }
                    arrayList.add(appParams2);
                }
            }
            this.H.p(arrayList);
            this.S.p(appParams);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new c(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.o oVar) {
        jo.p.h(oVar, "event");
        this.Y.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.l lVar) {
        Object obj;
        jo.p.h(lVar, "event");
        this.Y.p(Boolean.FALSE);
        this.A.p(wn.q.a(lVar.a(), lVar.b()));
        if (lVar.b().getRequireConfirmation()) {
            return;
        }
        ArrayList arrayList = null;
        uo.l.d(this, null, null, new d(null), 3, null);
        List<App.AppParams> f10 = this.H.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), lVar.a())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            appParams.setAppUserDetail(lVar.b());
            List<App.AppParams> f11 = this.H.f();
            if (f11 != null) {
                arrayList = new ArrayList(xn.t.u(f11, 10));
                for (App.AppParams appParams2 : f11) {
                    if (jo.p.c(appParams2.getAppId(), lVar.a())) {
                        appParams2 = appParams;
                    }
                    arrayList.add(appParams2);
                }
            }
            this.H.p(arrayList);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.k kVar) {
        jo.p.h(kVar, "event");
        this.Y.p(Boolean.FALSE);
        uo.l.d(this, null, null, new e(kVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.d dVar) {
        jo.p.h(dVar, "event");
        this.O.p(dVar.a());
        this.Q.p(dVar.a());
        this.M.p(Boolean.TRUE);
        this.U.p(a.b.f34695b);
        this.K.p(null);
        this.W.p(Boolean.FALSE);
        this.H.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.e eVar) {
        jo.p.h(eVar, "event");
        this.M.p(Boolean.FALSE);
        this.U.p(eVar.a().isEmpty() ? a.e.f34698b : a.d.f34697b);
        this.W.p(Boolean.valueOf(eVar.b() == 0));
        this.H.p(eVar.a());
        this.K.p(Integer.valueOf(eVar.b()));
        this.S.p(eVar.c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.b bVar) {
        jo.p.h(bVar, "event");
        this.M.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.c cVar) {
        jo.p.h(cVar, "event");
        this.M.p(Boolean.FALSE);
        this.W.p(Boolean.valueOf(cVar.b() == 0));
        androidx.lifecycle.e0<List<App.AppParams>> e0Var = this.H;
        List<App.AppParams> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, cVar.a()));
        this.K.p(Integer.valueOf(cVar.b()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.a aVar) {
        jo.p.h(aVar, "event");
        this.M.p(Boolean.FALSE);
        List<App.AppParams> f10 = this.I.f();
        boolean z10 = true;
        if (f10 == null || !f10.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.U.p(new a.C0439a(aVar.a()));
        }
        uo.l.d(this, null, null, new f(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z.f fVar) {
        jo.p.h(fVar, "event");
        androidx.lifecycle.e0<String> e0Var = this.Q;
        App.AppParams a10 = fVar.a();
        e0Var.p(a10 != null ? a10.getAppId() : null);
        this.S.p(fVar.a());
    }
}
