package y;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import uo.d2;

/* loaded from: classes.dex */
public final class r1 implements m1.a, WindowInsetsAnimationControlListener {
    public WindowInsetsAnimationController A;
    public boolean B;
    public final CancellationSignal C;
    public float D;
    public d2 E;
    public uo.p<? super WindowInsetsAnimationController> F;

    /* renamed from: w  reason: collision with root package name */
    public final y.e f60925w;

    /* renamed from: x  reason: collision with root package name */
    public final View f60926x;

    /* renamed from: y  reason: collision with root package name */
    public final c1 f60927y;

    /* renamed from: z  reason: collision with root package name */
    public final m2.d f60928z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f60929w = new a();

        public a() {
            super(1);
        }

        public final void a(Throwable th2) {
            jo.p.h(th2, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f60930w = new b();

        public b() {
            super(1);
        }

        public final void a(Throwable th2) {
            jo.p.h(th2, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {304, 330, 355}, m = "fling-huYlsQE")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f60931w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60932x;

        /* renamed from: y  reason: collision with root package name */
        public long f60933y;

        /* renamed from: z  reason: collision with root package name */
        public float f60934z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return r1.this.q(0L, 0.0f, false, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {348}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ float A;
        public final /* synthetic */ i1 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ jo.b0 E;
        public final /* synthetic */ WindowInsetsAnimationController F;
        public final /* synthetic */ boolean G;

        /* renamed from: w  reason: collision with root package name */
        public int f60935w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60936x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f60938z;

        @co.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {332}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ int A;
            public final /* synthetic */ int B;
            public final /* synthetic */ r1 C;
            public final /* synthetic */ jo.b0 D;
            public final /* synthetic */ WindowInsetsAnimationController E;
            public final /* synthetic */ boolean F;

            /* renamed from: w  reason: collision with root package name */
            public int f60939w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f60940x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ float f60941y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ i1 f60942z;

            /* renamed from: y.r1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1034a extends jo.q implements io.p<Float, Float, wn.v> {
                public final /* synthetic */ WindowInsetsAnimationController A;
                public final /* synthetic */ boolean B;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ int f60943w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f60944x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ r1 f60945y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ jo.b0 f60946z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1034a(int i10, int i11, r1 r1Var, jo.b0 b0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10) {
                    super(2);
                    this.f60943w = i10;
                    this.f60944x = i11;
                    this.f60945y = r1Var;
                    this.f60946z = b0Var;
                    this.A = windowInsetsAnimationController;
                    this.B = z10;
                }

                public final void a(float f10, float f11) {
                    float f12 = this.f60943w;
                    boolean z10 = false;
                    if (f10 <= this.f60944x && f12 <= f10) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f60945y.n(f10);
                        return;
                    }
                    this.f60946z.f38128w = f11;
                    this.A.finish(this.B);
                    this.f60945y.A = null;
                    d2 d2Var = this.f60945y.E;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(Float f10, Float f11) {
                    a(f10.floatValue(), f11.floatValue());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, float f10, i1 i1Var, int i11, int i12, r1 r1Var, jo.b0 b0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f60940x = i10;
                this.f60941y = f10;
                this.f60942z = i1Var;
                this.A = i11;
                this.B = i12;
                this.C = r1Var;
                this.D = b0Var;
                this.E = windowInsetsAnimationController;
                this.F = z10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f60940x, this.f60941y, this.f60942z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60939w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    float f10 = this.f60941y;
                    i1 i1Var = this.f60942z;
                    C1034a c1034a = new C1034a(this.A, this.B, this.C, this.D, this.E, this.F);
                    this.f60939w = 1;
                    if (u.x0.g(this.f60940x, f10, i1Var, c1034a, this) == c10) {
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
        public d(int i10, float f10, i1 i1Var, int i11, int i12, jo.b0 b0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f60938z = i10;
            this.A = f10;
            this.B = i1Var;
            this.C = i11;
            this.D = i12;
            this.E = b0Var;
            this.F = windowInsetsAnimationController;
            this.G = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(this.f60938z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, dVar);
            dVar2.f60936x = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d2 d10;
            Object c10 = bo.c.c();
            int i10 = this.f60935w;
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f60936x;
                r1 r1Var = r1.this;
                d10 = uo.l.d(q0Var, null, null, new a(this.f60938z, this.A, this.B, this.C, this.D, r1Var, this.E, this.F, this.G, null), 3, null);
                r1Var.E = d10;
                d2 d2Var = r1.this.E;
                if (d2Var != null) {
                    this.f60935w = 1;
                    if (d2Var.E(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            r1.this.E = null;
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ float B;
        public final /* synthetic */ WindowInsetsAnimationController C;
        public final /* synthetic */ boolean D;

        /* renamed from: w  reason: collision with root package name */
        public int f60947w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60948x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f60950z;

        @co.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {358}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ WindowInsetsAnimationController A;
            public final /* synthetic */ boolean B;
            public final /* synthetic */ r1 C;

            /* renamed from: w  reason: collision with root package name */
            public int f60951w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f60952x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f60953y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ float f60954z;

            /* renamed from: y.r1$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1035a extends jo.q implements io.l<u.a<Float, u.m>, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ r1 f60955w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1035a(r1 r1Var) {
                    super(1);
                    this.f60955w = r1Var;
                }

                public final void a(u.a<Float, u.m> aVar) {
                    jo.p.h(aVar, "$this$animateTo");
                    this.f60955w.n(aVar.o().floatValue());
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(u.a<Float, u.m> aVar) {
                    a(aVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, r1 r1Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f60952x = i10;
                this.f60953y = i11;
                this.f60954z = f10;
                this.A = windowInsetsAnimationController;
                this.B = z10;
                this.C = r1Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f60952x, this.f60953y, this.f60954z, this.A, this.B, this.C, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60951w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a b10 = u.b.b(this.f60952x, 0.0f, 2, null);
                    Float c11 = co.b.c(this.f60953y);
                    Float c12 = co.b.c(this.f60954z);
                    C1035a c1035a = new C1035a(this.C);
                    this.f60951w = 1;
                    if (u.a.f(b10, c11, null, c12, c1035a, this, 2, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.A.finish(this.B);
                this.C.A = null;
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f60950z = i10;
            this.A = i11;
            this.B = f10;
            this.C = windowInsetsAnimationController;
            this.D = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f60950z, this.A, this.B, this.C, this.D, dVar);
            eVar.f60948x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d2 d10;
            bo.c.c();
            if (this.f60947w == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f60948x;
                r1 r1Var = r1.this;
                d10 = uo.l.d(q0Var, null, null, new a(this.f60950z, this.A, this.B, this.C, this.D, r1Var, null), 3, null);
                r1Var.E = d10;
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f60956w = new f();

        public f() {
            super(1);
        }

        public final void a(Throwable th2) {
            jo.p.h(th2, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    public r1(y.e eVar, View view, c1 c1Var, m2.d dVar) {
        jo.p.h(eVar, "windowInsets");
        jo.p.h(view, "view");
        jo.p.h(c1Var, "sideCalculator");
        jo.p.h(dVar, "density");
        this.f60925w = eVar;
        this.f60926x = view;
        this.f60927y = c1Var;
        this.f60928z = dVar;
        this.C = new CancellationSignal();
    }

    @Override // m1.a
    public Object b(long j10, long j11, ao.d<? super m2.u> dVar) {
        return q(j11, this.f60927y.a(m2.u.h(j11), m2.u.i(j11)), true, dVar);
    }

    @Override // m1.a
    public long c(long j10, long j11, int i10) {
        return t(j11, this.f60927y.a(b1.f.m(j11), b1.f.n(j11)));
    }

    @Override // m1.a
    public Object f(long j10, ao.d<? super m2.u> dVar) {
        return q(j10, this.f60927y.d(m2.u.h(j10), m2.u.i(j10)), false, dVar);
    }

    @Override // m1.a
    public long g(long j10, int i10) {
        return t(j10, this.f60927y.d(b1.f.m(j10), b1.f.n(j10)));
    }

    public final void n(float f10) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.A;
        if (windowInsetsAnimationController != null) {
            Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
            jo.p.g(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.f60927y.c(currentInsets, lo.c.c(f10)), 1.0f, 0.0f);
        }
    }

    public final void o() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.A;
        if ((windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady()) && (windowInsetsAnimationController = this.A) != null) {
            windowInsetsAnimationController.finish(this.f60925w.g());
        }
        this.A = null;
        uo.p<? super WindowInsetsAnimationController> pVar = this.F;
        if (pVar != null) {
            pVar.R(null, a.f60929w);
        }
        this.F = null;
        d2 d2Var = this.E;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.E = null;
        this.D = 0.0f;
        this.B = false;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        o();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        jo.p.h(windowInsetsAnimationController, "controller");
        o();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
        jo.p.h(windowInsetsAnimationController, "controller");
        this.A = windowInsetsAnimationController;
        this.B = false;
        uo.p<? super WindowInsetsAnimationController> pVar = this.F;
        if (pVar != null) {
            pVar.R(windowInsetsAnimationController, f.f60956w);
        }
        this.F = null;
    }

    public final void p() {
        uo.p<? super WindowInsetsAnimationController> pVar = this.F;
        if (pVar != null) {
            pVar.R(null, b.f60930w);
        }
        d2 d2Var = this.E;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.A;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!jo.p.c(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(long r27, float r29, boolean r30, ao.d<? super m2.u> r31) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.r1.q(long, float, boolean, ao.d):java.lang.Object");
    }

    public final Object r(ao.d<? super WindowInsetsAnimationController> dVar) {
        Object obj = this.A;
        if (obj == null) {
            uo.q qVar = new uo.q(bo.b.b(dVar), 1);
            qVar.y();
            this.F = qVar;
            s();
            obj = qVar.t();
            if (obj == bo.c.c()) {
                co.h.c(dVar);
            }
        }
        return obj;
    }

    public final void s() {
        if (this.B) {
            return;
        }
        this.B = true;
        WindowInsetsController windowInsetsController = this.f60926x.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f60925w.f(), -1L, null, this.C, this);
        }
    }

    public final long t(long j10, float f10) {
        d2 d2Var = this.E;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
            this.E = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.A;
        if (!(f10 == 0.0f)) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (this.f60925w.g() != (i10 > 0) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.D = 0.0f;
                    s();
                    return this.f60927y.f(j10);
                }
                c1 c1Var = this.f60927y;
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                jo.p.g(hiddenStateInsets, "animationController.hiddenStateInsets");
                int e10 = c1Var.e(hiddenStateInsets);
                c1 c1Var2 = this.f60927y;
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                jo.p.g(shownStateInsets, "animationController.shownStateInsets");
                int e11 = c1Var2.e(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                jo.p.g(currentInsets, "animationController.currentInsets");
                int e12 = this.f60927y.e(currentInsets);
                if (e12 == (i10 > 0 ? e11 : e10)) {
                    this.D = 0.0f;
                    return b1.f.f16721b.c();
                }
                float f11 = e12 + f10 + this.D;
                int m10 = po.n.m(lo.c.c(f11), e10, e11);
                this.D = f11 - lo.c.c(f11);
                if (m10 != e12) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f60927y.c(currentInsets, m10), 1.0f, 0.0f);
                }
                return this.f60927y.f(j10);
            }
        }
        return b1.f.f16721b.c();
    }
}
