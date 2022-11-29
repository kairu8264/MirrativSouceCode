package h0;

import androidx.compose.ui.platform.g2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import l0.h2;
import s1.a;

/* loaded from: classes.dex */
public final class d1 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<io.p<? super l0.i, ? super Integer, ? extends wn.v>, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a1 f33760w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a1 f33761x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<a1> f33762y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ i0<a1> f33763z;

        /* renamed from: h0.d1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0412a extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a1 f33764w;

            /* renamed from: h0.d1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0413a extends jo.q implements io.a<Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ a1 f33765w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0413a(a1 a1Var) {
                    super(0);
                    this.f33765w = a1Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final Boolean invoke() {
                    this.f33765w.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0412a(a1 a1Var) {
                super(1);
                this.f33764w = a1Var;
            }

            public final void a(w1.y yVar) {
                jo.p.h(yVar, "$this$semantics");
                w1.w.F(yVar, w1.e.f57880b.b());
                w1.w.g(yVar, null, new C0413a(this.f33764w), 1, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a1 f33766w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i0<a1> f33767x;

            /* renamed from: h0.d1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0414a extends jo.q implements io.l<h0<a1>, Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ a1 f33768w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0414a(a1 a1Var) {
                    super(1);
                    this.f33768w = a1Var;
                }

                @Override // io.l
                /* renamed from: a */
                public final Boolean invoke(h0<a1> h0Var) {
                    jo.p.h(h0Var, "it");
                    return Boolean.valueOf(jo.p.c(h0Var.c(), this.f33768w));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a1 a1Var, i0<a1> i0Var) {
                super(0);
                this.f33766w = a1Var;
                this.f33767x = i0Var;
            }

            public final void a() {
                if (jo.p.c(this.f33766w, this.f33767x.a())) {
                    return;
                }
                xn.x.C(this.f33767x.b(), new C0414a(this.f33766w));
                l0.e1 c10 = this.f33767x.c();
                if (c10 != null) {
                    c10.invalidate();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, a1 a1Var2, List<a1> list, i0<a1> i0Var) {
            super(3);
            this.f33760w = a1Var;
            this.f33761x = a1Var2;
            this.f33762y = list;
            this.f33763z = i0Var;
        }

        public final void a(io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
            int i11;
            jo.p.h(pVar, "children");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(pVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
                return;
            }
            boolean c10 = jo.p.c(this.f33760w, this.f33761x);
            int i12 = c10 ? 150 : 75;
            int i13 = (!c10 || xn.a0.U(this.f33762y).size() == 1) ? 0 : 75;
            c2 f10 = d1.f(u.j.h(i12, i13, u.b0.c()), c10, new b(this.f33760w, this.f33763z), iVar, 0, 0);
            c2 g10 = d1.g(u.j.h(i12, i13, u.b0.b()), c10, iVar, 0);
            x0.f b10 = w1.p.b(c1.h0.c(x0.f.f59359u, ((Number) g10.getValue()).floatValue(), ((Number) g10.getValue()).floatValue(), ((Number) f10.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null), false, new C0412a(this.f33760w), 1, null);
            iVar.x(733328855);
            q1.c0 h10 = y.j.h(x0.a.f59327a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(b10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a10);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a12 = h2.a(iVar);
            h2.b(a12, h10, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(l0.n1.a(l0.n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar = y.l.f60836a;
            iVar.x(-421978688);
            pVar.invoke(iVar, Integer.valueOf(i11 & 14));
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(io.p<? super l0.i, ? super Integer, ? extends wn.v> pVar, l0.i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q<a1, l0.i, Integer, wn.v> f33769w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a1 f33770x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33771y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.q<? super a1, ? super l0.i, ? super Integer, wn.v> qVar, a1 a1Var, int i10) {
            super(2);
            this.f33769w = qVar;
            this.f33770x = a1Var;
            this.f33771y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            io.q<a1, l0.i, Integer, wn.v> qVar = this.f33769w;
            a1 a1Var = this.f33770x;
            jo.p.e(a1Var);
            qVar.s0(a1Var, iVar, Integer.valueOf((this.f33771y >> 3) & 112));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a1 f33772w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f33773x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q<a1, l0.i, Integer, wn.v> f33774y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f33775z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(a1 a1Var, x0.f fVar, io.q<? super a1, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f33772w = a1Var;
            this.f33773x = fVar;
            this.f33774y = qVar;
            this.f33775z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            d1.a(this.f33772w, this.f33773x, this.f33774y, iVar, this.f33775z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33776w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a1 f33777x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.platform.i f33778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a1 a1Var, androidx.compose.ui.platform.i iVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f33777x = a1Var;
            this.f33778y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f33777x, this.f33778y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33776w;
            if (i10 == 0) {
                wn.m.b(obj);
                a1 a1Var = this.f33777x;
                if (a1Var != null) {
                    long h10 = d1.h(a1Var.getDuration(), this.f33777x.b() != null, this.f33778y);
                    this.f33776w = 1;
                    if (uo.b1.a(h10, this) == c10) {
                        return c10;
                    }
                }
                return wn.v.f59242a;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f33777x.dismiss();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e1 f33779w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f33780x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.q<a1, l0.i, Integer, wn.v> f33781y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f33782z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(e1 e1Var, x0.f fVar, io.q<? super a1, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f33779w = e1Var;
            this.f33780x = fVar;
            this.f33781y = qVar;
            this.f33782z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            d1.b(this.f33779w, this.f33780x, this.f33781y, iVar, this.f33782z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33783a;

        static {
            int[] iArr = new int[c1.values().length];
            iArr[c1.Indefinite.ordinal()] = 1;
            iArr[c1.Long.ordinal()] = 2;
            iArr[c1.Short.ordinal()] = 3;
            f33783a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f33784w = new g();

        public g() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.a<wn.v> A;

        /* renamed from: w  reason: collision with root package name */
        public int f33785w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.a<Float, u.m> f33786x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33787y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ u.i<Float> f33788z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u.a<Float, u.m> aVar, boolean z10, u.i<Float> iVar, io.a<wn.v> aVar2, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f33786x = aVar;
            this.f33787y = z10;
            this.f33788z = iVar;
            this.A = aVar2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f33786x, this.f33787y, this.f33788z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33785w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<Float, u.m> aVar = this.f33786x;
                Float c11 = co.b.c(this.f33787y ? 1.0f : 0.0f);
                u.i<Float> iVar = this.f33788z;
                this.f33785w = 1;
                if (u.a.f(aVar, c11, iVar, null, null, this, 12, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.A.invoke();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33789w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u.a<Float, u.m> f33790x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33791y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ u.i<Float> f33792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(u.a<Float, u.m> aVar, boolean z10, u.i<Float> iVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f33790x = aVar;
            this.f33791y = z10;
            this.f33792z = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f33790x, this.f33791y, this.f33792z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33789w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<Float, u.m> aVar = this.f33790x;
                Float c11 = co.b.c(this.f33791y ? 1.0f : 0.8f);
                u.i<Float> iVar = this.f33792z;
                this.f33789w = 1;
                if (u.a.f(aVar, c11, iVar, null, null, this, 12, null) == c10) {
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0205 A[LOOP:2: B:79:0x0203->B:80:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h0.a1 r18, x0.f r19, io.q<? super h0.a1, ? super l0.i, ? super java.lang.Integer, wn.v> r20, l0.i r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.d1.a(h0.a1, x0.f, io.q, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(h0.e1 r12, x0.f r13, io.q<? super h0.a1, ? super l0.i, ? super java.lang.Integer, wn.v> r14, l0.i r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.d1.b(h0.e1, x0.f, io.q, l0.i, int, int):void");
    }

    public static final c2<Float> f(u.i<Float> iVar, boolean z10, io.a<wn.v> aVar, l0.i iVar2, int i10, int i11) {
        iVar2.x(1016418159);
        if ((i11 & 4) != 0) {
            aVar = g.f33784w;
        }
        io.a<wn.v> aVar2 = aVar;
        iVar2.x(-492369756);
        Object y10 = iVar2.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = u.b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            iVar2.q(y10);
        }
        iVar2.O();
        u.a aVar3 = (u.a) y10;
        l0.c0.c(Boolean.valueOf(z10), new h(aVar3, z10, iVar, aVar2, null), iVar2, (i10 >> 3) & 14);
        c2<Float> g10 = aVar3.g();
        iVar2.O();
        return g10;
    }

    public static final c2<Float> g(u.i<Float> iVar, boolean z10, l0.i iVar2, int i10) {
        iVar2.x(2003504988);
        iVar2.x(-492369756);
        Object y10 = iVar2.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = u.b.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            iVar2.q(y10);
        }
        iVar2.O();
        u.a aVar = (u.a) y10;
        l0.c0.c(Boolean.valueOf(z10), new i(aVar, z10, iVar, null), iVar2, (i10 >> 3) & 14);
        c2<Float> g10 = aVar.g();
        iVar2.O();
        return g10;
    }

    public static final long h(c1 c1Var, boolean z10, androidx.compose.ui.platform.i iVar) {
        long j10;
        jo.p.h(c1Var, "<this>");
        int i10 = f.f33783a[c1Var.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            j10 = 4000;
        }
        long j11 = j10;
        return iVar == null ? j11 : iVar.a(j11, true, true, z10);
    }
}
