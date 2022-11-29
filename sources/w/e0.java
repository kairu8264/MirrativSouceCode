package w;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import uo.q0;
import uo.r0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public static final io.q<t, b1.f, ao.d<? super wn.v>, Object> f57629a = new a(null);

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.q<t, b1.f, ao.d<? super wn.v>, Object> {

        /* renamed from: w */
        public int f57630w;

        public a(ao.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(t tVar, long j10, ao.d<? super wn.v> dVar) {
            return new a(dVar).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57630w == 0) {
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(t tVar, b1.f fVar, ao.d<? super wn.v> dVar) {
            return a(tVar, fVar.u(), dVar);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {244}, m = "awaitFirstDownOnPass")
    /* loaded from: classes.dex */
    public static final class b extends co.d {
        public int A;

        /* renamed from: w */
        public Object f57631w;

        /* renamed from: x */
        public Object f57632x;

        /* renamed from: y */
        public boolean f57633y;

        /* renamed from: z */
        public /* synthetic */ Object f57634z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57634z = obj;
            this.A |= Integer.MIN_VALUE;
            return e0.f(null, null, false, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.k implements io.p<n1.c, ao.d<? super n1.w>, Object> {
        public final /* synthetic */ n1.w A;

        /* renamed from: x */
        public long f57635x;

        /* renamed from: y */
        public int f57636y;

        /* renamed from: z */
        public /* synthetic */ Object f57637z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n1.w wVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.A = wVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.c cVar, ao.d<? super n1.w> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.A, dVar);
            cVar.f57637z = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0048 -> B:30:0x004e). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f57636y
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                long r3 = r9.f57635x
                java.lang.Object r1 = r9.f57637z
                n1.c r1 = (n1.c) r1
                wn.m.b(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L4e
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                wn.m.b(r10)
                java.lang.Object r10 = r9.f57637z
                n1.c r10 = (n1.c) r10
                n1.w r1 = r9.A
                long r3 = r1.l()
                androidx.compose.ui.platform.g2 r1 = r10.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r10
                r10 = r9
            L39:
                r5 = 0
                r6 = 0
                r10.f57637z = r1
                r10.f57635x = r3
                r10.f57636y = r2
                java.lang.Object r5 = w.e0.e(r1, r5, r10, r2, r6)
                if (r5 != r0) goto L48
                return r0
            L48:
                r8 = r0
                r0 = r10
                r10 = r5
                r4 = r3
                r3 = r1
                r1 = r8
            L4e:
                n1.w r10 = (n1.w) r10
                long r6 = r10.l()
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 < 0) goto L59
                return r10
            L59:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L39
            */
            throw new UnsupportedOperationException("Method not decompiled: w.e0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {174}, m = "consumeUntilUp")
    /* loaded from: classes.dex */
    public static final class d extends co.d {

        /* renamed from: w */
        public Object f57638w;

        /* renamed from: x */
        public /* synthetic */ Object f57639x;

        /* renamed from: y */
        public int f57640y;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57639x = obj;
            this.f57640y |= Integer.MIN_VALUE;
            return e0.h(null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {206}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.l<b1.f, wn.v> A;

        /* renamed from: w */
        public int f57641w;

        /* renamed from: x */
        public /* synthetic */ Object f57642x;

        /* renamed from: y */
        public final /* synthetic */ u f57643y;

        /* renamed from: z */
        public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57644z;

        @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {208}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> A;
            public final /* synthetic */ io.l<b1.f, wn.v> B;

            /* renamed from: w */
            public int f57645w;

            /* renamed from: x */
            public /* synthetic */ Object f57646x;

            /* renamed from: y */
            public final /* synthetic */ u f57647y;

            /* renamed from: z */
            public final /* synthetic */ n1.e0 f57648z;

            @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {210, 216}, m = "invokeSuspend")
            /* renamed from: w.e0$e$a$a */
            /* loaded from: classes.dex */
            public static final class C0938a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ q0 A;
                public final /* synthetic */ u B;
                public final /* synthetic */ io.l<b1.f, wn.v> C;

                /* renamed from: x */
                public int f57649x;

                /* renamed from: y */
                public /* synthetic */ Object f57650y;

                /* renamed from: z */
                public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57651z;

                @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {213}, m = "invokeSuspend")
                /* renamed from: w.e0$e$a$a$a */
                /* loaded from: classes.dex */
                public static final class C0939a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w */
                    public int f57652w;

                    /* renamed from: x */
                    public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57653x;

                    /* renamed from: y */
                    public final /* synthetic */ u f57654y;

                    /* renamed from: z */
                    public final /* synthetic */ n1.w f57655z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0939a(io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, u uVar, n1.w wVar, ao.d<? super C0939a> dVar) {
                        super(2, dVar);
                        this.f57653x = qVar;
                        this.f57654y = uVar;
                        this.f57655z = wVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0939a(this.f57653x, this.f57654y, this.f57655z, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0939a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f57652w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            io.q<t, b1.f, ao.d<? super wn.v>, Object> qVar = this.f57653x;
                            u uVar = this.f57654y;
                            b1.f d10 = b1.f.d(this.f57655z.f());
                            this.f57652w = 1;
                            if (qVar.s0(uVar, d10, this) == c10) {
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
                /* JADX WARN: Multi-variable type inference failed */
                public C0938a(io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, q0 q0Var, u uVar, io.l<? super b1.f, wn.v> lVar, ao.d<? super C0938a> dVar) {
                    super(2, dVar);
                    this.f57651z = qVar;
                    this.A = q0Var;
                    this.B = uVar;
                    this.C = lVar;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                    return ((C0938a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    C0938a c0938a = new C0938a(this.f57651z, this.A, this.B, this.C, dVar);
                    c0938a.f57650y = obj;
                    return c0938a;
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r12.f57649x
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r4) goto L1b
                        if (r1 != r2) goto L13
                        wn.m.b(r13)
                        goto L61
                    L13:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1b:
                        java.lang.Object r1 = r12.f57650y
                        n1.c r1 = (n1.c) r1
                        wn.m.b(r13)
                        goto L37
                    L23:
                        wn.m.b(r13)
                        java.lang.Object r13 = r12.f57650y
                        r1 = r13
                        n1.c r1 = (n1.c) r1
                        r13 = 0
                        r12.f57650y = r1
                        r12.f57649x = r4
                        java.lang.Object r13 = w.e0.e(r1, r13, r12, r4, r3)
                        if (r13 != r0) goto L37
                        return r0
                    L37:
                        n1.w r13 = (n1.w) r13
                        r13.a()
                        io.q<w.t, b1.f, ao.d<? super wn.v>, java.lang.Object> r4 = r12.f57651z
                        io.q r5 = w.e0.c()
                        if (r4 == r5) goto L56
                        uo.q0 r6 = r12.A
                        r7 = 0
                        r8 = 0
                        w.e0$e$a$a$a r9 = new w.e0$e$a$a$a
                        io.q<w.t, b1.f, ao.d<? super wn.v>, java.lang.Object> r4 = r12.f57651z
                        w.u r5 = r12.B
                        r9.<init>(r4, r5, r13, r3)
                        r10 = 3
                        r11 = 0
                        uo.j.d(r6, r7, r8, r9, r10, r11)
                    L56:
                        r12.f57650y = r3
                        r12.f57649x = r2
                        java.lang.Object r13 = w.e0.l(r1, r12)
                        if (r13 != r0) goto L61
                        return r0
                    L61:
                        n1.w r13 = (n1.w) r13
                        if (r13 != 0) goto L6b
                        w.u r13 = r12.B
                        r13.d()
                        goto L82
                    L6b:
                        r13.a()
                        w.u r0 = r12.B
                        r0.e()
                        io.l<b1.f, wn.v> r0 = r12.C
                        if (r0 == 0) goto L82
                        long r1 = r13.f()
                        b1.f r13 = b1.f.d(r1)
                        r0.invoke(r13)
                    L82:
                        wn.v r13 = wn.v.f59242a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w.e0.e.a.C0938a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(u uVar, n1.e0 e0Var, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.l<? super b1.f, wn.v> lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57647y = uVar;
                this.f57648z = e0Var;
                this.A = qVar;
                this.B = lVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f57647y, this.f57648z, this.A, this.B, dVar);
                aVar.f57646x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57645w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    q0 q0Var = (q0) this.f57646x;
                    this.f57647y.h();
                    n1.e0 e0Var = this.f57648z;
                    C0938a c0938a = new C0938a(this.A, q0Var, this.f57647y, this.B, null);
                    this.f57645w = 1;
                    if (e0Var.N(c0938a, this) == c10) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public e(u uVar, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.l<? super b1.f, wn.v> lVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f57643y = uVar;
            this.f57644z = qVar;
            this.A = lVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f57643y, this.f57644z, this.A, dVar);
            eVar.f57642x = obj;
            return eVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57641w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(this.f57643y, (n1.e0) this.f57642x, this.f57644z, this.A, null);
                this.f57641w = 1;
                if (r0.e(aVar, this) == c10) {
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

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.l<b1.f, wn.v> A;
        public final /* synthetic */ io.l<b1.f, wn.v> B;
        public final /* synthetic */ io.l<b1.f, wn.v> C;

        /* renamed from: w */
        public int f57656w;

        /* renamed from: x */
        public /* synthetic */ Object f57657x;

        /* renamed from: y */
        public final /* synthetic */ n1.e0 f57658y;

        /* renamed from: z */
        public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57659z;

        @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ q0 A;
            public final /* synthetic */ io.l<b1.f, wn.v> B;
            public final /* synthetic */ io.l<b1.f, wn.v> C;
            public final /* synthetic */ io.l<b1.f, wn.v> D;

            /* renamed from: w */
            public int f57660w;

            /* renamed from: x */
            public /* synthetic */ Object f57661x;

            /* renamed from: y */
            public final /* synthetic */ u f57662y;

            /* renamed from: z */
            public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57663z;

            @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {94, 106, 117, 127, 140, 158}, m = "invokeSuspend")
            /* renamed from: w.e0$f$a$a */
            /* loaded from: classes.dex */
            public static final class C0940a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
                public long A;
                public int B;
                public /* synthetic */ Object C;
                public final /* synthetic */ u D;
                public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> E;
                public final /* synthetic */ q0 F;
                public final /* synthetic */ io.l<b1.f, wn.v> G;
                public final /* synthetic */ io.l<b1.f, wn.v> H;
                public final /* synthetic */ io.l<b1.f, wn.v> I;

                /* renamed from: x */
                public Object f57664x;

                /* renamed from: y */
                public Object f57665y;

                /* renamed from: z */
                public Object f57666z;

                @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", l = {98}, m = "invokeSuspend")
                /* renamed from: w.e0$f$a$a$a */
                /* loaded from: classes.dex */
                public static final class C0941a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w */
                    public int f57667w;

                    /* renamed from: x */
                    public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57668x;

                    /* renamed from: y */
                    public final /* synthetic */ u f57669y;

                    /* renamed from: z */
                    public final /* synthetic */ n1.w f57670z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0941a(io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, u uVar, n1.w wVar, ao.d<? super C0941a> dVar) {
                        super(2, dVar);
                        this.f57668x = qVar;
                        this.f57669y = uVar;
                        this.f57670z = wVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0941a(this.f57668x, this.f57669y, this.f57670z, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0941a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f57667w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            io.q<t, b1.f, ao.d<? super wn.v>, Object> qVar = this.f57668x;
                            u uVar = this.f57669y;
                            b1.f d10 = b1.f.d(this.f57670z.f());
                            this.f57667w = 1;
                            if (qVar.s0(uVar, d10, this) == c10) {
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

                @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", l = {107}, m = "invokeSuspend")
                /* renamed from: w.e0$f$a$a$b */
                /* loaded from: classes.dex */
                public static final class b extends co.k implements io.p<n1.c, ao.d<? super n1.w>, Object> {

                    /* renamed from: x */
                    public int f57671x;

                    /* renamed from: y */
                    public /* synthetic */ Object f57672y;

                    public b(ao.d<? super b> dVar) {
                        super(2, dVar);
                    }

                    @Override // io.p
                    /* renamed from: a */
                    public final Object invoke(n1.c cVar, ao.d<? super n1.w> dVar) {
                        return ((b) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        b bVar = new b(dVar);
                        bVar.f57672y = obj;
                        return bVar;
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f57671x;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            this.f57671x = 1;
                            obj = e0.l((n1.c) this.f57672y, this);
                            if (obj == c10) {
                                return c10;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            wn.m.b(obj);
                        }
                        return obj;
                    }
                }

                @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
                /* renamed from: w.e0$f$a$a$c */
                /* loaded from: classes.dex */
                public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w */
                    public int f57673w;

                    /* renamed from: x */
                    public final /* synthetic */ io.q<t, b1.f, ao.d<? super wn.v>, Object> f57674x;

                    /* renamed from: y */
                    public final /* synthetic */ u f57675y;

                    /* renamed from: z */
                    public final /* synthetic */ n1.w f57676z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public c(io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, u uVar, n1.w wVar, ao.d<? super c> dVar) {
                        super(2, dVar);
                        this.f57674x = qVar;
                        this.f57675y = uVar;
                        this.f57676z = wVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new c(this.f57674x, this.f57675y, this.f57676z, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f57673w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            io.q<t, b1.f, ao.d<? super wn.v>, Object> qVar = this.f57674x;
                            u uVar = this.f57675y;
                            b1.f d10 = b1.f.d(this.f57676z.f());
                            this.f57673w = 1;
                            if (qVar.s0(uVar, d10, this) == c10) {
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

                @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {141}, m = "invokeSuspend")
                /* renamed from: w.e0$f$a$a$d */
                /* loaded from: classes.dex */
                public static final class d extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
                    public final /* synthetic */ io.l<b1.f, wn.v> A;
                    public final /* synthetic */ io.l<b1.f, wn.v> B;
                    public final /* synthetic */ jo.e0<n1.w> C;

                    /* renamed from: x */
                    public int f57677x;

                    /* renamed from: y */
                    public /* synthetic */ Object f57678y;

                    /* renamed from: z */
                    public final /* synthetic */ u f57679z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(u uVar, io.l<? super b1.f, wn.v> lVar, io.l<? super b1.f, wn.v> lVar2, jo.e0<n1.w> e0Var, ao.d<? super d> dVar) {
                        super(2, dVar);
                        this.f57679z = uVar;
                        this.A = lVar;
                        this.B = lVar2;
                        this.C = e0Var;
                    }

                    @Override // io.p
                    /* renamed from: a */
                    public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                        return ((d) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        d dVar2 = new d(this.f57679z, this.A, this.B, this.C, dVar);
                        dVar2.f57678y = obj;
                        return dVar2;
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f57677x;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            this.f57677x = 1;
                            obj = e0.l((n1.c) this.f57678y, this);
                            if (obj == c10) {
                                return c10;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            wn.m.b(obj);
                        }
                        n1.w wVar = (n1.w) obj;
                        if (wVar != null) {
                            wVar.a();
                            this.f57679z.e();
                            this.A.invoke(b1.f.d(wVar.f()));
                            return wn.v.f59242a;
                        }
                        this.f57679z.d();
                        io.l<b1.f, wn.v> lVar = this.B;
                        if (lVar != null) {
                            lVar.invoke(b1.f.d(this.C.f38136w.f()));
                            return wn.v.f59242a;
                        }
                        return null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0940a(u uVar, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, q0 q0Var, io.l<? super b1.f, wn.v> lVar, io.l<? super b1.f, wn.v> lVar2, io.l<? super b1.f, wn.v> lVar3, ao.d<? super C0940a> dVar) {
                    super(2, dVar);
                    this.D = uVar;
                    this.E = qVar;
                    this.F = q0Var;
                    this.G = lVar;
                    this.H = lVar2;
                    this.I = lVar3;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                    return ((C0940a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    C0940a c0940a = new C0940a(this.D, this.E, this.F, this.G, this.H, this.I, dVar);
                    c0940a.C = obj;
                    return c0940a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:117:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x00df A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:126:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x00e9 A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:127:0x00e3, B:129:0x00e9, B:130:0x00ef), top: B:178:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:130:0x00ef A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:127:0x00e3, B:129:0x00e9, B:130:0x00ef), top: B:178:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x011f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:142:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x015e  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x0173  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x01ce  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x01e8 A[RETURN] */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 516
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w.e0.f.a.C0940a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(u uVar, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, q0 q0Var, io.l<? super b1.f, wn.v> lVar, io.l<? super b1.f, wn.v> lVar2, io.l<? super b1.f, wn.v> lVar3, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57662y = uVar;
                this.f57663z = qVar;
                this.A = q0Var;
                this.B = lVar;
                this.C = lVar2;
                this.D = lVar3;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f57662y, this.f57663z, this.A, this.B, this.C, this.D, dVar);
                aVar.f57661x = obj;
                return aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57660w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    C0940a c0940a = new C0940a(this.f57662y, this.f57663z, this.A, this.B, this.C, this.D, null);
                    this.f57660w = 1;
                    if (((n1.e0) this.f57661x).N(c0940a, this) == c10) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public f(n1.e0 e0Var, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.l<? super b1.f, wn.v> lVar, io.l<? super b1.f, wn.v> lVar2, io.l<? super b1.f, wn.v> lVar3, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f57658y = e0Var;
            this.f57659z = qVar;
            this.A = lVar;
            this.B = lVar2;
            this.C = lVar3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            f fVar = new f(this.f57658y, this.f57659z, this.A, this.B, this.C, dVar);
            fVar.f57657x = obj;
            return fVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57656w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f57657x;
                u uVar = new u(this.f57658y);
                n1.e0 e0Var = this.f57658y;
                a aVar = new a(uVar, this.f57659z, q0Var, this.A, this.B, this.C, null);
                this.f57656w = 1;
                if (n.d(e0Var, aVar, this) == c10) {
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

    @co.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {262, 277}, m = "waitForUpOrCancellation")
    /* loaded from: classes.dex */
    public static final class g extends co.d {

        /* renamed from: w */
        public Object f57680w;

        /* renamed from: x */
        public /* synthetic */ Object f57681x;

        /* renamed from: y */
        public int f57682y;

        public g(ao.d<? super g> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57681x = obj;
            this.f57682y |= Integer.MIN_VALUE;
            return e0.l(null, this);
        }
    }

    public static final Object d(n1.c cVar, boolean z10, ao.d<? super n1.w> dVar) {
        return f(cVar, n1.o.Main, z10, dVar);
    }

    public static /* synthetic */ Object e(n1.c cVar, boolean z10, ao.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d(cVar, z10, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x004d -> B:51:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(n1.c r9, n1.o r10, boolean r11, ao.d<? super n1.w> r12) {
        /*
            boolean r0 = r12 instanceof w.e0.b
            if (r0 == 0) goto L13
            r0 = r12
            w.e0$b r0 = (w.e0.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w.e0$b r0 = new w.e0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f57634z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f57633y
            java.lang.Object r10 = r0.f57632x
            n1.o r10 = (n1.o) r10
            java.lang.Object r11 = r0.f57631w
            n1.c r11 = (n1.c) r11
            wn.m.b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            wn.m.b(r12)
        L41:
            r0.f57631w = r9
            r0.f57632x = r10
            r0.f57633y = r11
            r0.A = r3
            java.lang.Object r12 = r9.t0(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            n1.m r12 = (n1.m) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            n1.w r7 = (n1.w) r7
            if (r11 == 0) goto L6b
            boolean r7 = n1.n.a(r7)
            goto L6f
        L6b:
            boolean r7 = n1.n.b(r7)
        L6f:
            if (r7 != 0) goto L73
            r2 = r5
            goto L77
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e0.f(n1.c, n1.o, boolean, ao.d):java.lang.Object");
    }

    public static final Object g(n1.c cVar, n1.w wVar, ao.d<? super n1.w> dVar) {
        return cVar.H(cVar.getViewConfiguration().a(), new c(wVar, null), dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[LOOP:0: B:52:0x0050->B:53:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[EDGE_INSN: B:65:0x007a->B:60:0x007a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0041 -> B:51:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(n1.c r8, ao.d<? super wn.v> r9) {
        /*
            boolean r0 = r9 instanceof w.e0.d
            if (r0 == 0) goto L13
            r0 = r9
            w.e0$d r0 = (w.e0.d) r0
            int r1 = r0.f57640y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57640y = r1
            goto L18
        L13:
            w.e0$d r0 = new w.e0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f57639x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57640y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f57638w
            n1.c r8 = (n1.c) r8
            wn.m.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            wn.m.b(r9)
        L38:
            r0.f57638w = r8
            r0.f57640y = r3
            r9 = 0
            java.lang.Object r9 = n1.c.y0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            n1.m r9 = (n1.m) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            n1.w r7 = (n1.w) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            n1.w r6 = (n1.w) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e0.h(n1.c, ao.d):java.lang.Object");
    }

    public static final Object i(n1.e0 e0Var, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.l<? super b1.f, wn.v> lVar, ao.d<? super wn.v> dVar) {
        Object d10 = n.d(e0Var, new e(new u(e0Var), qVar, lVar, null), dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    public static final Object j(n1.e0 e0Var, io.l<? super b1.f, wn.v> lVar, io.l<? super b1.f, wn.v> lVar2, io.q<? super t, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.l<? super b1.f, wn.v> lVar3, ao.d<? super wn.v> dVar) {
        Object e10 = r0.e(new f(e0Var, qVar, lVar2, lVar, lVar3, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    public static /* synthetic */ Object k(n1.e0 e0Var, io.l lVar, io.l lVar2, io.q qVar, io.l lVar3, ao.d dVar, int i10, Object obj) {
        io.l lVar4 = (i10 & 1) != 0 ? null : lVar;
        io.l lVar5 = (i10 & 2) != 0 ? null : lVar2;
        if ((i10 & 4) != 0) {
            qVar = f57629a;
        }
        return j(e0Var, lVar4, lVar5, qVar, (i10 & 8) != 0 ? null : lVar3, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x00bb -> B:111:0x00be). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(n1.c r13, ao.d<? super n1.w> r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e0.l(n1.c, ao.d):java.lang.Object");
    }
}
