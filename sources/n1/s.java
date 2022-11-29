package n1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r f41515w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f41516x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, boolean z10) {
            super(1);
            this.f41515w = rVar;
            this.f41516x = z10;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("pointerHoverIcon");
            c1Var.a().b("icon", this.f41515w);
            c1Var.a().b("overrideDescendants", Boolean.valueOf(this.f41516x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r f41517w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f41518x;

        @co.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {74}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ r A;

            /* renamed from: w  reason: collision with root package name */
            public int f41519w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f41520x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f41521y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ t f41522z;

            @co.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", l = {80}, m = "invokeSuspend")
            /* renamed from: n1.s$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0613a extends co.k implements io.p<c, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ t A;
                public final /* synthetic */ r B;

                /* renamed from: x  reason: collision with root package name */
                public int f41523x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ Object f41524y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ boolean f41525z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0613a(boolean z10, t tVar, r rVar, ao.d<? super C0613a> dVar) {
                    super(2, dVar);
                    this.f41525z = z10;
                    this.A = tVar;
                    this.B = rVar;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(c cVar, ao.d<? super wn.v> dVar) {
                    return ((C0613a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    C0613a c0613a = new C0613a(this.f41525z, this.A, this.B, dVar);
                    c0613a.f41524y = obj;
                    return c0613a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please submit an issue!!! */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r12.f41523x
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r12.f41524y
                        n1.c r1 = (n1.c) r1
                        wn.m.b(r13)
                        r3 = r1
                        r1 = r0
                        r0 = r12
                        goto L40
                    L16:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1e:
                        wn.m.b(r13)
                        java.lang.Object r13 = r12.f41524y
                        n1.c r13 = (n1.c) r13
                        r1 = r13
                        r13 = r12
                    L27:
                        boolean r3 = r13.f41525z
                        if (r3 == 0) goto L2e
                        n1.o r3 = n1.o.Main
                        goto L30
                    L2e:
                        n1.o r3 = n1.o.Initial
                    L30:
                        r13.f41524y = r1
                        r13.f41523x = r2
                        java.lang.Object r3 = r1.t0(r3, r13)
                        if (r3 != r0) goto L3b
                        return r0
                    L3b:
                        r11 = r0
                        r0 = r13
                        r13 = r3
                        r3 = r1
                        r1 = r11
                    L40:
                        n1.m r13 = (n1.m) r13
                        int r4 = r13.f()
                        n1.p$a r5 = n1.p.f41507a
                        int r6 = r5.e()
                        boolean r4 = n1.p.i(r4, r6)
                        r6 = 0
                        if (r4 == 0) goto L6e
                        java.util.List r4 = r13.c()
                        java.lang.Object r4 = r4.get(r6)
                        n1.w r4 = (n1.w) r4
                        long r7 = r3.a()
                        b1.l$a r9 = b1.l.f16742b
                        long r9 = r9.b()
                        boolean r4 = n1.n.f(r4, r7, r9)
                        if (r4 == 0) goto L6e
                        r6 = r2
                    L6e:
                        int r13 = r13.f()
                        int r4 = r5.b()
                        boolean r13 = n1.p.i(r13, r4)
                        if (r13 != 0) goto L85
                        if (r6 != 0) goto L85
                        n1.t r13 = r0.A
                        n1.r r4 = r0.B
                        r13.a(r4)
                    L85:
                        r13 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n1.s.b.a.C0613a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, t tVar, r rVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f41521y = z10;
                this.f41522z = tVar;
                this.A = rVar;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f41521y, this.f41522z, this.A, dVar);
                aVar.f41520x = obj;
                return aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f41519w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    C0613a c0613a = new C0613a(this.f41521y, this.f41522z, this.A, null);
                    this.f41519w = 1;
                    if (((e0) this.f41520x).N(c0613a, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, boolean z10) {
            super(3);
            this.f41517w = rVar;
            this.f41518x = z10;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            x0.f c10;
            jo.p.h(fVar, "$this$composed");
            iVar.x(811087536);
            t tVar = (t) iVar.G(androidx.compose.ui.platform.o0.k());
            if (tVar == null) {
                c10 = x0.f.f59359u;
            } else {
                c10 = o0.c(fVar, this.f41517w, Boolean.valueOf(this.f41518x), new a(this.f41518x, tVar, this.f41517w, null));
            }
            iVar.O();
            return c10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, r rVar, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(rVar, "icon");
        return x0.e.c(fVar, a1.c() ? new a(rVar, z10) : a1.a(), new b(rVar, z10));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(fVar, rVar, z10);
    }
}
