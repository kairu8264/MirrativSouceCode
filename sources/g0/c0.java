package g0;

import n1.e0;

/* loaded from: classes.dex */
public final class c0 {

    @co.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {127}, m = "awaitMouseEventDown")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f32215w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f32216x;

        /* renamed from: y  reason: collision with root package name */
        public int f32217y;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f32216x = obj;
            this.f32217y |= Integer.MIN_VALUE;
            return c0.b(null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32218w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f32219x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g f32220y;

        @co.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", l = {90, 97, 112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ g A;

            /* renamed from: x  reason: collision with root package name */
            public Object f32221x;

            /* renamed from: y  reason: collision with root package name */
            public int f32222y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f32223z;

            /* renamed from: g0.c0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0364a extends jo.q implements io.l<n1.w, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ g f32224w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0364a(g gVar) {
                    super(1);
                    this.f32224w = gVar;
                }

                public final void a(n1.w wVar) {
                    jo.p.h(wVar, "it");
                    if (this.f32224w.c(wVar.f())) {
                        wVar.a();
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar) {
                    a(wVar);
                    return wn.v.f59242a;
                }
            }

            /* renamed from: g0.c0$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0365b extends jo.q implements io.l<n1.w, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ g f32225w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ k f32226x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0365b(g gVar, k kVar) {
                    super(1);
                    this.f32225w = gVar;
                    this.f32226x = kVar;
                }

                public final void a(n1.w wVar) {
                    jo.p.h(wVar, "it");
                    if (this.f32225w.b(wVar.f(), this.f32226x)) {
                        wVar.a();
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar) {
                    a(wVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.A = gVar;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.A, dVar);
                aVar.f32223z = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r12.f32222y
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1a:
                    java.lang.Object r1 = r12.f32221x
                    g0.c r1 = (g0.c) r1
                    java.lang.Object r5 = r12.f32223z
                    n1.c r5 = (n1.c) r5
                    wn.m.b(r13)
                    r13 = r5
                    goto L44
                L27:
                    java.lang.Object r1 = r12.f32221x
                    g0.c r1 = (g0.c) r1
                    java.lang.Object r5 = r12.f32223z
                    n1.c r5 = (n1.c) r5
                    wn.m.b(r13)
                    r6 = r12
                    goto L56
                L34:
                    wn.m.b(r13)
                    java.lang.Object r13 = r12.f32223z
                    n1.c r13 = (n1.c) r13
                    g0.c r1 = new g0.c
                    androidx.compose.ui.platform.g2 r5 = r13.getViewConfiguration()
                    r1.<init>(r5)
                L44:
                    r5 = r12
                L45:
                    r5.f32223z = r13
                    r5.f32221x = r1
                    r5.f32222y = r4
                    java.lang.Object r6 = g0.c0.a(r13, r5)
                    if (r6 != r0) goto L52
                    return r0
                L52:
                    r11 = r5
                    r5 = r13
                    r13 = r6
                    r6 = r11
                L56:
                    n1.m r13 = (n1.m) r13
                    r1.d(r13)
                    java.util.List r7 = r13.c()
                    r8 = 0
                    java.lang.Object r7 = r7.get(r8)
                    n1.w r7 = (n1.w) r7
                    boolean r13 = g0.x.a(r13)
                    if (r13 == 0) goto L93
                    g0.g r13 = r6.A
                    long r8 = r7.f()
                    boolean r13 = r13.d(r8)
                    if (r13 == 0) goto Ld6
                    r7.a()
                    long r7 = r7.e()
                    g0.c0$b$a$a r13 = new g0.c0$b$a$a
                    g0.g r9 = r6.A
                    r13.<init>(r9)
                    r6.f32223z = r5
                    r6.f32221x = r1
                    r6.f32222y = r3
                    java.lang.Object r13 = w.h.j(r5, r7, r13, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                L93:
                    int r13 = r1.a()
                    if (r13 == r4) goto La9
                    if (r13 == r3) goto La2
                    g0.k$a r13 = g0.k.f32240a
                    g0.k r13 = r13.f()
                    goto Laf
                La2:
                    g0.k$a r13 = g0.k.f32240a
                    g0.k r13 = r13.g()
                    goto Laf
                La9:
                    g0.k$a r13 = g0.k.f32240a
                    g0.k r13 = r13.e()
                Laf:
                    g0.g r8 = r6.A
                    long r9 = r7.f()
                    boolean r8 = r8.a(r9, r13)
                    if (r8 == 0) goto Ld6
                    r7.a()
                    long r7 = r7.e()
                    g0.c0$b$a$b r9 = new g0.c0$b$a$b
                    g0.g r10 = r6.A
                    r9.<init>(r10, r13)
                    r6.f32223z = r5
                    r6.f32221x = r1
                    r6.f32222y = r2
                    java.lang.Object r13 = w.h.j(r5, r7, r9, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                Ld6:
                    r13 = r5
                    r5 = r6
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: g0.c0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f32220y = gVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f32220y, dVar);
            bVar.f32219x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32218w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(this.f32220y, null);
                this.f32218w = 1;
                if (((e0) this.f32219x).N(aVar, this) == c10) {
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n1.c r10, ao.d<? super n1.m> r11) {
        /*
            boolean r0 = r11 instanceof g0.c0.a
            if (r0 == 0) goto L13
            r0 = r11
            g0.c0$a r0 = (g0.c0.a) r0
            int r1 = r0.f32217y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32217y = r1
            goto L18
        L13:
            g0.c0$a r0 = new g0.c0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f32216x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f32217y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f32215w
            n1.c r10 = (n1.c) r10
            wn.m.b(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            wn.m.b(r11)
        L38:
            n1.o r11 = n1.o.Main
            r0.f32215w = r10
            r0.f32217y = r3
            java.lang.Object r11 = r10.t0(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            n1.m r11 = (n1.m) r11
            int r2 = r11.b()
            boolean r2 = n1.q.a(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r11.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            n1.w r7 = (n1.w) r7
            int r8 = r7.k()
            n1.j0$a r9 = n1.j0.f41449a
            int r9 = r9.b()
            boolean r8 = n1.j0.g(r8, r9)
            if (r8 == 0) goto L7b
            boolean r7 = n1.n.a(r7)
            if (r7 == 0) goto L7b
            r7 = r3
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L5b
        L82:
            r5 = r3
        L83:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.c0.b(n1.c, ao.d):java.lang.Object");
    }

    public static final Object c(e0 e0Var, g gVar, ao.d<? super wn.v> dVar) {
        Object d10 = w.n.d(e0Var, new b(gVar, null), dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }
}
