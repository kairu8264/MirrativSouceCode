package ra;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import jf.g0;
import org.greenrobot.eventbus.ThreadMode;
import pd.l0;
import uo.r0;

/* loaded from: classes2.dex */
public final class p extends q0 implements uo.q0 {
    public final e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final e0<Boolean> C;
    public final LiveData<Boolean> D;
    public final e0<Boolean> E;
    public final LiveData<Boolean> F;
    public final e0<Integer> G;
    public final LiveData<Integer> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f50679y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f50680z;

    public p(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f50679y = aVar;
        this.f50680z = r0.b();
        aVar.b(this);
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
        e0<Integer> e0Var4 = new e0<>(Integer.valueOf(g0.APP.e()));
        this.G = e0Var4;
        this.H = e0Var4;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f50679y.c(this);
        super.d();
    }

    public final LiveData<Integer> f() {
        return this.H;
    }

    public final LiveData<Boolean> g() {
        return this.F;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f50680z.getCoroutineContext();
    }

    public final LiveData<Boolean> h() {
        return this.D;
    }

    public final LiveData<Boolean> i() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l0.c cVar) {
        jo.p.h(cVar, "event");
        this.G.p(Integer.valueOf(cVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l0.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.valueOf(dVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l0.b bVar) {
        jo.p.h(bVar, "event");
        this.C.p(Boolean.valueOf(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l0.a aVar) {
        jo.p.h(aVar, "event");
        this.E.p(Boolean.valueOf(aVar.a()));
    }
}
