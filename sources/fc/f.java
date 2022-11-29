package fc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import fc.b;
import hf.c;
import io.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.w;
import org.greenrobot.eventbus.ThreadMode;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.o2;
import wn.v;
import xb.t;
import xn.s;
import xo.r;
import xo.y;

/* loaded from: classes2.dex */
public final class f extends q0 implements uo.q0 {
    public e0<List<c.a>> A;
    public LiveData<List<c.a>> B;
    public e0<w> C;
    public LiveData<w> D;
    public final wo.f<MRError> E;
    public final e0<List<t>> F;
    public final LiveData<List<t>> G;
    public final e0<t> H;
    public final LiveData<t> I;
    public final r<v> J;
    public final xo.w<v> K;
    public final r<MRError> L;
    public final xo.w<MRError> M;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f31930y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f31931z;

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditStore$on$1", f = "FloatingControlEditStore.kt", l = {71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31932w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f31934y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f31934y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f31934y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31932w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.E;
                MRError a10 = this.f31934y.a();
                this.f31932w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditStore$on$4", f = "FloatingControlEditStore.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31935w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31935w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = f.this.J;
                v vVar = v.f59242a;
                this.f31935w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditStore$on$6", f = "FloatingControlEditStore.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31937w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.e f31939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.e eVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f31939y = eVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f31939y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31937w;
            if (i10 == 0) {
                wn.m.b(obj);
                r rVar = f.this.L;
                MRError a10 = this.f31939y.a();
                this.f31937w = 1;
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

    public f(q8.a aVar) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f31930y = aVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f31931z = c10.plus(b10);
        e0<List<c.a>> e0Var = new e0<>(s.k());
        this.A = e0Var;
        this.B = e0Var;
        e0<w> e0Var2 = new e0<>(null);
        this.C = e0Var2;
        this.D = e0Var2;
        this.E = wo.g.a(-2);
        e0<List<t>> e0Var3 = new e0<>();
        this.F = e0Var3;
        this.G = e0Var3;
        e0<t> e0Var4 = new e0<>();
        this.H = e0Var4;
        this.I = e0Var4;
        r<v> b11 = y.b(0, 0, null, 7, null);
        this.J = b11;
        this.K = b11;
        r<MRError> b12 = y.b(0, 0, null, 7, null);
        this.L = b12;
        this.M = b12;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f31930y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f31931z;
    }

    public final LiveData<List<c.a>> i() {
        return this.B;
    }

    public final xo.w<MRError> j() {
        return this.M;
    }

    public final xo.c<MRError> k() {
        return xo.e.a(this.E);
    }

    public final LiveData<List<t>> l() {
        return this.G;
    }

    public final xo.w<v> m() {
        return this.K;
    }

    public final LiveData<t> n() {
        return this.I;
    }

    public final LiveData<w> o() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(dVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.g gVar) {
        jo.p.h(gVar, "event");
        this.C.p(gVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final d2 on(b.c cVar) {
        d2 d10;
        jo.p.h(cVar, "event");
        d10 = uo.l.d(this, null, null, new a(cVar, null), 3, null);
        return d10;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0350b c0350b) {
        Object obj;
        t tVar;
        Object obj2;
        jo.p.h(c0350b, "event");
        Iterator<T> it = c0350b.a().getRankings().iterator();
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
        e0<List<t>> e0Var = this.F;
        List<RankingFocusableResponse.RankingFocusable> rankings = c0350b.a().getRankings();
        ArrayList arrayList = new ArrayList(xn.t.u(rankings, 10));
        for (RankingFocusableResponse.RankingFocusable rankingFocusable : rankings) {
            arrayList.add(t.f60098h.a(rankingFocusable, z10, rankingFocusable.isFocus()));
        }
        e0Var.p(arrayList);
        e0<t> e0Var2 = this.H;
        List<t> f10 = this.F.f();
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
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x004d A[EDGE_INSN: B:41:0x004d->B:19:0x004d ?: BREAK  , SYNTHETIC] */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(fc.b.f r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "event"
            r2 = r18
            jo.p.h(r2, r1)
            androidx.lifecycle.LiveData<java.util.List<xb.t>> r1 = r0.G
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
            androidx.lifecycle.e0<xb.t> r1 = r0.H
            r1.p(r6)
            androidx.lifecycle.e0<java.util.List<xb.t>> r1 = r0.F
            androidx.lifecycle.LiveData<java.util.List<xb.t>> r4 = r0.G
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
        throw new UnsupportedOperationException("Method not decompiled: fc.f.on(fc.b$f):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new c(eVar, null), 3, null);
    }
}
