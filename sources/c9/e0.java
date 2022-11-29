package c9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.q0;
import c9.b;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import ha.a;
import hf.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;

/* loaded from: classes.dex */
public final class e0 extends q0 implements uo.q0 {
    public final /* synthetic */ uo.q0 A;
    public final androidx.lifecycle.e0<List<UrgeUser>> B;
    public final LiveData<List<UrgeUser>> C;
    public final androidx.lifecycle.e0<wn.k<String, Boolean>> D;
    public final LiveData<wn.k<String, Boolean>> E;
    public final xo.r<wn.p<Integer, Boolean, MRError>> F;
    public final xo.w<wn.p<Integer, Boolean, MRError>> G;
    public final androidx.lifecycle.e0<List<c.a>> H;
    public final LiveData<List<c.a>> I;
    public final androidx.lifecycle.e0<List<c.a>> J;
    public final LiveData<List<c.a>> K;
    public final androidx.lifecycle.e0<ha.a> L;
    public final LiveData<ha.a> M;
    public final androidx.lifecycle.e0<ha.a> N;
    public final LiveData<ha.a> O;
    public final androidx.lifecycle.e0<ha.a> P;
    public final LiveData<ha.a> Q;
    public final androidx.lifecycle.e0<Integer> R;
    public final LiveData<Integer> S;
    public final androidx.lifecycle.e0<Integer> T;
    public final LiveData<Integer> U;
    public final androidx.lifecycle.e0<Integer> V;
    public final LiveData<Integer> W;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f18914y;

    /* renamed from: z  reason: collision with root package name */
    public final jf.d0 f18915z;

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchStore$onEvent$1", f = "SearchStore.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f18916w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ nd.r f18918y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nd.r rVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f18918y = rVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f18918y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18916w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = e0.this.F;
                wn.p pVar = new wn.p(co.b.d(this.f18918y.b()), co.b.a(this.f18918y.c()), this.f18918y.a());
                this.f18916w = 1;
                if (rVar.emit(pVar, this) == c10) {
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

    public e0(q8.a aVar, jf.d0 d0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(d0Var, "myAppRepository");
        this.f18914y = aVar;
        this.f18915z = d0Var;
        this.A = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<List<UrgeUser>> e0Var = new androidx.lifecycle.e0<>();
        this.B = e0Var;
        this.C = e0Var;
        androidx.lifecycle.e0<wn.k<String, Boolean>> e0Var2 = new androidx.lifecycle.e0<>();
        this.D = e0Var2;
        this.E = e0Var2;
        xo.r<wn.p<Integer, Boolean, MRError>> b10 = xo.y.b(0, 0, null, 7, null);
        this.F = b10;
        this.G = b10;
        androidx.lifecycle.e0<List<c.a>> e0Var3 = new androidx.lifecycle.e0<>();
        this.H = e0Var3;
        this.I = e0Var3;
        androidx.lifecycle.e0<List<c.a>> e0Var4 = new androidx.lifecycle.e0<>();
        this.J = e0Var4;
        this.K = e0Var4;
        a.d dVar = a.d.f34697b;
        androidx.lifecycle.e0<ha.a> e0Var5 = new androidx.lifecycle.e0<>(dVar);
        this.L = e0Var5;
        this.M = e0Var5;
        androidx.lifecycle.e0<ha.a> e0Var6 = new androidx.lifecycle.e0<>(dVar);
        this.N = e0Var6;
        this.O = e0Var6;
        androidx.lifecycle.e0<ha.a> e0Var7 = new androidx.lifecycle.e0<>(dVar);
        this.P = e0Var7;
        this.Q = e0Var7;
        androidx.lifecycle.e0<Integer> e0Var8 = new androidx.lifecycle.e0<>(1);
        this.R = e0Var8;
        this.S = e0Var8;
        androidx.lifecycle.e0<Integer> e0Var9 = new androidx.lifecycle.e0<>(1);
        this.T = e0Var9;
        this.U = e0Var9;
        androidx.lifecycle.e0<Integer> e0Var10 = new androidx.lifecycle.e0<>(1);
        this.V = e0Var10;
        this.W = e0Var10;
    }

    public static final c.a v(b.a aVar, c.a aVar2, c.a aVar3) {
        jo.p.h(aVar, "$event");
        jo.p.h(aVar2, "$newValue");
        jo.p.h(aVar3, "oldAppInfo");
        return jo.p.c(aVar3.d(), aVar.a().d()) ? aVar2 : aVar3;
    }

    public static final c.a w(nd.d dVar, c.a aVar, c.a aVar2) {
        jo.p.h(dVar, "$event");
        jo.p.h(aVar, "$it");
        jo.p.h(aVar2, "oldAppInfo");
        return jo.p.c(aVar2.d(), dVar.a()) ? aVar : aVar2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f18914y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final LiveData<List<c.a>> i() {
        return this.K;
    }

    public final LiveData<List<c.a>> j() {
        return this.I;
    }

    public final LiveData<wn.k<String, Boolean>> k() {
        return this.E;
    }

    public final LiveData<Integer> l() {
        return this.W;
    }

    public final LiveData<Integer> m() {
        return this.U;
    }

    public final LiveData<Integer> n() {
        return this.S;
    }

    public final LiveData<ha.a> o() {
        return this.Q;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        this.R.p(Integer.valueOf(gVar.a().getNextPage()));
        this.L.p(a.d.f34697b);
        this.B.p(gVar.a().getUsers());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(b.e eVar) {
        jo.p.h(eVar, "event");
        this.L.p(a.d.f34697b);
        this.B.p(eVar.a().getUsers());
    }

    public final LiveData<ha.a> p() {
        return this.O;
    }

    public final LiveData<ha.a> q() {
        return this.M;
    }

    public final LiveData<List<UrgeUser>> r() {
        return this.C;
    }

    public final xo.w<wn.p<Integer, Boolean, MRError>> s() {
        return this.G;
    }

    public final boolean t(String str) {
        return (str == null || this.f18915z.e(str) == null) ? false : true;
    }

    public final List<c.a> u(App.Apps apps) {
        List<App.AppParams> apps2 = apps.getApps();
        ArrayList arrayList = new ArrayList(xn.t.u(apps2, 10));
        int i10 = 0;
        for (Object obj : apps2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            App.AppParams appParams = (App.AppParams) obj;
            arrayList.add(new c.a(appParams.getAppId(), appParams.getTitle(), appParams.getIconUrl(), t(appParams.getAppId()), i10, appParams, appParams.getShortTitle()));
            i10 = i11;
        }
        return arrayList;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.y yVar) {
        jo.p.h(yVar, "event");
        this.D.p(new wn.k<>(yVar.a(), Boolean.valueOf(yVar.b())));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        this.L.p(new a.C0439a(fVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.r rVar) {
        jo.p.h(rVar, "event");
        uo.l.d(this, null, null, new a(rVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        if (dVar.b()) {
            this.H.p(u(dVar.a()));
            this.N.p(a.d.f34697b);
            return;
        }
        this.J.p(u(dVar.a()));
        this.P.p(a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(final nd.d dVar) {
        List<c.a> arrayList;
        Object obj;
        jo.p.h(dVar, "event");
        List<c.a> f10 = this.H.f();
        if (f10 == null || (arrayList = xn.a0.D0(f10)) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((c.a) obj).d(), dVar.a())) {
                break;
            }
        }
        c.a aVar = (c.a) obj;
        final c.a b10 = aVar != null ? c.a.b(aVar, null, null, null, dVar.b(), 0, null, null, 119, null) : null;
        if (b10 != null) {
            arrayList.replaceAll(new UnaryOperator() { // from class: c9.d0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    c.a w10;
                    w10 = e0.w(nd.d.this, b10, (c.a) obj2);
                    return w10;
                }
            });
        }
        this.H.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        if (cVar.c()) {
            this.T.p(Integer.valueOf(cVar.b().getNextPage()));
        } else {
            this.V.p(Integer.valueOf(cVar.b().getNextPage()));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(cVar.b().getApps().size());
        List<App.AppParams> apps = cVar.b().getApps();
        ArrayList arrayList2 = new ArrayList(xn.t.u(apps, 10));
        for (App.AppParams appParams : apps) {
            arrayList2.add(c.a.f35512h.a(appParams, t(appParams.getAppId())));
        }
        arrayList.addAll(arrayList2);
        if (cVar.c()) {
            this.N.p(a.d.f34697b);
            if (!cVar.a()) {
                this.H.p(arrayList);
                return;
            }
            androidx.lifecycle.e0<List<c.a>> e0Var = this.H;
            List<c.a> f10 = e0Var.f();
            e0Var.p(f10 != null ? xn.a0.o0(f10, arrayList) : null);
            return;
        }
        this.P.p(a.d.f34697b);
        if (!cVar.a()) {
            this.J.p(arrayList);
            return;
        }
        androidx.lifecycle.e0<List<c.a>> e0Var2 = this.J;
        List<c.a> f11 = e0Var2.f();
        e0Var2.p(f11 != null ? xn.a0.o0(f11, arrayList) : null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0140b c0140b) {
        jo.p.h(c0140b, "event");
        if (c0140b.b()) {
            this.N.p(new a.C0439a(c0140b.a()));
        } else {
            this.P.p(new a.C0439a(c0140b.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.h hVar) {
        jo.p.h(hVar, "event");
        if (hVar.b()) {
            this.L.p(a.b.f34695b);
        } else if (hVar.a()) {
            this.N.p(a.b.f34695b);
        } else {
            this.P.p(a.b.f34695b);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(final b.a aVar) {
        List<c.a> arrayList;
        jo.p.h(aVar, "event");
        List<c.a> f10 = this.H.f();
        if (f10 == null || (arrayList = xn.a0.D0(f10)) == null) {
            arrayList = new ArrayList<>();
        }
        final c.a b10 = c.a.b(arrayList.get(arrayList.indexOf(aVar.a())), null, null, null, !aVar.a().h(), 0, null, null, 119, null);
        arrayList.replaceAll(new UnaryOperator() { // from class: c9.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                c.a v10;
                v10 = e0.v(b.a.this, b10, (c.a) obj);
                return v10;
            }
        });
        this.H.p(arrayList);
    }
}
