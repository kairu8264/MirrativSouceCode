package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import ha.a;
import jo.f0;
import l0.c0;
import l0.h2;
import l0.l1;
import l0.n1;
import l0.u1;
import s1.a;
import uo.q0;
import y.d1;
import z.g0;
import z.h0;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f44525w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f44525w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f44525w.b().U();
            jo.p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f44526w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f44527x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f44528y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f44529z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f44526w = aVar;
            this.f44527x = aVar2;
            this.f44528y = aVar3;
            this.f44529z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f44529z;
            vq.a aVar2 = this.f44526w;
            io.a aVar3 = this.f44527x;
            return kq.c.a(this.f44528y, new kq.b(f0.b(w.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayPageKt$LiveGameDailyRankingYesterdayPage$1", f = "LiveGameDailyRankingYesterdayPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44530w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r f44531x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44532y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar, String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44531x = rVar;
            this.f44532y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44531x, this.f44532y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f44530w == 0) {
                wn.m.b(obj);
                this.f44531x.c(this.f44532y);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayPageKt$LiveGameDailyRankingYesterdayPage$2", f = "LiveGameDailyRankingYesterdayPage.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ r A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public int f44533w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f44534x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w f44535y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44536z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0 f44537w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var) {
                super(0);
                this.f44537w = g0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(this.f44537w.m());
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w f44538w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r f44539x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f44540y;

            public b(w wVar, r rVar, String str) {
                this.f44538w = wVar;
                this.f44539x = rVar;
                this.f44540y = str;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                String value;
                if (jo.p.c(this.f44538w.h().getValue(), a.d.f34697b) && (value = this.f44538w.g().getValue()) != null) {
                    r rVar = this.f44539x;
                    String str = this.f44540y;
                    if (value.length() > 0) {
                        rVar.d(str, value);
                    }
                }
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f44541w;

            /* loaded from: classes.dex */
            public static final class a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f44542w;

                @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayPageKt$LiveGameDailyRankingYesterdayPage$2$invokeSuspend$$inlined$filter$1$2", f = "LiveGameDailyRankingYesterdayPage.kt", l = {224}, m = "emit")
                /* renamed from: oa.v$d$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0670a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f44543w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f44544x;

                    public C0670a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f44543w = obj;
                        this.f44544x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(xo.d dVar) {
                    this.f44542w = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof oa.v.d.c.a.C0670a
                        if (r0 == 0) goto L13
                        r0 = r6
                        oa.v$d$c$a$a r0 = (oa.v.d.c.a.C0670a) r0
                        int r1 = r0.f44544x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f44544x = r1
                        goto L18
                    L13:
                        oa.v$d$c$a$a r0 = new oa.v$d$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f44543w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f44544x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        wn.m.b(r6)
                        xo.d r6 = r4.f44542w
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L48
                        r0.f44544x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: oa.v.d.c.a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f44541w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f44541w.a(new a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : wn.v.f59242a;
            }
        }

        /* renamed from: oa.v$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0671d implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f44546w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g0 f44547x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w f44548y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f44549z;

            /* renamed from: oa.v$d$d$a */
            /* loaded from: classes.dex */
            public static final class a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f44550w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ g0 f44551x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ w f44552y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ int f44553z;

                @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingYesterdayPageKt$LiveGameDailyRankingYesterdayPage$2$invokeSuspend$$inlined$map$1$2", f = "LiveGameDailyRankingYesterdayPage.kt", l = {224}, m = "emit")
                /* renamed from: oa.v$d$d$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0672a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f44554w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f44555x;

                    public C0672a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f44554w = obj;
                        this.f44555x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(xo.d dVar, g0 g0Var, w wVar, int i10) {
                    this.f44550w = dVar;
                    this.f44551x = g0Var;
                    this.f44552y = wVar;
                    this.f44553z = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, ao.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof oa.v.d.C0671d.a.C0672a
                        if (r0 == 0) goto L13
                        r0 = r8
                        oa.v$d$d$a$a r0 = (oa.v.d.C0671d.a.C0672a) r0
                        int r1 = r0.f44555x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f44555x = r1
                        goto L18
                    L13:
                        oa.v$d$d$a$a r0 = new oa.v$d$d$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f44554w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f44555x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r8)
                        goto L79
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        wn.m.b(r8)
                        xo.d r8 = r6.f44550w
                        java.lang.Number r7 = (java.lang.Number) r7
                        int r7 = r7.intValue()
                        z.g0 r2 = r6.f44551x
                        z.v r2 = r2.p()
                        java.util.List r2 = r2.b()
                        int r2 = r2.size()
                        int r7 = r7 + r2
                        oa.w r2 = r6.f44552y
                        l0.c2 r2 = r2.f()
                        java.lang.Object r2 = r2.getValue()
                        oa.t r2 = (oa.t) r2
                        r4 = 0
                        if (r2 == 0) goto L65
                        java.util.List r2 = r2.c()
                        if (r2 == 0) goto L65
                        int r2 = r2.size()
                        goto L66
                    L65:
                        r2 = r4
                    L66:
                        int r5 = r6.f44553z
                        int r2 = r2 - r5
                        if (r7 <= r2) goto L6c
                        r4 = r3
                    L6c:
                        java.lang.Boolean r7 = co.b.a(r4)
                        r0.f44555x = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L79
                        return r1
                    L79:
                        wn.v r7 = wn.v.f59242a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: oa.v.d.C0671d.a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public C0671d(xo.c cVar, g0 g0Var, w wVar, int i10) {
                this.f44546w = cVar;
                this.f44547x = g0Var;
                this.f44548y = wVar;
                this.f44549z = i10;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f44546w.a(new a(dVar, this.f44547x, this.f44548y, this.f44549z), dVar2);
                return a10 == bo.c.c() ? a10 : wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g0 g0Var, w wVar, int i10, r rVar, String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44534x = g0Var;
            this.f44535y = wVar;
            this.f44536z = i10;
            this.A = rVar;
            this.B = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44534x, this.f44535y, this.f44536z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44533w;
            if (i10 == 0) {
                wn.m.b(obj);
                c cVar = new c(new C0671d(u1.m(new a(this.f44534x)), this.f44534x, this.f44535y, this.f44536z));
                b bVar = new b(this.f44535y, this.A, this.B);
                this.f44533w = 1;
                if (cVar.a(bVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r f44557w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f44558x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, String str) {
            super(0);
            this.f44557w = rVar;
            this.f44558x = str;
        }

        public final void a() {
            this.f44557w.c(this.f44558x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44559w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44560x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44561y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44562z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f44559w = lVar;
            this.f44560x = lVar2;
            this.f44561y = aVar;
            this.f44562z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            v.a(this.f44559w, this.f44560x, this.f44561y, iVar, this.f44562z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(lVar, "onClickProfile");
        jo.p.h(lVar2, "onClickLive");
        jo.p.h(aVar, "onClose");
        l0.i h10 = iVar.h(1273990115);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            h10.x(1509148303);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new s0(f0.b(w.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            w wVar = (w) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(r.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            r rVar = (r) y11;
            g0 a11 = h0.a(0, 0, h10, 0, 3);
            c0.c(wn.v.f59242a, new c(rVar, "live_game.list", null), h10, 64);
            c0.c(a11, new d(a11, wVar, 2, rVar, "live_game.list", null), h10, 64);
            x0.f j10 = d1.j(d1.n(x0.f.f59359u, 0.0f, 1, null), 0.0f, 1, null);
            x0.a e10 = x0.a.f59327a.e();
            h10.x(733328855);
            q1.c0 h11 = y.j.h(e10, false, h10, 6);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a12 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a13 = q1.w.a(j10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a12);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a14 = h2.a(h10);
            h2.b(a14, h11, c0787a.d());
            h2.b(a14, dVar, c0787a.b());
            h2.b(a14, qVar, c0787a.c());
            h2.b(a14, g2Var, c0787a.f());
            h10.c();
            a13.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar3 = y.l.f60836a;
            int i12 = i11 << 6;
            x.a(a11, wVar.f(), lVar, lVar2, aVar, h10, (i12 & 896) | (i12 & 7168) | (i12 & 57344));
            l9.e.b(wVar.h().getValue(), "", new e(rVar, "live_game.list"), h10, ha.a.f34693a | 48);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new f(lVar, lVar2, aVar, i10));
    }
}
