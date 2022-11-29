package jc;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.RequestPackageUsageStats;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.unity.UnityActionEvent;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import io.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.x;
import lc.o0;
import org.greenrobot.eventbus.ThreadMode;
import pd.f0;
import uo.r0;
import wn.v;
import xb.t;
import xn.s;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class j extends q0 implements uo.q0 {
    public final q8.a A;
    public final r<MRError> A0;
    public final x B;
    public final w<MRError> B0;
    public final kf.m C;
    public final kc.m C0;
    public final /* synthetic */ uo.q0 D;
    public final Anniversary E;
    public final e0<Boolean> F;
    public final LiveData<Boolean> G;
    public final e0<List<AppCampaign>> H;
    public final LiveData<List<AppCampaign>> I;
    public final r<AppCampaign> J;
    public final w<AppCampaign> K;
    public final r<v> L;
    public final w<v> M;
    public List<ThumbnailFrame> N;
    public final r<MRError> O;
    public final w<MRError> P;
    public final r<v> Q;
    public final w<v> R;
    public final e0<ye.c> S;
    public final LiveData<ye.c> T;
    public final r<v> U;
    public final w<v> V;
    public final r<MRError> W;
    public final w<MRError> X;
    public final r<v> Y;
    public final w<v> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final r<MRError> f37525a0;

    /* renamed from: b0  reason: collision with root package name */
    public final w<MRError> f37526b0;

    /* renamed from: c0  reason: collision with root package name */
    public final r<v> f37527c0;

    /* renamed from: d0  reason: collision with root package name */
    public final w<v> f37528d0;

    /* renamed from: e0  reason: collision with root package name */
    public final r<MRError> f37529e0;

    /* renamed from: f0  reason: collision with root package name */
    public final w<MRError> f37530f0;

    /* renamed from: g0  reason: collision with root package name */
    public final r<v> f37531g0;

    /* renamed from: h0  reason: collision with root package name */
    public final w<v> f37532h0;

    /* renamed from: i0  reason: collision with root package name */
    public final r<MRError> f37533i0;

    /* renamed from: j0  reason: collision with root package name */
    public final w<MRError> f37534j0;

    /* renamed from: k0  reason: collision with root package name */
    public final r<RequestPackageUsageStats> f37535k0;

    /* renamed from: l0  reason: collision with root package name */
    public final w<RequestPackageUsageStats> f37536l0;

    /* renamed from: m0  reason: collision with root package name */
    public final lc.n f37537m0;

    /* renamed from: n0  reason: collision with root package name */
    public final e0<EventNoticeResponse> f37538n0;

    /* renamed from: o0  reason: collision with root package name */
    public final LiveData<EventNoticeResponse> f37539o0;

    /* renamed from: p0  reason: collision with root package name */
    public final e0<Boolean> f37540p0;

    /* renamed from: q0  reason: collision with root package name */
    public final LiveData<Boolean> f37541q0;

    /* renamed from: r0  reason: collision with root package name */
    public final e0<Boolean> f37542r0;

    /* renamed from: s0  reason: collision with root package name */
    public final e0<Integer> f37543s0;

    /* renamed from: t0  reason: collision with root package name */
    public final LiveData<Integer> f37544t0;

    /* renamed from: u0  reason: collision with root package name */
    public final e0<List<t>> f37545u0;

    /* renamed from: v0  reason: collision with root package name */
    public final LiveData<List<t>> f37546v0;

    /* renamed from: w0  reason: collision with root package name */
    public final e0<t> f37547w0;

    /* renamed from: x0  reason: collision with root package name */
    public final LiveData<t> f37548x0;

    /* renamed from: y  reason: collision with root package name */
    public final String f37549y;

    /* renamed from: y0  reason: collision with root package name */
    public final r<v> f37550y0;

    /* renamed from: z  reason: collision with root package name */
    public final String f37551z;

    /* renamed from: z0  reason: collision with root package name */
    public final w<v> f37552z0;

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$10", f = "LivePrepareStore.kt", l = {272}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37553w;

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
            int i10 = this.f37553w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.Q;
                v vVar = v.f59242a;
                this.f37553w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$11", f = "LivePrepareStore.kt", l = {282, 284}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37555w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AppCampaign f37556x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f37557y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppCampaign appCampaign, j jVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f37556x = appCampaign;
            this.f37557y = jVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f37556x, this.f37557y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37555w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f37556x != null) {
                    r rVar = this.f37557y.J;
                    AppCampaign appCampaign = this.f37556x;
                    this.f37555w = 1;
                    if (rVar.emit(appCampaign, this) == c10) {
                        return c10;
                    }
                } else {
                    r rVar2 = this.f37557y.L;
                    v vVar = v.f59242a;
                    this.f37555w = 2;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$12", f = "LivePrepareStore.kt", l = {300, 302}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37558w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AppCampaign f37559x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f37560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AppCampaign appCampaign, j jVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f37559x = appCampaign;
            this.f37560y = jVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f37559x, this.f37560y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37558w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f37559x != null) {
                    r rVar = this.f37560y.J;
                    AppCampaign appCampaign = this.f37559x;
                    this.f37558w = 1;
                    if (rVar.emit(appCampaign, this) == c10) {
                        return c10;
                    }
                } else {
                    r rVar2 = this.f37560y.L;
                    v vVar = v.f59242a;
                    this.f37558w = 2;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$13", f = "LivePrepareStore.kt", l = {306}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37561w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37561w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.f37531g0;
                v vVar = v.f59242a;
                this.f37561w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$14", f = "LivePrepareStore.kt", l = {313}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37563w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.j f37565y;

        public e(f0.j jVar, ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f37565y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f37563w;
            if (i10 == 0) {
                wn.m.b(obj);
                r unused = j.this.f37533i0;
                throw null;
            } else if (i10 == 1) {
                wn.m.b(obj);
                return v.f59242a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$18", f = "LivePrepareStore.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37566w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37566w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.f37550y0;
                v vVar = v.f59242a;
                this.f37566w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$1", f = "LivePrepareStore.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37568w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37568w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.U;
                v vVar = v.f59242a;
                this.f37568w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$20", f = "LivePrepareStore.kt", l = {388}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37570w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.z f37572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f0.z zVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f37572y = zVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f37572y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37570w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.A0;
                MRError a10 = this.f37572y.a();
                this.f37570w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$2", f = "LivePrepareStore.kt", l = {180}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37573w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.l f37575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f0.l lVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f37575y = lVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f37575y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37573w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.W;
                MRError a10 = this.f37575y.a();
                this.f37573w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$3", f = "LivePrepareStore.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    /* renamed from: jc.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0508j extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37576w;

        public C0508j(ao.d<? super C0508j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0508j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((C0508j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37576w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.Y;
                v vVar = v.f59242a;
                this.f37576w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$4", f = "LivePrepareStore.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37578w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.k f37580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f0.k kVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f37580y = kVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f37580y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37578w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.f37525a0;
                MRError a10 = this.f37580y.a();
                this.f37578w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$5", f = "LivePrepareStore.kt", l = {205, 207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37581w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f0.t f37582x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f37583y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(f0.t tVar, j jVar, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f37582x = tVar;
            this.f37583y = jVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f37582x, this.f37583y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37581w;
            if (i10 == 0) {
                wn.m.b(obj);
                RequestPackageUsageStats b10 = this.f37582x.b();
                if (b10 != null) {
                    r rVar = this.f37583y.f37535k0;
                    this.f37581w = 1;
                    if (rVar.emit(b10, this) == c10) {
                        return c10;
                    }
                } else {
                    r rVar2 = this.f37583y.f37527c0;
                    v vVar = v.f59242a;
                    this.f37581w = 2;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$6", f = "LivePrepareStore.kt", l = {215}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37584w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.m f37586y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f0.m mVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f37586y = mVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f37586y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37584w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.f37529e0;
                MRError a10 = this.f37586y.a();
                this.f37584w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$8", f = "LivePrepareStore.kt", l = {239, 241}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37587w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AppCampaign f37588x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f37589y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AppCampaign appCampaign, j jVar, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f37588x = appCampaign;
            this.f37589y = jVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new n(this.f37588x, this.f37589y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37587w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f37588x != null) {
                    r rVar = this.f37589y.J;
                    AppCampaign appCampaign = this.f37588x;
                    this.f37587w = 1;
                    if (rVar.emit(appCampaign, this) == c10) {
                        return c10;
                    }
                } else {
                    r rVar2 = this.f37589y.L;
                    v vVar = v.f59242a;
                    this.f37587w = 2;
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

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareStore$on$9", f = "LivePrepareStore.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37590w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.b f37592y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(f0.b bVar, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f37592y = bVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f37592y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37590w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = j.this.O;
                MRError a10 = this.f37592y.a();
                this.f37590w = 1;
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

    public j(String str, String str2, q8.a aVar, x xVar, kf.m mVar, kf.t tVar, Context context, nf.w wVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        jo.p.h(mVar, "livePreference");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(context, "applicationContext");
        jo.p.h(wVar, "liveSettingStore");
        this.f37549y = str;
        this.f37551z = str2;
        this.A = aVar;
        this.B = xVar;
        this.C = mVar;
        this.D = r0.b();
        mVar.q5(false);
        aVar.b(this);
        this.E = xVar.Q1().length() == 0 ? null : (Anniversary) new xm.e().i(xVar.Q1(), Anniversary.class);
        e0<Boolean> e0Var = new e0<>(Boolean.valueOf(H()));
        this.F = e0Var;
        this.G = e0Var;
        e0<List<AppCampaign>> e0Var2 = new e0<>(s.k());
        this.H = e0Var2;
        this.I = e0Var2;
        r<AppCampaign> b10 = y.b(0, 0, null, 7, null);
        this.J = b10;
        this.K = b10;
        r<v> b11 = y.b(0, 0, null, 7, null);
        this.L = b11;
        this.M = b11;
        this.N = s.k();
        r<MRError> b12 = y.b(0, 0, null, 7, null);
        this.O = b12;
        this.P = b12;
        r<v> b13 = y.b(0, 0, null, 7, null);
        this.Q = b13;
        this.R = b13;
        e0<ye.c> e0Var3 = new e0<>(null);
        this.S = e0Var3;
        this.T = e0Var3;
        r<v> b14 = y.b(0, 0, null, 7, null);
        this.U = b14;
        this.V = b14;
        r<MRError> b15 = y.b(0, 0, null, 7, null);
        this.W = b15;
        this.X = b15;
        r<v> b16 = y.b(0, 0, null, 7, null);
        this.Y = b16;
        this.Z = b16;
        r<MRError> b17 = y.b(0, 0, null, 7, null);
        this.f37525a0 = b17;
        this.f37526b0 = b17;
        r<v> b18 = y.b(0, 0, null, 7, null);
        this.f37527c0 = b18;
        this.f37528d0 = b18;
        r<MRError> b19 = y.b(0, 0, null, 7, null);
        this.f37529e0 = b19;
        this.f37530f0 = b19;
        r<v> b20 = y.b(0, 0, null, 7, null);
        this.f37531g0 = b20;
        this.f37532h0 = b20;
        r<MRError> b21 = y.b(0, 0, null, 7, null);
        this.f37533i0 = b21;
        this.f37534j0 = b21;
        r<RequestPackageUsageStats> b22 = y.b(0, 0, null, 7, null);
        this.f37535k0 = b22;
        this.f37536l0 = b22;
        lc.n nVar = new lc.n(wVar.e(), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
        nVar.k().m(mVar.getTitle());
        nVar.g().m(xVar.H3());
        this.f37537m0 = nVar;
        e0<EventNoticeResponse> e0Var4 = new e0<>();
        this.f37538n0 = e0Var4;
        this.f37539o0 = e0Var4;
        e0<Boolean> e0Var5 = new e0<>(Boolean.FALSE);
        this.f37540p0 = e0Var5;
        this.f37541q0 = e0Var5;
        this.f37542r0 = new e0<>(Boolean.valueOf(mVar.D1().length() > 0));
        e0<Integer> e0Var6 = new e0<>(Integer.valueOf(tVar.b0()));
        this.f37543s0 = e0Var6;
        this.f37544t0 = e0Var6;
        e0<List<t>> e0Var7 = new e0<>();
        this.f37545u0 = e0Var7;
        this.f37546v0 = e0Var7;
        e0<t> e0Var8 = new e0<>();
        this.f37547w0 = e0Var8;
        this.f37548x0 = e0Var8;
        r<v> b23 = y.b(0, 0, null, 7, null);
        this.f37550y0 = b23;
        this.f37552z0 = b23;
        r<MRError> b24 = y.b(0, 0, null, 7, null);
        this.A0 = b24;
        this.B0 = b24;
        kc.m mVar2 = new kc.m(context, wVar.g(), wVar.c(), wVar.k(), wVar.d(), wVar.e(), wVar.a(), wVar.j(), null, 256, null);
        mVar2.f().m(mVar.b1());
        this.C0 = mVar2;
    }

    public final w<MRError> A() {
        return this.f37526b0;
    }

    public final w<MRError> B() {
        return this.X;
    }

    public final w<MRError> C() {
        return this.f37530f0;
    }

    public final w<MRError> D() {
        return this.B0;
    }

    public final w<MRError> E() {
        return this.f37534j0;
    }

    public final LiveData<EventNoticeResponse> F() {
        return this.f37539o0;
    }

    public final w<MRError> G() {
        return this.P;
    }

    public final boolean H() {
        return this.B.L0();
    }

    public final AppCampaign I() {
        List<AppCampaign> f10 = this.I.f();
        Object obj = null;
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jo.p.c(((AppCampaign) next).getAppId(), T())) {
                    obj = next;
                    break;
                }
            }
            return (AppCampaign) obj;
        }
        return null;
    }

    public final String J() {
        return this.f37549y;
    }

    public final String K() {
        ye.c f10 = this.T.f();
        if (f10 != null) {
            return f10.b();
        }
        return null;
    }

    public final lc.n L() {
        return this.f37537m0;
    }

    public final LiveData<Integer> M() {
        return this.f37544t0;
    }

    public final LiveData<List<t>> N() {
        return this.f37546v0;
    }

    public final w<v> O() {
        return this.f37552z0;
    }

    public final LiveData<t> P() {
        return this.f37548x0;
    }

    public final LiveData<ye.c> Q() {
        return this.T;
    }

    public final w<RequestPackageUsageStats> R() {
        return this.f37536l0;
    }

    public final w<v> S() {
        return this.R;
    }

    public final String T() {
        return this.C.h();
    }

    public final int U() {
        Object obj;
        List<o0> f10 = this.f37537m0.f().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((o0) obj).c()) {
                    break;
                }
            }
            o0 o0Var = (o0) obj;
            if (o0Var != null) {
                return o0Var.b();
            }
        }
        return 0;
    }

    public final w<AppCampaign> V() {
        return this.K;
    }

    public final w<v> W() {
        return this.Z;
    }

    public final w<v> X() {
        return this.V;
    }

    public final w<v> Y() {
        return this.f37528d0;
    }

    public final w<v> Z() {
        return this.f37532h0;
    }

    public final boolean a0() {
        return this.f37551z != null;
    }

    public final LiveData<Boolean> b0() {
        return this.G;
    }

    public final LiveData<Boolean> c0() {
        return this.f37541q0;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.A.c(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.D.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.q qVar) {
        jo.p.h(qVar, "event");
        this.S.p(qVar.a());
    }

    public final Anniversary u() {
        return this.E;
    }

    public final LiveData<List<AppCampaign>> v() {
        return this.I;
    }

    public final String w() {
        return this.f37551z;
    }

    public final int x() {
        return this.B.u();
    }

    public final kc.m y() {
        return this.C0;
    }

    public final w<v> z() {
        return this.M;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.s sVar) {
        jo.p.h(sVar, "event");
        this.S.p(sVar.a());
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.l lVar) {
        jo.p.h(lVar, "event");
        uo.l.d(this, null, null, new i(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.r rVar) {
        jo.p.h(rVar, "event");
        this.S.p(rVar.a());
        uo.l.d(this, null, null, new C0508j(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.k kVar) {
        jo.p.h(kVar, "event");
        uo.l.d(this, null, null, new k(kVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.t tVar) {
        jo.p.h(tVar, "event");
        this.S.p(tVar.a());
        uo.l.d(this, null, null, new l(tVar, this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new m(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.c cVar) {
        Object obj;
        boolean z10;
        jo.p.h(cVar, "event");
        this.f37537m0.b().p(cVar.a().getAvatarBodyImageUrl());
        this.f37537m0.p().p(Boolean.valueOf(cVar.a().getTwitterAutopost() == 1));
        List<ThumbnailFrame> thumbnailFrames = cVar.a().getThumbnailFrames();
        int selectedThumbnailFrameId = cVar.a().getSelectedThumbnailFrameId();
        this.N = thumbnailFrames;
        Iterator<T> it = thumbnailFrames.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ThumbnailFrame) obj).getId() == selectedThumbnailFrameId) {
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
        ThumbnailFrame thumbnailFrame = (ThumbnailFrame) obj;
        this.f37537m0.h().p(thumbnailFrame != null ? thumbnailFrame.getLeftThumbnailImageUrl() : null);
        this.f37537m0.j().p(thumbnailFrame != null ? thumbnailFrame.getRightThumbnailImageUrl() : null);
        this.f37537m0.i().p(thumbnailFrame != null ? thumbnailFrame.getRightThumbnailAnimationUrl() : null);
        e0<List<o0>> f10 = this.f37537m0.f();
        ArrayList arrayList = new ArrayList(xn.t.u(thumbnailFrames, 10));
        for (ThumbnailFrame thumbnailFrame2 : thumbnailFrames) {
            arrayList.add(o0.f39945d.a(thumbnailFrame2, selectedThumbnailFrameId));
        }
        f10.p(arrayList);
        this.f37537m0.o().p(Boolean.valueOf(cVar.a().isOmotenashiLiveEnable()));
        this.f37537m0.d().p(cVar.a().getOmotenashiLiveNoticeText());
        this.f37537m0.e().p(cVar.a().getOmotenashiLpUrl());
        this.H.p(cVar.a().getAppCampaigns());
        uo.l.d(this, null, null, new n(I(), this, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.a aVar) {
        jo.p.h(aVar, "event");
        this.f37537m0.p().p(Boolean.valueOf(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new o(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.w wVar) {
        jo.p.h(wVar, "event");
        this.f37537m0.k().p(wVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.v vVar) {
        jo.p.h(vVar, "event");
        this.C0.f().p(vVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.d0 d0Var) {
        jo.p.h(d0Var, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.e0 e0Var) {
        jo.p.h(e0Var, "event");
        e0<String> a10 = this.f37537m0.a();
        jf.w a11 = e0Var.a();
        a10.p(a11 != null ? a11.a() : null);
        uo.l.d(this, null, null, new b(I(), this, null), 3, null);
        this.f37542r0.p(Boolean.valueOf(this.C.D1().length() > 0));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.c0 c0Var) {
        jo.p.h(c0Var, "event");
        this.f37537m0.k().p(c0Var.a().getTitle());
        this.f37537m0.g().p(c0Var.a().getLiveThumbnailImageUrl());
        this.f37537m0.a().p(c0Var.a().getAppIconUrl());
        this.f37537m0.a().p(c0Var.a().getLiveAppSetting().a());
        this.C0.f().p(c0Var.a().getMemo());
        uo.l.d(this, null, null, new c(I(), this, null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new e(jVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.y yVar) {
        jo.p.h(yVar, "event");
        this.f37537m0.g().p(yVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.b0 b0Var) {
        Object obj;
        boolean z10;
        jo.p.h(b0Var, "event");
        int a10 = b0Var.a();
        Iterator<T> it = this.N.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ThumbnailFrame) obj).getId() == a10) {
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
        ThumbnailFrame thumbnailFrame = (ThumbnailFrame) obj;
        this.f37537m0.h().p(thumbnailFrame != null ? thumbnailFrame.getLeftThumbnailImageUrl() : null);
        this.f37537m0.j().p(thumbnailFrame != null ? thumbnailFrame.getRightThumbnailImageUrl() : null);
        this.f37537m0.i().p(thumbnailFrame != null ? thumbnailFrame.getRightThumbnailAnimationUrl() : null);
        e0<List<o0>> f10 = this.f37537m0.f();
        List<ThumbnailFrame> list = this.N;
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (ThumbnailFrame thumbnailFrame2 : list) {
            arrayList.add(o0.f39945d.a(thumbnailFrame2, a10));
        }
        f10.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.n nVar) {
        jo.p.h(nVar, "event");
        this.f37538n0.p(nVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LoadAvatarModelCompleted loadAvatarModelCompleted) {
        jo.p.h(loadAvatarModelCompleted, "event");
        this.F.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.x xVar) {
        jo.p.h(xVar, "event");
        this.C.q5(xVar.a());
        this.f37540p0.p(Boolean.valueOf(xVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.g gVar) {
        jo.p.h(gVar, "event");
        this.f37543s0.p(Integer.valueOf(gVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.p pVar) {
        Object obj;
        t tVar;
        Object obj2;
        jo.p.h(pVar, "event");
        Iterator<T> it = pVar.a().getRankings().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((RankingFocusableResponse.RankingFocusable) obj).isFocus()) {
                break;
            }
        }
        boolean z10 = obj != null;
        e0<List<t>> e0Var = this.f37545u0;
        List<RankingFocusableResponse.RankingFocusable> rankings = pVar.a().getRankings();
        ArrayList arrayList = new ArrayList(xn.t.u(rankings, 10));
        for (RankingFocusableResponse.RankingFocusable rankingFocusable : rankings) {
            arrayList.add(t.f60098h.a(rankingFocusable, z10, rankingFocusable.isFocus()));
        }
        e0Var.p(arrayList);
        e0<t> e0Var2 = this.f37547w0;
        List<t> f10 = this.f37545u0.f();
        if (f10 != null) {
            Iterator<T> it2 = f10.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((t) obj2).i()) {
                    break;
                }
            }
            tVar = (t) obj2;
        } else {
            tVar = null;
        }
        e0Var2.p(tVar);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.o oVar) {
        jo.p.h(oVar, "event");
        this.f37545u0.p(s.k());
        this.f37547w0.p(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x004d A[EDGE_INSN: B:41:0x004d->B:19:0x004d ?: BREAK  , SYNTHETIC] */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(pd.f0.a0 r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "event"
            r2 = r18
            jo.p.h(r2, r1)
            androidx.lifecycle.LiveData<java.util.List<xb.t>> r1 = r0.f37546v0
            java.lang.Object r1 = r1.f()
            java.util.List r1 = (java.util.List) r1
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L50
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r1.next()
            r7 = r6
            xb.t r7 = (xb.t) r7
            java.lang.String r8 = r7.c()
            java.lang.String r9 = r18.a()
            boolean r8 = jo.p.c(r8, r9)
            if (r8 == 0) goto L48
            int r7 = r7.d()
            java.lang.Integer r8 = r18.b()
            if (r8 != 0) goto L40
            goto L48
        L40:
            int r8 = r8.intValue()
            if (r7 != r8) goto L48
            r7 = r3
            goto L49
        L48:
            r7 = r4
        L49:
            if (r7 == 0) goto L1a
            goto L4d
        L4c:
            r6 = r5
        L4d:
            xb.t r6 = (xb.t) r6
            goto L51
        L50:
            r6 = r5
        L51:
            if (r6 == 0) goto L54
            goto L55
        L54:
            r3 = r4
        L55:
            androidx.lifecycle.e0<xb.t> r1 = r0.f37547w0
            r1.p(r6)
            androidx.lifecycle.e0<java.util.List<xb.t>> r1 = r0.f37545u0
            androidx.lifecycle.LiveData<java.util.List<xb.t>> r4 = r0.f37546v0
            java.lang.Object r4 = r4.f()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Lc4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = xn.t.u(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L75:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lc4
            java.lang.Object r6 = r4.next()
            r7 = r6
            xb.t r7 = (xb.t) r7
            java.lang.String r6 = r7.c()
            java.lang.String r8 = r18.a()
            boolean r6 = jo.p.c(r6, r8)
            if (r6 == 0) goto Lb1
            int r6 = r7.d()
            java.lang.Integer r8 = r18.b()
            if (r8 != 0) goto L9b
            goto Lb1
        L9b:
            int r8 = r8.intValue()
            if (r6 != r8) goto Lb1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r15 = 31
            r16 = 0
            r14 = r3
            xb.t r6 = xb.t.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto Lc0
        Lb1:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 31
            r16 = 0
            r14 = r3
            xb.t r6 = xb.t.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lc0:
            r5.add(r6)
            goto L75
        Lc4:
            r1.p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.j.on(pd.f0$a0):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f0.z zVar) {
        jo.p.h(zVar, "event");
        uo.l.d(this, null, null, new h(zVar, null), 3, null);
    }
}
