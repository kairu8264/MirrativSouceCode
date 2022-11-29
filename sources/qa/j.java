package qa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import org.greenrobot.eventbus.ThreadMode;
import pd.k0;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes2.dex */
public final class j extends q0 implements uo.q0 {
    public final e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final e0<Boolean> C;
    public final LiveData<Boolean> D;
    public final e0<Boolean> E;
    public final LiveData<Boolean> F;
    public final e0<Boolean> G;
    public final LiveData<Boolean> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f48855y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f48856z;

    public j(q8.a aVar) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f48855y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f48856z = c10.plus(b10);
        Boolean bool = Boolean.FALSE;
        e0<Boolean> e0Var = new e0<>(bool);
        this.A = e0Var;
        this.B = e0Var;
        e0<Boolean> e0Var2 = new e0<>(bool);
        this.C = e0Var2;
        this.D = e0Var2;
        e0<Boolean> e0Var3 = new e0<>(bool);
        this.E = e0Var3;
        this.F = e0Var3;
        e0<Boolean> e0Var4 = new e0<>(bool);
        this.G = e0Var4;
        this.H = e0Var4;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f48855y.c(this);
        super.d();
    }

    public final LiveData<Boolean> f() {
        return this.H;
    }

    public final LiveData<Boolean> g() {
        return this.F;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f48856z;
    }

    public final LiveData<Boolean> h() {
        return this.B;
    }

    public final LiveData<Boolean> i() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k0.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(Boolean.valueOf(cVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k0.d dVar) {
        jo.p.h(dVar, "event");
        this.C.p(Boolean.valueOf(dVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k0.b bVar) {
        jo.p.h(bVar, "event");
        this.E.p(Boolean.valueOf(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k0.a aVar) {
        jo.p.h(aVar, "event");
        this.G.p(Boolean.valueOf(aVar.a()));
    }
}
