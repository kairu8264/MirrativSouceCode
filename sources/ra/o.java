package ra;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import java.util.Iterator;
import java.util.List;
import jf.g0;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.m0;
import uo.r0;
import wn.v;
import wo.x;
import xn.a0;
import xn.s;

/* loaded from: classes2.dex */
public final class o extends q0 implements uo.q0 {
    public final /* synthetic */ uo.q0 A;
    public final e0<ha.a> B;
    public final LiveData<ha.a> C;
    public final e0<String> D;
    public final LiveData<String> E;
    public final e0<Long> F;
    public final LiveData<Long> G;
    public final e0<Long> H;
    public final LiveData<Long> I;
    public final s0<List<CampaignNotice>> J;
    public final wo.f<MRError> K;
    public final e0<Integer> L;
    public final LiveData<Integer> M;
    public boolean N;

    /* renamed from: y  reason: collision with root package name */
    public final g0 f50663y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f50664z;

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageStore$on$1", f = "NoticeCampaignPageStore.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50665w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50665w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = o.this.J;
                List k10 = s.k();
                this.f50665w = 1;
                if (s0Var.d(k10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageStore$on$2", f = "NoticeCampaignPageStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50667w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<CampaignNotice> f50669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<CampaignNotice> list, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f50669y = list;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f50669y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50667w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = o.this.J;
                List<CampaignNotice> list = this.f50669y;
                this.f50667w = 1;
                if (s0Var.d(list, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageStore$on$3", f = "NoticeCampaignPageStore.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50670w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m0.a f50672y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m0.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f50672y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f50672y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50670w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = o.this.K;
                MRError a10 = this.f50672y.a();
                this.f50670w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageStore$on$4", f = "NoticeCampaignPageStore.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50673w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m0.g f50675y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m0.g gVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f50675y = gVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f50675y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean z10;
            Object c10 = bo.c.c();
            int i10 = this.f50673w;
            if (i10 == 0) {
                wn.m.b(obj);
                List<CampaignNotice> h10 = o.this.h();
                m0.g gVar = this.f50675y;
                Iterator<T> it = h10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((CampaignNotice) obj2).getId() == gVar.a().getId()) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
                CampaignNotice campaignNotice = (CampaignNotice) obj2;
                if (campaignNotice != null) {
                    campaignNotice.setNew(false);
                }
                s0 s0Var = o.this.J;
                List<CampaignNotice> h11 = o.this.h();
                this.f50673w = 1;
                if (s0Var.d(h11, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageStore$on$5", f = "NoticeCampaignPageStore.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50676w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0.d f50677x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o f50678y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m0.d dVar, o oVar, ao.d<? super e> dVar2) {
            super(2, dVar2);
            this.f50677x = dVar;
            this.f50678y = oVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f50677x, this.f50678y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean z10;
            Object c10 = bo.c.c();
            int i10 = this.f50676w;
            if (i10 == 0) {
                wn.m.b(obj);
                for (CampaignNotice campaignNotice : this.f50677x.b().getCampaignNotices()) {
                    Iterator<T> it = this.f50678y.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((CampaignNotice) obj2).getId() == campaignNotice.getId()) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    }
                    CampaignNotice campaignNotice2 = (CampaignNotice) obj2;
                    if (campaignNotice2 != null) {
                        campaignNotice2.setHasReceivableReward(campaignNotice.getHasReceivableReward());
                    }
                }
                s0 s0Var = this.f50678y.J;
                List<CampaignNotice> h10 = this.f50678y.h();
                this.f50676w = 1;
                if (s0Var.d(h10, this) == c10) {
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

    public o(g0 g0Var, q8.a aVar) {
        jo.p.h(g0Var, "page");
        jo.p.h(aVar, "dispatcher");
        this.f50663y = g0Var;
        this.f50664z = aVar;
        this.A = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.B = e0Var;
        this.C = e0Var;
        e0<String> e0Var2 = new e0<>("");
        this.D = e0Var2;
        this.E = e0Var2;
        e0<Long> e0Var3 = new e0<>(0L);
        this.F = e0Var3;
        this.G = e0Var3;
        e0<Long> e0Var4 = new e0<>(0L);
        this.H = e0Var4;
        this.I = e0Var4;
        this.J = new s0<>();
        this.K = wo.g.a(-2);
        e0<Integer> e0Var5 = new e0<>(null);
        this.L = e0Var5;
        this.M = e0Var5;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f50664z.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final List<CampaignNotice> h() {
        List<CampaignNotice> b10 = this.J.b();
        return b10 == null ? s.k() : b10;
    }

    public final x<List<CampaignNotice>> i() {
        return this.J.c();
    }

    public final x<MRError> j() {
        return this.K.g();
    }

    public final boolean k() {
        return this.N;
    }

    public final LiveData<Integer> l() {
        return this.M;
    }

    public final LiveData<Long> m() {
        return this.G;
    }

    public final LiveData<String> n() {
        return this.E;
    }

    public final LiveData<Long> o() {
        return this.I;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.e eVar) {
        jo.p.h(eVar, "event");
        if (this.f50663y != eVar.b()) {
            return;
        }
        this.B.p(a.b.f34695b);
        this.D.p("");
        this.F.p(Long.valueOf(eVar.a()));
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final LiveData<ha.a> p() {
        return this.C;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.c cVar) {
        jo.p.h(cVar, "event");
        if (this.f50663y != cVar.a()) {
            return;
        }
        this.B.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.b bVar) {
        jo.p.h(bVar, "event");
        if (this.f50663y != bVar.a()) {
            return;
        }
        this.D.p(bVar.b().getNextCursor());
        List o02 = a0.o0(h(), bVar.b().getCampaignNotices());
        this.B.p(o02.isEmpty() ? a.e.f34698b : a.d.f34697b);
        uo.l.d(this, null, null, new b(o02, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.a aVar) {
        jo.p.h(aVar, "event");
        if (this.f50663y != aVar.b()) {
            return;
        }
        this.B.p(new a.C0439a(aVar.a()));
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.g gVar) {
        jo.p.h(gVar, "event");
        if (this.f50663y != gVar.b()) {
            return;
        }
        if (gVar.a().getHasReceivableReward()) {
            this.L.p(Integer.valueOf(gVar.a().getId()));
        } else {
            this.L.p(null);
        }
        uo.l.d(this, null, null, new d(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.f fVar) {
        jo.p.h(fVar, "event");
        if (this.f50663y != fVar.c()) {
            return;
        }
        this.N = fVar.a();
        this.H.p(Long.valueOf(fVar.b()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(m0.d dVar) {
        jo.p.h(dVar, "event");
        if (this.f50663y != dVar.a()) {
            return;
        }
        if (this.M.f() != null) {
            this.L.p(null);
        }
        uo.l.d(this, null, null, new e(dVar, this, null), 3, null);
    }
}
