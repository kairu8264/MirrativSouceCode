package w8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.live.PhotoCampaign;
import ha.a;
import hf.v0;
import io.p;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import w8.b;
import wn.m;
import wn.v;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class k extends q0 implements uo.q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final e0<String> C;
    public final LiveData<String> D;
    public final e0<Boolean> E;
    public final LiveData<Boolean> F;
    public final r<Boolean> G;
    public final w<Boolean> H;
    public final r<MRError> I;
    public final w<MRError> J;
    public final r<Integer> K;
    public final w<Integer> L;
    public final r<MRError> M;
    public final w<MRError> N;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f58240y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f58241z;

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostStore$on$1", f = "PhotoCampaignPostStore.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58242w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f58244y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f58244y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f58244y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58242w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = k.this.G;
                Boolean a10 = co.b.a(this.f58244y.a() != null);
                this.f58242w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostStore$on$2", f = "PhotoCampaignPostStore.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58245w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f58247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f58247y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f58247y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58245w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = k.this.I;
                MRError a10 = this.f58247y.a();
                this.f58245w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostStore$on$3", f = "PhotoCampaignPostStore.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58248w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.f f58250y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.f fVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f58250y = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f58250y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58248w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = k.this.K;
                Integer d10 = co.b.d(this.f58250y.a());
                this.f58248w = 1;
                if (rVar.emit(d10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostStore$on$4", f = "PhotoCampaignPostStore.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58251w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.d f58253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.d dVar, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f58253y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f58253y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58251w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = k.this.M;
                MRError a10 = this.f58253y.a();
                this.f58251w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    public k(q8.a aVar, v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(v0Var, "userHelper");
        this.f58240y = aVar;
        this.f58241z = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        e0<String> e0Var2 = new e0<>(null);
        this.C = e0Var2;
        this.D = e0Var2;
        e0<Boolean> e0Var3 = new e0<>(Boolean.valueOf(v0Var.m()));
        this.E = e0Var3;
        this.F = e0Var3;
        r<Boolean> b10 = y.b(0, 0, null, 7, null);
        this.G = b10;
        this.H = xo.e.b(b10);
        r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.I = b11;
        this.J = xo.e.b(b11);
        r<Integer> b12 = y.b(0, 0, null, 7, null);
        this.K = b12;
        this.L = xo.e.b(b12);
        r<MRError> b13 = y.b(0, 0, null, 7, null);
        this.M = b13;
        this.N = xo.e.b(b13);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f58240y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f58241z.getCoroutineContext();
    }

    public final LiveData<String> j() {
        return this.D;
    }

    public final w<Boolean> k() {
        return this.H;
    }

    public final w<MRError> l() {
        return this.J;
    }

    public final w<Integer> m() {
        return this.L;
    }

    public final w<MRError> n() {
        return this.N;
    }

    public final LiveData<Boolean> o() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0958b c0958b) {
        jo.p.h(c0958b, "event");
        this.A.p(a.b.f34695b);
    }

    public final LiveData<ha.a> p() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.d.f34697b);
        e0<Boolean> e0Var = this.E;
        PhotoCampaign a10 = cVar.a();
        boolean z10 = true;
        if (a10 == null || !a10.getTweet()) {
            z10 = false;
        }
        e0Var.p(Boolean.valueOf(z10));
        e0<String> e0Var2 = this.C;
        PhotoCampaign a11 = cVar.a();
        e0Var2.p(a11 != null ? a11.getId() : null);
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new c(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new d(dVar, null), 3, null);
    }
}
