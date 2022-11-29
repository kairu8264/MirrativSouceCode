package ab;

import ab.b;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import xo.y;

/* loaded from: classes2.dex */
public final class s extends q0 implements uo.q0 {
    public final List<w> A;
    public final List<w> B;
    public xo.r<b.f> C;
    public final xo.w<b.f> D;
    public xo.r<MRError> E;
    public final xo.w<MRError> F;
    public xo.r<wn.v> G;
    public final xo.w<wn.v> H;
    public xo.r<wn.v> I;
    public final xo.w<wn.v> J;
    public xo.r<wn.v> K;
    public final xo.w<wn.v> L;
    public final s0<ha.a> M;
    public final c2<ha.a> N;
    public final s0<i> O;
    public final c2<i> P;
    public final v0.s<k> Q;
    public final List<k> R;
    public final s0<Integer> S;
    public final s0<Integer> T;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f821y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f822z;

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseStore$on$2", f = "CoinPurchaseStore.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f823w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.f f825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.f fVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f825y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f825y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f823w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = s.this.C;
                b.f fVar = this.f825y;
                this.f823w = 1;
                if (rVar.emit(fVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseStore$on$3", f = "CoinPurchaseStore.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f826w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f826w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = s.this.G;
                wn.v vVar = wn.v.f59242a;
                this.f826w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseStore$on$4", f = "CoinPurchaseStore.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f828w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f828w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = s.this.I;
                wn.v vVar = wn.v.f59242a;
                this.f828w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseStore$on$5", f = "CoinPurchaseStore.kt", l = {122}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f830w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f830w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = s.this.K;
                wn.v vVar = wn.v.f59242a;
                this.f830w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseStore$on$6", f = "CoinPurchaseStore.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f832w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f834y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.a aVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f834y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f834y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f832w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = s.this.E;
                MRError a10 = this.f834y.a();
                this.f832w = 1;
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

    public s(q8.a aVar) {
        s0<ha.a> e10;
        s0<i> e11;
        s0<Integer> e12;
        jo.p.h(aVar, "dispatcher");
        this.f821y = aVar;
        this.f822z = r0.b();
        aVar.b(this);
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        this.B = arrayList;
        xo.r<b.f> b10 = y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        xo.r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.E = b11;
        this.F = b11;
        xo.r<wn.v> b12 = y.b(0, 0, null, 7, null);
        this.G = b12;
        this.H = b12;
        xo.r<wn.v> b13 = y.b(0, 0, null, 7, null);
        this.I = b13;
        this.J = b13;
        xo.r<wn.v> b14 = y.b(0, 0, null, 7, null);
        this.K = b14;
        this.L = b14;
        e10 = z1.e(a.d.f34697b, null, 2, null);
        this.M = e10;
        this.N = e10;
        e11 = z1.e(i.f783d.a(), null, 2, null);
        this.O = e11;
        this.P = e11;
        v0.s<k> c10 = u1.c();
        this.Q = c10;
        this.R = c10;
        e12 = z1.e(1, null, 2, null);
        this.S = e12;
        this.T = e12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f821y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f822z.getCoroutineContext();
    }

    public final xo.w<MRError> k() {
        return this.F;
    }

    public final xo.w<b.f> l() {
        return this.D;
    }

    public final c2<i> m() {
        return this.P;
    }

    public final List<k> n() {
        return this.R;
    }

    public final s0<Integer> o() {
        return this.T;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        this.M.setValue(a.b.f34695b);
        this.O.setValue(i.f783d.a());
        this.Q.clear();
    }

    public final xo.w<wn.v> p() {
        return this.H;
    }

    public final xo.w<wn.v> q() {
        return this.L;
    }

    public final xo.w<wn.v> r() {
        return this.J;
    }

    public final List<w> s() {
        return this.B;
    }

    public final c2<ha.a> t() {
        return this.N;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        k mVar;
        int i10;
        ArrayList arrayList;
        jo.p.h(fVar, "event");
        this.A.clear();
        this.A.addAll(fVar.b());
        this.M.setValue(a.d.f34697b);
        s0<i> s0Var = this.O;
        int i11 = 1;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.a().e())}, 1));
        jo.p.g(format, "format(this, *args)");
        String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.a().c())}, 1));
        jo.p.g(format2, "format(this, *args)");
        String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.a().d())}, 1));
        jo.p.g(format3, "format(this, *args)");
        s0Var.setValue(new i(format, format2, format3));
        this.Q.clear();
        v0.s<k> sVar = this.Q;
        List<w> b10 = fVar.b();
        ArrayList arrayList2 = new ArrayList(xn.t.u(b10, 10));
        for (w wVar : b10) {
            if (wVar.a().isSpecial()) {
                String sku = wVar.b().getSku();
                jo.p.g(sku, "skuDetailsWithCoinProduct.skuDetails.sku");
                Object[] objArr = new Object[i11];
                objArr[0] = Long.valueOf(wVar.a().getCoin());
                String format4 = String.format("%,d", Arrays.copyOf(objArr, 1));
                jo.p.g(format4, "format(this, *args)");
                int freeCoin = wVar.a().getFreeCoin();
                String price = wVar.b().getPrice();
                jo.p.g(price, "skuDetailsWithCoinProduct.skuDetails.price");
                mVar = new p(sku, format4, freeCoin, price, wVar.a().getSpecialRibbonUrl(), null, 32, null);
                arrayList = arrayList2;
                i10 = 1;
            } else {
                ArrayList arrayList3 = arrayList2;
                String sku2 = wVar.b().getSku();
                jo.p.g(sku2, "skuDetailsWithCoinProduct.skuDetails.sku");
                i10 = 1;
                String format5 = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(wVar.a().getCoin())}, 1));
                jo.p.g(format5, "format(this, *args)");
                int freeCoin2 = wVar.a().getFreeCoin();
                String price2 = wVar.b().getPrice();
                jo.p.g(price2, "skuDetailsWithCoinProduct.skuDetails.price");
                mVar = new m(sku2, format5, freeCoin2, price2, null, 16, null);
                arrayList = arrayList3;
            }
            arrayList.add(mVar);
            int i12 = i10;
            arrayList2 = arrayList;
            i11 = i12;
        }
        sVar.addAll(arrayList2);
        uo.l.d(this, null, null, new a(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.M.setValue(new a.C0439a(dVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new e(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        this.S.setValue(Integer.valueOf(gVar.a()));
    }
}
