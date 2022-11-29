package nf;

import androidx.lifecycle.LiveData;
import org.greenrobot.eventbus.ThreadMode;
import pd.a1;
import pd.q;
import uo.r0;

/* loaded from: classes3.dex */
public final class j0 implements uo.q0 {
    public static final a D = new a(null);
    public static final int E = 8;
    public static j0 F;
    public final LiveData<Boolean> A;
    public final xo.s<Boolean> B;
    public final xo.g0<Boolean> C;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42975w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.v f42976x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42977y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42978z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j0 a(q8.a aVar, kf.v vVar) {
            jo.p.h(aVar, "dispatcher");
            jo.p.h(vVar, "tutorialPreference");
            j0 j0Var = j0.F;
            if (j0Var != null) {
                j0Var.d();
            }
            j0 j0Var2 = new j0(aVar, vVar);
            j0.F = j0Var2;
            return j0Var2;
        }
    }

    public j0(q8.a aVar, kf.v vVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(vVar, "tutorialPreference");
        this.f42975w = aVar;
        this.f42976x = vVar;
        this.f42977y = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.valueOf(vVar.v5()));
        this.f42978z = e0Var;
        this.A = e0Var;
        xo.s<Boolean> a10 = xo.i0.a(Boolean.valueOf(vVar.K()));
        this.B = a10;
        this.C = a10;
    }

    public final void d() {
        this.f42975w.c(this);
        r0.d(this, null, 1, null);
    }

    public final LiveData<Boolean> e() {
        return this.A;
    }

    public final xo.g0<Boolean> f() {
        return this.C;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42977y.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(q.h hVar) {
        jo.p.h(hVar, "event");
        this.f42976x.S1(false);
        this.f42978z.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a1.m mVar) {
        jo.p.h(mVar, "event");
        this.f42976x.i1(false);
        this.B.setValue(Boolean.FALSE);
    }
}
