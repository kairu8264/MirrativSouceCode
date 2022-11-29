package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import x0.f;

/* loaded from: classes.dex */
public final class q0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<r0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f56308w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(0);
            this.f56308w = i10;
        }

        @Override // io.a
        /* renamed from: a */
        public final r0 invoke() {
            return new r0(this.f56308w);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f56309w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f56310x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w.m f56311y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f56312z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0 r0Var, boolean z10, w.m mVar, boolean z11, boolean z12) {
            super(1);
            this.f56309w = r0Var;
            this.f56310x = z10;
            this.f56311y = mVar;
            this.f56312z = z11;
            this.A = z12;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("scroll");
            c1Var.a().b("state", this.f56309w);
            c1Var.a().b("reverseScrolling", Boolean.valueOf(this.f56310x));
            c1Var.a().b("flingBehavior", this.f56311y);
            c1Var.a().b("isScrollable", Boolean.valueOf(this.f56312z));
            c1Var.a().b("isVertical", Boolean.valueOf(this.A));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f56313w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f56314x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f56315y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ w.m f56316z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<w1.y, wn.v> {
            public final /* synthetic */ uo.q0 A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f56317w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ boolean f56318x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f56319y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ r0 f56320z;

            /* renamed from: v.q0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0888a extends jo.q implements io.p<Float, Float, Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ uo.q0 f56321w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ boolean f56322x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ r0 f56323y;

                @co.f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {276, 278}, m = "invokeSuspend")
                /* renamed from: v.q0$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0889a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
                    public final /* synthetic */ float A;

                    /* renamed from: w  reason: collision with root package name */
                    public int f56324w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ boolean f56325x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ r0 f56326y;

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ float f56327z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0889a(boolean z10, r0 r0Var, float f10, float f11, ao.d<? super C0889a> dVar) {
                        super(2, dVar);
                        this.f56325x = z10;
                        this.f56326y = r0Var;
                        this.f56327z = f10;
                        this.A = f11;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0889a(this.f56325x, this.f56326y, this.f56327z, this.A, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0889a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f56324w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            if (this.f56325x) {
                                r0 r0Var = this.f56326y;
                                float f10 = this.f56327z;
                                this.f56324w = 1;
                                if (w.x.b(r0Var, f10, null, this, 2, null) == c10) {
                                    return c10;
                                }
                            } else {
                                r0 r0Var2 = this.f56326y;
                                float f11 = this.A;
                                this.f56324w = 2;
                                if (w.x.b(r0Var2, f11, null, this, 2, null) == c10) {
                                    return c10;
                                }
                            }
                        } else if (i10 != 1 && i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            wn.m.b(obj);
                        }
                        return wn.v.f59242a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0888a(uo.q0 q0Var, boolean z10, r0 r0Var) {
                    super(2);
                    this.f56321w = q0Var;
                    this.f56322x = z10;
                    this.f56323y = r0Var;
                }

                public final Boolean a(float f10, float f11) {
                    uo.l.d(this.f56321w, null, null, new C0889a(this.f56322x, this.f56323y, f11, f10, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.a<Float> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ r0 f56328w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(r0 r0Var) {
                    super(0);
                    this.f56328w = r0Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final Float invoke() {
                    return Float.valueOf(this.f56328w.k());
                }
            }

            /* renamed from: v.q0$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0890c extends jo.q implements io.a<Float> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ r0 f56329w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0890c(r0 r0Var) {
                    super(0);
                    this.f56329w = r0Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final Float invoke() {
                    return Float.valueOf(this.f56329w.j());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, boolean z12, r0 r0Var, uo.q0 q0Var) {
                super(1);
                this.f56317w = z10;
                this.f56318x = z11;
                this.f56319y = z12;
                this.f56320z = r0Var;
                this.A = q0Var;
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
                w1.i iVar = new w1.i(new b(this.f56320z), new C0890c(this.f56320z), this.f56317w);
                if (this.f56318x) {
                    w1.w.R(yVar, iVar);
                } else {
                    w1.w.D(yVar, iVar);
                }
                if (this.f56319y) {
                    w1.w.v(yVar, null, new C0888a(this.A, this.f56318x, this.f56320z), 1, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, r0 r0Var, boolean z11, w.m mVar, boolean z12) {
            super(3);
            this.f56313w = z10;
            this.f56314x = r0Var;
            this.f56315y = z11;
            this.f56316z = mVar;
            this.A = z12;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(1478351300);
            i0 b10 = w.z.f57867a.b(iVar, 6);
            iVar.x(773894976);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                l0.s sVar = new l0.s(l0.c0.i(ao.h.f16651w, iVar));
                iVar.q(sVar);
                y10 = sVar;
            }
            iVar.O();
            uo.q0 d10 = ((l0.s) y10).d();
            iVar.O();
            f.a aVar = x0.f.f59359u;
            x0.f b11 = w1.p.b(aVar, false, new a(this.A, this.f56313w, this.f56315y, this.f56314x, d10), 1, null);
            boolean z10 = this.f56313w;
            w.q qVar = z10 ? w.q.Vertical : w.q.Horizontal;
            boolean z11 = !this.A;
            x0.f L = j0.a(n.a(b11, qVar), b10).L(w.a0.h(aVar, this.f56314x, qVar, b10, this.f56315y, (!(iVar.G(androidx.compose.ui.platform.o0.j()) == m2.q.Rtl) || z10) ? z11 : !z11, this.f56316z, this.f56314x.i())).L(new s0(this.f56314x, this.A, this.f56313w, b10));
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final r0 a(int i10, l0.i iVar, int i11, int i12) {
        iVar.x(-1464256199);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        r0 r0Var = (r0) u0.b.b(new Object[0], r0.f56375f.a(), null, new a(i10), iVar, 72, 4);
        iVar.O();
        return r0Var;
    }

    public static final x0.f b(x0.f fVar, r0 r0Var, boolean z10, w.m mVar, boolean z11, boolean z12) {
        return x0.e.c(fVar, a1.c() ? new b(r0Var, z10, mVar, z11, z12) : a1.a(), new c(z12, r0Var, z11, mVar, z10));
    }

    public static final x0.f c(x0.f fVar, r0 r0Var, boolean z10, w.m mVar, boolean z11) {
        jo.p.h(fVar, "<this>");
        jo.p.h(r0Var, "state");
        return b(fVar, r0Var, z11, mVar, z10, true);
    }

    public static /* synthetic */ x0.f d(x0.f fVar, r0 r0Var, boolean z10, w.m mVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(fVar, r0Var, z10, mVar, z11);
    }
}
