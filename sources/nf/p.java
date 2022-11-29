package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import com.dena.mirrorman.net.api.response.live.PhotoCampaign;
import ha.a;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.t;
import uo.r0;

/* loaded from: classes3.dex */
public final class p extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final androidx.lifecycle.e0<Integer> C;
    public final LiveData<Integer> D;
    public final androidx.lifecycle.e0<List<GroupShotItem>> E;
    public final LiveData<List<GroupShotItem>> F;
    public final androidx.lifecycle.e0<ha.a> G;
    public final LiveData<ha.a> H;
    public final xo.r<PhotoCampaign> I;
    public final xo.w<PhotoCampaign> J;
    public final xo.r<MRError> K;
    public final xo.w<MRError> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43155y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43156z;

    @co.f(c = "com.dena.mirrorman.store.GroupShotGalleryStore$on$1", f = "GroupShotGalleryStore.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43157w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t.d f43159y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t.d dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f43159y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43159y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43157w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = p.this.K;
                MRError a10 = this.f43159y.a();
                this.f43157w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.GroupShotGalleryStore$on$2", f = "GroupShotGalleryStore.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43160w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t.c f43162y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t.c cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43162y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43162y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43160w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = p.this.I;
                PhotoCampaign a10 = this.f43162y.a();
                this.f43160w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    public p(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43155y = aVar;
        this.f43156z = r0.b();
        aVar.b(this);
        a.d dVar = a.d.f34697b;
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(dVar);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(0);
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<List<GroupShotItem>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<ha.a> e0Var4 = new androidx.lifecycle.e0<>(dVar);
        this.G = e0Var4;
        this.H = e0Var4;
        xo.r<PhotoCampaign> b10 = xo.y.b(0, 0, null, 7, null);
        this.I = b10;
        this.J = xo.e.b(b10);
        xo.r<MRError> b11 = xo.y.b(0, 0, null, 7, null);
        this.K = b11;
        this.L = xo.e.b(b11);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43155y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43156z.getCoroutineContext();
    }

    public final xo.w<MRError> h() {
        return this.L;
    }

    public final LiveData<ha.a> i() {
        return this.H;
    }

    public final xo.w<PhotoCampaign> j() {
        return this.J;
    }

    public final LiveData<List<GroupShotItem>> k() {
        return this.F;
    }

    public final LiveData<Integer> l() {
        return this.D;
    }

    public final LiveData<ha.a> m() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.g gVar) {
        jo.p.h(gVar, "event");
        this.A.p(a.b.f34695b);
        this.C.p(0);
        this.E.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.e eVar) {
        jo.p.h(eVar, "event");
        this.C.p(Integer.valueOf(eVar.a().getNextId()));
        androidx.lifecycle.e0<List<GroupShotItem>> e0Var = this.E;
        List<GroupShotItem> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, eVar.a().getItems()));
        this.A.p(eVar.a().getItems().isEmpty() ? a.e.f34698b : a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(new a.C0439a(dVar.a()));
        uo.l.d(this, null, null, new a(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.b bVar) {
        jo.p.h(bVar, "event");
        this.G.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.c cVar) {
        jo.p.h(cVar, "event");
        this.G.p(a.d.f34697b);
        uo.l.d(this, null, null, new b(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(t.a aVar) {
        jo.p.h(aVar, "event");
        this.G.p(new a.C0439a(aVar.a()));
    }
}
