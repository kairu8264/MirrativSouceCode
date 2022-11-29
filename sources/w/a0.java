package w;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import l0.c2;
import l0.i;
import l0.s0;
import l0.u1;
import l0.z1;
import n1.j0;
import n1.o0;
import uo.q0;
import v.i0;
import w.k;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y f57543a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final r1.f<Boolean> f57544b = r1.c.a(a.f57545w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f57545w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements y {
        @Override // w.y
        public float a(float f10) {
            return f10;
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {293}, m = "awaitScrollEvent")
    /* loaded from: classes.dex */
    public static final class c extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57546w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57547x;

        /* renamed from: y  reason: collision with root package name */
        public int f57548y;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57547x = obj;
            this.f57548y |= Integer.MIN_VALUE;
            return a0.d(null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {271}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57549w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57550x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v f57551y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<d0> f57552z;

        @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {273}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ c2<d0> A;

            /* renamed from: x  reason: collision with root package name */
            public int f57553x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f57554y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ v f57555z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar, c2<d0> c2Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57555z = vVar;
                this.A = c2Var;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f57555z, this.A, dVar);
                aVar.f57554y = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r10.f57553x
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r10.f57554y
                    n1.c r1 = (n1.c) r1
                    wn.m.b(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L37
                L16:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1e:
                    wn.m.b(r11)
                    java.lang.Object r11 = r10.f57554y
                    n1.c r11 = (n1.c) r11
                    r1 = r11
                    r11 = r10
                L27:
                    r11.f57554y = r1
                    r11.f57553x = r2
                    java.lang.Object r3 = w.a0.a(r1, r11)
                    if (r3 != r0) goto L32
                    return r0
                L32:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L37:
                    n1.m r11 = (n1.m) r11
                    java.util.List r4 = r11.c()
                    int r5 = r4.size()
                    r6 = 0
                    r7 = r6
                L43:
                    if (r7 >= r5) goto L57
                    java.lang.Object r8 = r4.get(r7)
                    n1.w r8 = (n1.w) r8
                    boolean r8 = r8.m()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L54
                    r4 = r6
                    goto L58
                L54:
                    int r7 = r7 + 1
                    goto L43
                L57:
                    r4 = r2
                L58:
                    if (r4 == 0) goto L9c
                    w.v r4 = r0.f57555z
                    l0.c2<w.d0> r5 = r0.A
                    long r7 = r3.a()
                    long r7 = r4.a(r3, r11, r7)
                    java.lang.Object r4 = r5.getValue()
                    w.d0 r4 = (w.d0) r4
                    float r5 = r4.k(r7)
                    float r5 = r4.g(r5)
                    w.b0 r4 = r4.d()
                    float r4 = r4.d(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L83
                    r4 = r2
                    goto L84
                L83:
                    r4 = r6
                L84:
                    if (r4 != 0) goto L9c
                    java.util.List r11 = r11.c()
                    int r4 = r11.size()
                L8e:
                    if (r6 >= r4) goto L9c
                    java.lang.Object r5 = r11.get(r6)
                    n1.w r5 = (n1.w) r5
                    r5.a()
                    int r6 = r6 + 1
                    goto L8e
                L9c:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: w.a0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v vVar, c2<d0> c2Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f57551y = vVar;
            this.f57552z = c2Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(this.f57551y, this.f57552z, dVar);
            dVar2.f57550x = obj;
            return dVar2;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57549w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(this.f57551y, this.f57552z, null);
                this.f57549w = 1;
                if (((n1.e0) this.f57550x).N(aVar, this) == c10) {
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
    public static final class e extends jo.q implements io.p<l0.i, Integer, s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w f57556w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w wVar) {
            super(2);
            this.f57556w = wVar;
        }

        public final s a(l0.i iVar, int i10) {
            iVar.x(498671830);
            w wVar = this.f57556w;
            iVar.O();
            return wVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ s invoke(l0.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<n1.w, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f57557w = new f();

        public f() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(n1.w wVar) {
            jo.p.h(wVar, "down");
            return Boolean.valueOf(!j0.g(wVar.k(), j0.f41449a.b()));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<d0> f57558w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c2<d0> c2Var) {
            super(0);
            this.f57558w = c2Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f57558w.getValue().i());
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.q<q0, Float, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57559w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ float f57560x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<m1.b> f57561y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<d0> f57562z;

        @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", f = "Scrollable.kt", l = {258}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57563w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c2<d0> f57564x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ float f57565y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c2<d0> c2Var, float f10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57564x = c2Var;
                this.f57565y = f10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57564x, this.f57565y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57563w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    float f10 = this.f57565y;
                    this.f57563w = 1;
                    if (this.f57564x.getValue().e(f10, this) == c10) {
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
        public h(s0<m1.b> s0Var, c2<d0> c2Var, ao.d<? super h> dVar) {
            super(3, dVar);
            this.f57561y = s0Var;
            this.f57562z = c2Var;
        }

        public final Object a(q0 q0Var, float f10, ao.d<? super wn.v> dVar) {
            h hVar = new h(this.f57561y, this.f57562z, dVar);
            hVar.f57560x = f10;
            return hVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57559w == 0) {
                wn.m.b(obj);
                uo.l.d(this.f57561y.getValue().e(), null, null, new a(this.f57562z, this.f57560x, null), 3, null);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(q0 q0Var, Float f10, ao.d<? super wn.v> dVar) {
            return a(q0Var, f10.floatValue(), dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<c1, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ m B;
        public final /* synthetic */ x.m C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q f57566w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b0 f57567x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i0 f57568y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f57569z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q qVar, b0 b0Var, i0 i0Var, boolean z10, boolean z11, m mVar, x.m mVar2) {
            super(1);
            this.f57566w = qVar;
            this.f57567x = b0Var;
            this.f57568y = i0Var;
            this.f57569z = z10;
            this.A = z11;
            this.B = mVar;
            this.C = mVar2;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("scrollable");
            c1Var.a().b("orientation", this.f57566w);
            c1Var.a().b("state", this.f57567x);
            c1Var.a().b("overscrollEffect", this.f57568y);
            c1Var.a().b("enabled", Boolean.valueOf(this.f57569z));
            c1Var.a().b("reverseDirection", Boolean.valueOf(this.A));
            c1Var.a().b("flingBehavior", this.B);
            c1Var.a().b("interactionSource", this.C);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ m A;
        public final /* synthetic */ i0 B;
        public final /* synthetic */ boolean C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q f57570w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b0 f57571x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f57572y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x.m f57573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q qVar, b0 b0Var, boolean z10, x.m mVar, m mVar2, i0 i0Var, boolean z11) {
            super(3);
            this.f57570w = qVar;
            this.f57571x = b0Var;
            this.f57572y = z10;
            this.f57573z = mVar;
            this.A = mVar2;
            this.B = i0Var;
            this.C = z11;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-629830927);
            iVar.x(773894976);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                Object sVar = new l0.s(l0.c0.i(ao.h.f16651w, iVar));
                iVar.q(sVar);
                y10 = sVar;
            }
            iVar.O();
            q0 d10 = ((l0.s) y10).d();
            iVar.O();
            Object[] objArr = {d10, this.f57570w, this.f57571x, Boolean.valueOf(this.f57572y)};
            q qVar = this.f57570w;
            b0 b0Var = this.f57571x;
            boolean z10 = this.f57572y;
            iVar.x(-568225417);
            boolean z11 = false;
            for (int i11 = 0; i11 < 4; i11++) {
                z11 |= iVar.P(objArr[i11]);
            }
            Object y11 = iVar.y();
            if (z11 || y11 == l0.i.f39065a.a()) {
                y11 = new w.c(d10, qVar, b0Var, z10);
                iVar.q(y11);
            }
            iVar.O();
            x0.f fVar2 = x0.f.f59359u;
            x0.f g10 = a0.g(v.r.b(fVar2).L(((w.c) y11).i()), this.f57573z, this.f57570w, this.f57572y, this.f57571x, this.A, this.B, this.C, iVar, 0);
            if (this.C) {
                fVar2 = p.f57841w;
            }
            x0.f L = g10.L(fVar2);
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements m1.a {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f57574w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<d0> f57575x;

        @co.f(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {477}, m = "onPostFling-RZ2iAVY")
        /* loaded from: classes.dex */
        public static final class a extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public long f57576w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f57577x;

            /* renamed from: z  reason: collision with root package name */
            public int f57579z;

            public a(ao.d<? super a> dVar) {
                super(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f57577x = obj;
                this.f57579z |= Integer.MIN_VALUE;
                return k.this.b(0L, 0L, this);
            }
        }

        public k(boolean z10, c2<d0> c2Var) {
            this.f57574w = z10;
            this.f57575x = c2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // m1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(long r3, long r5, ao.d<? super m2.u> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof w.a0.k.a
                if (r3 == 0) goto L13
                r3 = r7
                w.a0$k$a r3 = (w.a0.k.a) r3
                int r4 = r3.f57579z
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f57579z = r4
                goto L18
            L13:
                w.a0$k$a r3 = new w.a0$k$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f57577x
                java.lang.Object r7 = bo.c.c()
                int r0 = r3.f57579z
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f57576w
                wn.m.b(r4)
                goto L4d
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                wn.m.b(r4)
                boolean r4 = r2.f57574w
                if (r4 == 0) goto L58
                l0.c2<w.d0> r4 = r2.f57575x
                java.lang.Object r4 = r4.getValue()
                w.d0 r4 = (w.d0) r4
                r3.f57576w = r5
                r3.f57579z = r1
                java.lang.Object r4 = r4.b(r5, r3)
                if (r4 != r7) goto L4d
                return r7
            L4d:
                m2.u r4 = (m2.u) r4
                long r3 = r4.n()
                long r3 = m2.u.k(r5, r3)
                goto L5e
            L58:
                m2.u$a r3 = m2.u.f40549b
                long r3 = r3.a()
            L5e:
                m2.u r3 = m2.u.b(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: w.a0.k.b(long, long, ao.d):java.lang.Object");
        }

        @Override // m1.a
        public long c(long j10, long j11, int i10) {
            if (this.f57574w) {
                return this.f57575x.getValue().f(j11);
            }
            return b1.f.f16721b.c();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(n1.c r5, ao.d<? super n1.m> r6) {
        /*
            boolean r0 = r6 instanceof w.a0.c
            if (r0 == 0) goto L13
            r0 = r6
            w.a0$c r0 = (w.a0.c) r0
            int r1 = r0.f57548y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57548y = r1
            goto L18
        L13:
            w.a0$c r0 = new w.a0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f57547x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57548y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f57546w
            n1.c r5 = (n1.c) r5
            wn.m.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            wn.m.b(r6)
        L38:
            r0.f57546w = r5
            r0.f57548y = r3
            r6 = 0
            java.lang.Object r6 = n1.c.y0(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            n1.m r6 = (n1.m) r6
            int r2 = r6.f()
            n1.p$a r4 = n1.p.f41507a
            int r4 = r4.f()
            boolean r2 = n1.p.i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.a0.d(n1.c, ao.d):java.lang.Object");
    }

    public static final r1.f<Boolean> e() {
        return f57544b;
    }

    public static final x0.f f(x0.f fVar, c2<d0> c2Var, v vVar) {
        return o0.c(fVar, c2Var, vVar, new d(vVar, c2Var, null));
    }

    public static final x0.f g(x0.f fVar, x.m mVar, q qVar, boolean z10, b0 b0Var, m mVar2, i0 i0Var, boolean z11, l0.i iVar, int i10) {
        x0.f h10;
        iVar.x(-2012025036);
        iVar.x(-1730187034);
        m a10 = mVar2 == null ? z.f57867a.a(iVar, 6) : mVar2;
        iVar.O();
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = z1.e(new m1.b(), null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        c2 l10 = u1.l(new d0(qVar, z10, s0Var, b0Var, a10, i0Var), iVar, 0);
        Boolean valueOf = Boolean.valueOf(z11);
        iVar.x(1157296644);
        boolean P = iVar.P(valueOf);
        Object y11 = iVar.y();
        if (P || y11 == aVar.a()) {
            y11 = k(l10, z11);
            iVar.q(y11);
        }
        iVar.O();
        m1.a aVar2 = (m1.a) y11;
        iVar.x(-492369756);
        Object y12 = iVar.y();
        if (y12 == aVar.a()) {
            y12 = new w(l10);
            iVar.q(y12);
        }
        iVar.O();
        v a11 = w.b.a(iVar, 0);
        h10 = w.k.h(fVar, new e((w) y12), f.f57557w, qVar, (r22 & 8) != 0 ? true : z11, (r22 & 16) != 0 ? null : mVar, new g(l10), (r22 & 64) != 0 ? new k.j(null) : null, (r22 & 128) != 0 ? new k.C0946k(null) : new h(s0Var, l10, null), (r22 & 256) != 0 ? false : false);
        x0.f a12 = m1.c.a(f(h10, l10, a11), aVar2, (m1.b) s0Var.getValue());
        iVar.O();
        return a12;
    }

    public static final x0.f h(x0.f fVar, b0 b0Var, q qVar, i0 i0Var, boolean z10, boolean z11, m mVar, x.m mVar2) {
        jo.p.h(fVar, "<this>");
        jo.p.h(b0Var, "state");
        jo.p.h(qVar, "orientation");
        return x0.e.c(fVar, a1.c() ? new i(qVar, b0Var, i0Var, z10, z11, mVar, mVar2) : a1.a(), new j(qVar, b0Var, z11, mVar2, mVar, i0Var, z10));
    }

    public static final x0.f i(x0.f fVar, b0 b0Var, q qVar, boolean z10, boolean z11, m mVar, x.m mVar2) {
        jo.p.h(fVar, "<this>");
        jo.p.h(b0Var, "state");
        jo.p.h(qVar, "orientation");
        return h(fVar, b0Var, qVar, null, z10, z11, mVar, mVar2);
    }

    public static /* synthetic */ x0.f j(x0.f fVar, b0 b0Var, q qVar, boolean z10, boolean z11, m mVar, x.m mVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return i(fVar, b0Var, qVar, z12, z11, (i10 & 16) != 0 ? null : mVar, (i10 & 32) != 0 ? null : mVar2);
    }

    public static final m1.a k(c2<d0> c2Var, boolean z10) {
        return new k(z10, c2Var);
    }
}
