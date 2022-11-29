package v;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import l0.c2;
import l0.i;
import l0.u1;
import l0.z1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w1.x<io.a<b1.f>> f56136a = new w1.x<>("MagnifierPositionInRoot", null, 2, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f56137w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l f56138x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f56139y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c0 f56140z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar, io.l lVar2, float f10, c0 c0Var) {
            super(1);
            this.f56137w = lVar;
            this.f56138x = lVar2;
            this.f56139y = f10;
            this.f56140z = c0Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b(b0.c(0, 1, null) ? "magnifier" : "magnifier (not supported)");
            c1Var.a().b("sourceCenter", this.f56137w);
            c1Var.a().b("magnifierCenter", this.f56138x);
            c1Var.a().b("zoom", Float.valueOf(this.f56139y));
            c1Var.a().b(TtmlNode.TAG_STYLE, this.f56140z);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<m2.d, b1.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f56141w = new b();

        public b() {
            super(1);
        }

        public final long a(m2.d dVar) {
            jo.p.h(dVar, "$this$null");
            return b1.f.f16721b.b();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ b1.f invoke(m2.d dVar) {
            return b1.f.d(a(dVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ m0 A;
        public final /* synthetic */ c0 B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<m2.d, b1.f> f56142w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<m2.d, b1.f> f56143x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f56144y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<m2.j, wn.v> f56145z;

        @co.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ View A;
            public final /* synthetic */ m2.d B;
            public final /* synthetic */ float C;
            public final /* synthetic */ xo.r<wn.v> D;
            public final /* synthetic */ c2<io.l<m2.j, wn.v>> E;
            public final /* synthetic */ c2<Boolean> F;
            public final /* synthetic */ c2<b1.f> G;
            public final /* synthetic */ c2<io.l<m2.d, b1.f>> H;
            public final /* synthetic */ l0.s0<b1.f> I;
            public final /* synthetic */ c2<Float> J;

            /* renamed from: w  reason: collision with root package name */
            public int f56146w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f56147x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ m0 f56148y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ c0 f56149z;

            @co.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            /* renamed from: v.b0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0883a extends co.l implements io.p<wn.v, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f56150w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ l0 f56151x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0883a(l0 l0Var, ao.d<? super C0883a> dVar) {
                    super(2, dVar);
                    this.f56151x = l0Var;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(wn.v vVar, ao.d<? super wn.v> dVar) {
                    return ((C0883a) create(vVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0883a(this.f56151x, dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    bo.c.c();
                    if (this.f56150w == 0) {
                        wn.m.b(obj);
                        this.f56151x.c();
                        return wn.v.f59242a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.a<wn.v> {
                public final /* synthetic */ c2<io.l<m2.d, b1.f>> A;
                public final /* synthetic */ l0.s0<b1.f> B;
                public final /* synthetic */ c2<Float> C;
                public final /* synthetic */ jo.d0 D;
                public final /* synthetic */ c2<io.l<m2.j, wn.v>> E;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ l0 f56152w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ m2.d f56153x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ c2<Boolean> f56154y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ c2<b1.f> f56155z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(l0 l0Var, m2.d dVar, c2<Boolean> c2Var, c2<b1.f> c2Var2, c2<? extends io.l<? super m2.d, b1.f>> c2Var3, l0.s0<b1.f> s0Var, c2<Float> c2Var4, jo.d0 d0Var, c2<? extends io.l<? super m2.j, wn.v>> c2Var5) {
                    super(0);
                    this.f56152w = l0Var;
                    this.f56153x = dVar;
                    this.f56154y = c2Var;
                    this.f56155z = c2Var2;
                    this.A = c2Var3;
                    this.B = s0Var;
                    this.C = c2Var4;
                    this.D = d0Var;
                    this.E = c2Var5;
                }

                public final void a() {
                    long b10;
                    if (c.k(this.f56154y)) {
                        l0 l0Var = this.f56152w;
                        long q10 = c.q(this.f56155z);
                        Object invoke = c.n(this.A).invoke(this.f56153x);
                        l0.s0<b1.f> s0Var = this.B;
                        long u10 = ((b1.f) invoke).u();
                        if (b1.g.c(u10)) {
                            b10 = b1.f.r(c.j(s0Var), u10);
                        } else {
                            b10 = b1.f.f16721b.b();
                        }
                        l0Var.b(q10, b10, c.o(this.C));
                        long a10 = this.f56152w.a();
                        jo.d0 d0Var = this.D;
                        m2.d dVar = this.f56153x;
                        c2<io.l<m2.j, wn.v>> c2Var = this.E;
                        if (m2.o.e(a10, d0Var.f38135w)) {
                            return;
                        }
                        d0Var.f38135w = a10;
                        io.l p10 = c.p(c2Var);
                        if (p10 != null) {
                            p10.invoke(m2.j.c(dVar.f(m2.p.b(a10))));
                            return;
                        }
                        return;
                    }
                    this.f56152w.dismiss();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m0 m0Var, c0 c0Var, View view, m2.d dVar, float f10, xo.r<wn.v> rVar, c2<? extends io.l<? super m2.j, wn.v>> c2Var, c2<Boolean> c2Var2, c2<b1.f> c2Var3, c2<? extends io.l<? super m2.d, b1.f>> c2Var4, l0.s0<b1.f> s0Var, c2<Float> c2Var5, ao.d<? super a> dVar2) {
                super(2, dVar2);
                this.f56148y = m0Var;
                this.f56149z = c0Var;
                this.A = view;
                this.B = dVar;
                this.C = f10;
                this.D = rVar;
                this.E = c2Var;
                this.F = c2Var2;
                this.G = c2Var3;
                this.H = c2Var4;
                this.I = s0Var;
                this.J = c2Var5;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f56148y, this.f56149z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, dVar);
                aVar.f56147x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                l0 l0Var;
                Object c10 = bo.c.c();
                int i10 = this.f56146w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    uo.q0 q0Var = (uo.q0) this.f56147x;
                    l0 a10 = this.f56148y.a(this.f56149z, this.A, this.B, this.C);
                    jo.d0 d0Var = new jo.d0();
                    long a11 = a10.a();
                    m2.d dVar = this.B;
                    io.l p10 = c.p(this.E);
                    if (p10 != null) {
                        p10.invoke(m2.j.c(dVar.f(m2.p.b(a11))));
                    }
                    d0Var.f38135w = a11;
                    xo.e.t(xo.e.v(this.D, new C0883a(a10, null)), q0Var);
                    try {
                        xo.c m10 = u1.m(new b(a10, this.B, this.F, this.G, this.H, this.I, this.J, d0Var, this.E));
                        this.f56147x = a10;
                        this.f56146w = 1;
                        if (xo.e.f(m10, this) == c10) {
                            return c10;
                        }
                        l0Var = a10;
                    } catch (Throwable th2) {
                        th = th2;
                        l0Var = a10;
                        l0Var.dismiss();
                        throw th;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    l0Var = (l0) this.f56147x;
                    try {
                        wn.m.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        l0Var.dismiss();
                        throw th;
                    }
                }
                l0Var.dismiss();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<q1.q, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<b1.f> f56156w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l0.s0<b1.f> s0Var) {
                super(1);
                this.f56156w = s0Var;
            }

            public final void a(q1.q qVar) {
                jo.p.h(qVar, "it");
                c.l(this.f56156w, q1.r.e(qVar));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
                a(qVar);
                return wn.v.f59242a;
            }
        }

        /* renamed from: v.b0$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0884c extends jo.q implements io.l<e1.e, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.r<wn.v> f56157w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0884c(xo.r<wn.v> rVar) {
                super(1);
                this.f56157w = rVar;
            }

            public final void a(e1.e eVar) {
                jo.p.h(eVar, "$this$drawBehind");
                this.f56157w.b(wn.v.f59242a);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
                a(eVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<b1.f> f56158w;

            /* loaded from: classes.dex */
            public static final class a extends jo.q implements io.a<b1.f> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ c2<b1.f> f56159w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(c2<b1.f> c2Var) {
                    super(0);
                    this.f56159w = c2Var;
                }

                public final long a() {
                    return c.q(this.f56159w);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ b1.f invoke() {
                    return b1.f.d(a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(c2<b1.f> c2Var) {
                super(1);
                this.f56158w = c2Var;
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
                yVar.d(b0.a(), new a(this.f56158w));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<b1.f> f56160w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(c2<b1.f> c2Var) {
                super(0);
                this.f56160w = c2Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(b1.g.c(c.q(this.f56160w)));
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends jo.q implements io.a<b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ m2.d f56161w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c2<io.l<m2.d, b1.f>> f56162x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ l0.s0<b1.f> f56163y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(m2.d dVar, c2<? extends io.l<? super m2.d, b1.f>> c2Var, l0.s0<b1.f> s0Var) {
                super(0);
                this.f56161w = dVar;
                this.f56162x = c2Var;
                this.f56163y = s0Var;
            }

            public final long a() {
                long u10 = ((b1.f) c.m(this.f56162x).invoke(this.f56161w)).u();
                if (b1.g.c(c.j(this.f56163y)) && b1.g.c(u10)) {
                    return b1.f.r(c.j(this.f56163y), u10);
                }
                return b1.f.f16721b.b();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ b1.f invoke() {
                return b1.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super m2.d, b1.f> lVar, io.l<? super m2.d, b1.f> lVar2, float f10, io.l<? super m2.j, wn.v> lVar3, m0 m0Var, c0 c0Var) {
            super(3);
            this.f56142w = lVar;
            this.f56143x = lVar2;
            this.f56144y = f10;
            this.f56145z = lVar3;
            this.A = m0Var;
            this.B = c0Var;
        }

        public static final long j(l0.s0<b1.f> s0Var) {
            return s0Var.getValue().u();
        }

        public static final boolean k(c2<Boolean> c2Var) {
            return c2Var.getValue().booleanValue();
        }

        public static final void l(l0.s0<b1.f> s0Var, long j10) {
            s0Var.setValue(b1.f.d(j10));
        }

        public static final io.l<m2.d, b1.f> m(c2<? extends io.l<? super m2.d, b1.f>> c2Var) {
            return (io.l) c2Var.getValue();
        }

        public static final io.l<m2.d, b1.f> n(c2<? extends io.l<? super m2.d, b1.f>> c2Var) {
            return (io.l) c2Var.getValue();
        }

        public static final float o(c2<Float> c2Var) {
            return c2Var.getValue().floatValue();
        }

        public static final io.l<m2.j, wn.v> p(c2<? extends io.l<? super m2.j, wn.v>> c2Var) {
            return (io.l) c2Var.getValue();
        }

        public static final long q(c2<b1.f> c2Var) {
            return c2Var.getValue().u();
        }

        public final x0.f i(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-454877003);
            View view = (View) iVar.G(androidx.compose.ui.platform.z.k());
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(b1.f.d(b1.f.f16721b.b()), null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            l0.s0 s0Var = (l0.s0) y10;
            c2 l10 = u1.l(this.f56142w, iVar, 0);
            c2 l11 = u1.l(this.f56143x, iVar, 0);
            c2 l12 = u1.l(Float.valueOf(this.f56144y), iVar, 0);
            c2 l13 = u1.l(this.f56145z, iVar, 0);
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = u1.b(new f(dVar, l10, s0Var));
                iVar.q(y11);
            }
            iVar.O();
            c2 c2Var = (c2) y11;
            iVar.x(-492369756);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = u1.b(new e(c2Var));
                iVar.q(y12);
            }
            iVar.O();
            c2 c2Var2 = (c2) y12;
            iVar.x(-492369756);
            Object y13 = iVar.y();
            if (y13 == aVar.a()) {
                y13 = xo.y.b(1, 0, wo.h.DROP_OLDEST, 2, null);
                iVar.q(y13);
            }
            iVar.O();
            xo.r rVar = (xo.r) y13;
            float f10 = this.A.b() ? 0.0f : this.f56144y;
            c0 c0Var = this.B;
            l0.c0.f(new Object[]{view, dVar, Float.valueOf(f10), c0Var, Boolean.valueOf(jo.p.c(c0Var, c0.f56165g.b()))}, new a(this.A, this.B, view, dVar, this.f56144y, rVar, l13, c2Var2, c2Var, l11, s0Var, l12, null), iVar, 8);
            x0.f b10 = w1.p.b(z0.i.a(q1.k0.a(fVar, new b(s0Var)), new C0884c(rVar)), false, new d(c2Var), 1, null);
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return i(fVar, iVar, num.intValue());
        }
    }

    public static final w1.x<io.a<b1.f>> a() {
        return f56136a;
    }

    public static final boolean b(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return b(i10);
    }

    public static final x0.f d(x0.f fVar, io.l<? super m2.d, b1.f> lVar, io.l<? super m2.d, b1.f> lVar2, float f10, c0 c0Var, io.l<? super m2.j, wn.v> lVar3) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "sourceCenter");
        jo.p.h(lVar2, "magnifierCenter");
        jo.p.h(c0Var, TtmlNode.TAG_STYLE);
        io.l aVar = a1.c() ? new a(lVar, lVar2, f10, c0Var) : a1.a();
        x0.f fVar2 = x0.f.f59359u;
        if (c(0, 1, null)) {
            fVar2 = e(fVar2, lVar, lVar2, f10, c0Var, lVar3, m0.f56291a.a());
        }
        return a1.b(fVar, aVar, fVar2);
    }

    @SuppressLint({"ModifierInspectorInfo"})
    public static final x0.f e(x0.f fVar, io.l<? super m2.d, b1.f> lVar, io.l<? super m2.d, b1.f> lVar2, float f10, c0 c0Var, io.l<? super m2.j, wn.v> lVar3, m0 m0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "sourceCenter");
        jo.p.h(lVar2, "magnifierCenter");
        jo.p.h(c0Var, TtmlNode.TAG_STYLE);
        jo.p.h(m0Var, "platformMagnifierFactory");
        return x0.e.d(fVar, null, new c(lVar, lVar2, f10, lVar3, m0Var, c0Var), 1, null);
    }

    public static /* synthetic */ x0.f f(x0.f fVar, io.l lVar, io.l lVar2, float f10, c0 c0Var, io.l lVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = b.f56141w;
        }
        io.l lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            c0Var = c0.f56165g.a();
        }
        c0 c0Var2 = c0Var;
        if ((i10 & 16) != 0) {
            lVar3 = null;
        }
        return d(fVar, lVar, lVar4, f11, c0Var2, lVar3);
    }
}
