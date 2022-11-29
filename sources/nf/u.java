package nf;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import ha.a;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.e0;
import uo.r0;

/* loaded from: classes3.dex */
public final class u extends androidx.lifecycle.q0 implements uo.q0 {
    public final Resources A;
    public final /* synthetic */ uo.q0 B;
    public final androidx.lifecycle.e0<ha.a> C;
    public final LiveData<ha.a> D;
    public final androidx.lifecycle.e0<String> E;
    public final LiveData<String> F;
    public final s0<List<LiveGiftRankingUser>> G;
    public final wo.f<MRError> H;

    /* renamed from: y  reason: collision with root package name */
    public final jf.x f43254y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f43255z;

    @co.f(c = "com.dena.mirrorman.store.LiveGiftRankingUsersStore$on$1", f = "LiveGiftRankingUsersStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43256w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43256w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = u.this.G;
                List k10 = xn.s.k();
                this.f43256w = 1;
                if (s0Var.d(k10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LiveGiftRankingUsersStore$on$2", f = "LiveGiftRankingUsersStore.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43258w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<LiveGiftRankingUser> f43260y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<LiveGiftRankingUser> list, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43260y = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43260y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43258w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = u.this.G;
                List<LiveGiftRankingUser> list = this.f43260y;
                this.f43258w = 1;
                if (s0Var.d(list, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LiveGiftRankingUsersStore$on$3", f = "LiveGiftRankingUsersStore.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43261w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0.a f43263y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43263y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43263y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43261w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = u.this.H;
                MRError a10 = this.f43263y.a();
                this.f43261w = 1;
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

    public u(jf.x xVar, q8.a aVar, Resources resources) {
        jo.p.h(xVar, "rankingType");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f43254y = xVar;
        this.f43255z = aVar;
        this.A = resources;
        this.B = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.C = e0Var;
        this.D = e0Var;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>("");
        this.E = e0Var2;
        this.F = e0Var2;
        this.G = new s0<>();
        this.H = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43255z.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final List<LiveGiftRankingUser> h() {
        List<LiveGiftRankingUser> b10 = this.G.b();
        return b10 == null ? xn.s.k() : b10;
    }

    public final wo.x<List<LiveGiftRankingUser>> i() {
        return this.G.c();
    }

    public final LiveData<String> j() {
        return this.F;
    }

    public final LiveData<ha.a> k() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e0.d dVar) {
        jo.p.h(dVar, "event");
        if (dVar.a() != this.f43254y) {
            return;
        }
        this.C.p(a.b.f34695b);
        this.E.p("");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e0.c cVar) {
        jo.p.h(cVar, "event");
        if (cVar.a() != this.f43254y) {
            return;
        }
        this.C.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e0.b bVar) {
        jo.p.h(bVar, "event");
        if (bVar.a() != this.f43254y) {
            return;
        }
        this.E.p(bVar.b().getNextCursor());
        List o02 = xn.a0.o0(h(), bVar.b().getRanking());
        this.C.p(o02.isEmpty() ? a.e.f34698b : a.d.f34697b);
        uo.l.d(this, null, null, new b(o02, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e0.a aVar) {
        jo.p.h(aVar, "event");
        if (aVar.b() != this.f43254y) {
            return;
        }
        this.C.p(new a.C0439a(aVar.a()));
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }
}
