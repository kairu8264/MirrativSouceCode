package qc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import io.p;
import org.greenrobot.eventbus.ThreadMode;
import pd.w;
import uo.r0;
import wn.m;
import wn.v;
import wo.x;

/* loaded from: classes2.dex */
public final class j extends q0 implements uo.q0 {
    public final e0<EventNoticeResponse> A;
    public final LiveData<EventNoticeResponse> B;
    public final e0<MRError> C;
    public final LiveData<MRError> D;
    public final e0<MRError> E;
    public final LiveData<MRError> F;
    public final wo.f<PurchaseAvatarsResponse> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f48969y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f48970z;

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoStore$on$1", f = "HomeEmomoStore.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f48971w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w.d f48973y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w.d dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f48973y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f48973y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f48971w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = j.this.G;
                PurchaseAvatarsResponse a10 = this.f48973y.a();
                this.f48971w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public j(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f48969y = aVar;
        this.f48970z = r0.b();
        aVar.b(this);
        e0<EventNoticeResponse> e0Var = new e0<>();
        this.A = e0Var;
        this.B = e0Var;
        e0<MRError> e0Var2 = new e0<>();
        this.C = e0Var2;
        this.D = e0Var2;
        e0<MRError> e0Var3 = new e0<>();
        this.E = e0Var3;
        this.F = e0Var3;
        this.G = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.f48969y.c(this);
    }

    public final LiveData<MRError> g() {
        return this.D;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f48970z.getCoroutineContext();
    }

    public final LiveData<EventNoticeResponse> h() {
        return this.B;
    }

    public final LiveData<MRError> i() {
        return this.F;
    }

    public final x<PurchaseAvatarsResponse> j() {
        return this.G.g();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w.a aVar) {
        jo.p.h(aVar, "event");
        this.C.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new a(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(w.c cVar) {
        jo.p.h(cVar, "event");
        this.E.p(cVar.a());
    }
}
