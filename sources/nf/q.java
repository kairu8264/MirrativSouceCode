package nf;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameAppRankingResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDetailResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import com.dena.mirrorman.net.api.response.CampaignShareInfoResponse;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.greenrobot.eventbus.ThreadMode;
import pd.u;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes3.dex */
public final class q extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final wo.q<MRError> C;
    public final wo.q<jf.b0> D;
    public final wo.q<CampaignShareInfoResponse> E;
    public final wo.q<LiveArchiveDownloadUrlResponse> F;
    public final wo.f<LiveDetailResponse> G;
    public final xo.r<ContractSummaryResponse> H;
    public final xo.r<ub.a> I;
    public final xo.r<String> J;
    public final xo.w<String> K;
    public final xo.r<Boolean> L;
    public final xo.w<Boolean> M;
    public final xo.r<LiveGameDetailResponse> N;
    public final xo.w<LiveGameDetailResponse> O;
    public final xo.r<LiveGameAppRankingResponse> P;
    public final xo.w<LiveGameAppRankingResponse> Q;
    @SuppressLint({"SimpleDateFormat"})
    public final xo.c<ub.a> R;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43167y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f43168z;

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$contractTransition$1", f = "HandleUrlSchemeStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.q<ContractSummaryResponse, ub.a, ao.d<? super ub.a>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43169w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f43170x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f43171y;

        public a(ao.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // io.q
        /* renamed from: a */
        public final Object s0(ContractSummaryResponse contractSummaryResponse, ub.a aVar, ao.d<? super ub.a> dVar) {
            a aVar2 = new a(dVar);
            aVar2.f43170x = contractSummaryResponse;
            aVar2.f43171y = aVar;
            return aVar2.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f43169w == 0) {
                wn.m.b(obj);
                ub.a aVar = (ub.a) this.f43171y;
                if (((ContractSummaryResponse) this.f43170x).isContractEnable()) {
                    return aVar;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$10", f = "HandleUrlSchemeStore.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43172w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.b f43174y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43174y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43174y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43172w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = q.this.P;
                LiveGameAppRankingResponse a10 = this.f43174y.a();
                this.f43172w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$1", f = "HandleUrlSchemeStore.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43175w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.n f43177y;

        public c(u.n nVar, ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43177y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f43175w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q unused = q.this.D;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$2", f = "HandleUrlSchemeStore.kt", l = {104}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43178w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.g f43180y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u.g gVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f43180y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f43180y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43178w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = q.this.C;
                MRError a10 = this.f43180y.a();
                this.f43178w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$3", f = "HandleUrlSchemeStore.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43181w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.i f43183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u.i iVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f43183y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f43183y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43181w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = q.this.E;
                CampaignShareInfoResponse a10 = this.f43183y.a();
                this.f43181w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$4", f = "HandleUrlSchemeStore.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43184w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.h f43186y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(u.h hVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43186y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43186y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43184w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = q.this.F;
                LiveArchiveDownloadUrlResponse a10 = this.f43186y.a();
                this.f43184w = 1;
                if (qVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$5", f = "HandleUrlSchemeStore.kt", l = {143}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43187w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.j f43189y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(u.j jVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f43189y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f43189y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43187w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = q.this.G;
                LiveDetailResponse a10 = this.f43189y.a();
                this.f43187w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$6", f = "HandleUrlSchemeStore.kt", l = {158, 160, 161}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43190w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.m f43192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u.m mVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f43192y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f43192y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r5.f43190w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                wn.m.b(r6)
                goto L73
            L1e:
                wn.m.b(r6)
                goto L88
            L22:
                wn.m.b(r6)
                nf.q r6 = nf.q.this
                androidx.lifecycle.e0 r6 = nf.q.l(r6)
                r1 = 0
                java.lang.Boolean r1 = co.b.a(r1)
                r6.p(r1)
                pd.u$m r6 = r5.f43192y
                com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse r6 = r6.a()
                boolean r6 = r6.isContractEnable()
                if (r6 != 0) goto L5e
                pd.u$m r6 = r5.f43192y
                com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse r6 = r6.a()
                boolean r6 = r6.isVisibleHistory()
                if (r6 == 0) goto L5e
                nf.q r6 = nf.q.this
                xo.r r6 = nf.q.m(r6)
                java.lang.Boolean r1 = co.b.a(r4)
                r5.f43190w = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L88
                return r0
            L5e:
                nf.q r6 = nf.q.this
                xo.r r6 = nf.q.k(r6)
                pd.u$m r1 = r5.f43192y
                ub.a r1 = r1.b()
                r5.f43190w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L73
                return r0
            L73:
                nf.q r6 = nf.q.this
                xo.r r6 = nf.q.q(r6)
                pd.u$m r1 = r5.f43192y
                com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse r1 = r1.a()
                r5.f43190w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L88
                return r0
            L88:
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.q.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$7", f = "HandleUrlSchemeStore.kt", l = {171, 173}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43193w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.f f43194x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ q f43195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(u.f fVar, q qVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f43194x = fVar;
            this.f43195y = qVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f43194x, this.f43195y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43193w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f43194x.b().isContractEnable()) {
                    xo.r rVar = this.f43195y.J;
                    KycInfo kycInfo = this.f43194x.a().getKycInfo();
                    String applicationUrl = kycInfo != null ? kycInfo.getApplicationUrl() : null;
                    this.f43193w = 1;
                    if (rVar.emit(applicationUrl, this) == c10) {
                        return c10;
                    }
                } else {
                    xo.r rVar2 = this.f43195y.J;
                    this.f43193w = 2;
                    if (rVar2.emit(null, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$8", f = "HandleUrlSchemeStore.kt", l = {181}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43196w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.a f43198y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(u.a aVar, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f43198y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f43198y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43196w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = q.this.L;
                Boolean a10 = co.b.a(this.f43198y.a());
                this.f43196w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.HandleUrlSchemeStore$on$9", f = "HandleUrlSchemeStore.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43199w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.c f43201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(u.c cVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f43201y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f43201y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43199w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = q.this.N;
                LiveGameDetailResponse a10 = this.f43201y.a();
                this.f43199w = 1;
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

    public q(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f43167y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f43168z = c10.plus(b10);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        this.C = new wo.q<>();
        this.D = new wo.q<>();
        this.E = new wo.q<>();
        this.F = new wo.q<>();
        this.G = wo.g.a(-2);
        xo.r<ContractSummaryResponse> b11 = xo.y.b(0, 0, null, 7, null);
        this.H = b11;
        xo.r<ub.a> b12 = xo.y.b(0, 0, null, 7, null);
        this.I = b12;
        xo.r<String> b13 = xo.y.b(0, 0, null, 7, null);
        this.J = b13;
        this.K = b13;
        xo.r<Boolean> b14 = xo.y.b(0, 0, null, 7, null);
        this.L = b14;
        this.M = b14;
        xo.r<LiveGameDetailResponse> b15 = xo.y.b(0, 0, null, 7, null);
        this.N = b15;
        this.O = b15;
        xo.r<LiveGameAppRankingResponse> b16 = xo.y.b(0, 0, null, 7, null);
        this.P = b16;
        this.Q = b16;
        this.R = xo.e.h(b11, b12, new a(null));
    }

    public final xo.w<Boolean> A() {
        return this.M;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43167y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43168z;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new c(nVar, null), 3, null);
    }

    public final wo.x<LiveArchiveDownloadUrlResponse> r() {
        return this.F.g();
    }

    public final wo.x<CampaignShareInfoResponse> s() {
        return this.E.g();
    }

    public final xo.c<ub.a> t() {
        return this.R;
    }

    public final wo.x<MRError> u() {
        return this.C.g();
    }

    public final wo.x<LiveDetailResponse> v() {
        return this.G.g();
    }

    public final xo.w<LiveGameDetailResponse> w() {
        return this.O;
    }

    public final wo.x<jf.b0> x() {
        return this.D.g();
    }

    public final xo.w<String> y() {
        return this.K;
    }

    public final xo.w<LiveGameAppRankingResponse> z() {
        return this.Q;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new d(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new e(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new f(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.k kVar) {
        jo.p.h(kVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new g(jVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.l lVar) {
        jo.p.h(lVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new h(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new i(fVar, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new j(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new k(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new b(bVar, null), 3, null);
    }
}
