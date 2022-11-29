package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import l0.i;
import l0.z1;
import x0.f;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x.m f56401w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f56402x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x.m mVar, boolean z10) {
            super(1);
            this.f56401w = mVar;
            this.f56402x = z10;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("hoverable");
            c1Var.a().b("interactionSource", this.f56401w);
            c1Var.a().b("enabled", Boolean.valueOf(this.f56402x));
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
        public final /* synthetic */ x.m f56403w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f56404x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.g> f56405w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x.m f56406x;

            /* renamed from: v.v$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0895a implements l0.z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ l0.s0 f56407a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ x.m f56408b;

                public C0895a(l0.s0 s0Var, x.m mVar) {
                    this.f56407a = s0Var;
                    this.f56408b = mVar;
                }

                @Override // l0.z
                public void dispose() {
                    b.i(this.f56407a, this.f56408b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0.s0<x.g> s0Var, x.m mVar) {
                super(1);
                this.f56405w = s0Var;
                this.f56406x = mVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                return new C0895a(this.f56405w, this.f56406x);
            }
        }

        @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
        /* renamed from: v.v$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0896b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f56409w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ boolean f56410x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.g> f56411y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ x.m f56412z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0896b(boolean z10, l0.s0<x.g> s0Var, x.m mVar, ao.d<? super C0896b> dVar) {
                super(2, dVar);
                this.f56410x = z10;
                this.f56411y = s0Var;
                this.f56412z = mVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0896b(this.f56410x, this.f56411y, this.f56412z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C0896b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f56409w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (!this.f56410x) {
                        l0.s0<x.g> s0Var = this.f56411y;
                        x.m mVar = this.f56412z;
                        this.f56409w = 1;
                        if (b.f(s0Var, mVar, this) == c10) {
                            return c10;
                        }
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ l0.s0<x.g> A;

            /* renamed from: w  reason: collision with root package name */
            public int f56413w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f56414x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f56415y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ x.m f56416z;

            @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ uo.q0 A;
                public final /* synthetic */ x.m B;
                public final /* synthetic */ l0.s0<x.g> C;

                /* renamed from: x  reason: collision with root package name */
                public int f56417x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ Object f56418y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ ao.g f56419z;

                @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
                /* renamed from: v.v$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0897a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w  reason: collision with root package name */
                    public int f56420w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ x.m f56421x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ l0.s0<x.g> f56422y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0897a(x.m mVar, l0.s0<x.g> s0Var, ao.d<? super C0897a> dVar) {
                        super(2, dVar);
                        this.f56421x = mVar;
                        this.f56422y = s0Var;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0897a(this.f56421x, this.f56422y, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0897a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f56420w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            x.m mVar = this.f56421x;
                            l0.s0<x.g> s0Var = this.f56422y;
                            this.f56420w = 1;
                            if (b.e(mVar, s0Var, this) == c10) {
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

                @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
                /* renamed from: v.v$b$c$a$b  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0898b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w  reason: collision with root package name */
                    public int f56423w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ l0.s0<x.g> f56424x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ x.m f56425y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0898b(l0.s0<x.g> s0Var, x.m mVar, ao.d<? super C0898b> dVar) {
                        super(2, dVar);
                        this.f56424x = s0Var;
                        this.f56425y = mVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0898b(this.f56424x, this.f56425y, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0898b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f56423w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            l0.s0<x.g> s0Var = this.f56424x;
                            x.m mVar = this.f56425y;
                            this.f56423w = 1;
                            if (b.f(s0Var, mVar, this) == c10) {
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
                public a(ao.g gVar, uo.q0 q0Var, x.m mVar, l0.s0<x.g> s0Var, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f56419z = gVar;
                    this.A = q0Var;
                    this.B = mVar;
                    this.C = s0Var;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                    return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    a aVar = new a(this.f56419z, this.A, this.B, this.C, dVar);
                    aVar.f56418y = obj;
                    return aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please submit an issue!!! */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r14.f56417x
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r14.f56418y
                        n1.c r1 = (n1.c) r1
                        wn.m.b(r15)
                        r4 = r1
                        r1 = r0
                        r0 = r14
                        goto L40
                    L17:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1f:
                        wn.m.b(r15)
                        java.lang.Object r15 = r14.f56418y
                        n1.c r15 = (n1.c) r15
                        r1 = r15
                        r15 = r14
                    L28:
                        ao.g r4 = r15.f56419z
                        boolean r4 = uo.g2.m(r4)
                        if (r4 == 0) goto L85
                        r15.f56418y = r1
                        r15.f56417x = r2
                        java.lang.Object r4 = n1.c.y0(r1, r3, r15, r2, r3)
                        if (r4 != r0) goto L3b
                        return r0
                    L3b:
                        r13 = r0
                        r0 = r15
                        r15 = r4
                        r4 = r1
                        r1 = r13
                    L40:
                        n1.m r15 = (n1.m) r15
                        int r15 = r15.f()
                        n1.p$a r5 = n1.p.f41507a
                        int r6 = r5.a()
                        boolean r6 = n1.p.i(r15, r6)
                        if (r6 == 0) goto L65
                        uo.q0 r7 = r0.A
                        r8 = 0
                        r9 = 0
                        v.v$b$c$a$a r10 = new v.v$b$c$a$a
                        x.m r15 = r0.B
                        l0.s0<x.g> r5 = r0.C
                        r10.<init>(r15, r5, r3)
                        r11 = 3
                        r12 = 0
                        uo.j.d(r7, r8, r9, r10, r11, r12)
                        goto L81
                    L65:
                        int r5 = r5.b()
                        boolean r15 = n1.p.i(r15, r5)
                        if (r15 == 0) goto L81
                        uo.q0 r5 = r0.A
                        r6 = 0
                        r7 = 0
                        v.v$b$c$a$b r8 = new v.v$b$c$a$b
                        l0.s0<x.g> r15 = r0.C
                        x.m r9 = r0.B
                        r8.<init>(r15, r9, r3)
                        r9 = 3
                        r10 = 0
                        uo.j.d(r5, r6, r7, r8, r9, r10)
                    L81:
                        r15 = r0
                        r0 = r1
                        r1 = r4
                        goto L28
                    L85:
                        wn.v r15 = wn.v.f59242a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v.v.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(uo.q0 q0Var, x.m mVar, l0.s0<x.g> s0Var, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f56415y = q0Var;
                this.f56416z = mVar;
                this.A = s0Var;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((c) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                c cVar = new c(this.f56415y, this.f56416z, this.A, dVar);
                cVar.f56414x = obj;
                return cVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f56413w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    a aVar = new a(getContext(), this.f56415y, this.f56416z, this.A, null);
                    this.f56413w = 1;
                    if (((n1.e0) this.f56414x).N(aVar, this) == c10) {
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

        @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {62}, m = "invoke$emitEnter")
        /* loaded from: classes.dex */
        public static final class d extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public Object f56426w;

            /* renamed from: x  reason: collision with root package name */
            public Object f56427x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f56428y;

            /* renamed from: z  reason: collision with root package name */
            public int f56429z;

            public d(ao.d<? super d> dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f56428y = obj;
                this.f56429z |= Integer.MIN_VALUE;
                return b.e(null, null, this);
            }
        }

        @co.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
        /* loaded from: classes.dex */
        public static final class e extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public Object f56430w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f56431x;

            /* renamed from: y  reason: collision with root package name */
            public int f56432y;

            public e(ao.d<? super e> dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f56431x = obj;
                this.f56432y |= Integer.MIN_VALUE;
                return b.f(null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x.m mVar, boolean z10) {
            super(3);
            this.f56403w = mVar;
            this.f56404x = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object e(x.m r4, l0.s0<x.g> r5, ao.d<? super wn.v> r6) {
            /*
                boolean r0 = r6 instanceof v.v.b.d
                if (r0 == 0) goto L13
                r0 = r6
                v.v$b$d r0 = (v.v.b.d) r0
                int r1 = r0.f56429z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56429z = r1
                goto L18
            L13:
                v.v$b$d r0 = new v.v$b$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f56428y
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f56429z
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f56427x
                x.g r4 = (x.g) r4
                java.lang.Object r5 = r0.f56426w
                l0.s0 r5 = (l0.s0) r5
                wn.m.b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                wn.m.b(r6)
                x.g r6 = g(r5)
                if (r6 != 0) goto L58
                x.g r6 = new x.g
                r6.<init>()
                r0.f56426w = r5
                r0.f56427x = r6
                r0.f56429z = r3
                java.lang.Object r4 = r4.b(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                h(r5, r4)
            L58:
                wn.v r4 = wn.v.f59242a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: v.v.b.e(x.m, l0.s0, ao.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object f(l0.s0<x.g> r4, x.m r5, ao.d<? super wn.v> r6) {
            /*
                boolean r0 = r6 instanceof v.v.b.e
                if (r0 == 0) goto L13
                r0 = r6
                v.v$b$e r0 = (v.v.b.e) r0
                int r1 = r0.f56432y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56432y = r1
                goto L18
            L13:
                v.v$b$e r0 = new v.v$b$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f56431x
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f56432y
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f56430w
                l0.s0 r4 = (l0.s0) r4
                wn.m.b(r6)
                goto L4e
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                wn.m.b(r6)
                x.g r6 = g(r4)
                if (r6 == 0) goto L52
                x.h r2 = new x.h
                r2.<init>(r6)
                r0.f56430w = r4
                r0.f56432y = r3
                java.lang.Object r5 = r5.b(r2, r0)
                if (r5 != r1) goto L4e
                return r1
            L4e:
                r5 = 0
                h(r4, r5)
            L52:
                wn.v r4 = wn.v.f59242a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: v.v.b.f(l0.s0, x.m, ao.d):java.lang.Object");
        }

        public static final x.g g(l0.s0<x.g> s0Var) {
            return s0Var.getValue();
        }

        public static final void h(l0.s0<x.g> s0Var, x.g gVar) {
            s0Var.setValue(gVar);
        }

        public static final void i(l0.s0<x.g> s0Var, x.m mVar) {
            x.g g10 = g(s0Var);
            if (g10 != null) {
                mVar.a(new x.h(g10));
                h(s0Var, null);
            }
        }

        public final x0.f d(x0.f fVar, l0.i iVar, int i10) {
            x0.f fVar2;
            jo.p.h(fVar, "$this$composed");
            iVar.x(1294013553);
            iVar.x(773894976);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                l0.s sVar = new l0.s(l0.c0.i(ao.h.f16651w, iVar));
                iVar.q(sVar);
                y10 = sVar;
            }
            iVar.O();
            uo.q0 d10 = ((l0.s) y10).d();
            iVar.O();
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = z1.e(null, null, 2, null);
                iVar.q(y11);
            }
            iVar.O();
            l0.s0 s0Var = (l0.s0) y11;
            x.m mVar = this.f56403w;
            l0.c0.a(mVar, new a(s0Var, mVar), iVar, 0);
            l0.c0.c(Boolean.valueOf(this.f56404x), new C0896b(this.f56404x, s0Var, this.f56403w, null), iVar, 0);
            if (this.f56404x) {
                f.a aVar2 = x0.f.f59359u;
                x.m mVar2 = this.f56403w;
                fVar2 = n1.o0.b(aVar2, mVar2, new c(d10, mVar2, s0Var, null));
            } else {
                fVar2 = x0.f.f59359u;
            }
            iVar.O();
            return fVar2;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return d(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, x.m mVar, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(mVar, "interactionSource");
        return x0.e.c(fVar, a1.c() ? new a(mVar, z10) : a1.a(), new b(mVar, z10));
    }
}
