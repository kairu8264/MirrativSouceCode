package ja;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import c1.c0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import h0.p0;
import h0.p1;
import h0.q1;
import h0.r1;
import h0.s1;
import h0.w1;
import ha.a;
import hf.d0;
import hf.v0;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import l0.a0;
import l0.c2;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.t1;
import l0.u1;
import l0.z;
import l0.z1;
import nd.i1;
import s1.a;
import uo.q0;
import wn.v;
import x0.f;
import xn.s;
import xo.r;
import xo.w;
import y.d1;
import y.r0;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f37333w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f37333w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f37333w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f37334w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f37335x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f37336y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f37337z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f37334w = aVar;
            this.f37335x = aVar2;
            this.f37336y = aVar3;
            this.f37337z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f37337z;
            vq.a aVar2 = this.f37334w;
            io.a aVar3 = this.f37335x;
            return kq.c.a(this.f37336y, new kq.b(f0.b(na.f.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f37338w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kq.a aVar) {
            super(0);
            this.f37338w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f37338w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f37339w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f37340x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f37341y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f37342z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f37339w = aVar;
            this.f37340x = aVar2;
            this.f37341y = aVar3;
            this.f37342z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f37342z;
            vq.a aVar2 = this.f37339w;
            io.a aVar3 = this.f37340x;
            return kq.c.a(this.f37341y, new kq.b(f0.b(oa.n.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$1", f = "LiveGamePage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ io.l<LiveGameStartResponse, v> A;
        public final /* synthetic */ io.l<MRError, v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f37343w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f37344x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ na.f f37345y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f37346z;

        @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$1$1", f = "LiveGamePage.kt", l = {86}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f37347w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ na.f f37348x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f37349y;

            /* renamed from: ja.h$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0501a implements xo.d<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f37350w;

                public C0501a(io.a<v> aVar) {
                    this.f37350w = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(v vVar, ao.d<? super v> dVar) {
                    this.f37350w.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(na.f fVar, io.a<v> aVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f37348x = fVar;
                this.f37349y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f37348x, this.f37349y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f37347w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    r<v> q10 = this.f37348x.q();
                    C0501a c0501a = new C0501a(this.f37349y);
                    this.f37347w = 1;
                    if (q10.a(c0501a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$1$2", f = "LiveGamePage.kt", l = {91}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f37351w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ na.f f37352x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<LiveGameStartResponse, v> f37353y;

            /* loaded from: classes.dex */
            public static final class a implements xo.d<LiveGameStartResponse> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.l<LiveGameStartResponse, v> f37354w;

                /* JADX WARN: Multi-variable type inference failed */
                public a(io.l<? super LiveGameStartResponse, v> lVar) {
                    this.f37354w = lVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(LiveGameStartResponse liveGameStartResponse, ao.d<? super v> dVar) {
                    this.f37354w.invoke(liveGameStartResponse);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(na.f fVar, io.l<? super LiveGameStartResponse, v> lVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f37352x = fVar;
                this.f37353y = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f37352x, this.f37353y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f37351w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    w<LiveGameStartResponse> o10 = this.f37352x.o();
                    a aVar = new a(this.f37353y);
                    this.f37351w = 1;
                    if (o10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$1$3", f = "LiveGamePage.kt", l = {96}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f37355w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ na.f f37356x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<MRError, v> f37357y;

            /* loaded from: classes.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.l<MRError, v> f37358w;

                /* JADX WARN: Multi-variable type inference failed */
                public a(io.l<? super MRError, v> lVar) {
                    this.f37358w = lVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                    this.f37358w.invoke(mRError);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(na.f fVar, io.l<? super MRError, v> lVar, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f37356x = fVar;
                this.f37357y = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new c(this.f37356x, this.f37357y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f37355w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    w<MRError> n10 = this.f37356x.n();
                    a aVar = new a(this.f37357y);
                    this.f37355w = 1;
                    if (n10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(na.f fVar, io.a<v> aVar, io.l<? super LiveGameStartResponse, v> lVar, io.l<? super MRError, v> lVar2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f37345y = fVar;
            this.f37346z = aVar;
            this.A = lVar;
            this.B = lVar2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f37345y, this.f37346z, this.A, this.B, dVar);
            eVar.f37344x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f37343w == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f37344x;
                uo.l.d(q0Var, null, null, new a(this.f37345y, this.f37346z, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.f37345y, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new c(this.f37345y, this.B, null), 3, null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.l<a0, z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.o f37359w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.r f37360x;

        /* loaded from: classes.dex */
        public static final class a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.o f37361a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.r f37362b;

            public a(androidx.lifecycle.o oVar, androidx.lifecycle.r rVar) {
                this.f37361a = oVar;
                this.f37362b = rVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f37361a.c(this.f37362b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.lifecycle.o oVar, androidx.lifecycle.r rVar) {
            super(1);
            this.f37359w = oVar;
            this.f37360x = rVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            p.h(a0Var, "$this$DisposableEffect");
            this.f37359w.a(this.f37360x);
            return new a(this.f37359w, this.f37360x);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.q<List<? extends q1>, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ uf.f f37363w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0<Integer> f37364x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(uf.f fVar, s0<Integer> s0Var) {
            super(3);
            this.f37363w = fVar;
            this.f37364x = s0Var;
        }

        public final void a(List<q1> list, l0.i iVar, int i10) {
            p.h(list, "tabPositions");
            r1.f34156a.b(uf.h.b(x0.f.f59359u, this.f37363w, list, null, 4, null), m2.g.l(4), v1.b.a(ja.j.pinkFlamingo, iVar, 0), iVar, 4144, 0);
            h.e(this.f37364x, this.f37363w.i());
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(List<? extends q1> list, l0.i iVar, Integer num) {
            a(list, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: ja.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0502h extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ q0 A;
        public final /* synthetic */ i1 B;
        public final /* synthetic */ v0 C;
        public final /* synthetic */ d0 D;
        public final /* synthetic */ uf.f E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<Integer> f37365w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ oa.e f37366x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37367y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ MRLogger f37368z;

        /* renamed from: ja.h$h$a */
        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {
            public final /* synthetic */ q0 A;
            public final /* synthetic */ s0<Integer> B;
            public final /* synthetic */ i1 C;
            public final /* synthetic */ v0 D;
            public final /* synthetic */ d0 E;
            public final /* synthetic */ uf.f F;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f37369w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ oa.e f37370x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f37371y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ MRLogger f37372z;

            @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$3$2$1$1$2", f = "LiveGamePage.kt", l = {169}, m = "invokeSuspend")
            /* renamed from: ja.h$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0503a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f37373w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ uf.f f37374x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ int f37375y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0503a(uf.f fVar, int i10, ao.d<? super C0503a> dVar) {
                    super(2, dVar);
                    this.f37374x = fVar;
                    this.f37375y = i10;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    return new C0503a(this.f37374x, this.f37375y, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((C0503a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f37373w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        uf.f fVar = this.f37374x;
                        int i11 = this.f37375y;
                        this.f37373w = 1;
                        if (uf.f.h(fVar, i11, 0.0f, this, 2, null) == c10) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, oa.e eVar, String str, MRLogger mRLogger, q0 q0Var, s0<Integer> s0Var, i1 i1Var, v0 v0Var, d0 d0Var, uf.f fVar) {
                super(0);
                this.f37369w = i10;
                this.f37370x = eVar;
                this.f37371y = str;
                this.f37372z = mRLogger;
                this.A = q0Var;
                this.B = s0Var;
                this.C = i1Var;
                this.D = v0Var;
                this.E = d0Var;
                this.F = fVar;
            }

            public final void a() {
                int d10 = h.d(this.B);
                int i10 = this.f37369w;
                if (d10 == i10 && i10 == ja.i.RANKING.h()) {
                    this.f37370x.c(this.f37371y, null);
                    MRLogger mRLogger = this.f37372z;
                    MRLog.Companion companion = MRLog.Companion;
                    String str = this.f37371y;
                    int i11 = this.f37369w;
                    i1 i1Var = this.C;
                    v0 v0Var = this.D;
                    d0 d0Var = this.E;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_TAB_SELECT);
                    List<wn.k<String, String>> p10 = s.p(wn.q.a("page_id", str), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "{\"tab\": \"" + i11 + "\"}"));
                    if (i1Var.a().c()) {
                        p10.add(wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, v0Var.x()));
                        p10.add(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, d0Var.c()));
                    }
                    builder.setPayload(p10);
                    mRLogger.sendLog(builder.build());
                }
                uo.l.d(this.A, null, null, new C0503a(this.F, this.f37369w, null), 3, null);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: ja.h$h$b */
        /* loaded from: classes.dex */
        public static final class b extends q implements io.p<l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ja.i f37376w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f37377x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f37378y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ja.i iVar, int i10, s0<Integer> s0Var) {
                super(2);
                this.f37376w = iVar;
                this.f37377x = i10;
                this.f37378y = s0Var;
            }

            public final void a(l0.i iVar, int i10) {
                long a10;
                y1.d0 g10;
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                    return;
                }
                String b10 = v1.f.b(this.f37376w.e(), iVar, 0);
                x0.f i11 = r0.i(x0.f.f59359u, m2.g.l(12));
                if (h.d(this.f37378y) == this.f37377x) {
                    iVar.x(41592832);
                    a10 = v1.b.a(ja.j.pinkFlamingo, iVar, 0);
                    iVar.O();
                } else {
                    iVar.x(41592942);
                    a10 = v1.b.a(ja.j.f37420r, iVar, 0);
                    iVar.O();
                }
                if (h.d(this.f37378y) == this.f37377x) {
                    g10 = o9.b.f44283a.b().h();
                } else {
                    g10 = o9.b.f44283a.b().g();
                }
                w1.c(b10, i11, a10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, g10, iVar, 48, 0, 32760);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* renamed from: ja.h$h$c */
        /* loaded from: classes.dex */
        public static final class c extends q implements io.p<l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f37379w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ja.i f37380x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f37381y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i10, ja.i iVar, s0<Integer> s0Var) {
                super(2);
                this.f37379w = i10;
                this.f37380x = iVar;
                this.f37381y = s0Var;
            }

            public final void a(l0.i iVar, int i10) {
                f1.d c10;
                if ((i10 & 11) != 2 || !iVar.j()) {
                    if (h.d(this.f37381y) == this.f37379w) {
                        iVar.x(41593475);
                        c10 = v1.e.c(this.f37380x.c(), iVar, 0);
                        iVar.O();
                    } else {
                        iVar.x(41593575);
                        c10 = v1.e.c(this.f37380x.i(), iVar, 0);
                        iVar.O();
                    }
                    p0.a(c10, null, null, c0.f18634b.e(), iVar, 3128, 4);
                    return;
                }
                iVar.I();
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0502h(s0<Integer> s0Var, oa.e eVar, String str, MRLogger mRLogger, q0 q0Var, i1 i1Var, v0 v0Var, d0 d0Var, uf.f fVar) {
            super(2);
            this.f37365w = s0Var;
            this.f37366x = eVar;
            this.f37367y = str;
            this.f37368z = mRLogger;
            this.A = q0Var;
            this.B = i1Var;
            this.C = v0Var;
            this.D = d0Var;
            this.E = fVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            ja.i[] values = ja.i.values();
            s0<Integer> s0Var = this.f37365w;
            oa.e eVar = this.f37366x;
            String str = this.f37367y;
            MRLogger mRLogger = this.f37368z;
            q0 q0Var = this.A;
            i1 i1Var = this.B;
            v0 v0Var = this.C;
            d0 d0Var = this.D;
            uf.f fVar = this.E;
            int length = values.length;
            int i11 = 0;
            int i12 = 0;
            while (i12 < length) {
                ja.i iVar2 = values[i12];
                int i13 = i11 + 1;
                ja.i[] iVarArr = values;
                int i14 = i11;
                uf.f fVar2 = fVar;
                d0 d0Var2 = d0Var;
                v0 v0Var2 = v0Var;
                p1.a(h.d(s0Var) == i11, new a(i11, eVar, str, mRLogger, q0Var, s0Var, i1Var, v0Var2, d0Var2, fVar2), null, false, s0.c.b(iVar, -501732261, true, new b(iVar2, i14, s0Var)), s0.c.b(iVar, -640517668, true, new c(i14, iVar2, s0Var)), null, 0L, 0L, iVar, 221184, 460);
                i12++;
                eVar = eVar;
                i11 = i13;
                s0Var = s0Var;
                values = iVarArr;
                length = length;
                fVar = fVar2;
                d0Var = d0Var2;
                v0Var = v0Var2;
                i1Var = i1Var;
                q0Var = q0Var;
                mRLogger = mRLogger;
                str = str;
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.r<uf.d, Integer, l0.i, Integer, v> {
        public final /* synthetic */ oa.n A;
        public final /* synthetic */ io.l<String, v> B;
        public final /* synthetic */ io.l<String, v> C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ io.l<oa.g, v> E;
        public final /* synthetic */ na.a F;
        public final /* synthetic */ String G;
        public final /* synthetic */ oa.e H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ na.f f37382w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<na.d, v> f37383x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<na.d, v> f37384y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f37385z;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ na.f f37386w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ na.a f37387x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f37388y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(na.f fVar, na.a aVar, String str) {
                super(0);
                this.f37386w = fVar;
                this.f37387x = aVar;
                this.f37388y = str;
            }

            public final void a() {
                String value = this.f37386w.p().getValue();
                if (value != null) {
                    na.f fVar = this.f37386w;
                    na.a aVar = this.f37387x;
                    String str = this.f37388y;
                    if (p.c(fVar.r().f(), a.d.f34697b)) {
                        if (!fVar.l().isEmpty()) {
                            if (value.length() > 0) {
                                aVar.f(str, value);
                            }
                        }
                    }
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ oa.e f37389w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f37390x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(oa.e eVar, String str) {
                super(0);
                this.f37389w = eVar;
                this.f37390x = str;
            }

            public final void a() {
                this.f37389w.c(this.f37390x, null);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ oa.n f37391w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ oa.e f37392x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f37393y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(oa.n nVar, oa.e eVar, String str) {
                super(0);
                this.f37391w = nVar;
                this.f37392x = eVar;
                this.f37393y = str;
            }

            public final void a() {
                String value = this.f37391w.g().getValue();
                if (value != null) {
                    this.f37392x.d(this.f37393y, value);
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f37394a;

            static {
                int[] iArr = new int[ja.i.values().length];
                iArr[ja.i.LISTING.ordinal()] = 1;
                iArr[ja.i.RANKING.ordinal()] = 2;
                f37394a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(na.f fVar, io.l<? super na.d, v> lVar, io.l<? super na.d, v> lVar2, int i10, oa.n nVar, io.l<? super String, v> lVar3, io.l<? super String, v> lVar4, io.a<v> aVar, io.l<? super oa.g, v> lVar5, na.a aVar2, String str, oa.e eVar) {
            super(4);
            this.f37382w = fVar;
            this.f37383x = lVar;
            this.f37384y = lVar2;
            this.f37385z = i10;
            this.A = nVar;
            this.B = lVar3;
            this.C = lVar4;
            this.D = aVar;
            this.E = lVar5;
            this.F = aVar2;
            this.G = str;
            this.H = eVar;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ v F(uf.d dVar, Integer num, l0.i iVar, Integer num2) {
            a(dVar, num.intValue(), iVar, num2.intValue());
            return v.f59242a;
        }

        public final void a(uf.d dVar, int i10, l0.i iVar, int i11) {
            ja.i iVar2;
            p.h(dVar, "$this$HorizontalPager");
            if ((i11 & 112) == 0) {
                i11 |= iVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 721) == 144 && iVar.j()) {
                iVar.I();
                return;
            }
            ja.i[] values = ja.i.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    iVar2 = null;
                    break;
                }
                iVar2 = values[i12];
                if (i10 == iVar2.h()) {
                    break;
                }
                i12++;
            }
            if (iVar2 == null) {
                return;
            }
            int i13 = d.f37394a[iVar2.ordinal()];
            if (i13 == 1) {
                iVar.x(-1853271930);
                c2<na.c> m10 = this.f37382w.m();
                List<na.d> l10 = this.f37382w.l();
                io.l<na.d, v> lVar = this.f37383x;
                io.l<na.d, v> lVar2 = this.f37384y;
                a aVar = new a(this.f37382w, this.F, this.G);
                int i14 = this.f37385z;
                na.g.a(m10, l10, lVar, lVar2, aVar, iVar, ((i14 >> 6) & 896) | 64 | ((i14 >> 6) & 7168));
                iVar.O();
            } else if (i13 != 2) {
                iVar.x(-1853270274);
                iVar.O();
            } else {
                iVar.x(-1853271179);
                c2<ha.a> h10 = this.A.h();
                c2<oa.g> f10 = this.A.f();
                io.l<String, v> lVar3 = this.B;
                io.l<String, v> lVar4 = this.C;
                b bVar = new b(this.H, this.G);
                io.a<v> aVar2 = this.D;
                io.l<oa.g, v> lVar5 = this.E;
                c cVar = new c(this.A, this.H, this.G);
                int i15 = this.f37385z;
                oa.q.a(h10, f10, lVar3, lVar4, bVar, aVar2, lVar5, cVar, iVar, ((i15 >> 12) & 896) | ((i15 >> 12) & 7168) | (458752 & (i15 >> 9)) | ((i15 >> 9) & 3670016));
                iVar.O();
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.LiveGamePageKt$LiveGamePage$4", f = "LiveGamePage.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ oa.e A;
        public final /* synthetic */ String B;
        public final /* synthetic */ MRLogger C;
        public final /* synthetic */ i1 D;
        public final /* synthetic */ v0 E;
        public final /* synthetic */ d0 F;

        /* renamed from: w  reason: collision with root package name */
        public int f37395w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ uf.f f37396x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f37397y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ od.p f37398z;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.f f37399w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uf.f fVar) {
                super(0);
                this.f37399w = fVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f37399w.i());
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<Integer> {
            public final /* synthetic */ MRLogger A;
            public final /* synthetic */ i1 B;
            public final /* synthetic */ v0 C;
            public final /* synthetic */ d0 D;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f37400w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ od.p f37401x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ oa.e f37402y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f37403z;

            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f37404a;

                static {
                    int[] iArr = new int[ja.i.values().length];
                    iArr[ja.i.LISTING.ordinal()] = 1;
                    iArr[ja.i.RANKING.ordinal()] = 2;
                    f37404a = iArr;
                }
            }

            public b(boolean z10, od.p pVar, oa.e eVar, String str, MRLogger mRLogger, i1 i1Var, v0 v0Var, d0 d0Var) {
                this.f37400w = z10;
                this.f37401x = pVar;
                this.f37402y = eVar;
                this.f37403z = str;
                this.A = mRLogger;
                this.B = i1Var;
                this.C = v0Var;
                this.D = d0Var;
            }

            public final Object a(int i10, ao.d<? super v> dVar) {
                ja.i iVar;
                ja.i[] values = ja.i.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        iVar = null;
                        break;
                    }
                    iVar = values[i11];
                    if (i10 == iVar.h()) {
                        break;
                    }
                    i11++;
                }
                if (iVar == null) {
                    return v.f59242a;
                }
                if (this.f37400w) {
                    this.f37401x.l(i10);
                }
                if (a.f37404a[iVar.ordinal()] == 2) {
                    this.f37402y.c(this.f37403z, null);
                }
                MRLogger mRLogger = this.A;
                MRLog.Companion companion = MRLog.Companion;
                String str = this.f37403z;
                i1 i1Var = this.B;
                v0 v0Var = this.C;
                d0 d0Var = this.D;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_TAB_SELECT);
                List<wn.k<String, String>> p10 = s.p(wn.q.a("page_id", str), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "{\"tab\": \"" + iVar.getId() + "\"}"));
                if (i1Var.a().c()) {
                    p10.add(wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, v0Var.x()));
                    p10.add(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, d0Var.c()));
                }
                builder.setPayload(p10);
                mRLogger.sendLog(builder.build());
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(uf.f fVar, boolean z10, od.p pVar, oa.e eVar, String str, MRLogger mRLogger, i1 i1Var, v0 v0Var, d0 d0Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f37396x = fVar;
            this.f37397y = z10;
            this.f37398z = pVar;
            this.A = eVar;
            this.B = str;
            this.C = mRLogger;
            this.D = i1Var;
            this.E = v0Var;
            this.F = d0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f37396x, this.f37397y, this.f37398z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37395w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c m10 = u1.m(new a(this.f37396x));
                b bVar = new b(this.f37397y, this.f37398z, this.A, this.B, this.C, this.D, this.E, this.F);
                this.f37395w = 1;
                if (m10.a(bVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class k extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ io.l<na.d, v> A;
        public final /* synthetic */ io.l<na.d, v> B;
        public final /* synthetic */ io.l<String, v> C;
        public final /* synthetic */ io.l<String, v> D;
        public final /* synthetic */ io.a<v> E;
        public final /* synthetic */ io.l<oa.g, v> F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f37405w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f37406x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<LiveGameStartResponse, v> f37407y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<MRError, v> f37408z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(boolean z10, io.a<v> aVar, io.l<? super LiveGameStartResponse, v> lVar, io.l<? super MRError, v> lVar2, io.l<? super na.d, v> lVar3, io.l<? super na.d, v> lVar4, io.l<? super String, v> lVar5, io.l<? super String, v> lVar6, io.a<v> aVar2, io.l<? super oa.g, v> lVar7, int i10) {
            super(2);
            this.f37405w = z10;
            this.f37406x = aVar;
            this.f37407y = lVar;
            this.f37408z = lVar2;
            this.A = lVar3;
            this.B = lVar4;
            this.C = lVar5;
            this.D = lVar6;
            this.E = aVar2;
            this.F = lVar7;
            this.G = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.b(this.f37405w, this.f37406x, this.f37407y, this.f37408z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ na.a f37409w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f37410x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(na.a aVar, String str) {
            super(0);
            this.f37409w = aVar;
            this.f37410x = str;
        }

        public final void a() {
            this.f37409w.e(this.f37410x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public static final void b(boolean z10, io.a<v> aVar, io.l<? super LiveGameStartResponse, v> lVar, io.l<? super MRError, v> lVar2, io.l<? super na.d, v> lVar3, io.l<? super na.d, v> lVar4, io.l<? super String, v> lVar5, io.l<? super String, v> lVar6, io.a<v> aVar2, io.l<? super oa.g, v> lVar7, l0.i iVar, int i10) {
        int i11;
        Object obj;
        Object c10;
        Object obj2;
        Object c11;
        Object obj3;
        Object c12;
        Object obj4;
        Object c13;
        t1 t1Var;
        Integer num;
        l0.i iVar2;
        p.h(aVar, "showRegistrationDialog");
        p.h(lVar, "onLiveGameStart");
        p.h(lVar2, "onLiveGameStartFailed");
        p.h(lVar3, "onClickImage");
        p.h(lVar4, "onClickPlay");
        p.h(lVar5, "onClickProfile");
        p.h(lVar6, "onClickLive");
        p.h(aVar2, "onClickDailyRankingYesterdayRanking");
        p.h(lVar7, "onClickDailyRankingRule");
        l0.i h10 = iVar.h(-47397868);
        if ((i10 & 14) == 0) {
            i11 = (h10.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(lVar2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(lVar3) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(lVar4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((3670016 & i10) == 0) {
            i11 |= h10.P(lVar5) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= h10.P(lVar6) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= h10.P(aVar2) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i11 |= h10.P(lVar7) ? 536870912 : 268435456;
        }
        int i12 = i11;
        if ((i12 & 1533916891) == 306783378 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            h10.x(-909571169);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = b10.c(f0.b(nf.o.class), null, null);
                h10.q(y10);
            }
            h10.O();
            h10.O();
            nf.o oVar = (nf.o) y10;
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(od.p.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            od.p pVar = (od.p) y11;
            h10.x(1509148303);
            xq.a b12 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P3 = h10.P(null) | h10.P(null);
            Object y12 = h10.y();
            if (P3 || y12 == l0.i.f39065a.a()) {
                y12 = new androidx.lifecycle.s0(f0.b(na.f.class), new a(a10), new b(null, null, b12, a10));
                h10.q(y12);
            }
            h10.O();
            h10.O();
            h10.O();
            na.f fVar = (na.f) ((androidx.lifecycle.q0) ((androidx.lifecycle.s0) y12).getValue());
            h10.x(1509148303);
            xq.a b13 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a11 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P4 = h10.P(null) | h10.P(null);
            Object y13 = h10.y();
            if (P4 || y13 == l0.i.f39065a.a()) {
                y13 = new androidx.lifecycle.s0(f0.b(oa.n.class), new c(a11), new d(null, null, b13, a11));
                h10.q(y13);
            }
            h10.O();
            h10.O();
            h10.O();
            oa.n nVar = (oa.n) ((androidx.lifecycle.q0) ((androidx.lifecycle.s0) y13).getValue());
            h10.x(-909571169);
            xq.a b14 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P5 = h10.P(null) | h10.P(null);
            Object y14 = h10.y();
            if (P5 || y14 == l0.i.f39065a.a()) {
                obj = null;
                c10 = b14.c(f0.b(na.a.class), null, null);
                h10.q(c10);
            } else {
                c10 = y14;
                obj = null;
            }
            h10.O();
            h10.O();
            na.a aVar3 = (na.a) c10;
            h10.x(-909571169);
            xq.a b15 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P6 = h10.P(obj) | h10.P(obj);
            Object y15 = h10.y();
            if (P6 || y15 == l0.i.f39065a.a()) {
                Object c14 = b15.c(f0.b(oa.e.class), null, null);
                h10.q(c14);
                y15 = c14;
            }
            h10.O();
            h10.O();
            oa.e eVar = (oa.e) y15;
            h10.x(-909571169);
            xq.a b16 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P7 = h10.P(null) | h10.P(null);
            Object y16 = h10.y();
            if (P7 || y16 == l0.i.f39065a.a()) {
                obj2 = null;
                c11 = b16.c(f0.b(MRLogger.class), null, null);
                h10.q(c11);
            } else {
                c11 = y16;
                obj2 = null;
            }
            h10.O();
            h10.O();
            MRLogger mRLogger = (MRLogger) c11;
            h10.x(-909571169);
            xq.a b17 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P8 = h10.P(obj2) | h10.P(obj2);
            Object y17 = h10.y();
            if (P8 || y17 == l0.i.f39065a.a()) {
                obj3 = null;
                c12 = b17.c(f0.b(i1.class), null, null);
                h10.q(c12);
            } else {
                c12 = y17;
                obj3 = null;
            }
            h10.O();
            h10.O();
            i1 i1Var = (i1) c12;
            h10.x(-909571169);
            xq.a b18 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P9 = h10.P(obj3) | h10.P(obj3);
            Object y18 = h10.y();
            if (P9 || y18 == l0.i.f39065a.a()) {
                obj4 = null;
                c13 = b18.c(f0.b(v0.class), null, null);
                h10.q(c13);
            } else {
                c13 = y18;
                obj4 = null;
            }
            h10.O();
            h10.O();
            v0 v0Var = (v0) c13;
            h10.x(-909571169);
            xq.a b19 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P10 = h10.P(obj4) | h10.P(obj4);
            Object y19 = h10.y();
            if (P10 || y19 == l0.i.f39065a.a()) {
                t1Var = null;
                y19 = b19.c(f0.b(d0.class), null, null);
                h10.q(y19);
            } else {
                t1Var = null;
            }
            h10.O();
            h10.O();
            d0 d0Var = (d0) y19;
            t1 t1Var2 = t1Var;
            l0.c0.c(v.f59242a, new e(fVar, aVar, lVar, lVar2, null), h10, 64);
            final l lVar8 = new l(aVar3, "live_game.list");
            h10.x(1157296644);
            boolean P11 = h10.P(lVar8);
            Object y20 = h10.y();
            if (P11 || y20 == l0.i.f39065a.a()) {
                y20 = new androidx.lifecycle.r() { // from class: ja.g
                    @Override // androidx.lifecycle.r
                    public final void i(u uVar, o.b bVar2) {
                        h.c(io.a.this, uVar, bVar2);
                    }
                };
                h10.q(y20);
            }
            h10.O();
            androidx.lifecycle.o g10 = ((u) h10.G(androidx.compose.ui.platform.z.i())).g();
            p.g(g10, "LocalLifecycleOwner.current.lifecycle");
            l0.c0.a(g10, new f(g10, (androidx.lifecycle.r) y20), h10, 8);
            if (z10) {
                num = oVar.n().f();
                if (num == null) {
                    num = 0;
                }
            } else {
                num = 0;
            }
            int intValue = num.intValue();
            uf.f a12 = uf.g.a(intValue, h10, 0, 0);
            h10.x(-492369756);
            Object y21 = h10.y();
            i.a aVar4 = l0.i.f39065a;
            if (y21 == aVar4.a()) {
                y21 = z1.e(Integer.valueOf(intValue), t1Var2, 2, t1Var2);
                h10.q(y21);
            }
            h10.O();
            s0 s0Var = (s0) y21;
            h10.x(773894976);
            h10.x(-492369756);
            Object y22 = h10.y();
            if (y22 == aVar4.a()) {
                l0.s sVar = new l0.s(l0.c0.i(ao.h.f16651w, h10));
                h10.q(sVar);
                y22 = sVar;
            }
            h10.O();
            q0 d10 = ((l0.s) y22).d();
            h10.O();
            h10.x(-483455358);
            f.a aVar5 = x0.f.f59359u;
            q1.c0 a13 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a15 = q1.w.a(aVar5);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a14);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a16 = h2.a(h10);
            h2.b(a16, a13, c0787a.d());
            h2.b(a16, dVar, c0787a.b());
            h2.b(a16, qVar, c0787a.c());
            h2.b(a16, g2Var, c0787a.f());
            h10.c();
            a15.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            s1.a(d(s0Var), d1.n(d1.o(aVar5, m2.g.l(65)), 0.0f, 1, null), h0.q0.f34133a.a(h10, 8).l(), 0L, s0.c.b(h10, 381866402, true, new g(a12, s0Var)), null, s0.c.b(h10, -678460510, true, new C0502h(s0Var, eVar, "live_game.list", mRLogger, d10, i1Var, v0Var, d0Var, a12)), h10, 1597488, 40);
            uf.b.a(ja.i.values().length, null, a12, false, 0.0f, null, null, null, null, false, s0.c.b(h10, 959035215, true, new i(fVar, lVar3, lVar4, i12, nVar, lVar5, lVar6, aVar2, lVar7, aVar3, "live_game.list", eVar)), h10, 0, 6, AnalyticsListener.EVENT_AUDIO_SINK_ERROR);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            iVar2 = h10;
            l0.c0.c(a12, new j(a12, z10, pVar, eVar, "live_game.list", mRLogger, i1Var, v0Var, d0Var, null), iVar2, 64);
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new k(z10, aVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, aVar2, lVar7, i10));
    }

    public static final void c(io.a aVar, u uVar, o.b bVar) {
        p.h(aVar, "$reload");
        p.h(uVar, "<anonymous parameter 0>");
        p.h(bVar, "event");
        if (bVar == o.b.ON_RESUME) {
            aVar.invoke();
        }
    }

    public static final int d(s0<Integer> s0Var) {
        return s0Var.getValue().intValue();
    }

    public static final void e(s0<Integer> s0Var, int i10) {
        s0Var.setValue(Integer.valueOf(i10));
    }
}
