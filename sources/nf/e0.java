package nf;

import ce.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUserDetail;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.unity.MiniGameStateType;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.y0;
import uo.r0;

/* loaded from: classes3.dex */
public final class e0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final s0<ShooterEventResponse> A;
    public final wo.f<MRError> B;
    public final wo.f<ShooterMemberAvatarsResponse> C;
    public final wo.f<MRError> D;
    public final wo.f<ShooterUpdateTeamResponse> E;
    public final wo.f<MRError> F;
    public final wo.f<ShooterUpdateMemberResponse> G;
    public final wo.f<MRError> H;
    public final wo.f<DiarkisAuthInfoResponse> I;
    public final wo.f<MRError> J;
    public final wo.f<ShooterTeamResultResponse> K;
    public final wo.f<MRError> L;
    public final wo.f<ShooterMatchingStateChangedBcsvrResponse> M;
    public final wo.f<ShooterMemberStateChangedBcsvrResponse> N;
    public final wo.f<wn.v> O;
    public final xo.s<String> P;
    public final xo.g0<String> Q;
    public final xo.s<MiniGameStateType> R;
    public final xo.g0<MiniGameStateType> S;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42619y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42620z;

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$10", f = "ShooterGameStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42621w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.i f42623y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0.i iVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42623y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42623y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42621w == 0) {
                wn.m.b(obj);
                e0.this.P.setValue(this.f42623y.a());
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$11", f = "ShooterGameStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42624w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.j f42626y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y0.j jVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42626y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42626y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42624w == 0) {
                wn.m.b(obj);
                e0.this.R.setValue(this.f42626y.a());
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$12", f = "ShooterGameStore.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42627w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.h1 f42629y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l.h1 h1Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42629y = h1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42629y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42627w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.M;
                ShooterMatchingStateChangedBcsvrResponse b10 = this.f42629y.b();
                this.f42627w = 1;
                if (fVar.r(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$13", f = "ShooterGameStore.kt", l = {180}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42630w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.i1 f42632y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l.i1 i1Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42632y = i1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42632y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42630w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.N;
                ShooterMemberStateChangedBcsvrResponse b10 = this.f42632y.b();
                this.f42630w = 1;
                if (fVar.r(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$14", f = "ShooterGameStore.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42633w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42633w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.O;
                wn.v vVar = wn.v.f59242a;
                this.f42633w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$1", f = "ShooterGameStore.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42635w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.d f42637y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y0.d dVar, ao.d<? super f> dVar2) {
            super(2, dVar2);
            this.f42637y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f42637y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42635w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = e0.this.A;
                ShooterEventResponse a10 = this.f42637y.a();
                this.f42635w = 1;
                if (s0Var.d(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$2", f = "ShooterGameStore.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42638w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.c f42640y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y0.c cVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f42640y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f42640y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42638w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.B;
                MRError a10 = this.f42640y.a();
                this.f42638w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$3", f = "ShooterGameStore.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42641w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.f f42643y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y0.f fVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f42643y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f42643y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42641w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.C;
                ShooterMemberAvatarsResponse a10 = this.f42643y.a();
                this.f42641w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$4", f = "ShooterGameStore.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42644w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.e f42646y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y0.e eVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f42646y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f42646y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42644w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.D;
                MRError a10 = this.f42646y.a();
                this.f42644w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$5", f = "ShooterGameStore.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42647w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.b f42649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(y0.b bVar, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f42649y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f42649y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42647w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.I;
                DiarkisAuthInfoResponse a10 = this.f42649y.a();
                this.f42647w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$6", f = "ShooterGameStore.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42650w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.a f42652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(y0.a aVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f42652y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f42652y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42650w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.J;
                MRError a10 = this.f42652y.a();
                this.f42650w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$7", f = "ShooterGameStore.kt", l = {137}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42653w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.l f42655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(y0.l lVar, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f42655y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f42655y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42653w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.G;
                ShooterUpdateMemberResponse a10 = this.f42655y.a();
                this.f42653w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$8", f = "ShooterGameStore.kt", l = {144}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42656w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.g f42658y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(y0.g gVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f42658y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f42658y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42656w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.K;
                ShooterTeamResultResponse a10 = this.f42658y.a();
                this.f42656w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterGameStore$on$9", f = "ShooterGameStore.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42659w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0.h f42661y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(y0.h hVar, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f42661y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f42661y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42659w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = e0.this.L;
                MRError a10 = this.f42661y.a();
                this.f42659w = 1;
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

    public e0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42619y = aVar;
        this.f42620z = r0.b();
        aVar.b(this);
        this.A = new s0<>();
        this.B = wo.g.a(-2);
        this.C = wo.g.a(-2);
        this.D = wo.g.a(-2);
        this.E = wo.g.a(-2);
        this.F = wo.g.a(-2);
        this.G = wo.g.a(-2);
        this.H = wo.g.a(-2);
        this.I = wo.g.a(-2);
        this.J = wo.g.a(-2);
        this.K = wo.g.a(-2);
        this.L = wo.g.a(-2);
        this.M = wo.g.a(-2);
        this.N = wo.g.a(-2);
        this.O = wo.g.a(-2);
        xo.s<String> a10 = xo.i0.a("");
        this.P = a10;
        this.Q = a10;
        xo.s<MiniGameStateType> a11 = xo.i0.a(MiniGameStateType.UNLOADED);
        this.R = a11;
        this.S = a11;
    }

    public final xo.c<ShooterTeamResultResponse> A() {
        return xo.e.a(this.K);
    }

    public final xo.g0<MiniGameStateType> B() {
        return this.S;
    }

    public final xo.c<MRError> C() {
        return xo.e.a(this.L);
    }

    public final List<ShooterReward> D() {
        ShooterUserDetail ratingClassReward;
        List<ShooterReward> rewards;
        ShooterEventResponse b10 = this.A.b();
        return (b10 == null || (ratingClassReward = b10.getRatingClassReward()) == null || (rewards = ratingClassReward.getRewards()) == null) ? xn.s.k() : rewards;
    }

    public final xo.c<ShooterMatchingStateChangedBcsvrResponse> E() {
        return xo.e.a(this.M);
    }

    public final xo.c<ShooterMemberStateChangedBcsvrResponse> F() {
        return xo.e.a(this.N);
    }

    public final xo.g0<String> G() {
        return this.Q;
    }

    public final List<ShooterReward> H() {
        ShooterUserDetail scoreReward;
        List<ShooterReward> rewards;
        ShooterEventResponse b10 = this.A.b();
        return (b10 == null || (scoreReward = b10.getScoreReward()) == null || (rewards = scoreReward.getRewards()) == null) ? xn.s.k() : rewards;
    }

    public final int I() {
        ShooterEventResponse b10 = this.A.b();
        if (b10 != null) {
            return b10.getSeasonNo();
        }
        return 0;
    }

    public final int J() {
        ShooterUserDetail rankReward;
        ShooterEventResponse b10 = this.A.b();
        if (b10 == null || (rankReward = b10.getRankReward()) == null) {
            return 0;
        }
        return rankReward.getRank();
    }

    public final xo.c<MRError> K() {
        return xo.e.a(this.H);
    }

    public final xo.c<ShooterUpdateMemberResponse> L() {
        return xo.e.a(this.G);
    }

    public final xo.c<MRError> M() {
        return xo.e.a(this.F);
    }

    public final xo.c<ShooterUpdateTeamResponse> N() {
        return xo.e.a(this.E);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42619y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42620z.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new f(dVar, null), 3, null);
    }

    public final xo.c<wn.v> t() {
        return xo.e.a(this.O);
    }

    public final xo.c<MRError> u() {
        return xo.e.a(this.J);
    }

    public final xo.c<DiarkisAuthInfoResponse> v() {
        return xo.e.a(this.I);
    }

    public final xo.c<MRError> w() {
        return xo.e.a(this.B);
    }

    public final xo.c<ShooterEventResponse> x() {
        return this.A.a();
    }

    public final xo.c<MRError> y() {
        return xo.e.a(this.D);
    }

    public final xo.c<ShooterMemberAvatarsResponse> z() {
        return xo.e.a(this.C);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new g(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new h(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new i(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new j(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new k(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new l(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new m(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new n(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.i iVar) {
        jo.p.h(iVar, "event");
        if (iVar.a().length() == 0) {
            return;
        }
        uo.l.d(this, null, null, new a(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y0.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new b(jVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.h1 h1Var) {
        jo.p.h(h1Var, "event");
        uo.l.d(this, null, null, new c(h1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i1 i1Var) {
        jo.p.h(i1Var, "event");
        uo.l.d(this, null, null, new d(i1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.C0712c c0712c) {
        jo.p.h(c0712c, "event");
        uo.l.d(this, null, null, new e(null), 3, null);
    }
}
