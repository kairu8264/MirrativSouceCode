package f0;

import u.l0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f31385a = m2.g.l(2);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c1.u f31386w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f31387x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31388y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e2.t f31389z;

        @co.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {49}, m = "invokeSuspend")
        /* renamed from: f0.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0324a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f31390w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ u.a<Float, u.m> f31391x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0324a(u.a<Float, u.m> aVar, ao.d<? super C0324a> dVar) {
                super(2, dVar);
                this.f31391x = aVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0324a(this.f31391x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C0324a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f31390w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> aVar = this.f31391x;
                    Float c11 = co.b.c(0.0f);
                    u.i c12 = f0.c();
                    this.f31390w = 1;
                    if (u.a.f(aVar, c11, c12, null, null, this, 12, null) == c10) {
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
        public static final class b extends jo.q implements io.l<e1.c, wn.v> {
            public final /* synthetic */ c1.u A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u.a<Float, u.m> f31392w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e2.t f31393x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e2.a0 f31394y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ r0 f31395z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(u.a<Float, u.m> aVar, e2.t tVar, e2.a0 a0Var, r0 r0Var, c1.u uVar) {
                super(1);
                this.f31392w = aVar;
                this.f31393x = tVar;
                this.f31394y = a0Var;
                this.f31395z = r0Var;
                this.A = uVar;
            }

            public final void a(e1.c cVar) {
                b1.h hVar;
                y1.z i10;
                jo.p.h(cVar, "$this$drawWithContent");
                cVar.c1();
                float l10 = po.n.l(this.f31392w.o().floatValue(), 0.0f, 1.0f);
                if (l10 == 0.0f) {
                    return;
                }
                int b10 = this.f31393x.b(y1.b0.n(this.f31394y.g()));
                t0 g10 = this.f31395z.g();
                if (g10 == null || (i10 = g10.i()) == null || (hVar = i10.d(b10)) == null) {
                    hVar = new b1.h(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float I0 = cVar.I0(f0.d());
                float f10 = I0 / 2;
                float h10 = po.n.h(hVar.i() + f10, b1.l.i(cVar.c()) - f10);
                e1.e.J0(cVar, this.A, b1.g.a(h10, hVar.l()), b1.g.a(h10, hVar.e()), I0, 0, null, l10, null, 0, 432, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
                a(cVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c1.u uVar, r0 r0Var, e2.a0 a0Var, e2.t tVar) {
            super(3);
            this.f31386w = uVar;
            this.f31387x = r0Var;
            this.f31388y = a0Var;
            this.f31389z = tVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
            if ((((c1.i1) r13).b() == c1.c0.f18634b.e()) == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final x0.f a(x0.f r11, l0.i r12, int r13) {
            /*
                r10 = this;
                java.lang.String r13 = "$this$composed"
                jo.p.h(r11, r13)
                r13 = 1634330012(0x6169e59c, float:2.6966478E20)
                r12.x(r13)
                r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
                r12.x(r13)
                java.lang.Object r13 = r12.y()
                l0.i$a r0 = l0.i.f39065a
                java.lang.Object r0 = r0.a()
                r1 = 0
                if (r13 != r0) goto L29
                r13 = 1065353216(0x3f800000, float:1.0)
                r0 = 0
                r2 = 2
                u.a r13 = u.b.b(r13, r0, r2, r1)
                r12.q(r13)
            L29:
                r12.O()
                r3 = r13
                u.a r3 = (u.a) r3
                c1.u r13 = r10.f31386w
                boolean r0 = r13 instanceof c1.i1
                r2 = 0
                r4 = 1
                if (r0 == 0) goto L4c
                c1.i1 r13 = (c1.i1) r13
                long r5 = r13.b()
                c1.c0$a r13 = c1.c0.f18634b
                long r7 = r13.e()
                int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r13 != 0) goto L49
                r13 = r4
                goto L4a
            L49:
                r13 = r2
            L4a:
                if (r13 != 0) goto L4d
            L4c:
                r2 = r4
            L4d:
                f0.r0 r13 = r10.f31387x
                boolean r13 = r13.d()
                if (r13 == 0) goto L92
                e2.a0 r13 = r10.f31388y
                long r4 = r13.g()
                boolean r13 = y1.b0.h(r4)
                if (r13 == 0) goto L92
                if (r2 == 0) goto L92
                c1.u r4 = r10.f31386w
                e2.a0 r13 = r10.f31388y
                y1.a r5 = r13.e()
                e2.a0 r13 = r10.f31388y
                long r6 = r13.g()
                y1.b0 r6 = y1.b0.b(r6)
                f0.f0$a$a r7 = new f0.f0$a$a
                r7.<init>(r3, r1)
                r9 = 0
                r8 = r12
                l0.c0.e(r4, r5, r6, r7, r8, r9)
                f0.f0$a$b r13 = new f0.f0$a$b
                e2.t r4 = r10.f31389z
                e2.a0 r5 = r10.f31388y
                f0.r0 r6 = r10.f31387x
                c1.u r7 = r10.f31386w
                r2 = r13
                r2.<init>(r3, r4, r5, r6, r7)
                x0.f r11 = z0.i.c(r11, r13)
                goto L94
            L92:
                x0.f$a r11 = x0.f.f59359u
            L94:
                r12.O()
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.f0.a.a(x0.f, l0.i, int):x0.f");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<l0.b<Float>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f31396w = new b();

        public b() {
            super(1);
        }

        public final void a(l0.b<Float> bVar) {
            jo.p.h(bVar, "$this$keyframes");
            bVar.f(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.a(valueOf, 0);
            bVar.a(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.a(valueOf2, 500);
            bVar.a(valueOf2, 999);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l0.b<Float> bVar) {
            a(bVar);
            return wn.v.f59242a;
        }
    }

    public static final x0.f b(x0.f fVar, r0 r0Var, e2.a0 a0Var, e2.t tVar, c1.u uVar, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(r0Var, "state");
        jo.p.h(a0Var, "value");
        jo.p.h(tVar, "offsetMapping");
        jo.p.h(uVar, "cursorBrush");
        return z10 ? x0.e.d(fVar, null, new a(uVar, r0Var, a0Var, tVar), 1, null) : fVar;
    }

    public static final u.i<Float> c() {
        return u.j.d(u.j.e(b.f31396w), null, 0L, 6, null);
    }

    public static final float d() {
        return f31385a;
    }
}
