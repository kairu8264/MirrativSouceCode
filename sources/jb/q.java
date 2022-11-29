package jb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import jb.b;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import wn.v;
import wo.x;

/* loaded from: classes2.dex */
public final class q extends q0 implements uo.q0 {
    public final e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final e0<te.c> C;
    public final LiveData<te.c> D;
    public final s0<MRError> E;
    public final x<MRError> F;
    public final s0<MRError> G;
    public final x<MRError> H;
    public final e0<te.a> I;
    public final LiveData<te.a> J;
    public final e0<Float> K;
    public final LiveData<Float> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f37475y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f37476z;

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerStore$on$1", f = "ArchivePlayerStore.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37477w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f37479y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f37479y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f37479y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37477w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = q.this.E;
                MRError a10 = this.f37479y.a();
                this.f37477w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    public q(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f37475y = aVar;
        this.f37476z = r0.b();
        aVar.b(this);
        e0<Boolean> e0Var = new e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        e0<te.c> e0Var2 = new e0<>(null);
        this.C = e0Var2;
        this.D = e0Var2;
        s0<MRError> s0Var = new s0<>();
        this.E = s0Var;
        this.F = s0Var.c();
        s0<MRError> s0Var2 = new s0<>();
        this.G = s0Var2;
        this.H = s0Var2.c();
        e0<te.a> e0Var3 = new e0<>();
        this.I = e0Var3;
        this.J = e0Var3;
        e0<Float> e0Var4 = new e0<>(Float.valueOf(1.0f));
        this.K = e0Var4;
        this.L = e0Var4;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        r0.d(this, null, 1, null);
        this.f37475y.c(this);
    }

    public final x<MRError> g() {
        return this.H;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f37476z.getCoroutineContext();
    }

    public final x<MRError> h() {
        return this.F;
    }

    public final LiveData<te.c> i() {
        return this.D;
    }

    public final LiveData<Float> j() {
        return this.L;
    }

    public final LiveData<te.a> k() {
        return this.J;
    }

    public final LiveData<Boolean> l() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.valueOf(dVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        this.C.p(eVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0505b c0505b) {
        jo.p.h(c0505b, "event");
        this.I.p(c0505b.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        this.K.p(Float.valueOf(aVar.a()));
    }
}
