package t;

import l0.i;
import q1.q0;
import t.d;
import u.q1;
import u.u0;
import u.z0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<t.d<S>, k> {

        /* renamed from: w */
        public static final a f52850w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final k invoke(t.d<S> dVar) {
            jo.p.h(dVar, "$this$null");
            return b.e(m.r(u.j.i(220, 90, null, 4, null), 0.0f, 2, null).b(m.v(u.j.i(220, 90, null, 4, null), 0.92f, 0L, 4, null)), m.t(u.j.i(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* renamed from: t.b$b */
    /* loaded from: classes.dex */
    public static final class C0809b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.r<t.g, S, l0.i, Integer, wn.v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w */
        public final /* synthetic */ S f52851w;

        /* renamed from: x */
        public final /* synthetic */ x0.f f52852x;

        /* renamed from: y */
        public final /* synthetic */ io.l<t.d<S>, k> f52853y;

        /* renamed from: z */
        public final /* synthetic */ x0.a f52854z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0809b(S s10, x0.f fVar, io.l<? super t.d<S>, k> lVar, x0.a aVar, io.r<? super t.g, ? super S, ? super l0.i, ? super Integer, wn.v> rVar, int i10, int i11) {
            super(2);
            this.f52851w = s10;
            this.f52852x = fVar;
            this.f52853y = lVar;
            this.f52854z = aVar;
            this.A = rVar;
            this.B = i10;
            this.C = i11;
        }

        public final void a(l0.i iVar, int i10) {
            b.a(this.f52851w, this.f52852x, this.f52853y, this.f52854z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<t.d<S>, k> {

        /* renamed from: w */
        public static final c f52855w = new c();

        static {
        }

        public c() {
            super(1);
        }

        public final k a(t.d<S> dVar) {
            jo.p.h(dVar, "$this$null");
            return b.e(m.r(u.j.i(220, 90, null, 4, null), 0.0f, 2, null).b(m.v(u.j.i(220, 90, null, 4, null), 0.92f, 0L, 4, null)), m.t(u.j.i(90, 0, null, 6, null), 0.0f, 2, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ k invoke(Object obj) {
            return a((t.d) obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<S, S> {

        /* renamed from: w */
        public static final d f52856w = new d();

        static {
        }

        public d() {
            super(1);
        }

        @Override // io.l
        public final S invoke(S s10) {
            return s10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ t.d<S> A;
        public final /* synthetic */ io.r<t.g, S, l0.i, Integer, wn.v> B;
        public final /* synthetic */ v0.s<S> C;

        /* renamed from: w */
        public final /* synthetic */ z0<S> f52857w;

        /* renamed from: x */
        public final /* synthetic */ S f52858x;

        /* renamed from: y */
        public final /* synthetic */ int f52859y;

        /* renamed from: z */
        public final /* synthetic */ io.l<t.d<S>, k> f52860z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.q<q1.e0, q1.b0, m2.b, q1.d0> {

            /* renamed from: w */
            public final /* synthetic */ k f52861w;

            /* renamed from: t.b$e$a$a */
            /* loaded from: classes.dex */
            public static final class C0810a extends jo.q implements io.l<q0.a, wn.v> {

                /* renamed from: w */
                public final /* synthetic */ q0 f52862w;

                /* renamed from: x */
                public final /* synthetic */ k f52863x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0810a(q0 q0Var, k kVar) {
                    super(1);
                    this.f52862w = q0Var;
                    this.f52863x = kVar;
                }

                public final void a(q0.a aVar) {
                    jo.p.h(aVar, "$this$layout");
                    aVar.i(this.f52862w, 0, 0, this.f52863x.d());
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                    a(aVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(3);
                this.f52861w = kVar;
            }

            public final q1.d0 a(q1.e0 e0Var, q1.b0 b0Var, long j10) {
                q1.d0 O0;
                jo.p.h(e0Var, "$this$layout");
                jo.p.h(b0Var, "measurable");
                q0 M = b0Var.M(j10);
                O0 = q1.e0.O0(e0Var, M.r0(), M.f0(), null, new C0810a(M, this.f52861w), 4, null);
                return O0;
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ q1.d0 s0(q1.e0 e0Var, q1.b0 b0Var, m2.b bVar) {
                return a(e0Var, b0Var, bVar.t());
            }
        }

        /* renamed from: t.b$e$b */
        /* loaded from: classes.dex */
        public static final class C0811b extends jo.q implements io.l<S, Boolean> {

            /* renamed from: w */
            public final /* synthetic */ S f52864w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0811b(S s10) {
                super(1);
                this.f52864w = s10;
            }

            public final Boolean a(S s10) {
                return Boolean.valueOf(jo.p.c(s10, this.f52864w));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return a(obj);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.q<t.g, l0.i, Integer, wn.v> {
            public final /* synthetic */ v0.s<S> A;

            /* renamed from: w */
            public final /* synthetic */ t.d<S> f52865w;

            /* renamed from: x */
            public final /* synthetic */ S f52866x;

            /* renamed from: y */
            public final /* synthetic */ io.r<t.g, S, l0.i, Integer, wn.v> f52867y;

            /* renamed from: z */
            public final /* synthetic */ int f52868z;

            /* loaded from: classes.dex */
            public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

                /* renamed from: w */
                public final /* synthetic */ v0.s<S> f52869w;

                /* renamed from: x */
                public final /* synthetic */ S f52870x;

                /* renamed from: y */
                public final /* synthetic */ t.d<S> f52871y;

                /* renamed from: t.b$e$c$a$a */
                /* loaded from: classes.dex */
                public static final class C0812a implements l0.z {

                    /* renamed from: a */
                    public final /* synthetic */ v0.s f52872a;

                    /* renamed from: b */
                    public final /* synthetic */ Object f52873b;

                    /* renamed from: c */
                    public final /* synthetic */ t.d f52874c;

                    public C0812a(v0.s sVar, Object obj, t.d dVar) {
                        this.f52872a = sVar;
                        this.f52873b = obj;
                        this.f52874c = dVar;
                    }

                    @Override // l0.z
                    public void dispose() {
                        this.f52872a.remove(this.f52873b);
                        this.f52874c.h().remove(this.f52873b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(v0.s<S> sVar, S s10, t.d<S> dVar) {
                    super(1);
                    this.f52869w = sVar;
                    this.f52870x = s10;
                    this.f52871y = dVar;
                }

                public final l0.z a(l0.a0 a0Var) {
                    jo.p.h(a0Var, "$this$DisposableEffect");
                    return new C0812a(this.f52869w, this.f52870x, this.f52871y);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ l0.z invoke(l0.a0 a0Var) {
                    return a(a0Var);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(t.d<S> dVar, S s10, io.r<? super t.g, ? super S, ? super l0.i, ? super Integer, wn.v> rVar, int i10, v0.s<S> sVar) {
                super(3);
                this.f52865w = dVar;
                this.f52866x = s10;
                this.f52867y = rVar;
                this.f52868z = i10;
                this.A = sVar;
            }

            public final void a(t.g gVar, l0.i iVar, int i10) {
                jo.p.h(gVar, "$this$AnimatedVisibility");
                if ((i10 & 14) == 0) {
                    i10 |= iVar.P(gVar) ? 4 : 2;
                }
                if (((i10 & 91) ^ 18) == 0 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i11 = i10 & 14;
                l0.c0.a(gVar, new a(this.A, this.f52866x, this.f52865w), iVar, i11);
                this.f52865w.h().put(this.f52866x, ((h) gVar).b());
                this.f52867y.F(gVar, this.f52866x, iVar, Integer.valueOf(i11 | ((this.f52868z >> 9) & 896)));
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(t.g gVar, l0.i iVar, Integer num) {
                a(gVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(z0<S> z0Var, S s10, int i10, io.l<? super t.d<S>, k> lVar, t.d<S> dVar, io.r<? super t.g, ? super S, ? super l0.i, ? super Integer, wn.v> rVar, v0.s<S> sVar) {
            super(2);
            this.f52857w = z0Var;
            this.f52858x = s10;
            this.f52859y = i10;
            this.f52860z = lVar;
            this.A = dVar;
            this.B = rVar;
            this.C = sVar;
        }

        public final void a(l0.i iVar, int i10) {
            if (((i10 & 11) ^ 2) == 0 && iVar.j()) {
                iVar.I();
                return;
            }
            io.l<t.d<S>, k> lVar = this.f52860z;
            z0.b bVar = this.A;
            iVar.x(-3687241);
            k y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = lVar.invoke(bVar);
                iVar.q(y10);
            }
            iVar.O();
            k kVar = (k) y10;
            Boolean valueOf = Boolean.valueOf(jo.p.c(this.f52857w.k().a(), this.f52858x));
            io.l<t.d<S>, k> lVar2 = this.f52860z;
            z0.b bVar2 = this.A;
            iVar.x(-3686930);
            boolean P = iVar.P(valueOf);
            Object y11 = iVar.y();
            if (P || y11 == aVar.a()) {
                y11 = lVar2.invoke(bVar2).a();
                iVar.q(y11);
            }
            iVar.O();
            p pVar = (p) y11;
            S s10 = this.f52858x;
            z0<S> z0Var = this.f52857w;
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = new d.a(jo.p.c(s10, z0Var.m()));
                iVar.q(y12);
            }
            iVar.O();
            d.a aVar2 = (d.a) y12;
            n c10 = kVar.c();
            x0.f a10 = q1.z.a(x0.f.f59359u, new a(kVar));
            aVar2.b(jo.p.c(this.f52858x, this.f52857w.m()));
            t.f.b(this.f52857w, new C0811b(this.f52858x), a10.L(aVar2), c10, pVar, s0.c.b(iVar, -819913132, true, new c(this.A, this.f52858x, this.B, this.f52859y, this.C)), iVar, (this.f52859y & 14) | 196608, 0);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<S, Object> A;
        public final /* synthetic */ io.r<t.g, S, l0.i, Integer, wn.v> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w */
        public final /* synthetic */ z0<S> f52875w;

        /* renamed from: x */
        public final /* synthetic */ x0.f f52876x;

        /* renamed from: y */
        public final /* synthetic */ io.l<t.d<S>, k> f52877y;

        /* renamed from: z */
        public final /* synthetic */ x0.a f52878z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(z0<S> z0Var, x0.f fVar, io.l<? super t.d<S>, k> lVar, x0.a aVar, io.l<? super S, ? extends Object> lVar2, io.r<? super t.g, ? super S, ? super l0.i, ? super Integer, wn.v> rVar, int i10, int i11) {
            super(2);
            this.f52875w = z0Var;
            this.f52876x = fVar;
            this.f52877y = lVar;
            this.f52878z = aVar;
            this.A = lVar2;
            this.B = rVar;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            b.b(this.f52875w, this.f52876x, this.f52877y, this.f52878z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<m2.o, m2.o, u0<m2.o>> {

        /* renamed from: w */
        public static final g f52879w = new g();

        static {
        }

        public g() {
            super(2);
        }

        public final u0<m2.o> a(long j10, long j11) {
            return u.j.g(0.0f, 0.0f, m2.o.b(q1.f(m2.o.f40537b)), 3, null);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ u0<m2.o> invoke(m2.o oVar, m2.o oVar2) {
            return a(oVar.j(), oVar2.j());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void a(S r16, x0.f r17, io.l<? super t.d<S>, t.k> r18, x0.a r19, io.r<? super t.g, ? super S, ? super l0.i, ? super java.lang.Integer, wn.v> r20, l0.i r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.a(java.lang.Object, x0.f, io.l, x0.a, io.r, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void b(u.z0<S> r23, x0.f r24, io.l<? super t.d<S>, t.k> r25, x0.a r26, io.l<? super S, ? extends java.lang.Object> r27, io.r<? super t.g, ? super S, ? super l0.i, ? super java.lang.Integer, wn.v> r28, l0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.b(u.z0, x0.f, io.l, x0.a, io.l, io.r, l0.i, int, int):void");
    }

    public static final x c(boolean z10, io.p<? super m2.o, ? super m2.o, ? extends u.c0<m2.o>> pVar) {
        jo.p.h(pVar, "sizeAnimationSpec");
        return new y(z10, pVar);
    }

    public static /* synthetic */ x d(boolean z10, io.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pVar = g.f52879w;
        }
        return c(z10, pVar);
    }

    public static final k e(n nVar, p pVar) {
        jo.p.h(nVar, "<this>");
        jo.p.h(pVar, "exit");
        return new k(nVar, pVar, 0.0f, null, 12, null);
    }
}
