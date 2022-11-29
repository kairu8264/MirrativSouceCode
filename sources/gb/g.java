package gb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.RewardAdCompleteResponse;
import gb.b;
import ha.a;
import io.p;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import wn.m;
import wn.v;
import wo.x;

/* loaded from: classes2.dex */
public final class g extends q0 implements uo.q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final wo.f<RewardAdCompleteResponse> C;
    public final x<RewardAdCompleteResponse> D;
    public final wo.f<MRError> E;
    public final x<MRError> F;
    public final e0<Boolean> G;
    public final e0<Boolean> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f32842y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f32843z;

    @co.f(c = "com.dena.mirrativ.otherfeature.reward.RewardStore$on$1", f = "RewardStore.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32844w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0383b f32846y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.C0383b c0383b, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f32846y = c0383b;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f32846y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32844w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = g.this.C;
                RewardAdCompleteResponse a10 = this.f32846y.a();
                this.f32844w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.reward.RewardStore$on$2", f = "RewardStore.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32847w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f32849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f32849y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f32849y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32847w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = g.this.E;
                MRError a10 = this.f32849y.a();
                this.f32847w = 1;
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

    public g(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f32842y = aVar;
        this.f32843z = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        wo.f<RewardAdCompleteResponse> a10 = wo.g.a(-2);
        this.C = a10;
        this.D = a10.g();
        wo.f<MRError> a11 = wo.g.a(-2);
        this.E = a11;
        this.F = a11.g();
        e0<Boolean> e0Var2 = new e0<>(Boolean.FALSE);
        this.G = e0Var2;
        this.H = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f32842y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f32843z.getCoroutineContext();
    }

    public final x<MRError> h() {
        return this.F;
    }

    public final x<RewardAdCompleteResponse> i() {
        return this.D;
    }

    public final e0<Boolean> j() {
        return this.H;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0383b c0383b) {
        jo.p.h(c0383b, "event");
        uo.l.d(this, null, null, new a(c0383b, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        this.G.p(Boolean.valueOf(cVar.a()));
    }
}
