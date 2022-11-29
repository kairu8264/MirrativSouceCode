package nf;

import androidx.lifecycle.LiveData;
import ce.l;
import ce.t;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.ConnectedStreamingCollabLivesResponse;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.GiftGachaOpenResponse;
import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import com.dena.mirrorman.net.api.response.MutualGiftReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.api.response.event.GiftRanking;
import com.dena.mirrorman.net.api.response.live.AcceptedMatchedCollabResponse;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.bcsvr.response.EventFeverState;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MutualGiftAchievedBcsvrResponse;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.c1;
import pd.f0;
import pd.g;
import pd.h;
import pd.i;
import pd.s;
import ud.d4;
import uo.d2;

/* loaded from: classes3.dex */
public final class c implements uo.q0 {

    /* renamed from: g1  reason: collision with root package name */
    public static final a f42441g1 = new a(null);

    /* renamed from: h1  reason: collision with root package name */
    public static final int f42442h1 = 8;

    /* renamed from: i1  reason: collision with root package name */
    public static c f42443i1;
    public final LiveData<AppUserDetailResponse> A;
    public final androidx.lifecycle.e0<String> A0;
    public final wo.f<AppUserDetailResponse> B;
    public final androidx.lifecycle.e0<String> B0;
    public final wo.f<MRError> C;
    public final xo.s<Boolean> C0;
    public final wo.f<wn.v> D;
    public final xo.g0<Boolean> D0;
    public final wo.f<MRError> E;
    public xo.r<wn.v> E0;
    public final wo.f<wn.v> F;
    public final xo.w<wn.v> F0;
    public final wo.f<MRError> G;
    public final androidx.lifecycle.e0<List<jf.u>> G0;
    public final wo.f<wn.v> H;
    public final LiveData<List<jf.u>> H0;
    public final wo.f<MRError> I;
    public final androidx.lifecycle.e0<String> I0;
    public final wo.f<MRError> J;
    public final LiveData<String> J0;
    public final nd.s0<wn.k<Boolean, Boolean>> K;
    public final androidx.lifecycle.e0<Map<Integer, String>> K0;
    public final nd.s0<EventFeverState> L;
    public final LiveData<Map<Integer, String>> L0;
    public final androidx.lifecycle.e0<wn.k<List<ud.n0>, Boolean>> M;
    public final xo.s<GiftRankingChangedBcsvrResponse> M0;
    public final LiveData<wn.k<List<ud.n0>, Boolean>> N;
    public final xo.s<GiftRankingChangedBcsvrResponse> N0;
    public final androidx.lifecycle.e0<FeverValue> O;
    public final xo.s<List<String>> O0;
    public final LiveData<FeverValue> P;
    public final xo.g0<List<String>> P0;
    public final androidx.lifecycle.e0<Integer> Q;
    public final xo.r<MRError> Q0;
    public final LiveData<Integer> R;
    public final xo.w<MRError> R0;
    public final nd.s0<wn.k<GiftGachaOpenResponse, GiftGachaStockType>> S;
    public final xo.s<Boolean> S0;
    public final androidx.lifecycle.e0<List<d4>> T;
    public final xo.g0<Boolean> T0;
    public final LiveData<List<d4>> U;
    public final xo.r<String> U0;
    public final androidx.lifecycle.e0<Boolean> V;
    public final xo.w<String> V0;
    public final LiveData<Boolean> W;
    public final androidx.lifecycle.e0<Boolean> W0;
    public final androidx.lifecycle.e0<List<LiveViewingUser>> X;
    public final LiveData<Boolean> X0;
    public final LiveData<List<LiveViewingUser>> Y;
    public final xo.r<MutualGiftReceiveRewardResponse> Y0;
    public final wo.f<wn.k<String, Integer>> Z;
    public final xo.w<MutualGiftReceiveRewardResponse> Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final wo.f<wn.k<String, MRError>> f42444a0;

    /* renamed from: a1  reason: collision with root package name */
    public final xo.r<wn.v> f42445a1;

    /* renamed from: b0  reason: collision with root package name */
    public final wo.f<ConnectedStreamingCollabLivesResponse> f42446b0;

    /* renamed from: b1  reason: collision with root package name */
    public final xo.w<wn.v> f42447b1;

    /* renamed from: c0  reason: collision with root package name */
    public final nd.s0<Map<String, Integer>> f42448c0;

    /* renamed from: c1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42449c1;

    /* renamed from: d0  reason: collision with root package name */
    public final wo.f<wn.v> f42450d0;

    /* renamed from: d1  reason: collision with root package name */
    public androidx.lifecycle.e0<Boolean> f42451d1;

    /* renamed from: e0  reason: collision with root package name */
    public final wo.f<MRError> f42452e0;

    /* renamed from: e1  reason: collision with root package name */
    public final xo.r<wn.v> f42453e1;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f42454f0;

    /* renamed from: f1  reason: collision with root package name */
    public final xo.w<wn.v> f42455f1;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42456g0;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Boolean> f42457h0;

    /* renamed from: i0  reason: collision with root package name */
    public final wo.f<MRError> f42458i0;

    /* renamed from: j0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42459j0;

    /* renamed from: k0  reason: collision with root package name */
    public final LiveData<Boolean> f42460k0;

    /* renamed from: l0  reason: collision with root package name */
    public final wo.f<wn.v> f42461l0;

    /* renamed from: m0  reason: collision with root package name */
    public final wo.f<String> f42462m0;

    /* renamed from: n0  reason: collision with root package name */
    public final nd.s0<String> f42463n0;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42464o0;

    /* renamed from: p0  reason: collision with root package name */
    public final LiveData<Boolean> f42465p0;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.lifecycle.e0<wn.k<List<StunServer>, List<TurnServer>>> f42466q0;

    /* renamed from: r0  reason: collision with root package name */
    public final LiveData<wn.k<List<StunServer>, List<TurnServer>>> f42467r0;

    /* renamed from: s0  reason: collision with root package name */
    public final xo.r<AcceptedMatchedCollabResponse> f42468s0;

    /* renamed from: t0  reason: collision with root package name */
    public final xo.w<AcceptedMatchedCollabResponse> f42469t0;

    /* renamed from: u0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42470u0;

    /* renamed from: v0  reason: collision with root package name */
    public final LiveData<Boolean> f42471v0;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f42472w;

    /* renamed from: w0  reason: collision with root package name */
    public final androidx.lifecycle.e0<jf.i> f42473w0;

    /* renamed from: x  reason: collision with root package name */
    public final hf.s f42474x;

    /* renamed from: x0  reason: collision with root package name */
    public final LiveData<jf.i> f42475x0;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.j f42476y;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f42477y0;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<AppUserDetailResponse> f42478z;

    /* renamed from: z0  reason: collision with root package name */
    public final LiveData<String> f42479z0;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(q8.a aVar, hf.s sVar) {
            jo.p.h(aVar, "dispatcher");
            jo.p.h(sVar, "getCurrentTimeMillis");
            c cVar = c.f42443i1;
            if (cVar != null) {
                cVar.L();
            }
            c cVar2 = new c(aVar, sVar, null);
            c.f42443i1 = cVar2;
            return cVar2;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$35", f = "CastServiceStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42480w;

        public a0(ao.d<? super a0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42480w == 0) {
                wn.m.b(obj);
                c.this.C0.setValue(co.b.a(true));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((ud.n0) t11).a()), Integer.valueOf(((ud.n0) t10).a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$36", f = "CastServiceStore.kt", l = {670}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42482w;

        public b0(ao.d<? super b0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42482w;
            if (i10 == 0) {
                wn.m.b(obj);
                c.this.C0.setValue(co.b.a(false));
                xo.r rVar = c.this.E0;
                wn.v vVar = wn.v.f59242a;
                this.f42482w = 1;
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

    /* renamed from: nf.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0630c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((ud.n0) t11).a()), Integer.valueOf(((ud.n0) t10).a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$37", f = "CastServiceStore.kt", l = {703}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42484w;

        public c0(ao.d<? super c0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42484w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = c.this.M0;
                this.f42484w = 1;
                if (sVar.emit(null, this) == c10) {
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

    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((ud.n0) t11).a()), Integer.valueOf(((ud.n0) t10).a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$38", f = "CastServiceStore.kt", l = {711}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42486w;

        public d0(ao.d<? super d0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42486w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = c.this.O0;
                List k10 = xn.s.k();
                this.f42486w = 1;
                if (sVar.emit(k10, this) == c10) {
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

    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((ud.n0) t11).a()), Integer.valueOf(((ud.n0) t10).a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$3", f = "CastServiceStore.kt", l = {281}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42488w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.b f42490y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(c.b bVar, ao.d<? super e0> dVar) {
            super(2, dVar);
            this.f42490y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(this.f42490y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42488w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.B;
                AppUserDetailResponse a10 = this.f42490y.a();
                this.f42488w = 1;
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

    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((ud.n0) t11).a()), Integer.valueOf(((ud.n0) t10).a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$40", f = "CastServiceStore.kt", l = {744, 745, 746, 747, 748}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42491w;

        public f0(ao.d<? super f0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f42491w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                wn.m.b(r10)
                goto L95
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                wn.m.b(r10)
                goto L82
            L28:
                wn.m.b(r10)
                goto L71
            L2c:
                wn.m.b(r10)
                goto L5e
            L30:
                wn.m.b(r10)
                goto L47
            L34:
                wn.m.b(r10)
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.z(r10)
                r1 = 0
                r9.f42491w = r6
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L47
                return r0
            L47:
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.l(r10)
                com.dena.mirrorman.net.bcsvr.response.EventFeverState r1 = new com.dena.mirrorman.net.bcsvr.response.EventFeverState
                r6 = 0
                r7 = 0
                r1.<init>(r6, r7)
                r9.f42491w = r5
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L5e
                return r0
            L5e:
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.c(r10)
                java.util.Map r1 = xn.n0.e()
                r9.f42491w = r4
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L71
                return r0
            L71:
                nf.c r10 = nf.c.this
                wo.f r10 = nf.c.j(r10)
                wn.v r1 = wn.v.f59242a
                r9.f42491w = r3
                java.lang.Object r10 = r10.r(r1, r9)
                if (r10 != r0) goto L82
                return r0
            L82:
                nf.c r10 = nf.c.this
                xo.s r10 = nf.c.t(r10)
                java.util.List r1 = xn.s.k()
                r9.f42491w = r2
                java.lang.Object r10 = r10.emit(r1, r9)
                if (r10 != r0) goto L95
                return r0
            L95:
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.c.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$10", f = "CastServiceStore.kt", l = {334}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42493w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42493w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.H;
                wn.v vVar = wn.v.f59242a;
                this.f42493w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$41", f = "CastServiceStore.kt", l = {768, 769, 770, 771, 772}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42495w;

        public g0(ao.d<? super g0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f42495w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                wn.m.b(r10)
                goto L95
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                wn.m.b(r10)
                goto L82
            L28:
                wn.m.b(r10)
                goto L71
            L2c:
                wn.m.b(r10)
                goto L5e
            L30:
                wn.m.b(r10)
                goto L47
            L34:
                wn.m.b(r10)
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.z(r10)
                r1 = 0
                r9.f42495w = r6
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L47
                return r0
            L47:
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.l(r10)
                com.dena.mirrorman.net.bcsvr.response.EventFeverState r1 = new com.dena.mirrorman.net.bcsvr.response.EventFeverState
                r6 = 0
                r7 = 0
                r1.<init>(r6, r7)
                r9.f42495w = r5
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L5e
                return r0
            L5e:
                nf.c r10 = nf.c.this
                nd.s0 r10 = nf.c.c(r10)
                java.util.Map r1 = xn.n0.e()
                r9.f42495w = r4
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L71
                return r0
            L71:
                nf.c r10 = nf.c.this
                wo.f r10 = nf.c.j(r10)
                wn.v r1 = wn.v.f59242a
                r9.f42495w = r3
                java.lang.Object r10 = r10.r(r1, r9)
                if (r10 != r0) goto L82
                return r0
            L82:
                nf.c r10 = nf.c.this
                xo.s r10 = nf.c.t(r10)
                java.util.List r1 = xn.s.k()
                r9.f42495w = r2
                java.lang.Object r10 = r10.emit(r1, r9)
                if (r10 != r0) goto L95
                return r0
            L95:
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.c.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$11", f = "CastServiceStore.kt", l = {341}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42497w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.e f42499y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c.e eVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f42499y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f42499y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42497w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.I;
                MRError a10 = this.f42499y.a();
                this.f42497w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$42$1", f = "CastServiceStore.kt", l = {786}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42500w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GiftRankingBcsvrResponse f42502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(GiftRankingBcsvrResponse giftRankingBcsvrResponse, ao.d<? super h0> dVar) {
            super(2, dVar);
            this.f42502y = giftRankingBcsvrResponse;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(this.f42502y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42500w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = c.this.O0;
                List o02 = xn.a0.o0((Collection) c.this.O0.getValue(), this.f42502y.getAchievedRewardsIcon());
                this.f42500w = 1;
                if (sVar.emit(o02, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$12", f = "CastServiceStore.kt", l = {348}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42503w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.t f42505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c.t tVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f42505y = tVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f42505y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42503w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.L;
                EventFeverState a10 = this.f42505y.a();
                this.f42503w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$46", f = "CastServiceStore.kt", l = {864}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42506w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.x f42508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(c.x xVar, ao.d<? super i0> dVar) {
            super(2, dVar);
            this.f42508y = xVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i0(this.f42508y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42506w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.Y0;
                MutualGiftReceiveRewardResponse b10 = this.f42508y.b();
                this.f42506w = 1;
                if (rVar.emit(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$13", f = "CastServiceStore.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42509w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.p0 f42511y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c.p0 p0Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f42511y = p0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f42511y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42509w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.K;
                wn.k kVar = new wn.k(co.b.a(this.f42511y.a()), co.b.a(this.f42511y.b()));
                this.f42509w = 1;
                if (s0Var.d(kVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$48", f = "CastServiceStore.kt", l = {882}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42512w;

        public j0(ao.d<? super j0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42512w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.f42445a1;
                wn.v vVar = wn.v.f59242a;
                this.f42512w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$19", f = "CastServiceStore.kt", l = {434}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42514w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.w f42516y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c.w wVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f42516y = wVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f42516y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42514w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.S;
                wn.k a10 = wn.q.a(this.f42516y.b(), this.f42516y.a());
                this.f42514w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$49", f = "CastServiceStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42517w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.u f42519y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(c.u uVar, ao.d<? super k0> dVar) {
            super(2, dVar);
            this.f42519y = uVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k0(this.f42519y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42517w == 0) {
                wn.m.b(obj);
                c.this.f42449c1.p(co.b.a(!jo.p.c(this.f42519y.a().getCounts().getLiveGames(), "0")));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$1", f = "CastServiceStore.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42520w;

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42520w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42450d0;
                wn.v vVar = wn.v.f59242a;
                this.f42520w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$4", f = "CastServiceStore.kt", l = {288}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42522w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.a f42524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(c.a aVar, ao.d<? super l0> dVar) {
            super(2, dVar);
            this.f42524y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l0(this.f42524y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42522w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.C;
                MRError a10 = this.f42524y.a();
                this.f42522w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$20", f = "CastServiceStore.kt", l = {448}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42525w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.k0 f42527y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(c.k0 k0Var, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f42527y = k0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f42527y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42525w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42462m0;
                String a10 = this.f42527y.a();
                this.f42525w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$5", f = "CastServiceStore.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42528w;

        public m0(ao.d<? super m0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42528w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.D;
                wn.v vVar = wn.v.f59242a;
                this.f42528w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$21", f = "CastServiceStore.kt", l = {497}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42530w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.s f42532y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(c.s sVar, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f42532y = sVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f42532y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42530w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42446b0;
                ConnectedStreamingCollabLivesResponse a10 = this.f42532y.a();
                this.f42530w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$6", f = "CastServiceStore.kt", l = {303}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class n0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42533w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.a0 f42535y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(c.a0 a0Var, ao.d<? super n0> dVar) {
            super(2, dVar);
            this.f42535y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n0(this.f42535y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42533w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.E;
                MRError a10 = this.f42535y.a();
                this.f42533w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$22", f = "CastServiceStore.kt", l = {517}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42536w;

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42536w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.f42463n0;
                this.f42536w = 1;
                if (s0Var.d(null, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$7", f = "CastServiceStore.kt", l = {312}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class o0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42538w;

        public o0(ao.d<? super o0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42538w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.F;
                wn.v vVar = wn.v.f59242a;
                this.f42538w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$23", f = "CastServiceStore.kt", l = {524}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42540w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.i f42542y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c.i iVar, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f42542y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(this.f42542y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42540w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42444a0;
                wn.k a10 = wn.q.a(this.f42542y.a(), this.f42542y.b());
                this.f42540w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$8", f = "CastServiceStore.kt", l = {319}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class p0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42543w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.g f42545y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(c.g gVar, ao.d<? super p0> dVar) {
            super(2, dVar);
            this.f42545y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p0(this.f42545y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42543w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.G;
                MRError a10 = this.f42545y.a();
                this.f42543w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$24", f = "CastServiceStore.kt", l = {550}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42546w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.C0715g f42548y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(g.C0715g c0715g, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f42548y = c0715g;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f42548y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42546w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42458i0;
                MRError a10 = this.f42548y.a();
                this.f42546w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$9", f = "CastServiceStore.kt", l = {326}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class q0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42549w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.d f42551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(c.d dVar, ao.d<? super q0> dVar2) {
            super(2, dVar2);
            this.f42551y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q0(this.f42551y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42549w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.J;
                MRError a10 = this.f42551y.a();
                this.f42549w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$25", f = "CastServiceStore.kt", l = {558}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42552w;

        public r(ao.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42552w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42461l0;
                wn.v vVar = wn.v.f59242a;
                this.f42552w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$onEvent$2$1", f = "CastServiceStore.kt", l = {479}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class r0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42554w;

        public r0(ao.d<? super r0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42554w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.f42463n0;
                this.f42554w = 1;
                if (s0Var.d(null, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$26", f = "CastServiceStore.kt", l = {564}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42556w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g.n f42558y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(g.n nVar, ao.d<? super s> dVar) {
            super(2, dVar);
            this.f42558y = nVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(this.f42558y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42556w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = c.this.f42463n0;
                String a10 = this.f42558y.a();
                this.f42556w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$onEvent$4", f = "CastServiceStore.kt", l = {489, 490}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42559w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.q0 f42561y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(c.q0 q0Var, ao.d<? super s0> dVar) {
            super(2, dVar);
            this.f42561y = q0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s0(this.f42561y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42559w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.Z;
                wn.k a10 = wn.q.a(this.f42561y.b(), co.b.d(this.f42561y.a()));
                this.f42559w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            nd.s0 s0Var = c.this.f42448c0;
            jo.h0 h0Var = new jo.h0(2);
            Object[] array = xn.p0.q(c.this.P()).toArray(new wn.k[0]);
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            h0Var.b(array);
            h0Var.a(wn.q.a(this.f42561y.b(), co.b.d(this.f42561y.a())));
            Map h10 = xn.n0.h((wn.k[]) h0Var.d(new wn.k[h0Var.c()]));
            this.f42559w = 2;
            if (s0Var.d(h10, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$27", f = "CastServiceStore.kt", l = {571}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42562w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i.a f42564y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(i.a aVar, ao.d<? super t> dVar) {
            super(2, dVar);
            this.f42564y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(this.f42564y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42562w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.f42468s0;
                AcceptedMatchedCollabResponse a10 = this.f42564y.a();
                this.f42562w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$29", f = "CastServiceStore.kt", l = {581}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42565w;

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42565w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.f42453e1;
                wn.v vVar = wn.v.f59242a;
                this.f42565w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$2", f = "CastServiceStore.kt", l = {268}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42567w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.o f42569y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(c.o oVar, ao.d<? super v> dVar) {
            super(2, dVar);
            this.f42569y = oVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(this.f42569y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42567w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = c.this.f42452e0;
                MRError a10 = this.f42569y.a();
                this.f42567w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$30", f = "CastServiceStore.kt", l = {588}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42570w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.l f42572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(c.l lVar, ao.d<? super w> dVar) {
            super(2, dVar);
            this.f42572y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(this.f42572y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42570w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.Q0;
                MRError a10 = this.f42572y.a();
                this.f42570w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$32", f = "CastServiceStore.kt", l = {613}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42573w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.n f42575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(c.n nVar, ao.d<? super x> dVar) {
            super(2, dVar);
            this.f42575y = nVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x(this.f42575y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42573w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = c.this.M0;
                GiftRankingChangedBcsvrResponse a10 = this.f42575y.a();
                this.f42573w = 1;
                if (sVar.emit(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$33", f = "CastServiceStore.kt", l = {636}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42576w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.v0 f42578y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(l.v0 v0Var, ao.d<? super y> dVar) {
            super(2, dVar);
            this.f42578y = v0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y(this.f42578y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42576w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = c.this.U0;
                String matchedLiveId = this.f42578y.b().getMatchedLiveId();
                this.f42576w = 1;
                if (rVar.emit(matchedLiveId, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.CastServiceStore$on$34", f = "CastServiceStore.kt", l = {653}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42579w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.t0 f42581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(c.t0 t0Var, ao.d<? super z> dVar) {
            super(2, dVar);
            this.f42581y = t0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z(this.f42581y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42579w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = c.this.S0;
                Boolean a10 = co.b.a(this.f42581y.a());
                this.f42579w = 1;
                if (sVar.emit(a10, this) == c10) {
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

    public c(q8.a aVar, hf.s sVar) {
        this.f42472w = aVar;
        this.f42474x = sVar;
        this.f42476y = new da.j();
        aVar.b(this);
        androidx.lifecycle.e0<AppUserDetailResponse> e0Var = new androidx.lifecycle.e0<>(null);
        this.f42478z = e0Var;
        this.A = e0Var;
        this.B = wo.g.a(-2);
        this.C = wo.g.a(-2);
        this.D = wo.g.a(-2);
        this.E = wo.g.a(-2);
        this.F = wo.g.a(-2);
        this.G = wo.g.a(-2);
        this.H = wo.g.a(-2);
        this.I = wo.g.a(-2);
        this.J = wo.g.a(-2);
        this.K = new nd.s0<>();
        this.L = new nd.s0<>();
        androidx.lifecycle.e0<wn.k<List<ud.n0>, Boolean>> e0Var2 = new androidx.lifecycle.e0<>(null);
        this.M = e0Var2;
        this.N = e0Var2;
        androidx.lifecycle.e0<FeverValue> e0Var3 = new androidx.lifecycle.e0<>();
        this.O = e0Var3;
        this.P = e0Var3;
        androidx.lifecycle.e0<Integer> e0Var4 = new androidx.lifecycle.e0<>(0);
        this.Q = e0Var4;
        this.R = e0Var4;
        this.S = new nd.s0<>();
        androidx.lifecycle.e0<List<d4>> e0Var5 = new androidx.lifecycle.e0<>(xn.s.k());
        this.T = e0Var5;
        this.U = e0Var5;
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var6 = new androidx.lifecycle.e0<>(bool);
        this.V = e0Var6;
        this.W = e0Var6;
        androidx.lifecycle.e0<List<LiveViewingUser>> e0Var7 = new androidx.lifecycle.e0<>(xn.s.k());
        this.X = e0Var7;
        this.Y = e0Var7;
        this.Z = wo.g.a(-2);
        this.f42444a0 = wo.g.a(-2);
        this.f42446b0 = wo.g.a(-2);
        this.f42448c0 = new nd.s0<>();
        this.f42450d0 = wo.g.a(-2);
        this.f42452e0 = wo.g.a(-2);
        androidx.lifecycle.e0<Boolean> e0Var8 = new androidx.lifecycle.e0<>(bool);
        this.f42456g0 = e0Var8;
        this.f42457h0 = e0Var8;
        this.f42458i0 = wo.g.a(-2);
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.f42459j0 = e0Var9;
        this.f42460k0 = e0Var9;
        this.f42461l0 = wo.g.a(-2);
        this.f42462m0 = wo.g.a(-2);
        this.f42463n0 = new nd.s0<>();
        androidx.lifecycle.e0<Boolean> e0Var10 = new androidx.lifecycle.e0<>(bool);
        this.f42464o0 = e0Var10;
        this.f42465p0 = e0Var10;
        androidx.lifecycle.e0<wn.k<List<StunServer>, List<TurnServer>>> e0Var11 = new androidx.lifecycle.e0<>(wn.q.a(null, null));
        this.f42466q0 = e0Var11;
        this.f42467r0 = e0Var11;
        xo.r<AcceptedMatchedCollabResponse> b10 = xo.y.b(0, 0, null, 7, null);
        this.f42468s0 = b10;
        this.f42469t0 = b10;
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>();
        this.f42470u0 = e0Var12;
        this.f42471v0 = e0Var12;
        androidx.lifecycle.e0<jf.i> e0Var13 = new androidx.lifecycle.e0<>(jf.i.NONE);
        this.f42473w0 = e0Var13;
        this.f42475x0 = e0Var13;
        androidx.lifecycle.e0<String> e0Var14 = new androidx.lifecycle.e0<>("");
        this.f42477y0 = e0Var14;
        this.f42479z0 = e0Var14;
        androidx.lifecycle.e0<String> e0Var15 = new androidx.lifecycle.e0<>("");
        this.A0 = e0Var15;
        this.B0 = e0Var15;
        xo.s<Boolean> a10 = xo.i0.a(bool);
        this.C0 = a10;
        this.D0 = a10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.E0 = b11;
        this.F0 = b11;
        androidx.lifecycle.e0<List<jf.u>> e0Var16 = new androidx.lifecycle.e0<>(xn.s.k());
        this.G0 = e0Var16;
        this.H0 = e0Var16;
        androidx.lifecycle.e0<String> e0Var17 = new androidx.lifecycle.e0<>("");
        this.I0 = e0Var17;
        this.J0 = e0Var17;
        androidx.lifecycle.e0<Map<Integer, String>> e0Var18 = new androidx.lifecycle.e0<>();
        this.K0 = e0Var18;
        this.L0 = e0Var18;
        xo.s<GiftRankingChangedBcsvrResponse> a11 = xo.i0.a(null);
        this.M0 = a11;
        this.N0 = a11;
        xo.s<List<String>> a12 = xo.i0.a(xn.s.k());
        this.O0 = a12;
        this.P0 = a12;
        xo.r<MRError> b12 = xo.y.b(0, 0, null, 7, null);
        this.Q0 = b12;
        this.R0 = b12;
        xo.s<Boolean> a13 = xo.i0.a(bool);
        this.S0 = a13;
        this.T0 = a13;
        xo.r<String> b13 = xo.y.b(0, 0, null, 7, null);
        this.U0 = b13;
        this.V0 = b13;
        androidx.lifecycle.e0<Boolean> e0Var19 = new androidx.lifecycle.e0<>(bool);
        this.W0 = e0Var19;
        this.X0 = e0Var19;
        xo.r<MutualGiftReceiveRewardResponse> b14 = xo.y.b(0, 0, null, 7, null);
        this.Y0 = b14;
        this.Z0 = b14;
        xo.r<wn.v> b15 = xo.y.b(0, 0, null, 7, null);
        this.f42445a1 = b15;
        this.f42447b1 = b15;
        androidx.lifecycle.e0<Boolean> e0Var20 = new androidx.lifecycle.e0<>(bool);
        this.f42449c1 = e0Var20;
        this.f42451d1 = e0Var20;
        xo.r<wn.v> b16 = xo.y.b(0, 0, null, 7, null);
        this.f42453e1 = b16;
        this.f42455f1 = b16;
    }

    public /* synthetic */ c(q8.a aVar, hf.s sVar, jo.h hVar) {
        this(aVar, sVar);
    }

    public final xo.w<wn.v> A0() {
        return this.f42447b1;
    }

    public final LiveData<wn.k<List<StunServer>, List<TurnServer>>> B0() {
        return this.f42467r0;
    }

    public final wo.x<wn.v> C0() {
        return this.H.g();
    }

    public final wo.x<wn.v> D0() {
        return this.F.g();
    }

    public final wo.x<AppUserDetailResponse> E0() {
        return this.B.g();
    }

    public final wo.x<wn.v> F0() {
        return this.D.g();
    }

    public final wo.x<wn.k<String, Integer>> G0() {
        return this.Z.g();
    }

    public final LiveData<Boolean> H0() {
        return this.f42471v0;
    }

    public final LiveData<Boolean> I0() {
        return this.W;
    }

    public final LiveData<Boolean> J0() {
        return this.f42460k0;
    }

    public final boolean K0() {
        List<LiveViewingUser> Q = Q();
        if ((Q instanceof Collection) && Q.isEmpty()) {
            return false;
        }
        for (LiveViewingUser liveViewingUser : Q) {
            if (jo.p.c(liveViewingUser.isStartedCollab(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final void L() {
        this.f42472w.c(this);
        uo.r0.d(this, null, 1, null);
    }

    public final LiveData<Boolean> L0() {
        return this.f42465p0;
    }

    public final xo.w<AcceptedMatchedCollabResponse> M() {
        return this.f42469t0;
    }

    public final wo.x<wn.k<Boolean, Boolean>> M0() {
        return this.K.c();
    }

    public final LiveData<AppUserDetailResponse> N() {
        return this.A;
    }

    public final LiveData<Boolean> N0() {
        return this.f42457h0;
    }

    public final LiveData<jf.i> O() {
        return this.f42475x0;
    }

    public final xo.g0<Boolean> O0() {
        return this.D0;
    }

    public final Map<String, Integer> P() {
        Map<String, Integer> b10 = this.f42448c0.b();
        return b10 == null ? xn.n0.e() : b10;
    }

    public final boolean P0() {
        return this.f42454f0;
    }

    public final List<LiveViewingUser> Q() {
        List<LiveViewingUser> f10 = this.Y.f();
        return f10 == null ? xn.s.k() : f10;
    }

    public final xo.g0<Boolean> Q0() {
        return this.T0;
    }

    public final LiveData<List<LiveViewingUser>> R() {
        return this.Y;
    }

    public final LiveData<List<d4>> S() {
        return this.U;
    }

    public final wo.x<ConnectedStreamingCollabLivesResponse> T() {
        return this.f42446b0.g();
    }

    public final int U() {
        Integer f10 = this.R.f();
        if (f10 == null) {
            f10 = 0;
        }
        return f10.intValue();
    }

    public final LiveData<Integer> V() {
        return this.R;
    }

    public final wo.x<EventFeverState> W() {
        return this.L.c();
    }

    public final xo.c<MRError> X() {
        return xo.e.a(this.f42458i0);
    }

    public final wo.x<MRError> Y() {
        return this.J.g();
    }

    public final wo.x<MRError> Z() {
        return this.I.g();
    }

    public final wo.x<MRError> a0() {
        return this.G.g();
    }

    public final wo.x<MRError> b0() {
        return this.C.g();
    }

    public final wo.x<MRError> c0() {
        return this.E.g();
    }

    public final xo.c<wn.k<String, MRError>> d0() {
        return xo.e.a(this.f42444a0);
    }

    public final xo.w<MRError> e0() {
        return this.R0;
    }

    public final xo.w<wn.v> f0() {
        return this.f42455f1;
    }

    public final LiveData<FeverValue> g0() {
        return this.P;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42476y.getCoroutineContext();
    }

    public final wn.k<GiftGachaOpenResponse, GiftGachaStockType> h0() {
        return this.S.b();
    }

    public final wo.x<wn.k<GiftGachaOpenResponse, GiftGachaStockType>> i0() {
        return this.S.c();
    }

    public final LiveData<wn.k<List<ud.n0>, Boolean>> j0() {
        return this.N;
    }

    public final xo.g0<List<String>> k0() {
        return this.P0;
    }

    public final LiveData<List<jf.u>> l0() {
        return this.H0;
    }

    public final androidx.lifecycle.e0<Boolean> m0() {
        return this.f42451d1;
    }

    public final LiveData<Map<Integer, String>> n0() {
        return this.L0;
    }

    public final xo.s<GiftRankingChangedBcsvrResponse> o0() {
        return this.N0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.r rVar) {
        jo.p.h(rVar, "event");
        this.f42454f0 = rVar.a().isStreamingCollabEnabled();
        this.f42464o0.p(Boolean.valueOf(rVar.a().isMatchingCollabEnabled()));
        this.f42466q0.p(wn.q.a(rVar.a().getStunServers(), rVar.a().getTurnServers()));
        this.f42470u0.p(Boolean.valueOf(rVar.a().getUserMatchingCollabEnabled()));
        this.G0.p(xn.s.k());
        xo.s<Boolean> sVar = this.C0;
        Boolean bool = Boolean.FALSE;
        sVar.setValue(bool);
        this.W0.p(bool);
        this.f42477y0.p(rVar.a().getMatchingCollabEnabledText());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t.g gVar) {
        jo.p.h(gVar, "event");
        this.V.p(Boolean.TRUE);
    }

    public final LiveData<String> p0() {
        return this.J0;
    }

    public final wo.x<MRError> q0() {
        return this.f42452e0.g();
    }

    public final wo.x<wn.v> r0() {
        return this.f42450d0.g();
    }

    public final androidx.lifecycle.e0<String> s0() {
        return this.B0;
    }

    public final LiveData<String> t0() {
        return this.f42479z0;
    }

    public final xo.w<MutualGiftReceiveRewardResponse> u0() {
        return this.Z0;
    }

    public final wo.x<String> v0() {
        return this.f42463n0.c();
    }

    public final xo.w<wn.v> w0() {
        return this.F0;
    }

    public final xo.c<String> x0() {
        return xo.e.a(this.f42462m0);
    }

    public final LiveData<Boolean> y0() {
        return this.X0;
    }

    public final xo.w<String> z0() {
        return this.V0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t.f fVar) {
        jo.p.h(fVar, "event");
        this.V.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(c.g0 g0Var) {
        Object obj;
        jo.p.h(g0Var, "event");
        Iterator<T> it = Q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((LiveViewingUser) obj).getUserId(), g0Var.a())) {
                break;
            }
        }
        LiveViewingUser liveViewingUser = (LiveViewingUser) obj;
        if (liveViewingUser != null && liveViewingUser.getLiveId() != null && jo.p.c(liveViewingUser.getLiveId(), this.f42463n0.b())) {
            uo.l.d(this, null, null, new r0(null), 3, null);
        }
        androidx.lifecycle.e0<List<LiveViewingUser>> e0Var = this.X;
        List<LiveViewingUser> Q = Q();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : Q) {
            if (!jo.p.c(((LiveViewingUser) obj2).getUserId(), g0Var.a())) {
                arrayList.add(obj2);
            }
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.o oVar) {
        jo.p.h(oVar, "event");
        uo.l.d(this, null, null, new v(oVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.q qVar) {
        jo.p.h(qVar, "event");
        this.f42464o0.p(Boolean.valueOf(qVar.a().isMatchingCollabEnabled()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.b bVar) {
        jo.p.h(bVar, "event");
        this.f42478z.p(bVar.a());
        uo.l.d(this, null, null, new e0(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(c.q0 q0Var) {
        jo.p.h(q0Var, "event");
        uo.l.d(this, null, null, new s0(q0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new l0(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.b0 b0Var) {
        jo.p.h(b0Var, "event");
        this.f42478z.p(b0Var.a());
        uo.l.d(this, null, null, new m0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.a0 a0Var) {
        jo.p.h(a0Var, "event");
        uo.l.d(this, null, null, new n0(a0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.h hVar) {
        jo.p.h(hVar, "event");
        this.f42478z.p(null);
        uo.l.d(this, null, null, new o0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new p0(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new q0(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new h(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.t tVar) {
        jo.p.h(tVar, "event");
        uo.l.d(this, null, null, new i(tVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.r0 r0Var) {
        jo.p.h(r0Var, "event");
        this.O.p(r0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.p0 p0Var) {
        jo.p.h(p0Var, "event");
        uo.l.d(this, null, null, new j(p0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.k kVar) {
        List<ud.n0> k10;
        ud.m0 m0Var;
        Object obj;
        boolean z10;
        boolean z11;
        jo.p.h(kVar, "event");
        wn.k<List<ud.n0>, Boolean> f10 = this.M.f();
        if (f10 == null || (k10 = f10.c()) == null) {
            k10 = xn.s.k();
        }
        List D0 = xn.a0.D0(k10);
        for (SimpleGiftGachaStock simpleGiftGachaStock : kVar.a()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : k10) {
                if (obj2 instanceof ud.m0) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                m0Var = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ud.m0 m0Var2 = (ud.m0) obj;
                if (jo.p.c(m0Var2.h(), simpleGiftGachaStock.getSenderId()) && m0Var2.e() == simpleGiftGachaStock.getType() && m0Var2.d() == simpleGiftGachaStock.getGiftEventId() && m0Var2.b() == simpleGiftGachaStock.getCollabUserId()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            ud.m0 m0Var3 = (ud.m0) obj;
            if (m0Var3 == null) {
                if (simpleGiftGachaStock.getCount() != 0) {
                    D0.add(ud.m0.f55186l.a(simpleGiftGachaStock));
                }
            } else if (simpleGiftGachaStock.getTime() >= m0Var3.a()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : D0) {
                    if (obj3 instanceof ud.m0) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    ud.m0 m0Var4 = (ud.m0) next;
                    if (jo.p.c(m0Var4.h(), simpleGiftGachaStock.getSenderId()) && m0Var4.e() == simpleGiftGachaStock.getType() && m0Var4.d() == simpleGiftGachaStock.getGiftEventId()) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        m0Var = next;
                        break;
                    }
                }
                ud.m0 m0Var5 = m0Var;
                if (m0Var5 != null) {
                    D0.remove(m0Var5);
                }
                if (simpleGiftGachaStock.getCount() != 0) {
                    D0.add(ud.m0.f55186l.a(simpleGiftGachaStock));
                }
            }
        }
        if (D0.size() > 1) {
            xn.w.x(D0, new b());
        }
        this.M.p(wn.q.a(D0, Boolean.FALSE));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.f0 f0Var) {
        List<ud.n0> k10;
        ud.m0 m0Var;
        Object obj;
        boolean z10;
        boolean z11;
        jo.p.h(f0Var, "event");
        wn.k<List<ud.n0>, Boolean> f10 = this.M.f();
        if (f10 == null || (k10 = f10.c()) == null) {
            k10 = xn.s.k();
        }
        List D0 = xn.a0.D0(k10);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : k10) {
            if (obj2 instanceof ud.m0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            m0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ud.m0 m0Var2 = (ud.m0) obj;
            if (jo.p.c(m0Var2.h(), f0Var.a().getSenderId()) && m0Var2.e() == f0Var.a().getType() && m0Var2.d() == f0Var.a().getGiftEventId() && m0Var2.b() == f0Var.a().getCollabUserId()) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        ud.m0 m0Var3 = (ud.m0) obj;
        if (m0Var3 == null) {
            if (f0Var.a().getCount() != 0) {
                D0.add(ud.m0.f55186l.a(f0Var.a()));
            }
        } else if (f0Var.a().getTime() >= m0Var3.a()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : D0) {
                if (obj3 instanceof ud.m0) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ud.m0 m0Var4 = (ud.m0) next;
                if (jo.p.c(m0Var4.h(), f0Var.a().getSenderId()) && m0Var4.e() == f0Var.a().getType() && m0Var4.d() == f0Var.a().getGiftEventId()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    m0Var = next;
                    break;
                }
            }
            ud.m0 m0Var5 = m0Var;
            if (m0Var5 != null) {
                D0.remove(m0Var5);
            }
            if (f0Var.a().getCount() != 0) {
                D0.add(ud.m0.f55186l.a(f0Var.a()));
            }
        }
        if (D0.size() > 1) {
            xn.w.x(D0, new C0630c());
        }
        this.M.p(wn.q.a(D0, Boolean.valueOf(f0Var.a().getCount() != 0)));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.w wVar) {
        jo.p.h(wVar, "event");
        uo.l.d(this, null, null, new k(wVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.j0 j0Var) {
        jo.p.h(j0Var, "event");
        if (U() != 0) {
            return;
        }
        this.Q.p(Integer.valueOf(j0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.k0 k0Var) {
        jo.p.h(k0Var, "event");
        uo.l.d(this, null, null, new m(k0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.i0 i0Var) {
        jo.p.h(i0Var, "event");
        this.T.p(i0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.d0 d0Var) {
        jo.p.h(d0Var, "event");
        androidx.lifecycle.e0<List<d4>> e0Var = this.T;
        List d10 = xn.r.d(d0Var.a());
        List<d4> f10 = this.T.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(d10, f10));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.s sVar) {
        jo.p.h(sVar, "event");
        uo.l.d(this, null, null, new n(sVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.l0 l0Var) {
        jo.p.h(l0Var, "event");
        this.f42459j0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.h hVar) {
        jo.p.h(hVar, "event");
        this.X.p(hVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.i iVar) {
        jo.p.h(iVar, "event");
        this.X.p(xn.s.k());
        uo.l.d(this, null, null, new o(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new p(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.c cVar) {
        jo.p.h(cVar, "event");
        this.X.p(cVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.p pVar) {
        jo.p.h(pVar, "event");
        this.f42456g0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.f fVar) {
        jo.p.h(fVar, "event");
        this.f42456g0.p(Boolean.FALSE);
        this.X.p(fVar.a());
        this.f42473w0.p(jf.i.NONE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g.C0715g c0715g) {
        jo.p.h(c0715g, "event");
        this.f42456g0.p(Boolean.FALSE);
        uo.l.d(this, null, null, new q(c0715g, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.C0712c c0712c) {
        jo.p.h(c0712c, "event");
        uo.l.d(this, null, null, new r(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final d2 on(g.n nVar) {
        d2 d10;
        jo.p.h(nVar, "event");
        d10 = uo.l.d(this, null, null, new s(nVar, null), 3, null);
        return d10;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.a aVar) {
        jo.p.h(aVar, "event");
        this.f42473w0.p(jf.i.MATCHING);
        uo.l.d(this, null, null, new t(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.m mVar) {
        jo.p.h(mVar, "event");
        androidx.lifecycle.e0<List<jf.u>> e0Var = this.G0;
        List<GiftRanking> rankings = mVar.a().getRankings();
        ArrayList arrayList = new ArrayList(xn.t.u(rankings, 10));
        for (GiftRanking giftRanking : rankings) {
            arrayList.add(jf.u.f38000o.a(giftRanking));
        }
        e0Var.p(arrayList);
        uo.l.d(this, null, null, new u(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new w(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.n nVar) {
        Object obj;
        jf.u a10;
        ArrayList arrayList;
        boolean z10;
        jo.p.h(nVar, "event");
        List<jf.u> f10 = this.H0.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                jf.u uVar = (jf.u) obj;
                if (uVar.e() == nVar.a().getEventId() && uVar.o() == nVar.a().isAppEvent()) {
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
            jf.u uVar2 = (jf.u) obj;
            if (uVar2 != null && uVar2.g() <= nVar.a().getNanoTime()) {
                a10 = uVar2.a((r32 & 1) != 0 ? uVar2.f38001a : 0, (r32 & 2) != 0 ? uVar2.f38002b : nVar.a().getNanoTime(), (r32 & 4) != 0 ? uVar2.f38003c : null, (r32 & 8) != 0 ? uVar2.f38004d : nVar.a().getRankingPoint(), (r32 & 16) != 0 ? uVar2.f38005e : nVar.a().getRank(), (r32 & 32) != 0 ? uVar2.f38006f : nVar.a().getRankText(), (r32 & 64) != 0 ? uVar2.f38007g : null, (r32 & 128) != 0 ? uVar2.f38008h : null, (r32 & 256) != 0 ? uVar2.f38009i : 0, (r32 & 512) != 0 ? uVar2.f38010j : null, (r32 & 1024) != 0 ? uVar2.f38011k : 0, (r32 & 2048) != 0 ? uVar2.f38012l : 0, (r32 & 4096) != 0 ? uVar2.f38013m : false, (r32 & 8192) != 0 ? uVar2.f38014n : false);
                androidx.lifecycle.e0<List<jf.u>> e0Var = this.G0;
                List<jf.u> f11 = e0Var.f();
                if (f11 != null) {
                    arrayList = new ArrayList(xn.t.u(f11, 10));
                    for (jf.u uVar3 : f11) {
                        if (uVar3.e() == uVar2.e() && uVar3.o() == uVar2.o()) {
                            uVar3 = a10;
                        }
                        arrayList.add(uVar3);
                    }
                } else {
                    arrayList = null;
                }
                e0Var.p(arrayList);
                if (!nVar.a().isAppEvent() || uVar2.h() <= nVar.a().getRank()) {
                    return;
                }
                uo.l.d(this, null, null, new x(nVar, null), 3, null);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.c0 c0Var) {
        jo.p.h(c0Var, "event");
        this.f42470u0.p(Boolean.valueOf(c0Var.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.t0 t0Var) {
        jo.p.h(t0Var, "event");
        if (jo.p.c(t0Var.a(), "CastService")) {
            this.f42473w0.p(jf.i.HOST_READY);
            this.A0.p(t0Var.b().getMatchedLiveId());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.v0 v0Var) {
        jo.p.h(v0Var, "event");
        if (jo.p.c(v0Var.a(), "CastService")) {
            this.f42473w0.p(jf.i.HOST_READY);
            this.B0.p(v0Var.b().getMatchedLiveId());
            uo.l.d(this, null, null, new y(v0Var, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.m mVar) {
        jo.p.h(mVar, "event");
        if (jo.p.c(mVar.a(), "CastService") && this.f42473w0.f() != jf.i.HOST_READY) {
            this.f42473w0.p(jf.i.START_READY);
            this.A0.p("");
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.t0 t0Var) {
        jo.p.h(t0Var, "event");
        uo.l.d(this, null, null, new z(t0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.n0 n0Var) {
        jo.p.h(n0Var, "event");
        uo.l.d(this, null, null, new a0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.h0 h0Var) {
        jo.p.h(h0Var, "event");
        uo.l.d(this, null, null, new b0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.C0151l c0151l) {
        jo.p.h(c0151l, "event");
        if (jo.p.c(c0151l.a(), "CastService")) {
            this.f42473w0.p(jf.i.NONE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.e eVar) {
        jo.p.h(eVar, "event");
        this.f42473w0.p(jf.i.NONE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.d dVar) {
        jo.p.h(dVar, "event");
        this.f42473w0.p(jf.i.MATCHING);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.c cVar) {
        jo.p.h(cVar, "event");
        this.f42473w0.p(jf.i.NONE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.z zVar) {
        jo.p.h(zVar, "event");
        uo.l.d(this, null, null, new c0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.y yVar) {
        jo.p.h(yVar, "event");
        uo.l.d(this, null, null, new d0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i.b bVar) {
        jo.p.h(bVar, "event");
        this.f42473w0.p(jf.i.NONE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.C0720s c0720s) {
        ArrayList arrayList;
        jo.p.h(c0720s, "event");
        androidx.lifecycle.e0<List<d4>> e0Var = this.T;
        List<d4> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj : f10) {
                d4 d4Var = (d4) obj;
                if ((d4Var.d() == 88 && jo.p.c(d4Var.e(), c0720s.a())) ? false : true) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.t tVar) {
        jo.p.h(tVar, "event");
        this.f42478z.p(null);
        this.M.p(null);
        this.O.p(null);
        this.f42459j0.p(Boolean.FALSE);
        this.T.p(xn.s.k());
        this.X.p(xn.s.k());
        this.Q.p(0);
        this.f42473w0.p(jf.i.NONE);
        this.A0.p("");
        this.f42477y0.p("");
        uo.l.d(this, null, null, new f0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.e eVar) {
        jo.p.h(eVar, "event");
        this.f42478z.p(null);
        this.M.p(null);
        this.O.p(null);
        this.f42459j0.p(Boolean.FALSE);
        this.T.p(xn.s.k());
        this.X.p(xn.s.k());
        this.Q.p(0);
        this.f42473w0.p(jf.i.NONE);
        this.A0.p("");
        this.f42477y0.p("");
        uo.l.d(this, null, null, new g0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y yVar) {
        jf.u uVar;
        Object obj;
        boolean z10;
        jo.p.h(yVar, "event");
        if (jo.p.c(yVar.b(), "CastService") && !yVar.a().getRankings().isEmpty()) {
            for (GiftRankingBcsvrResponse giftRankingBcsvrResponse : yVar.a().getRankings()) {
                ArrayList arrayList = null;
                if (!giftRankingBcsvrResponse.getAchievedRewardsIcon().isEmpty()) {
                    uo.l.d(this, null, null, new h0(giftRankingBcsvrResponse, null), 3, null);
                }
                if (giftRankingBcsvrResponse.isBannedUser() && giftRankingBcsvrResponse.isSenderRankUp()) {
                    this.I0.p(yVar.a().getLiveSentGiftId());
                } else {
                    List<jf.u> f10 = this.G0.f();
                    if (f10 != null) {
                        jo.p.g(f10, "value");
                        Iterator<T> it = f10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            jf.u uVar2 = (jf.u) obj;
                            if (uVar2.e() == giftRankingBcsvrResponse.getEventId() && uVar2.o() == giftRankingBcsvrResponse.isAppEvent()) {
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
                        uVar = (jf.u) obj;
                    } else {
                        uVar = null;
                    }
                    if ((uVar != null ? uVar.g() : 0L) <= giftRankingBcsvrResponse.getNanoTime()) {
                        jf.u b10 = jf.u.f38000o.b(giftRankingBcsvrResponse);
                        androidx.lifecycle.e0<List<jf.u>> e0Var = this.G0;
                        List<jf.u> f11 = e0Var.f();
                        if (f11 != null) {
                            jo.p.g(f11, "value");
                            arrayList = new ArrayList(xn.t.u(f11, 10));
                            for (jf.u uVar3 : f11) {
                                if (uVar3.e() == giftRankingBcsvrResponse.getEventId() && uVar3.o() == giftRankingBcsvrResponse.isAppEvent()) {
                                    uVar3 = b10;
                                }
                                arrayList.add(uVar3);
                            }
                        }
                        e0Var.p(arrayList);
                        if (yVar.a().getLiveSentGiftId() != null) {
                            if (giftRankingBcsvrResponse.isAppEventRankUp()) {
                                Map<Integer, String> f12 = this.K0.f();
                                if (f12 == null) {
                                    f12 = xn.n0.e();
                                } else {
                                    jo.p.g(f12, "mutableLatestAppEventRan…ftMap.value ?: emptyMap()");
                                }
                                Map<Integer, String> p10 = xn.n0.p(f12);
                                p10.put(Integer.valueOf(giftRankingBcsvrResponse.getEventId()), yVar.a().getLiveSentGiftId());
                                this.K0.p(p10);
                            } else if (giftRankingBcsvrResponse.isStreamerRankUp() || giftRankingBcsvrResponse.isSenderRankUp()) {
                                this.I0.p(yVar.a().getLiveSentGiftId());
                            }
                        }
                    }
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.m0 m0Var) {
        jo.p.h(m0Var, "event");
        this.W0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.y0 y0Var) {
        List<ud.n0> k10;
        Object obj;
        boolean z10;
        jo.p.h(y0Var, "event");
        wn.k<List<ud.n0>, Boolean> f10 = this.M.f();
        if (f10 == null || (k10 = f10.c()) == null) {
            k10 = xn.s.k();
        }
        List D0 = xn.a0.D0(k10);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : k10) {
            if (obj2 instanceof ud.o0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ud.o0 o0Var = (ud.o0) obj;
            if (jo.p.c(o0Var.d(), y0Var.b().getViewer().getUserId()) && o0Var.b() == y0Var.b().getEventId()) {
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
        if (((ud.o0) obj) != null) {
            return;
        }
        D0.add(ud.o0.f55276f.a(y0Var.b()));
        if (D0.size() > 1) {
            xn.w.x(D0, new d());
        }
        this.M.p(wn.q.a(D0, Boolean.TRUE));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.z0 z0Var) {
        List<ud.n0> k10;
        Object obj;
        boolean z10;
        jo.p.h(z0Var, "event");
        wn.k<List<ud.n0>, Boolean> f10 = this.M.f();
        if (f10 == null || (k10 = f10.c()) == null) {
            k10 = xn.s.k();
        }
        List D0 = xn.a0.D0(k10);
        for (MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse : z0Var.b().getReceivableRewards()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : k10) {
                if (obj2 instanceof ud.o0) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ud.o0 o0Var = (ud.o0) obj;
                if (jo.p.c(o0Var.d(), mutualGiftAchievedBcsvrResponse.getViewer().getUserId()) && o0Var.b() == mutualGiftAchievedBcsvrResponse.getEventId()) {
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
            if (((ud.o0) obj) == null) {
                D0.add(ud.o0.f55276f.a(mutualGiftAchievedBcsvrResponse));
            }
        }
        if (D0.size() > 1) {
            xn.w.x(D0, new e());
        }
        this.M.p(wn.q.a(D0, Boolean.FALSE));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.x xVar) {
        List<ud.n0> k10;
        boolean z10;
        jo.p.h(xVar, "event");
        Object obj = null;
        uo.l.d(this, null, null, new i0(xVar, null), 3, null);
        wn.k<List<ud.n0>, Boolean> f10 = this.M.f();
        if (f10 == null || (k10 = f10.c()) == null) {
            k10 = xn.s.k();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : k10) {
            if (obj2 instanceof ud.o0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ud.o0 o0Var = (ud.o0) next;
            if (jo.p.c(o0Var.d(), xVar.a().d()) && o0Var.b() == xVar.a().b()) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        ud.o0 o0Var2 = (ud.o0) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : k10) {
            if (!jo.p.c((ud.n0) obj3, o0Var2)) {
                arrayList2.add(obj3);
            }
        }
        List D0 = xn.a0.D0(arrayList2);
        if (D0.size() > 1) {
            xn.w.x(D0, new f());
        }
        this.M.p(wn.q.a(D0, Boolean.FALSE));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.o0 o0Var) {
        jo.p.h(o0Var, "event");
        uo.l.d(this, null, null, new j0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.u uVar) {
        jo.p.h(uVar, "event");
        uo.l.d(this, null, null, new k0(uVar, null), 3, null);
    }
}
