package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import org.greenrobot.eventbus.ThreadMode;
import pd.x0;
import uo.r0;

/* loaded from: classes3.dex */
public final class d0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<ShooterEventResponse> A;
    public final LiveData<ShooterEventResponse> B;
    public final wo.f<MRError> C;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42601y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42602z;

    @co.f(c = "com.dena.mirrorman.store.ShooterEventStore$on$1", f = "ShooterEventStore.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42603w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.a f42605y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42605y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42605y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42603w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = d0.this.C;
                MRError a10 = this.f42605y.a();
                this.f42603w = 1;
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

    public d0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42601y = aVar;
        this.f42602z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ShooterEventResponse> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        this.C = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42601y.c(this);
        super.d();
    }

    public final LiveData<ShooterEventResponse> g() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42602z.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x0.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }
}
