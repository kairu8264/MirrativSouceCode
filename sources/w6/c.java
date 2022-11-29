package w6;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import io.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import l0.o0;
import l0.s0;
import l0.u1;
import l0.z1;
import uo.d2;
import uo.g2;
import uo.q0;
import uo.q2;
import v.e0;
import wn.v;

/* loaded from: classes.dex */
public final class c implements w6.b {
    public final s0 A;
    public final s0 B;
    public final s0 C;
    public final s0 D;
    public final c2 E;
    public final c2 F;
    public final e0 G;

    /* renamed from: w  reason: collision with root package name */
    public final s0 f58135w;

    /* renamed from: x  reason: collision with root package name */
    public final s0 f58136x;

    /* renamed from: y  reason: collision with root package name */
    public final s0 f58137y;

    /* renamed from: z  reason: collision with root package name */
    public final s0 f58138z;

    @co.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.l<ao.d<? super v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ h B;
        public final /* synthetic */ s6.d C;
        public final /* synthetic */ float D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ g F;

        /* renamed from: w  reason: collision with root package name */
        public int f58139w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f58140x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c f58141y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58142z;

        @co.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$2", f = "LottieAnimatable.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend")
        /* renamed from: w6.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0953a extends co.l implements p<q0, ao.d<? super v>, Object> {
            public final /* synthetic */ int A;
            public final /* synthetic */ c B;

            /* renamed from: w  reason: collision with root package name */
            public int f58143w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f58144x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ d2 f58145y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f58146z;

            /* renamed from: w6.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0954a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f58147a;

                static {
                    int[] iArr = new int[g.values().length];
                    iArr[g.OnIterationFinish.ordinal()] = 1;
                    f58147a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0953a(g gVar, d2 d2Var, int i10, int i11, c cVar, ao.d<? super C0953a> dVar) {
                super(2, dVar);
                this.f58144x = gVar;
                this.f58145y = d2Var;
                this.f58146z = i10;
                this.A = i11;
                this.B = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0953a(this.f58144x, this.f58145y, this.f58146z, this.A, this.B, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0953a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0044 -> B:20:0x0048). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r5.f58143w
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    wn.m.b(r6)
                    r1 = r0
                    r0 = r5
                    goto L48
                L11:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L19:
                    wn.m.b(r6)
                    r6 = r5
                L1d:
                    w6.g r1 = r6.f58144x
                    int[] r3 = w6.c.a.C0953a.C0954a.f58147a
                    int r1 = r1.ordinal()
                    r1 = r3[r1]
                    if (r1 != r2) goto L37
                    uo.d2 r1 = r6.f58145y
                    boolean r1 = r1.isActive()
                    if (r1 == 0) goto L34
                    int r1 = r6.f58146z
                    goto L39
                L34:
                    int r1 = r6.A
                    goto L39
                L37:
                    int r1 = r6.f58146z
                L39:
                    w6.c r3 = r6.B
                    r6.f58143w = r2
                    java.lang.Object r1 = w6.c.d(r3, r1, r6)
                    if (r1 != r0) goto L44
                    return r0
                L44:
                    r4 = r0
                    r0 = r6
                    r6 = r1
                    r1 = r4
                L48:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 != 0) goto L53
                    wn.v r6 = wn.v.f59242a
                    return r6
                L53:
                    r6 = r0
                    r0 = r1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: w6.c.a.C0953a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f58148a;

            static {
                int[] iArr = new int[g.values().length];
                iArr[g.OnIterationFinish.ordinal()] = 1;
                iArr[g.Immediately.ordinal()] = 2;
                f58148a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, c cVar, int i10, int i11, h hVar, s6.d dVar, float f11, boolean z10, g gVar, ao.d<? super a> dVar2) {
            super(1, dVar2);
            this.f58140x = f10;
            this.f58141y = cVar;
            this.f58142z = i10;
            this.A = i11;
            this.B = hVar;
            this.C = dVar;
            this.D = f11;
            this.E = z10;
            this.F = gVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Object invoke(ao.d<? super v> dVar) {
            return ((a) create(dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final ao.d<v> create(ao.d<?> dVar) {
            return new a(this.f58140x, this.f58141y, this.f58142z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            ao.g gVar;
            Object c10 = bo.c.c();
            int i10 = this.f58139w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    float f10 = this.f58140x;
                    boolean z10 = (Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true;
                    float f11 = this.f58140x;
                    if (z10) {
                        this.f58141y.C(this.f58142z);
                        this.f58141y.D(this.A);
                        this.f58141y.H(this.f58140x);
                        this.f58141y.A(this.B);
                        this.f58141y.B(this.C);
                        this.f58141y.G(this.D);
                        if (!this.E) {
                            this.f58141y.E(Long.MIN_VALUE);
                        }
                        if (this.C == null) {
                            this.f58141y.F(false);
                            return v.f59242a;
                        }
                        this.f58141y.F(true);
                        int i11 = b.f58148a[this.F.ordinal()];
                        if (i11 == 1) {
                            gVar = q2.f56080w;
                        } else if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            gVar = ao.h.f16651w;
                        }
                        C0953a c0953a = new C0953a(this.F, g2.l(getContext()), this.A, this.f58142z, this.f58141y, null);
                        this.f58139w = 1;
                        if (uo.j.f(gVar, c0953a, this) == c10) {
                            return c10;
                        }
                    } else {
                        throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + '.').toString());
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g2.j(getContext());
                this.f58141y.F(false);
                return v.f59242a;
            } catch (Throwable th2) {
                this.f58141y.F(false);
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<Long, Boolean> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58150x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f58150x = i10;
        }

        public final Boolean a(long j10) {
            s6.d l10 = c.this.l();
            if (l10 == null) {
                return Boolean.TRUE;
            }
            long y10 = c.this.y() == Long.MIN_VALUE ? 0L : j10 - c.this.y();
            c.this.E(j10);
            h n10 = c.this.n();
            float b10 = n10 == null ? 0.0f : n10.b(l10);
            h n11 = c.this.n();
            float a10 = n11 == null ? 1.0f : n11.a(l10);
            float d10 = (((float) (y10 / 1000000)) / l10.d()) * c.this.f();
            float g10 = c.this.f() < 0.0f ? b10 - (c.this.g() + d10) : (c.this.g() + d10) - a10;
            if (g10 < 0.0f) {
                c cVar = c.this;
                cVar.G(po.n.l(cVar.g(), b10, a10) + d10);
            } else {
                float f10 = a10 - b10;
                int i10 = ((int) (g10 / f10)) + 1;
                if (c.this.h() + i10 > this.f58150x) {
                    c cVar2 = c.this;
                    cVar2.G(cVar2.x());
                    c.this.C(this.f58150x);
                    return Boolean.FALSE;
                }
                c cVar3 = c.this;
                cVar3.C(cVar3.h() + i10);
                float f11 = g10 - ((i10 - 1) * f10);
                c cVar4 = c.this;
                cVar4.G(cVar4.f() < 0.0f ? a10 - f11 : b10 + f11);
            }
            return Boolean.TRUE;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* renamed from: w6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0955c extends q implements io.a<Float> {
        public C0955c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            s6.d l10 = c.this.l();
            float f10 = 0.0f;
            if (l10 != null) {
                if (c.this.f() < 0.0f) {
                    h n10 = c.this.n();
                    if (n10 != null) {
                        f10 = n10.b(l10);
                    }
                } else {
                    h n11 = c.this.n();
                    f10 = n11 == null ? 1.0f : n11.a(l10);
                }
            }
            return Float.valueOf(f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<Boolean> {
        public d() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
            if ((r4.f58152w.g() == r4.f58152w.x()) != false) goto L7;
         */
        @Override // io.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() {
            /*
                r4 = this;
                w6.c r0 = w6.c.this
                int r0 = r0.h()
                w6.c r1 = w6.c.this
                int r1 = r1.e()
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L26
                w6.c r0 = w6.c.this
                float r0 = r0.g()
                w6.c r1 = w6.c.this
                float r1 = w6.c.j(r1)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L22
                r0 = r2
                goto L23
            L22:
                r0 = r3
            L23:
                if (r0 == 0) goto L26
                goto L27
            L26:
                r2 = r3
            L27:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.c.d.invoke():java.lang.Boolean");
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.l<ao.d<? super v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f58153w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s6.d f58155y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f58156z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s6.d dVar, float f10, int i10, boolean z10, ao.d<? super e> dVar2) {
            super(1, dVar2);
            this.f58155y = dVar;
            this.f58156z = f10;
            this.A = i10;
            this.B = z10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Object invoke(ao.d<? super v> dVar) {
            return ((e) create(dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final ao.d<v> create(ao.d<?> dVar) {
            return new e(this.f58155y, this.f58156z, this.A, this.B, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58153w == 0) {
                wn.m.b(obj);
                c.this.B(this.f58155y);
                c.this.G(this.f58156z);
                c.this.C(this.A);
                c.this.F(false);
                if (this.B) {
                    c.this.E(Long.MIN_VALUE);
                }
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c() {
        s0 e10;
        s0 e11;
        s0 e12;
        s0 e13;
        s0 e14;
        s0 e15;
        s0 e16;
        s0 e17;
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f58135w = e10;
        e11 = z1.e(Float.valueOf(0.0f), null, 2, null);
        this.f58136x = e11;
        e12 = z1.e(1, null, 2, null);
        this.f58137y = e12;
        e13 = z1.e(1, null, 2, null);
        this.f58138z = e13;
        e14 = z1.e(null, null, 2, null);
        this.A = e14;
        e15 = z1.e(Float.valueOf(1.0f), null, 2, null);
        this.B = e15;
        e16 = z1.e(null, null, 2, null);
        this.C = e16;
        e17 = z1.e(Long.MIN_VALUE, null, 2, null);
        this.D = e17;
        this.E = u1.b(new C0955c());
        this.F = u1.b(new d());
        this.G = new e0();
    }

    public final void A(h hVar) {
        this.A.setValue(hVar);
    }

    public final void B(s6.d dVar) {
        this.C.setValue(dVar);
    }

    public final void C(int i10) {
        this.f58137y.setValue(Integer.valueOf(i10));
    }

    public final void D(int i10) {
        this.f58138z.setValue(Integer.valueOf(i10));
    }

    public final void E(long j10) {
        this.D.setValue(Long.valueOf(j10));
    }

    public final void F(boolean z10) {
        this.f58135w.setValue(Boolean.valueOf(z10));
    }

    public final void G(float f10) {
        this.f58136x.setValue(Float.valueOf(f10));
    }

    public final void H(float f10) {
        this.B.setValue(Float.valueOf(f10));
    }

    @Override // w6.b
    public Object a(s6.d dVar, int i10, int i11, float f10, h hVar, float f11, boolean z10, g gVar, ao.d<? super v> dVar2) {
        Object e10 = e0.e(this.G, null, new a(f10, this, i10, i11, hVar, dVar, f11, z10, gVar, null), dVar2, 1, null);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    @Override // w6.f
    public int e() {
        return ((Number) this.f58138z.getValue()).intValue();
    }

    @Override // w6.f
    public float f() {
        return ((Number) this.B.getValue()).floatValue();
    }

    @Override // w6.f
    public float g() {
        return ((Number) this.f58136x.getValue()).floatValue();
    }

    @Override // w6.f
    public int h() {
        return ((Number) this.f58137y.getValue()).intValue();
    }

    @Override // w6.f
    public s6.d l() {
        return (s6.d) this.C.getValue();
    }

    @Override // w6.f
    public h n() {
        return (h) this.A.getValue();
    }

    @Override // w6.b
    public Object o(s6.d dVar, float f10, int i10, boolean z10, ao.d<? super v> dVar2) {
        Object e10 = e0.e(this.G, null, new e(dVar, f10, i10, z10, null), dVar2, 1, null);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    public final Object w(int i10, ao.d<? super Boolean> dVar) {
        return o0.b(new b(i10), dVar);
    }

    public final float x() {
        return ((Number) this.E.getValue()).floatValue();
    }

    public long y() {
        return ((Number) this.D.getValue()).longValue();
    }

    @Override // l0.c2
    /* renamed from: z */
    public Float getValue() {
        return Float.valueOf(g());
    }
}
