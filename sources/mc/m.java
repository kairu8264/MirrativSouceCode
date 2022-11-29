package mc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.a;
import pd.i1;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import xn.a0;

/* loaded from: classes2.dex */
public final class m extends q0 implements uo.q0 {
    public final LiveData<BroadcastResult> A;
    public final e0<y> B;
    public final LiveData<y> C;
    public final e0<ChatStatus> D;
    public final LiveData<ChatStatus> E;
    public final xo.r<wn.v> F;
    public final xo.w<wn.v> G;
    public final xo.r<MRError> H;
    public final xo.w<MRError> I;
    public final xo.r<MRError> J;
    public final xo.w<MRError> K;
    public final xo.r<MRError> L;
    public final xo.w<MRError> M;
    public final xo.r<MRError> N;
    public final xo.w<MRError> O;
    public final xo.r<MRError> P;
    public final xo.w<MRError> Q;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f40795y;

    /* renamed from: z  reason: collision with root package name */
    public final e0<BroadcastResult> f40796z;

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$1", f = "BroadcastResultStore.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40797w;

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
            int i10 = this.f40797w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.F;
                wn.v vVar = wn.v.f59242a;
                this.f40797w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$2", f = "BroadcastResultStore.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40799w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a.m f40801y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a.m mVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f40801y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f40801y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40799w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.H;
                MRError a10 = this.f40801y.a();
                this.f40799w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$3", f = "BroadcastResultStore.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40802w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a.e f40804y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.e eVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f40804y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f40804y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40802w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.J;
                MRError a10 = this.f40804y.a();
                this.f40802w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$4", f = "BroadcastResultStore.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40805w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a.i f40807y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.i iVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f40807y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f40807y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40805w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.L;
                MRError a10 = this.f40807y.a();
                this.f40805w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$5", f = "BroadcastResultStore.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40808w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a.c f40810y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a.c cVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f40810y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f40810y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40808w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.N;
                MRError a10 = this.f40810y.a();
                this.f40808w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultStore$on$6", f = "BroadcastResultStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40811w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a.g f40813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a.g gVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f40813y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f40813y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40811w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = m.this.P;
                MRError a10 = this.f40813y.a();
                this.f40811w = 1;
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

    public m(q8.a aVar) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f40795y = c10.plus(b10);
        aVar.b(this);
        e0<BroadcastResult> e0Var = new e0<>(null);
        this.f40796z = e0Var;
        this.A = e0Var;
        e0<y> e0Var2 = new e0<>(null);
        this.B = e0Var2;
        this.C = e0Var2;
        e0<ChatStatus> e0Var3 = new e0<>(null);
        this.D = e0Var3;
        this.E = e0Var3;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.F = b11;
        this.G = b11;
        xo.r<MRError> b12 = xo.y.b(0, 0, null, 7, null);
        this.H = b12;
        this.I = b12;
        xo.r<MRError> b13 = xo.y.b(0, 0, null, 7, null);
        this.J = b13;
        this.K = b13;
        xo.r<MRError> b14 = xo.y.b(0, 0, null, 7, null);
        this.L = b14;
        this.M = b14;
        xo.r<MRError> b15 = xo.y.b(0, 0, null, 7, null);
        this.N = b15;
        this.O = b15;
        xo.r<MRError> b16 = xo.y.b(0, 0, null, 7, null);
        this.P = b16;
        this.Q = b16;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f40795y;
    }

    public final LiveData<BroadcastResult> l() {
        return this.A;
    }

    public final LiveData<ChatStatus> m() {
        return this.E;
    }

    public final xo.w<MRError> n() {
        return this.O;
    }

    public final xo.w<MRError> o() {
        return this.K;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.C0710a c0710a) {
        jo.p.h(c0710a, "event");
        this.f40796z.p(c0710a.a());
        this.D.p(c0710a.a().getChatStatus());
    }

    public final LiveData<y> p() {
        return this.C;
    }

    public final xo.w<MRError> q() {
        return this.Q;
    }

    public final xo.w<MRError> r() {
        return this.M;
    }

    public final xo.w<MRError> s() {
        return this.I;
    }

    public final xo.w<wn.v> t() {
        return this.G;
    }

    public final y u() {
        n a10;
        y f10 = this.B.f();
        if (f10 == null) {
            return null;
        }
        List<n> f11 = f10.f();
        ArrayList arrayList = new ArrayList(xn.t.u(f11, 10));
        for (n nVar : f11) {
            a10 = nVar.a((r34 & 1) != 0 ? nVar.f40814w : null, (r34 & 2) != 0 ? nVar.f40815x : null, (r34 & 4) != 0 ? nVar.f40816y : null, (r34 & 8) != 0 ? nVar.f40817z : 0, (r34 & 16) != 0 ? nVar.A : null, (r34 & 32) != 0 ? nVar.B : false, (r34 & 64) != 0 ? nVar.C : true, (r34 & 128) != 0 ? nVar.D : false, (r34 & 256) != 0 ? nVar.E : true, (r34 & 512) != 0 ? nVar.F : null, (r34 & 1024) != 0 ? nVar.G : 0, (r34 & 2048) != 0 ? nVar.H : 0, (r34 & 4096) != 0 ? nVar.I : 0, (r34 & 8192) != 0 ? nVar.J : null, (r34 & 16384) != 0 ? nVar.K : null, (r34 & 32768) != 0 ? nVar.L : 0);
            arrayList.add(a10);
        }
        return y.b(f10, arrayList, true, 0, 0, 12, null);
    }

    public final y v(String str, boolean z10) {
        y f10 = this.B.f();
        if (f10 == null) {
            return null;
        }
        List<n> f11 = f10.f();
        ArrayList arrayList = new ArrayList(xn.t.u(f11, 10));
        for (n nVar : f11) {
            if (jo.p.c(nVar.l(), str)) {
                nVar = nVar.a((r34 & 1) != 0 ? nVar.f40814w : null, (r34 & 2) != 0 ? nVar.f40815x : null, (r34 & 4) != 0 ? nVar.f40816y : null, (r34 & 8) != 0 ? nVar.f40817z : 0, (r34 & 16) != 0 ? nVar.A : null, (r34 & 32) != 0 ? nVar.B : false, (r34 & 64) != 0 ? nVar.C : z10, (r34 & 128) != 0 ? nVar.D : false, (r34 & 256) != 0 ? nVar.E : false, (r34 & 512) != 0 ? nVar.F : null, (r34 & 1024) != 0 ? nVar.G : 0, (r34 & 2048) != 0 ? nVar.H : 0, (r34 & 4096) != 0 ? nVar.I : 0, (r34 & 8192) != 0 ? nVar.J : null, (r34 & 16384) != 0 ? nVar.K : null, (r34 & 32768) != 0 ? nVar.L : 0);
            }
            arrayList.add(nVar);
        }
        return y.b(f10, arrayList, false, 0, 0, 14, null);
    }

    public final y w(String str, int i10) {
        y f10 = this.B.f();
        if (f10 == null) {
            return null;
        }
        List<n> f11 = f10.f();
        ArrayList arrayList = new ArrayList(xn.t.u(f11, 10));
        for (n nVar : f11) {
            if (jo.p.c(nVar.l(), str)) {
                nVar = nVar.a((r34 & 1) != 0 ? nVar.f40814w : null, (r34 & 2) != 0 ? nVar.f40815x : null, (r34 & 4) != 0 ? nVar.f40816y : null, (r34 & 8) != 0 ? nVar.f40817z : 0, (r34 & 16) != 0 ? nVar.A : null, (r34 & 32) != 0 ? nVar.B : false, (r34 & 64) != 0 ? nVar.C : false, (r34 & 128) != 0 ? nVar.D : false, (r34 & 256) != 0 ? nVar.E : false, (r34 & 512) != 0 ? nVar.F : null, (r34 & 1024) != 0 ? nVar.G : 2, (r34 & 2048) != 0 ? nVar.H : i10 + 1, (r34 & 4096) != 0 ? nVar.I : 0, (r34 & 8192) != 0 ? nVar.J : null, (r34 & 16384) != 0 ? nVar.K : null, (r34 & 32768) != 0 ? nVar.L : 0);
            }
            arrayList.add(nVar);
        }
        return y.b(f10, arrayList, false, 0, 0, 14, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.k kVar) {
        jo.p.h(kVar, "event");
        this.B.p(y.f40850e.a(kVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.b bVar) {
        List<n> k10;
        jo.p.h(bVar, "event");
        y f10 = this.B.f();
        if (f10 == null || (k10 = f10.f()) == null) {
            k10 = xn.s.k();
        }
        y f11 = this.B.f();
        boolean d10 = f11 != null ? f11.d() : false;
        List<UserBasicWithGraphParams> users = bVar.a().getUsers();
        ArrayList arrayList = new ArrayList(xn.t.u(users, 10));
        for (UserBasicWithGraphParams userBasicWithGraphParams : users) {
            arrayList.add(n.M.a(userBasicWithGraphParams, d10));
        }
        this.B.p(new y(a0.o0(k10, arrayList), d10, bVar.a().getCurrentPage(), bVar.a().getNextPage()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new b(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.f fVar) {
        jo.p.h(fVar, "event");
        this.B.p(v(fVar.a(), true));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new c(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.j jVar) {
        jo.p.h(jVar, "event");
        this.B.p(v(jVar.a(), false));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new d(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.d dVar) {
        jo.p.h(dVar, "event");
        this.B.p(u());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new e(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.o oVar) {
        jo.p.h(oVar, "event");
        this.B.p(v(oVar.b(), true));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(i1.g0 g0Var) {
        jo.p.h(g0Var, "event");
        this.B.p(v(g0Var.a(), false));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.h hVar) {
        jo.p.h(hVar, "event");
        this.B.p(w(hVar.b(), hVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new f(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a.l lVar) {
        jo.p.h(lVar, "event");
        this.D.p(lVar.a());
    }
}
