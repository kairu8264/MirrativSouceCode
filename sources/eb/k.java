package eb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import eb.f;
import io.p;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import wn.v;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class k extends q0 implements uo.q0 {
    public final e0<m> A;
    public final LiveData<m> B;
    public final r<LiveGameStartResponse> C;
    public final w<LiveGameStartResponse> D;
    public final r<String> E;
    public final w<String> F;
    public final r<v> G;
    public final w<v> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f30374y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f30375z;

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingStore$on$1", f = "OnboardingStore.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30376w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.d f30378y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.d dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f30378y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f30378y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30376w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = k.this.C;
                LiveGameStartResponse a10 = this.f30378y.a();
                this.f30376w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingStore$on$2", f = "OnboardingStore.kt", l = {58, 60}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30379w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f.c f30380x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k f30381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.c cVar, k kVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f30380x = cVar;
            this.f30381y = kVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f30380x, this.f30381y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30379w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f30380x.a().length() > 0) {
                    r rVar = this.f30381y.E;
                    String a10 = this.f30380x.a();
                    this.f30379w = 1;
                    if (rVar.emit(a10, this) == c10) {
                        return c10;
                    }
                } else {
                    r rVar2 = this.f30381y.G;
                    v vVar = v.f59242a;
                    this.f30379w = 2;
                    if (rVar2.emit(vVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingStore$on$3", f = "OnboardingStore.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30382w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30382w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = k.this.G;
                v vVar = v.f59242a;
                this.f30382w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    public k(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f30374y = aVar;
        this.f30375z = r0.b();
        aVar.b(this);
        e0<m> e0Var = new e0<>(m.NONE);
        this.A = e0Var;
        this.B = e0Var;
        r<LiveGameStartResponse> b10 = y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        r<String> b11 = y.b(0, 0, null, 7, null);
        this.E = b11;
        this.F = b11;
        r<v> b12 = y.b(0, 0, null, 7, null);
        this.G = b12;
        this.H = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f30374y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f30375z.getCoroutineContext();
    }

    public final w<v> i() {
        return this.H;
    }

    public final LiveData<m> j() {
        return this.B;
    }

    public final w<String> k() {
        return this.F;
    }

    public final w<LiveGameStartResponse> l() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new a(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(eVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new b(cVar, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
