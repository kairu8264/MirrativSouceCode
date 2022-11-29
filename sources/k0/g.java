package k0;

import c1.c0;
import l0.s0;
import l0.z1;
import u.b0;
import u.b1;
import uo.a0;
import uo.d2;
import uo.q0;
import uo.r0;
import uo.y;
import wn.v;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public b1.f f38296a;

    /* renamed from: b  reason: collision with root package name */
    public final float f38297b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f38298c;

    /* renamed from: d  reason: collision with root package name */
    public Float f38299d;

    /* renamed from: e  reason: collision with root package name */
    public Float f38300e;

    /* renamed from: f  reason: collision with root package name */
    public b1.f f38301f;

    /* renamed from: g  reason: collision with root package name */
    public final u.a<Float, u.m> f38302g;

    /* renamed from: h  reason: collision with root package name */
    public final u.a<Float, u.m> f38303h;

    /* renamed from: i  reason: collision with root package name */
    public final u.a<Float, u.m> f38304i;

    /* renamed from: j  reason: collision with root package name */
    public final y<v> f38305j;

    /* renamed from: k  reason: collision with root package name */
    public final s0 f38306k;

    /* renamed from: l  reason: collision with root package name */
    public final s0 f38307l;

    @co.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38308w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38309x;

        /* renamed from: z  reason: collision with root package name */
        public int f38311z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38309x = obj;
            this.f38311z |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super d2>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38312w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38313x;

        @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38315w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f38316x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f38316x = gVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f38316x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38315w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a aVar = this.f38316x.f38302g;
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(75, 0, b0.c(), 2, null);
                    this.f38315w = 1;
                    if (u.a.f(aVar, c11, i11, null, null, this, 12, null) == c10) {
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

        @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
        /* renamed from: k0.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0533b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38317w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f38318x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0533b(g gVar, ao.d<? super C0533b> dVar) {
                super(2, dVar);
                this.f38318x = gVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0533b(this.f38318x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0533b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38317w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a aVar = this.f38318x.f38303h;
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(225, 0, b0.b(), 2, null);
                    this.f38317w = 1;
                    if (u.a.f(aVar, c11, i11, null, null, this, 12, null) == c10) {
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

        @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38319w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f38320x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g gVar, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f38320x = gVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new c(this.f38320x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38319w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a aVar = this.f38320x.f38304i;
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(225, 0, b0.c(), 2, null);
                    this.f38319w = 1;
                    if (u.a.f(aVar, c11, i11, null, null, this, 12, null) == c10) {
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

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f38313x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super d2> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d2 d10;
            bo.c.c();
            if (this.f38312w == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f38313x;
                uo.l.d(q0Var, null, null, new a(g.this, null), 3, null);
                uo.l.d(q0Var, null, null, new C0533b(g.this, null), 3, null);
                d10 = uo.l.d(q0Var, null, null, new c(g.this, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super d2>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38321w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38322x;

        @co.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38324w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f38325x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f38325x = gVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f38325x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38324w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a aVar = this.f38325x.f38302g;
                    Float c11 = co.b.c(0.0f);
                    b1 i11 = u.j.i(150, 0, b0.c(), 2, null);
                    this.f38324w = 1;
                    if (u.a.f(aVar, c11, i11, null, null, this, 12, null) == c10) {
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

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f38322x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super d2> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d2 d10;
            bo.c.c();
            if (this.f38321w == 0) {
                wn.m.b(obj);
                d10 = uo.l.d((q0) this.f38322x, null, null, new a(g.this, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(b1.f fVar, float f10, boolean z10) {
        s0 e10;
        s0 e11;
        this.f38296a = fVar;
        this.f38297b = f10;
        this.f38298c = z10;
        this.f38302g = u.b.b(0.0f, 0.0f, 2, null);
        this.f38303h = u.b.b(0.0f, 0.0f, 2, null);
        this.f38304i = u.b.b(0.0f, 0.0f, 2, null);
        this.f38305j = a0.a(null);
        Boolean bool = Boolean.FALSE;
        e10 = z1.e(bool, null, 2, null);
        this.f38306k = e10;
        e11 = z1.e(bool, null, 2, null);
        this.f38307l = e11;
    }

    public /* synthetic */ g(b1.f fVar, float f10, boolean z10, jo.h hVar) {
        this(fVar, f10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ao.d<? super wn.v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof k0.g.a
            if (r0 == 0) goto L13
            r0 = r7
            k0.g$a r0 = (k0.g.a) r0
            int r1 = r0.f38311z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38311z = r1
            goto L18
        L13:
            k0.g$a r0 = new k0.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38309x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f38311z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            wn.m.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f38308w
            k0.g r2 = (k0.g) r2
            wn.m.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f38308w
            k0.g r2 = (k0.g) r2
            wn.m.b(r7)
            goto L56
        L47:
            wn.m.b(r7)
            r0.f38308w = r6
            r0.f38311z = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            uo.y<wn.v> r7 = r2.f38305j
            r0.f38308w = r2
            r0.f38311z = r4
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f38308w = r7
            r0.f38311z = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            wn.v r7 = wn.v.f59242a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.d(ao.d):java.lang.Object");
    }

    public final void e(e1.e eVar, long j10) {
        Float valueOf;
        jo.p.h(eVar, "$this$draw");
        if (this.f38299d == null) {
            this.f38299d = Float.valueOf(h.b(eVar.c()));
        }
        if (this.f38300e == null) {
            if (Float.isNaN(this.f38297b)) {
                valueOf = Float.valueOf(h.a(eVar, this.f38298c, eVar.c()));
            } else {
                valueOf = Float.valueOf(eVar.I0(this.f38297b));
            }
            this.f38300e = valueOf;
        }
        if (this.f38296a == null) {
            this.f38296a = b1.f.d(eVar.U0());
        }
        if (this.f38301f == null) {
            this.f38301f = b1.f.d(b1.g.a(b1.l.i(eVar.c()) / 2.0f, b1.l.g(eVar.c()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? this.f38302g.o().floatValue() : 1.0f;
        Float f10 = this.f38299d;
        jo.p.e(f10);
        float floatValue2 = f10.floatValue();
        Float f11 = this.f38300e;
        jo.p.e(f11);
        float a10 = n2.a.a(floatValue2, f11.floatValue(), this.f38303h.o().floatValue());
        b1.f fVar = this.f38296a;
        jo.p.e(fVar);
        float m10 = b1.f.m(fVar.u());
        b1.f fVar2 = this.f38301f;
        jo.p.e(fVar2);
        float a11 = n2.a.a(m10, b1.f.m(fVar2.u()), this.f38304i.o().floatValue());
        b1.f fVar3 = this.f38296a;
        jo.p.e(fVar3);
        float n10 = b1.f.n(fVar3.u());
        b1.f fVar4 = this.f38301f;
        jo.p.e(fVar4);
        long a12 = b1.g.a(a11, n2.a.a(n10, b1.f.n(fVar4.u()), this.f38304i.o().floatValue()));
        long k10 = c0.k(j10, c0.n(j10) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f38298c) {
            e1.e.D(eVar, k10, a10, a12, 0.0f, null, null, 0, 120, null);
            return;
        }
        float i10 = b1.l.i(eVar.c());
        float g10 = b1.l.g(eVar.c());
        int b10 = c1.b0.f18630a.b();
        e1.d M0 = eVar.M0();
        long c10 = M0.c();
        M0.e().p();
        M0.d().a(0.0f, 0.0f, i10, g10, b10);
        e1.e.D(eVar, k10, a10, a12, 0.0f, null, null, 0, 120, null);
        M0.e().k();
        M0.f(c10);
    }

    public final Object f(ao.d<? super v> dVar) {
        Object e10 = r0.e(new b(null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    public final Object g(ao.d<? super v> dVar) {
        Object e10 = r0.e(new c(null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    public final void h() {
        k(true);
        this.f38305j.F(v.f59242a);
    }

    public final boolean i() {
        return ((Boolean) this.f38307l.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.f38306k.getValue()).booleanValue();
    }

    public final void k(boolean z10) {
        this.f38307l.setValue(Boolean.valueOf(z10));
    }

    public final void l(boolean z10) {
        this.f38306k.setValue(Boolean.valueOf(z10));
    }
}
