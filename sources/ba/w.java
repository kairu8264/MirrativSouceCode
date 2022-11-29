package ba;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoGameStatusType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunOpenGiftGachaResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrorman.unity.MiniGameStateType;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.c;
import pd.k;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import xn.a0;
import xo.y;

/* loaded from: classes.dex */
public final class w extends q0 implements uo.q0 {
    public final ao.g A;
    public final e0<EmomoRunEventResponse> B;
    public final LiveData<EmomoRunEventResponse> C;
    public final e0<EmomoRunScoreResponse> D;
    public final LiveData<EmomoRunScoreResponse> E;
    public final e0<EmomoRunGameResponse> F;
    public final LiveData<EmomoRunGameResponse> G;
    public final e0<EmomoRunGameResponse> H;
    public final LiveData<EmomoRunGameResponse> I;
    public final e0<jf.c> J;
    public final LiveData<jf.c> K;
    public final e0<Integer> L;
    public final LiveData<Integer> M;
    public final e0<EmomoGameStatusType> N;
    public final LiveData<EmomoGameStatusType> O;
    public final e0<MiniGameStateType> P;
    public final LiveData<MiniGameStateType> Q;
    public final e0<List<EmomoRunGameGift>> R;
    public final LiveData<List<EmomoRunGameGift>> S;
    public final e0<List<EmomoRunGameEffect>> T;
    public final LiveData<List<EmomoRunGameEffect>> U;
    public final e0<EmomoRunGameGift> V;
    public final LiveData<EmomoRunGameGift> W;
    public final e0<Boolean> X;
    public final LiveData<Boolean> Y;
    public final e0<Boolean> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final LiveData<Boolean> f17204a0;

    /* renamed from: b0  reason: collision with root package name */
    public final e0<MRError> f17205b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LiveData<MRError> f17206c0;

    /* renamed from: d0  reason: collision with root package name */
    public final xo.r<Integer> f17207d0;

    /* renamed from: e0  reason: collision with root package name */
    public final xo.r<EmomoRunOpenGiftGachaResponse> f17208e0;

    /* renamed from: f0  reason: collision with root package name */
    public final xo.r<MRError> f17209f0;

    /* renamed from: g0  reason: collision with root package name */
    public final e0<Boolean> f17210g0;

    /* renamed from: h0  reason: collision with root package name */
    public final LiveData<Boolean> f17211h0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f17212y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f17213z;

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunStore$on$1", f = "EmomoRunStore.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17214w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k.C0718k f17216y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k.C0718k c0718k, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f17216y = c0718k;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f17216y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17214w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = w.this.f17207d0;
                Integer d10 = co.b.d(this.f17216y.a().getRemainingGachaCount());
                this.f17214w = 1;
                if (rVar.emit(d10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunStore$on$4", f = "EmomoRunStore.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17217w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k.e f17219y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k.e eVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f17219y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f17219y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17217w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = w.this.f17208e0;
                EmomoRunOpenGiftGachaResponse a10 = this.f17219y.a();
                this.f17217w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunStore$on$5", f = "EmomoRunStore.kt", l = {183}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17220w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k.d f17222y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k.d dVar, ao.d<? super c> dVar2) {
            super(2, dVar2);
            this.f17222y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f17222y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17220w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = w.this.f17209f0;
                MRError a10 = this.f17222y.a();
                this.f17220w = 1;
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

    public w(q8.a aVar) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f17212y = aVar;
        this.f17213z = r0.b();
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.A = c10.plus(b10);
        e0<EmomoRunEventResponse> e0Var = new e0<>(null);
        this.B = e0Var;
        this.C = e0Var;
        e0<EmomoRunScoreResponse> e0Var2 = new e0<>(null);
        this.D = e0Var2;
        this.E = e0Var2;
        e0<EmomoRunGameResponse> e0Var3 = new e0<>(null);
        this.F = e0Var3;
        this.G = e0Var3;
        e0<EmomoRunGameResponse> e0Var4 = new e0<>(null);
        this.H = e0Var4;
        this.I = e0Var4;
        e0<jf.c> e0Var5 = new e0<>(null);
        this.J = e0Var5;
        this.K = e0Var5;
        e0<Integer> e0Var6 = new e0<>(0);
        this.L = e0Var6;
        this.M = e0Var6;
        e0<EmomoGameStatusType> e0Var7 = new e0<>(null);
        this.N = e0Var7;
        this.O = e0Var7;
        e0<MiniGameStateType> e0Var8 = new e0<>(MiniGameStateType.UNLOADED);
        this.P = e0Var8;
        this.Q = e0Var8;
        e0<List<EmomoRunGameGift>> e0Var9 = new e0<>(xn.s.k());
        this.R = e0Var9;
        this.S = e0Var9;
        e0<List<EmomoRunGameEffect>> e0Var10 = new e0<>(xn.s.k());
        this.T = e0Var10;
        this.U = e0Var10;
        e0<EmomoRunGameGift> e0Var11 = new e0<>(null);
        this.V = e0Var11;
        this.W = e0Var11;
        Boolean bool = Boolean.FALSE;
        e0<Boolean> e0Var12 = new e0<>(bool);
        this.X = e0Var12;
        this.Y = e0Var12;
        e0<Boolean> e0Var13 = new e0<>(bool);
        this.Z = e0Var13;
        this.f17204a0 = e0Var13;
        e0<MRError> e0Var14 = new e0<>(null);
        this.f17205b0 = e0Var14;
        this.f17206c0 = e0Var14;
        this.f17207d0 = y.b(0, 0, null, 7, null);
        this.f17208e0 = y.b(0, 0, null, 7, null);
        this.f17209f0 = y.b(0, 0, null, 7, null);
        e0<Boolean> e0Var15 = new e0<>(Boolean.TRUE);
        this.f17210g0 = e0Var15;
        this.f17211h0 = e0Var15;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f17212y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final LiveData<jf.c> i() {
        return this.K;
    }

    public final LiveData<EmomoRunEventResponse> j() {
        return this.C;
    }

    public final LiveData<EmomoRunGameResponse> k() {
        return this.G;
    }

    public final LiveData<List<EmomoRunGameEffect>> l() {
        return this.U;
    }

    public final LiveData<EmomoRunGameGift> m() {
        return this.W;
    }

    public final LiveData<List<EmomoRunGameGift>> n() {
        return this.S;
    }

    public final LiveData<Integer> o() {
        return this.M;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.g gVar) {
        jo.p.h(gVar, "event");
        this.B.p(gVar.a());
    }

    public final LiveData<MiniGameStateType> p() {
        return this.Q;
    }

    public final LiveData<EmomoGameStatusType> q() {
        return this.O;
    }

    public final LiveData<MRError> r() {
        return this.f17206c0;
    }

    public final LiveData<EmomoRunScoreResponse> s() {
        return this.E;
    }

    public final xo.w<MRError> t() {
        return xo.e.b(this.f17209f0);
    }

    public final xo.w<EmomoRunOpenGiftGachaResponse> u() {
        return xo.e.b(this.f17208e0);
    }

    public final LiveData<EmomoRunGameResponse> v() {
        return this.I;
    }

    public final xo.w<Integer> w() {
        return xo.e.b(this.f17207d0);
    }

    public final LiveData<Boolean> x() {
        return this.f17211h0;
    }

    public final LiveData<Boolean> y() {
        return this.f17204a0;
    }

    public final LiveData<Boolean> z() {
        return this.Y;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.h hVar) {
        jo.p.h(hVar, "event");
        this.D.p(hVar.a());
        this.R.p(hVar.a().getGameGifts());
        this.T.p(hVar.a().getGameEffects());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.C0718k c0718k) {
        jo.p.h(c0718k, "event");
        this.H.p(this.F.f());
        this.F.p(c0718k.a());
        this.L.p(Integer.valueOf(c0718k.a().getGameNo()));
        this.N.p(c0718k.a().getGameStatus());
        uo.l.d(this, null, null, new a(c0718k, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.l lVar) {
        jo.p.h(lVar, "event");
        this.P.p(lVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.b bVar) {
        jo.p.h(bVar, "event");
        List<EmomoRunGameGift> f10 = this.R.f();
        if (f10 != null) {
            e0<List<EmomoRunGameGift>> e0Var = this.R;
            ArrayList arrayList = new ArrayList();
            for (Object obj : f10) {
                if (!(((EmomoRunGameGift) obj).getGameGiftId() == bVar.a())) {
                    arrayList.add(obj);
                }
            }
            e0Var.p(a0.D0(arrayList));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.f fVar) {
        jo.p.h(fVar, "event");
        this.J.p(fVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.e0 e0Var) {
        jo.p.h(e0Var, "event");
        EmomoRunGameGift emomoRunGameGift = new EmomoRunGameGift(e0Var.a().getUserId(), e0Var.a().getName(), e0Var.a().getProfileImageUrl(), e0Var.a().getGameGiftId(), e0Var.a().getGameGiftType(), e0Var.a().getGameGiftCommand(), e0Var.a().getConsumedScore());
        List<EmomoRunGameGift> f10 = this.R.f();
        if (f10 != null) {
            e0<List<EmomoRunGameGift>> e0Var2 = this.R;
            jo.p.g(f10, "gameGifts");
            List<EmomoRunGameGift> D0 = a0.D0(f10);
            D0.add(emomoRunGameGift);
            e0Var2.p(D0);
        }
        this.V.p(emomoRunGameGift);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.j jVar) {
        jo.p.h(jVar, "event");
        if (jo.p.c(this.X.f(), Boolean.valueOf(jVar.a()))) {
            return;
        }
        this.X.p(Boolean.valueOf(jVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.C0712c c0712c) {
        jo.p.h(c0712c, "event");
        this.Z.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.a aVar) {
        jo.p.h(aVar, "event");
        this.f17205b0.p(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.c cVar) {
        jo.p.h(cVar, "event");
        this.f17210g0.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new b(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new c(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(k.i iVar) {
        jo.p.h(iVar, "event");
        this.f17210g0.p(Boolean.TRUE);
    }
}
