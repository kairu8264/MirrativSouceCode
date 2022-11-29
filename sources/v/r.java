package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.z0;
import b0.p;
import l0.i;
import l0.z1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f56330a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<a1.p, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f56331w = new a();

        public a() {
            super(1);
        }

        public final void a(a1.p pVar) {
            jo.p.h(pVar, "$this$focusProperties");
            pVar.k(false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(a1.p pVar) {
            a(pVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f56332w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f56333x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, x.m mVar) {
            super(1);
            this.f56332w = z10;
            this.f56333x = mVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusable");
            c1Var.a().b("enabled", Boolean.valueOf(this.f56332w));
            c1Var.a().b("interactionSource", this.f56333x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x.m f56334w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f56335x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.d> f56336w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x.m f56337x;

            /* renamed from: v.r$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0891a implements l0.z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ l0.s0 f56338a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ x.m f56339b;

                public C0891a(l0.s0 s0Var, x.m mVar) {
                    this.f56338a = s0Var;
                    this.f56339b = mVar;
                }

                @Override // l0.z
                public void dispose() {
                    x.d dVar = (x.d) this.f56338a.getValue();
                    if (dVar != null) {
                        x.e eVar = new x.e(dVar);
                        x.m mVar = this.f56339b;
                        if (mVar != null) {
                            mVar.a(eVar);
                        }
                        this.f56338a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0.s0<x.d> s0Var, x.m mVar) {
                super(1);
                this.f56336w = s0Var;
                this.f56337x = mVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                return new C0891a(this.f56336w, this.f56337x);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f56340w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f56341x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.d> f56342y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ x.m f56343z;

            @co.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {105}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public Object f56344w;

                /* renamed from: x  reason: collision with root package name */
                public int f56345x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ l0.s0<x.d> f56346y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ x.m f56347z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(l0.s0<x.d> s0Var, x.m mVar, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f56346y = s0Var;
                    this.f56347z = mVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new a(this.f56346y, this.f56347z, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    l0.s0<x.d> s0Var;
                    l0.s0<x.d> s0Var2;
                    Object c10 = bo.c.c();
                    int i10 = this.f56345x;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        x.d value = this.f56346y.getValue();
                        if (value != null) {
                            x.m mVar = this.f56347z;
                            s0Var = this.f56346y;
                            x.e eVar = new x.e(value);
                            if (mVar != null) {
                                this.f56344w = s0Var;
                                this.f56345x = 1;
                                if (mVar.b(eVar, this) == c10) {
                                    return c10;
                                }
                                s0Var2 = s0Var;
                            }
                            s0Var.setValue(null);
                        }
                        return wn.v.f59242a;
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        s0Var2 = (l0.s0) this.f56344w;
                        wn.m.b(obj);
                    }
                    s0Var = s0Var2;
                    s0Var.setValue(null);
                    return wn.v.f59242a;
                }
            }

            /* renamed from: v.r$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0892b implements l0.z {
                @Override // l0.z
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z10, uo.q0 q0Var, l0.s0<x.d> s0Var, x.m mVar) {
                super(1);
                this.f56340w = z10;
                this.f56341x = q0Var;
                this.f56342y = s0Var;
                this.f56343z = mVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                if (!this.f56340w) {
                    uo.l.d(this.f56341x, null, null, new a(this.f56342y, this.f56343z, null), 3, null);
                }
                return new C0892b();
            }
        }

        /* renamed from: v.r$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0893c extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<Boolean> f56348w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a1.t f56349x;

            /* renamed from: v.r$c$c$a */
            /* loaded from: classes.dex */
            public static final class a extends jo.q implements io.a<Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ a1.t f56350w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ l0.s0<Boolean> f56351x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(a1.t tVar, l0.s0<Boolean> s0Var) {
                    super(0);
                    this.f56350w = tVar;
                    this.f56351x = s0Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final Boolean invoke() {
                    this.f56350w.c();
                    return Boolean.valueOf(c.h(this.f56351x));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0893c(l0.s0<Boolean> s0Var, a1.t tVar) {
                super(1);
                this.f56348w = s0Var;
                this.f56349x = tVar;
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
                w1.w.C(yVar, c.h(this.f56348w));
                w1.w.t(yVar, null, new a(this.f56349x, this.f56348w), 1, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.l<b0.p, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<b0.p> f56352w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(l0.s0<b0.p> s0Var) {
                super(1);
                this.f56352w = s0Var;
            }

            public final void a(b0.p pVar) {
                c.g(this.f56352w, pVar);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(b0.p pVar) {
                a(pVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.l<a1.x, wn.v> {
            public final /* synthetic */ l0.s0<x.d> A;
            public final /* synthetic */ x.m B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f56353w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l0.s0<Boolean> f56354x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c0.e f56355y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ l0.s0<b0.p> f56356z;

            @co.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {144}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public Object f56357w;

                /* renamed from: x  reason: collision with root package name */
                public int f56358x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ c0.e f56359y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ l0.s0<b0.p> f56360z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(c0.e eVar, l0.s0<b0.p> s0Var, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f56359y = eVar;
                    this.f56360z = s0Var;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new a(this.f56359y, this.f56360z, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    p.a aVar;
                    Object c10 = bo.c.c();
                    int i10 = this.f56358x;
                    p.a aVar2 = null;
                    try {
                        if (i10 == 0) {
                            wn.m.b(obj);
                            b0.p f10 = c.f(this.f56360z);
                            p.a a10 = f10 != null ? f10.a() : null;
                            try {
                                c0.e eVar = this.f56359y;
                                this.f56357w = a10;
                                this.f56358x = 1;
                                if (c0.e.b(eVar, null, this, 1, null) == c10) {
                                    return c10;
                                }
                                aVar = a10;
                            } catch (Throwable th2) {
                                aVar2 = a10;
                                th = th2;
                                if (aVar2 != null) {
                                    aVar2.a();
                                }
                                throw th;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            aVar = (p.a) this.f56357w;
                            wn.m.b(obj);
                        }
                        if (aVar != null) {
                            aVar.a();
                        }
                        return wn.v.f59242a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }

            @co.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {152, 156}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public Object f56361w;

                /* renamed from: x  reason: collision with root package name */
                public int f56362x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ l0.s0<x.d> f56363y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ x.m f56364z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(l0.s0<x.d> s0Var, x.m mVar, ao.d<? super b> dVar) {
                    super(2, dVar);
                    this.f56363y = s0Var;
                    this.f56364z = mVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new b(this.f56363y, this.f56364z, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r6.f56362x
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r0 = r6.f56361w
                        x.d r0 = (x.d) r0
                        wn.m.b(r7)
                        goto L64
                    L16:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1e:
                        java.lang.Object r1 = r6.f56361w
                        l0.s0 r1 = (l0.s0) r1
                        wn.m.b(r7)
                        goto L4a
                    L26:
                        wn.m.b(r7)
                        l0.s0<x.d> r7 = r6.f56363y
                        java.lang.Object r7 = r7.getValue()
                        x.d r7 = (x.d) r7
                        if (r7 == 0) goto L4f
                        x.m r1 = r6.f56364z
                        l0.s0<x.d> r4 = r6.f56363y
                        x.e r5 = new x.e
                        r5.<init>(r7)
                        if (r1 == 0) goto L4b
                        r6.f56361w = r4
                        r6.f56362x = r3
                        java.lang.Object r7 = r1.b(r5, r6)
                        if (r7 != r0) goto L49
                        return r0
                    L49:
                        r1 = r4
                    L4a:
                        r4 = r1
                    L4b:
                        r7 = 0
                        r4.setValue(r7)
                    L4f:
                        x.d r7 = new x.d
                        r7.<init>()
                        x.m r1 = r6.f56364z
                        if (r1 == 0) goto L65
                        r6.f56361w = r7
                        r6.f56362x = r2
                        java.lang.Object r1 = r1.b(r7, r6)
                        if (r1 != r0) goto L63
                        return r0
                    L63:
                        r0 = r7
                    L64:
                        r7 = r0
                    L65:
                        l0.s0<x.d> r0 = r6.f56363y
                        r0.setValue(r7)
                        wn.v r7 = wn.v.f59242a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v.r.c.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @co.f(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", l = {163}, m = "invokeSuspend")
            /* renamed from: v.r$c$e$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0894c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public Object f56365w;

                /* renamed from: x  reason: collision with root package name */
                public int f56366x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ l0.s0<x.d> f56367y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ x.m f56368z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0894c(l0.s0<x.d> s0Var, x.m mVar, ao.d<? super C0894c> dVar) {
                    super(2, dVar);
                    this.f56367y = s0Var;
                    this.f56368z = mVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0894c(this.f56367y, this.f56368z, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0894c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    l0.s0<x.d> s0Var;
                    l0.s0<x.d> s0Var2;
                    Object c10 = bo.c.c();
                    int i10 = this.f56366x;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        x.d value = this.f56367y.getValue();
                        if (value != null) {
                            x.m mVar = this.f56368z;
                            s0Var = this.f56367y;
                            x.e eVar = new x.e(value);
                            if (mVar != null) {
                                this.f56365w = s0Var;
                                this.f56366x = 1;
                                if (mVar.b(eVar, this) == c10) {
                                    return c10;
                                }
                                s0Var2 = s0Var;
                            }
                            s0Var.setValue(null);
                        }
                        return wn.v.f59242a;
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        s0Var2 = (l0.s0) this.f56365w;
                        wn.m.b(obj);
                    }
                    s0Var = s0Var2;
                    s0Var.setValue(null);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(uo.q0 q0Var, l0.s0<Boolean> s0Var, c0.e eVar, l0.s0<b0.p> s0Var2, l0.s0<x.d> s0Var3, x.m mVar) {
                super(1);
                this.f56353w = q0Var;
                this.f56354x = s0Var;
                this.f56355y = eVar;
                this.f56356z = s0Var2;
                this.A = s0Var3;
                this.B = mVar;
            }

            public final void a(a1.x xVar) {
                jo.p.h(xVar, "it");
                c.i(this.f56354x, xVar.a());
                if (c.h(this.f56354x)) {
                    uo.l.d(this.f56353w, null, uo.s0.UNDISPATCHED, new a(this.f56355y, this.f56356z, null), 1, null);
                    uo.l.d(this.f56353w, null, null, new b(this.A, this.B, null), 3, null);
                    return;
                }
                uo.l.d(this.f56353w, null, null, new C0894c(this.A, this.B, null), 3, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(a1.x xVar) {
                a(xVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x.m mVar, boolean z10) {
            super(3);
            this.f56334w = mVar;
            this.f56335x = z10;
        }

        public static final b0.p f(l0.s0<b0.p> s0Var) {
            return s0Var.getValue();
        }

        public static final void g(l0.s0<b0.p> s0Var, b0.p pVar) {
            s0Var.setValue(pVar);
        }

        public static final boolean h(l0.s0<Boolean> s0Var) {
            return s0Var.getValue().booleanValue();
        }

        public static final void i(l0.s0<Boolean> s0Var, boolean z10) {
            s0Var.setValue(Boolean.valueOf(z10));
        }

        public final x0.f e(x0.f fVar, l0.i iVar, int i10) {
            x0.f fVar2;
            x0.f fVar3;
            jo.p.h(fVar, "$this$composed");
            iVar.x(1871352361);
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
            iVar.x(-492369756);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = z1.e(null, null, 2, null);
                iVar.q(y12);
            }
            iVar.O();
            l0.s0 s0Var2 = (l0.s0) y12;
            iVar.x(-492369756);
            Object y13 = iVar.y();
            if (y13 == aVar.a()) {
                y13 = z1.e(Boolean.FALSE, null, 2, null);
                iVar.q(y13);
            }
            iVar.O();
            l0.s0 s0Var3 = (l0.s0) y13;
            iVar.x(-492369756);
            Object y14 = iVar.y();
            if (y14 == aVar.a()) {
                y14 = new a1.t();
                iVar.q(y14);
            }
            iVar.O();
            a1.t tVar = (a1.t) y14;
            iVar.x(-492369756);
            Object y15 = iVar.y();
            if (y15 == aVar.a()) {
                y15 = c0.g.a();
                iVar.q(y15);
            }
            iVar.O();
            c0.e eVar = (c0.e) y15;
            x.m mVar = this.f56334w;
            l0.c0.a(mVar, new a(s0Var, mVar), iVar, 0);
            l0.c0.a(Boolean.valueOf(this.f56335x), new b(this.f56335x, d10, s0Var, this.f56334w), iVar, 0);
            if (this.f56335x) {
                if (h(s0Var3)) {
                    iVar.x(-492369756);
                    Object y16 = iVar.y();
                    if (y16 == aVar.a()) {
                        y16 = new t();
                        iVar.q(y16);
                    }
                    iVar.O();
                    fVar3 = (x0.f) y16;
                } else {
                    fVar3 = x0.f.f59359u;
                }
                fVar2 = a1.k.a(a1.b.a(a1.v.a(c0.g.b(r.e(w1.p.b(x0.f.f59359u, false, new C0893c(s0Var3, tVar), 1, null), new d(s0Var2)), eVar), tVar).L(fVar3), new e(d10, s0Var3, eVar, s0Var2, s0Var, this.f56334w)));
            } else {
                fVar2 = x0.f.f59359u;
            }
            iVar.O();
            return fVar2;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return e(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f56369w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f56370x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, x.m mVar) {
            super(1);
            this.f56369w = z10;
            this.f56370x = mVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusableInNonTouchMode");
            c1Var.a().b("enabled", Boolean.valueOf(this.f56369w));
            c1Var.a().b("interactionSource", this.f56370x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f56371w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f56372x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<a1.p, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j1.b f56373w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j1.b bVar) {
                super(1);
                this.f56373w = bVar;
            }

            public final void a(a1.p pVar) {
                jo.p.h(pVar, "$this$focusProperties");
                pVar.k(!j1.a.f(this.f56373w.a(), j1.a.f37049b.b()));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(a1.p pVar) {
                a(pVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, x.m mVar) {
            super(3);
            this.f56371w = z10;
            this.f56372x = mVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-618949501);
            x0.f c10 = r.c(a1.r.b(x0.f.f59359u, new a((j1.b) iVar.G(androidx.compose.ui.platform.o0.i()))), this.f56371w, this.f56372x);
            iVar.O();
            return c10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f56374w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.l lVar) {
            super(1);
            this.f56374w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onPinnableParentAvailable");
            c1Var.a().b("onPinnableParentAvailable", this.f56374w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<c1, wn.v> {
        public g() {
            super(1);
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusGroup");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    static {
        f56330a = new z0(a1.c() ? new g() : a1.a());
    }

    public static final x0.f b(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return a1.k.a(a1.r.b(fVar.L(f56330a), a.f56331w));
    }

    public static final x0.f c(x0.f fVar, boolean z10, x.m mVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, a1.c() ? new b(z10, mVar) : a1.a(), new c(mVar, z10));
    }

    public static final x0.f d(x0.f fVar, boolean z10, x.m mVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, a1.c() ? new d(z10, mVar) : a1.a(), new e(z10, mVar));
    }

    public static final x0.f e(x0.f fVar, io.l<? super b0.p, wn.v> lVar) {
        return a1.b(fVar, a1.c() ? new f(lVar) : a1.a(), x0.f.f59359u.L(new k0(lVar)));
    }
}
