package uf;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import io.l;
import io.p;
import io.r;
import jo.q;
import l0.h2;
import l0.k;
import l0.n1;
import l0.u1;
import m2.u;
import po.n;
import q1.w;
import s1.a;
import uo.q0;
import w.m;
import wn.v;
import x0.a;
import y.d1;
import y.j;
import y.r0;
import y.t0;
import z.c0;

/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ t0 B;
        public final /* synthetic */ a.c C;
        public final /* synthetic */ m D;
        public final /* synthetic */ l<Integer, Object> E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f55839w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f55840x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ uf.f f55841y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f55842z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, x0.f fVar, uf.f fVar2, boolean z10, float f10, t0 t0Var, a.c cVar, m mVar, l<? super Integer, ? extends Object> lVar, boolean z11, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, int i11, int i12, int i13) {
            super(2);
            this.f55839w = i10;
            this.f55840x = fVar;
            this.f55841y = fVar2;
            this.f55842z = z10;
            this.A = f10;
            this.B = t0Var;
            this.C = cVar;
            this.D = mVar;
            this.E = lVar;
            this.F = z11;
            this.G = rVar;
            this.H = i11;
            this.I = i12;
            this.J = i13;
        }

        public final void a(l0.i iVar, int i10) {
            b.a(this.f55839w, this.f55840x, this.f55841y, this.f55842z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, iVar, this.H | 1, this.I, this.J);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: uf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0872b extends q implements io.a<Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m f55843w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0872b(m mVar) {
            super(0);
            this.f55843w = mVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            m mVar = this.f55843w;
            qn.e eVar = mVar instanceof qn.e ? (qn.e) mVar : null;
            if (eVar != null) {
                return eVar.k();
            }
            return null;
        }
    }

    @co.f(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f55844w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ uf.f f55845x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f55846y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(uf.f fVar, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f55845x = fVar;
            this.f55846y = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f55845x, this.f55846y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f55844w == 0) {
                wn.m.b(obj);
                uf.f fVar = this.f55845x;
                fVar.u(n.d(Math.min(this.f55846y - 1, fVar.i()), 0));
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.google.accompanist.pager.Pager$Pager$4$1", f = "Pager.kt", l = {352}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f55847w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ uf.f f55848x;

        /* loaded from: classes3.dex */
        public static final class a extends q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.f f55849w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uf.f fVar) {
                super(0);
                this.f55849w = fVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f55849w.c());
            }
        }

        /* renamed from: uf.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0873b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.f f55850w;

            public C0873b(uf.f fVar) {
                this.f55850w = fVar;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                this.f55850w.p();
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* loaded from: classes3.dex */
        public static final class c implements xo.c<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f55851w;

            /* loaded from: classes3.dex */
            public static final class a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f55852w;

                @co.f(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", l = {224}, m = "emit")
                /* renamed from: uf.b$d$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0874a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f55853w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f55854x;

                    public C0874a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f55853w = obj;
                        this.f55854x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(xo.d dVar) {
                    this.f55852w = dVar;
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
                        boolean r0 = r6 instanceof uf.b.d.c.a.C0874a
                        if (r0 == 0) goto L13
                        r0 = r6
                        uf.b$d$c$a$a r0 = (uf.b.d.c.a.C0874a) r0
                        int r1 = r0.f55854x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f55854x = r1
                        goto L18
                    L13:
                        uf.b$d$c$a$a r0 = new uf.b$d$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f55853w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f55854x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        wn.m.b(r6)
                        xo.d r6 = r4.f55852w
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.f55854x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: uf.b.d.c.a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f55851w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
                Object a10 = this.f55851w.a(new a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(uf.f fVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f55848x = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f55848x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f55847w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c k10 = xo.e.k(new c(u1.m(new a(this.f55848x))), 1);
                C0873b c0873b = new C0873b(this.f55848x);
                this.f55847w = 1;
                if (k10.a(c0873b, this) == c10) {
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

    @co.f(c = "com.google.accompanist.pager.Pager$Pager$5$1", f = "Pager.kt", l = {357}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f55856w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ uf.f f55857x;

        /* loaded from: classes3.dex */
        public static final class a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.f f55858w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uf.f fVar) {
                super(0);
                this.f55858w = fVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                z.n m10 = this.f55858w.m();
                if (m10 != null) {
                    return Integer.valueOf(m10.getIndex());
                }
                return null;
            }
        }

        /* renamed from: uf.b$e$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0875b implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.f f55859w;

            public C0875b(uf.f fVar) {
                this.f55859w = fVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(Integer num, ao.d<? super v> dVar) {
                this.f55859w.x();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(uf.f fVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f55857x = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f55857x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f55856w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c j10 = xo.e.j(u1.m(new a(this.f55857x)));
                C0875b c0875b = new C0875b(this.f55857x);
                this.f55856w = 1;
                if (j10.a(c0875b, this) == c10) {
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

    @co.f(c = "com.google.accompanist.pager.Pager$Pager$6$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ t0 B;
        public final /* synthetic */ m2.q C;

        /* renamed from: w  reason: collision with root package name */
        public int f55860w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m2.d f55861x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ uf.f f55862y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f55863z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m2.d dVar, uf.f fVar, boolean z10, boolean z11, t0 t0Var, m2.q qVar, ao.d<? super f> dVar2) {
            super(2, dVar2);
            this.f55861x = dVar;
            this.f55862y = fVar;
            this.f55863z = z10;
            this.A = z11;
            this.B = t0Var;
            this.C = qVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f55861x, this.f55862y, this.f55863z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            float g10;
            bo.c.c();
            if (this.f55860w == 0) {
                wn.m.b(obj);
                m2.d dVar = this.f55861x;
                uf.f fVar = this.f55862y;
                boolean z10 = this.f55863z;
                boolean z11 = this.A;
                t0 t0Var = this.B;
                m2.q qVar = this.C;
                if (z10) {
                    if (!z11) {
                        g10 = t0Var.a();
                    } else {
                        g10 = t0Var.d();
                    }
                } else if (!z11) {
                    g10 = r0.f(t0Var, qVar);
                } else {
                    g10 = r0.g(t0Var, qVar);
                }
                fVar.s(dVar.X(g10));
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends q implements l<c0, v> {
        public final /* synthetic */ uf.e A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f55864w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f55865x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ uf.a f55866y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> f55867z;

        /* loaded from: classes3.dex */
        public static final class a extends q implements r<z.h, Integer, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.a f55868w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> f55869x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uf.e f55870y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f55871z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(uf.a aVar, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, uf.e eVar, int i10) {
                super(4);
                this.f55868w = aVar;
                this.f55869x = rVar;
                this.f55870y = eVar;
                this.f55871z = i10;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                jo.p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (iVar.P(hVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                if (k.O()) {
                    k.Z(1889356237, i12, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:404)");
                }
                x0.f E = d1.E(z.h.b(hVar, m1.c.b(x0.f.f59359u, this.f55868w, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                r<uf.d, Integer, l0.i, Integer, v> rVar = this.f55869x;
                uf.e eVar = this.f55870y;
                int i13 = this.f55871z;
                iVar.x(733328855);
                q1.c0 h10 = j.h(x0.a.f59327a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(o0.e());
                m2.q qVar = (m2.q) iVar.G(o0.j());
                g2 g2Var = (g2) iVar.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a10 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(E);
                if (!(iVar.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a10);
                } else {
                    iVar.o();
                }
                iVar.E();
                l0.i a12 = h2.a(iVar);
                h2.b(a12, h10, c0787a.d());
                h2.b(a12, dVar, c0787a.b());
                h2.b(a12, qVar, c0787a.c());
                h2.b(a12, g2Var, c0787a.f());
                iVar.c();
                a11.s0(n1.a(n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                y.l lVar = y.l.f60836a;
                rVar.F(eVar, Integer.valueOf(i10), iVar, Integer.valueOf((i12 & 112) | (i13 & 896)));
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                if (k.O()) {
                    k.Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i10, l<? super Integer, ? extends Object> lVar, uf.a aVar, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, uf.e eVar, int i11) {
            super(1);
            this.f55864w = i10;
            this.f55865x = lVar;
            this.f55866y = aVar;
            this.f55867z = rVar;
            this.A = eVar;
            this.B = i11;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            c0.e(c0Var, this.f55864w, this.f55865x, null, s0.c.c(1889356237, true, new a(this.f55866y, this.f55867z, this.A, this.B)), 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends q implements l<c0, v> {
        public final /* synthetic */ uf.e A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f55872w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f55873x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ uf.a f55874y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> f55875z;

        /* loaded from: classes3.dex */
        public static final class a extends q implements r<z.h, Integer, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uf.a f55876w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> f55877x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uf.e f55878y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f55879z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(uf.a aVar, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, uf.e eVar, int i10) {
                super(4);
                this.f55876w = aVar;
                this.f55877x = rVar;
                this.f55878y = eVar;
                this.f55879z = i10;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                jo.p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (iVar.P(hVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                if (k.O()) {
                    k.Z(-70560628, i12, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:433)");
                }
                x0.f E = d1.E(z.h.a(hVar, m1.c.b(x0.f.f59359u, this.f55876w, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                r<uf.d, Integer, l0.i, Integer, v> rVar = this.f55877x;
                uf.e eVar = this.f55878y;
                int i13 = this.f55879z;
                iVar.x(733328855);
                q1.c0 h10 = j.h(x0.a.f59327a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(o0.e());
                m2.q qVar = (m2.q) iVar.G(o0.j());
                g2 g2Var = (g2) iVar.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a10 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(E);
                if (!(iVar.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a10);
                } else {
                    iVar.o();
                }
                iVar.E();
                l0.i a12 = h2.a(iVar);
                h2.b(a12, h10, c0787a.d());
                h2.b(a12, dVar, c0787a.b());
                h2.b(a12, qVar, c0787a.c());
                h2.b(a12, g2Var, c0787a.f());
                iVar.c();
                a11.s0(n1.a(n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                y.l lVar = y.l.f60836a;
                rVar.F(eVar, Integer.valueOf(i10), iVar, Integer.valueOf((i12 & 112) | (i13 & 896)));
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                if (k.O()) {
                    k.Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(int i10, l<? super Integer, ? extends Object> lVar, uf.a aVar, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, uf.e eVar, int i11) {
            super(1);
            this.f55872w = i10;
            this.f55873x = lVar;
            this.f55874y = aVar;
            this.f55875z = rVar;
            this.A = eVar;
            this.B = i11;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyRow");
            c0.e(c0Var, this.f55872w, this.f55873x, null, s0.c.c(-70560628, true, new a(this.f55874y, this.f55875z, this.A, this.B)), 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ m C;
        public final /* synthetic */ l<Integer, Object> D;
        public final /* synthetic */ t0 E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ a.c G;
        public final /* synthetic */ a.b H;
        public final /* synthetic */ r<uf.d, Integer, l0.i, Integer, v> I;
        public final /* synthetic */ int J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f55880w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f55881x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ uf.f f55882y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f55883z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(int i10, x0.f fVar, uf.f fVar2, boolean z10, float f10, boolean z11, m mVar, l<? super Integer, ? extends Object> lVar, t0 t0Var, boolean z12, a.c cVar, a.b bVar, r<? super uf.d, ? super Integer, ? super l0.i, ? super Integer, v> rVar, int i11, int i12, int i13) {
            super(2);
            this.f55880w = i10;
            this.f55881x = fVar;
            this.f55882y = fVar2;
            this.f55883z = z10;
            this.A = f10;
            this.B = z11;
            this.C = mVar;
            this.D = lVar;
            this.E = t0Var;
            this.F = z12;
            this.G = cVar;
            this.H = bVar;
            this.I = rVar;
            this.J = i11;
            this.K = i12;
            this.L = i13;
        }

        public final void a(l0.i iVar, int i10) {
            b.b(this.f55880w, this.f55881x, this.f55882y, this.f55883z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, iVar, this.J | 1, this.K, this.L);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r33, x0.f r34, uf.f r35, boolean r36, float r37, y.t0 r38, x0.a.c r39, w.m r40, io.l<? super java.lang.Integer, ? extends java.lang.Object> r41, boolean r42, io.r<? super uf.d, ? super java.lang.Integer, ? super l0.i, ? super java.lang.Integer, wn.v> r43, l0.i r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.b.a(int, x0.f, uf.f, boolean, float, y.t0, x0.a$c, w.m, io.l, boolean, io.r, l0.i, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0204, code lost:
        if (r2 == l0.i.f39065a.a()) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r34, x0.f r35, uf.f r36, boolean r37, float r38, boolean r39, w.m r40, io.l<? super java.lang.Integer, ? extends java.lang.Object> r41, y.t0 r42, boolean r43, x0.a.c r44, x0.a.b r45, io.r<? super uf.d, ? super java.lang.Integer, ? super l0.i, ? super java.lang.Integer, wn.v> r46, l0.i r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.b.b(int, x0.f, uf.f, boolean, float, boolean, w.m, io.l, y.t0, boolean, x0.a$c, x0.a$b, io.r, l0.i, int, int, int):void");
    }

    public static final long e(long j10, boolean z10, boolean z11) {
        return b1.g.a(z10 ? b1.f.m(j10) : 0.0f, z11 ? b1.f.n(j10) : 0.0f);
    }

    public static final long f(long j10, boolean z10, boolean z11) {
        return m2.v.a(z10 ? u.h(j10) : 0.0f, z11 ? u.i(j10) : 0.0f);
    }
}
