package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.user.LatestRewardResponse;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.mirrativapi.user.TosPopUp;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import nd.f1;
import org.greenrobot.eventbus.ThreadMode;
import pd.x;
import uo.r0;
import wn.l;

/* loaded from: classes3.dex */
public final class r implements uo.q0 {
    public final androidx.lifecycle.e0<Integer> A;
    public final androidx.lifecycle.e0<Integer> B;
    public final androidx.lifecycle.e0<Integer> C;
    public final androidx.lifecycle.e0<Integer> D;
    public final androidx.lifecycle.e0<Integer> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final xo.r<ub.b> H;
    public final androidx.lifecycle.e0<SeasonRatingStatusResponse> I;
    public final LiveData<SeasonRatingStatusResponse> J;
    public final xo.r<wn.v> K;
    public final xo.w<wn.v> L;
    public final xo.w<ub.b> M;
    public final LiveData<Boolean> N;
    public final LiveData<Boolean> O;
    public final LiveData<Boolean> P;
    public final LiveData<Boolean> Q;
    public final LiveData<Boolean> R;
    public final LiveData<Integer> S;
    public final LiveData<ub.c> T;

    /* renamed from: w  reason: collision with root package name */
    public final kf.x f43207w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43208x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<LatestRewardResponse> f43209y;

    /* renamed from: z  reason: collision with root package name */
    public final LiveData<LatestRewardResponse> f43210z;

    @co.f(c = "com.dena.mirrorman.store.LatestRewardStore$on$1", f = "LatestRewardStore.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43211w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.c f43212x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r f43213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.c cVar, r rVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43212x = cVar;
            this.f43213y = rVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43212x, this.f43213y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43211w;
            if (i10 == 0) {
                wn.m.b(obj);
                TosPopUp popup = this.f43212x.a().getPopup();
                if (popup == null) {
                    return wn.v.f59242a;
                }
                ub.b bVar = new ub.b(popup.getId(), popup.getTitle(), popup.getDescription(), popup.getImageUrl(), popup.getLinkUrl());
                xo.r rVar = this.f43213y.H;
                this.f43211w = 1;
                if (rVar.emit(bVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LatestRewardStore$on$2", f = "LatestRewardStore.kt", l = {181}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43214w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.b f43215x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r f43216y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x.b bVar, r rVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43215x = bVar;
            this.f43216y = rVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43215x, this.f43216y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43214w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (!this.f43215x.b()) {
                    return wn.v.f59242a;
                }
                this.f43216y.I.p(this.f43215x.a());
                xo.r rVar = this.f43216y.K;
                wn.v vVar = wn.v.f59242a;
                this.f43214w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LatestRewardStore$rankingPrizeData$1", f = "LatestRewardStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.r<Integer, LatestRewardResponse, UserMe, ao.d<? super ub.c>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43217w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f43218x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f43219y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f43220z;

        public c(ao.d<? super c> dVar) {
            super(4, dVar);
        }

        @Override // io.r
        /* renamed from: a */
        public final Object F(Integer num, LatestRewardResponse latestRewardResponse, UserMe userMe, ao.d<? super ub.c> dVar) {
            c cVar = new c(dVar);
            cVar.f43218x = num;
            cVar.f43219y = latestRewardResponse;
            cVar.f43220z = userMe;
            return cVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            bo.c.c();
            if (this.f43217w == 0) {
                wn.m.b(obj);
                Integer num = (Integer) this.f43218x;
                LatestRewardResponse latestRewardResponse = (LatestRewardResponse) this.f43219y;
                UserMe userMe = (UserMe) this.f43220z;
                int rankingMonth = latestRewardResponse.getRankingMonth();
                boolean z10 = latestRewardResponse.getFixedRank() > 0;
                jo.p.g(num, "lastShowDateTime");
                if (!z10 || !(rankingMonth > num.intValue())) {
                    return null;
                }
                int fixedRank = latestRewardResponse.getFixedRank();
                int fixedGrade = latestRewardResponse.getFixedGrade();
                int fixedCashRate = latestRewardResponse.getFixedCashRate();
                int fixedCoinRate = latestRewardResponse.getFixedCoinRate();
                try {
                    l.a aVar = wn.l.f59224w;
                    a10 = wn.l.a(userMe.getAvatarBodyImageUrl());
                } catch (Throwable th2) {
                    l.a aVar2 = wn.l.f59224w;
                    a10 = wn.l.a(wn.m.a(th2));
                }
                return new ub.c(fixedRank, fixedGrade, fixedCashRate, fixedCoinRate, latestRewardResponse.getRankingMonth(), wn.l.c(a10) ? null : a10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes3.dex */
    public static final class d<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f43221a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f43222b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f43223c;

        public d(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f43221a = c0Var;
            this.f43222b = liveData;
            this.f43223c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f43221a.f();
            Object f11 = this.f43222b.f();
            Object f12 = this.f43223c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f43221a;
            LatestRewardResponse latestRewardResponse = (LatestRewardResponse) f12;
            Integer num = (Integer) f11;
            ((Boolean) f10).booleanValue();
            boolean z10 = false;
            if (latestRewardResponse.isVisibleRanking() && latestRewardResponse.getRankingMonth() > num.intValue()) {
                z10 = true;
            }
            c0Var.p(Boolean.valueOf(z10));
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f43224a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f43225b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f43226c;

        public e(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f43224a = c0Var;
            this.f43225b = liveData;
            this.f43226c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f43224a.f();
            Object f11 = this.f43225b.f();
            Object f12 = this.f43226c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f43224a;
            LatestRewardResponse latestRewardResponse = (LatestRewardResponse) f12;
            Integer num = (Integer) f11;
            ((Boolean) f10).booleanValue();
            boolean z10 = false;
            if (latestRewardResponse.isVisibleHistory() && latestRewardResponse.getCurrentMonth() > num.intValue()) {
                z10 = true;
            }
            c0Var.p(Boolean.valueOf(z10));
        }
    }

    /* loaded from: classes3.dex */
    public static final class f<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f43227a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f43228b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f43229c;

        public f(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f43227a = c0Var;
            this.f43228b = liveData;
            this.f43229c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f43227a.f();
            Object f11 = this.f43228b.f();
            Object f12 = this.f43229c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f43227a;
            LatestRewardResponse latestRewardResponse = (LatestRewardResponse) f12;
            Integer num = (Integer) f11;
            ((Boolean) f10).booleanValue();
            boolean z10 = false;
            if (latestRewardResponse.isVisibleHistory() && latestRewardResponse.getCurrentMonth() > num.intValue()) {
                z10 = true;
            }
            c0Var.p(Boolean.valueOf(z10));
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(Boolean bool) {
            return Boolean.valueOf(!bool.booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class h<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(Boolean bool) {
            return Boolean.valueOf(!bool.booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class i<I, O> implements n.a {
        @Override // n.a
        public final Integer apply(Boolean bool) {
            if (bool.booleanValue()) {
                return Integer.valueOf(f1.text_contract_check_monthly_ranking);
            }
            return null;
        }
    }

    public r(q8.a aVar, y yVar, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(yVar, "mainStore");
        jo.p.h(xVar, "userPreference");
        this.f43207w = xVar;
        this.f43208x = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<LatestRewardResponse> e0Var = new androidx.lifecycle.e0<>();
        this.f43209y = e0Var;
        this.f43210z = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.E()));
        this.A = e0Var2;
        this.B = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.Q0()));
        this.C = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.j0()));
        this.D = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.S3()));
        this.E = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.a4()));
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(Boolean.valueOf(xVar.N4()));
        this.F = e0Var3;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(Boolean.valueOf(xVar.n3()));
        this.G = e0Var4;
        xo.r<ub.b> b10 = xo.y.b(0, 0, null, 7, null);
        this.H = b10;
        androidx.lifecycle.e0<SeasonRatingStatusResponse> e0Var5 = new androidx.lifecycle.e0<>();
        this.I = e0Var5;
        this.J = e0Var5;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.K = b11;
        this.L = b11;
        this.M = b10;
        LiveData<Boolean> b12 = androidx.lifecycle.p0.b(e0Var3, new g());
        jo.p.g(b12, "crossinline transform: (…p(this) { transform(it) }");
        this.N = b12;
        LiveData<Boolean> b13 = androidx.lifecycle.p0.b(e0Var4, new h());
        jo.p.g(b13, "crossinline transform: (…p(this) { transform(it) }");
        this.O = b13;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(bool);
        for (LiveData liveData : xn.s.m(e0Var2, e0Var)) {
            c0Var.q(liveData, new d(c0Var, e0Var2, e0Var));
        }
        LiveData<Boolean> a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        this.P = a10;
        Boolean bool2 = Boolean.FALSE;
        androidx.lifecycle.e0<Integer> e0Var6 = this.B;
        LiveData<LatestRewardResponse> liveData2 = this.f43210z;
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
        c0Var2.p(bool2);
        for (LiveData liveData3 : xn.s.m(e0Var6, liveData2)) {
            c0Var2.q(liveData3, new e(c0Var2, e0Var6, liveData2));
        }
        LiveData<Boolean> a11 = androidx.lifecycle.p0.a(c0Var2);
        jo.p.g(a11, "distinctUntilChanged(this)");
        this.Q = a11;
        Boolean bool3 = Boolean.FALSE;
        androidx.lifecycle.e0<Integer> e0Var7 = this.C;
        LiveData<LatestRewardResponse> liveData4 = this.f43210z;
        androidx.lifecycle.c0 c0Var3 = new androidx.lifecycle.c0();
        c0Var3.p(bool3);
        for (LiveData liveData5 : xn.s.m(e0Var7, liveData4)) {
            c0Var3.q(liveData5, new f(c0Var3, e0Var7, liveData4));
        }
        LiveData<Boolean> a12 = androidx.lifecycle.p0.a(c0Var3);
        jo.p.g(a12, "distinctUntilChanged(this)");
        this.R = a12;
        LiveData<Integer> b14 = androidx.lifecycle.p0.b(this.P, new i());
        jo.p.g(b14, "crossinline transform: (…p(this) { transform(it) }");
        this.S = b14;
        this.T = androidx.lifecycle.l.c(xo.e.i(androidx.lifecycle.l.a(this.E), androidx.lifecycle.l.a(this.f43210z), androidx.lifecycle.l.a(yVar.m()), new c(null)), null, 0L, 3, null);
    }

    public final LiveData<LatestRewardResponse> d() {
        return this.f43210z;
    }

    public final LiveData<Integer> e() {
        return this.S;
    }

    public final xo.w<ub.b> f() {
        return this.M;
    }

    public final LiveData<ub.c> g() {
        return this.T;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43208x.getCoroutineContext();
    }

    public final LiveData<SeasonRatingStatusResponse> h() {
        return this.J;
    }

    public final xo.w<wn.v> i() {
        return this.L;
    }

    public final LiveData<Boolean> j() {
        return this.N;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.a aVar) {
        jo.p.h(aVar, "event");
        this.f43209y.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.k kVar) {
        jo.p.h(kVar, "event");
        this.A.p(Integer.valueOf(this.f43207w.E()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.g gVar) {
        jo.p.h(gVar, "event");
        this.B.p(Integer.valueOf(this.f43207w.Q0()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.j jVar) {
        jo.p.h(jVar, "event");
        this.C.p(Integer.valueOf(this.f43207w.j0()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.e eVar) {
        jo.p.h(eVar, "event");
        this.D.p(Integer.valueOf(this.f43207w.S3()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.i iVar) {
        jo.p.h(iVar, "event");
        this.E.p(Integer.valueOf(this.f43207w.a4()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.f fVar) {
        jo.p.h(fVar, "event");
        this.F.p(Boolean.valueOf(this.f43207w.N4()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.d dVar) {
        jo.p.h(dVar, "event");
        this.G.p(Boolean.valueOf(this.f43207w.n3()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new a(cVar, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(x.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new b(bVar, this, null), 3, null);
    }
}
