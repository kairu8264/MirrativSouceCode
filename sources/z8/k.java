package z8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import z8.b;
import z8.m;

/* loaded from: classes.dex */
public final class k extends q0 implements uo.q0 {
    public final wo.f<MRError> A;
    public final wo.x<MRError> B;
    public final e0<MissionInfoResponse> C;
    public final LiveData<MissionInfoResponse> D;
    public final e0<ha.a> E;
    public final LiveData<ha.a> F;
    public final e0<MissionStatusResponse> G;
    public final LiveData<MissionStatusResponse> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f62689y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f62690z;

    @co.f(c = "com.dena.mirrativ.catalog.mission.MissionStore$on$1", f = "MissionStore.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62691w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m.a f62693y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f62693y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f62693y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62691w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = k.this.A;
                MRError a10 = this.f62693y.a();
                this.f62691w = 1;
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

    public k(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f62689y = aVar;
        this.f62690z = r0.b();
        wo.f<MRError> a10 = wo.g.a(-2);
        this.A = a10;
        this.B = a10.g();
        e0<MissionInfoResponse> e0Var = new e0<>();
        this.C = e0Var;
        this.D = e0Var;
        e0<ha.a> e0Var2 = new e0<>(a.d.f34697b);
        this.E = e0Var2;
        this.F = e0Var2;
        e0<MissionStatusResponse> e0Var3 = new e0<>();
        this.G = e0Var3;
        this.H = e0Var3;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f62689y.c(this);
        super.d();
    }

    public final wo.x<MRError> g() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62690z.getCoroutineContext();
    }

    public final LiveData<MissionInfoResponse> h() {
        return this.D;
    }

    public final LiveData<MissionStatusResponse> i() {
        return this.H;
    }

    public final LiveData<ha.a> j() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C1084b c1084b) {
        jo.p.h(c1084b, "event");
        this.G.p(c1084b.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.b bVar) {
        jo.p.h(bVar, "event");
        this.E.p(a.d.f34697b);
        this.C.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.a aVar) {
        jo.p.h(aVar, "event");
        this.E.p(new a.C0439a(aVar.a()));
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m.c cVar) {
        jo.p.h(cVar, "event");
        this.E.p(a.b.f34695b);
    }
}
