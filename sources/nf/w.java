package nf;

import androidx.lifecycle.LiveData;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.f0;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final kf.t f43282a;

    /* renamed from: b  reason: collision with root package name */
    public final hf.r f43283b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43284c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<Boolean> f43285d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43286e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<Integer> f43287f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43288g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f43289h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43290i;

    /* renamed from: j  reason: collision with root package name */
    public final LiveData<Boolean> f43291j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Float> f43292k;

    /* renamed from: l  reason: collision with root package name */
    public final LiveData<Float> f43293l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43294m;

    /* renamed from: n  reason: collision with root package name */
    public final LiveData<Boolean> f43295n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f43296o;

    /* renamed from: p  reason: collision with root package name */
    public final LiveData<Boolean> f43297p;

    public w(q8.a aVar, kf.t tVar, hf.r rVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(rVar, "featureHelper");
        this.f43282a = tVar;
        this.f43283b = rVar;
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.valueOf(tVar.i5()));
        this.f43284c = e0Var;
        this.f43285d = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(Integer.valueOf(tVar.x()));
        this.f43286e = e0Var2;
        this.f43287f = e0Var2;
        boolean z10 = true;
        if (tVar.b0() != 2 && tVar.b0() != 1) {
            z10 = false;
        }
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(Boolean.valueOf(z10));
        this.f43288g = e0Var3;
        this.f43289h = e0Var3;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(Boolean.valueOf(tVar.f1()));
        this.f43290i = e0Var4;
        this.f43291j = e0Var4;
        androidx.lifecycle.e0<Float> e0Var5 = new androidx.lifecycle.e0<>(Float.valueOf(tVar.D0()));
        this.f43292k = e0Var5;
        this.f43293l = e0Var5;
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(Boolean.valueOf(tVar.c5()));
        this.f43294m = e0Var6;
        this.f43295n = e0Var6;
        androidx.lifecycle.e0<Boolean> e0Var7 = new androidx.lifecycle.e0<>(Boolean.valueOf(tVar.i()));
        this.f43296o = e0Var7;
        this.f43297p = e0Var7;
    }

    public final LiveData<Boolean> a() {
        return this.f43289h;
    }

    public final int b() {
        Integer f10 = this.f43287f.f();
        jo.p.e(f10);
        return f10.intValue();
    }

    public final LiveData<Integer> c() {
        return this.f43287f;
    }

    public final LiveData<Float> d() {
        return this.f43293l;
    }

    public final LiveData<Boolean> e() {
        return this.f43297p;
    }

    public final boolean f() {
        if (this.f43283b.d()) {
            Boolean f10 = this.f43285d.f();
            jo.p.e(f10);
            if (f10.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final LiveData<Boolean> g() {
        return this.f43285d;
    }

    public final boolean h() {
        return this.f43282a.S4() < 2;
    }

    public final boolean i() {
        Boolean f10 = this.f43295n.f();
        jo.p.e(f10);
        return f10.booleanValue();
    }

    public final LiveData<Boolean> j() {
        return this.f43295n;
    }

    public final LiveData<Boolean> k() {
        return this.f43291j;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.i iVar) {
        jo.p.h(iVar, "event");
        this.f43284c.p(Boolean.valueOf(iVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(f0.u uVar) {
        jo.p.h(uVar, "event");
        this.f43294m.p(Boolean.valueOf(uVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.h hVar) {
        jo.p.h(hVar, "event");
        this.f43286e.p(Integer.valueOf(hVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(ce.o oVar) {
        jo.p.h(oVar, "event");
        this.f43286e.p(Integer.valueOf(oVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.d dVar) {
        jo.p.h(dVar, "event");
        this.f43290i.p(Boolean.valueOf(dVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.j jVar) {
        jo.p.h(jVar, "event");
        this.f43284c.p(Boolean.valueOf(jVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.e eVar) {
        jo.p.h(eVar, "event");
        this.f43292k.p(Float.valueOf(eVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.p0 p0Var) {
        jo.p.h(p0Var, "event");
        this.f43290i.p(Boolean.valueOf(!(p0Var.a() == 0.0f)));
        this.f43292k.p(Float.valueOf(p0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.f fVar) {
        jo.p.h(fVar, "event");
        this.f43296o.p(Boolean.valueOf(fVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.s0 s0Var) {
        jo.p.h(s0Var, "event");
        this.f43282a.p3(s0Var.a());
        this.f43294m.p(Boolean.valueOf(s0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.g gVar) {
        jo.p.h(gVar, "event");
        androidx.lifecycle.e0<Boolean> e0Var = this.f43288g;
        boolean z10 = true;
        if (gVar.a() != 2 && gVar.a() != 1) {
            z10 = false;
        }
        e0Var.p(Boolean.valueOf(z10));
    }
}
