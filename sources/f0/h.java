package f0;

import android.view.KeyEvent;
import androidx.compose.ui.platform.g2;
import java.util.List;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.q0;
import s1.a;
import v0.h;
import x0.f;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<y1.z, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31403w = new a();

        public a() {
            super(1);
        }

        public final void a(y1.z zVar) {
            jo.p.h(zVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y1.z zVar) {
            a(zVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31404w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r0 f31405a;

            public a(r0 r0Var) {
                this.f31405a = r0Var;
            }

            @Override // l0.z
            public void dispose() {
                if (this.f31405a.d()) {
                    h.l(this.f31405a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0 r0Var) {
            super(1);
            this.f31404w = r0Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f31404w);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.v f31406w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g0.v f31407a;

            public a(g0.v vVar) {
                this.f31407a = vVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f31407a.J();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g0.v vVar) {
            super(1);
            this.f31406w = vVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f31406w);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e2.c0 f31408w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f31409x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31410y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e2.m f31411z;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {
            @Override // l0.z
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e2.c0 c0Var, r0 r0Var, e2.a0 a0Var, e2.m mVar) {
            super(1);
            this.f31408w = c0Var;
            this.f31409x = r0Var;
            this.f31410y = a0Var;
            this.f31411z = mVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            if (this.f31408w != null && this.f31409x.d()) {
                r0 r0Var = this.f31409x;
                r0Var.t(g0.f31400a.h(this.f31408w, this.f31410y, r0Var.j(), this.f31411z, this.f31409x.i(), this.f31409x.h()));
            }
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ o0 A;
        public final /* synthetic */ e2.a0 B;
        public final /* synthetic */ e2.i0 C;
        public final /* synthetic */ x0.f D;
        public final /* synthetic */ x0.f E;
        public final /* synthetic */ x0.f F;
        public final /* synthetic */ x0.f G;
        public final /* synthetic */ c0.e H;
        public final /* synthetic */ r0 I;
        public final /* synthetic */ g0.v J;
        public final /* synthetic */ boolean K;
        public final /* synthetic */ boolean L;
        public final /* synthetic */ io.l<y1.z, wn.v> M;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> f31412w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f31413x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f31414y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31415z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
            public final /* synthetic */ e2.i0 A;
            public final /* synthetic */ x0.f B;
            public final /* synthetic */ x0.f C;
            public final /* synthetic */ x0.f D;
            public final /* synthetic */ x0.f E;
            public final /* synthetic */ c0.e F;
            public final /* synthetic */ r0 G;
            public final /* synthetic */ g0.v H;
            public final /* synthetic */ boolean I;
            public final /* synthetic */ boolean J;
            public final /* synthetic */ io.l<y1.z, wn.v> K;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f31416w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ y1.d0 f31417x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ o0 f31418y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ e2.a0 f31419z;

            /* renamed from: f0.h$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0326a extends jo.q implements io.p<l0.i, Integer, wn.v> {
                public final /* synthetic */ io.l<y1.z, wn.v> A;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ g0.v f31420w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ r0 f31421x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ boolean f31422y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ boolean f31423z;

                /* renamed from: f0.h$e$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0327a implements q1.c0 {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ r0 f31424a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ io.l<y1.z, wn.v> f31425b;

                    /* renamed from: f0.h$e$a$a$a$a  reason: collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C0328a extends jo.q implements io.l<q0.a, wn.v> {

                        /* renamed from: w  reason: collision with root package name */
                        public static final C0328a f31426w = new C0328a();

                        public C0328a() {
                            super(1);
                        }

                        public final void a(q0.a aVar) {
                            jo.p.h(aVar, "$this$layout");
                        }

                        @Override // io.l
                        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                            a(aVar);
                            return wn.v.f59242a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public C0327a(r0 r0Var, io.l<? super y1.z, wn.v> lVar) {
                        this.f31424a = r0Var;
                        this.f31425b = lVar;
                    }

                    @Override // q1.c0
                    public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
                        jo.p.h(e0Var, "$this$measure");
                        jo.p.h(list, "measurables");
                        h.a aVar = v0.h.f56484e;
                        r0 r0Var = this.f31424a;
                        v0.h a10 = aVar.a();
                        try {
                            v0.h k10 = a10.k();
                            t0 g10 = r0Var.g();
                            y1.z i10 = g10 != null ? g10.i() : null;
                            a10.r(k10);
                            a10.d();
                            wn.p<Integer, Integer, y1.z> d10 = g0.f31400a.d(this.f31424a.q(), j10, e0Var.getLayoutDirection(), i10);
                            int intValue = d10.a().intValue();
                            int intValue2 = d10.b().intValue();
                            y1.z c10 = d10.c();
                            if (!jo.p.c(i10, c10)) {
                                this.f31424a.v(new t0(c10));
                                this.f31425b.invoke(c10);
                            }
                            return e0Var.W(intValue, intValue2, xn.n0.h(wn.q.a(q1.b.a(), Integer.valueOf(lo.c.c(c10.g()))), wn.q.a(q1.b.b(), Integer.valueOf(lo.c.c(c10.j())))), C0328a.f31426w);
                        } catch (Throwable th2) {
                            a10.d();
                            throw th2;
                        }
                    }

                    @Override // q1.c0
                    public int d(q1.m mVar, List<? extends q1.l> list, int i10) {
                        jo.p.h(mVar, "<this>");
                        jo.p.h(list, "measurables");
                        this.f31424a.q().n(mVar.getLayoutDirection());
                        return this.f31424a.q().c();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0326a(g0.v vVar, r0 r0Var, boolean z10, boolean z11, io.l<? super y1.z, wn.v> lVar) {
                    super(2);
                    this.f31420w = vVar;
                    this.f31421x = r0Var;
                    this.f31422y = z10;
                    this.f31423z = z11;
                    this.A = lVar;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) == 2 && iVar.j()) {
                        iVar.I();
                        return;
                    }
                    C0327a c0327a = new C0327a(this.f31421x, this.A);
                    iVar.x(-1323940314);
                    f.a aVar = x0.f.f59359u;
                    m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                    m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                    g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                    a.C0787a c0787a = s1.a.f51802o;
                    io.a<s1.a> a10 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(aVar);
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
                    h2.b(a12, c0327a, c0787a.d());
                    h2.b(a12, dVar, c0787a.b());
                    h2.b(a12, qVar, c0787a.c());
                    h2.b(a12, g2Var, c0787a.f());
                    iVar.c();
                    boolean z10 = false;
                    a11.s0(n1.a(n1.b(iVar)), iVar, 0);
                    iVar.x(2058660585);
                    iVar.x(1714611517);
                    iVar.O();
                    iVar.O();
                    iVar.s();
                    iVar.O();
                    g0.v vVar = this.f31420w;
                    if (this.f31421x.c() == f0.k.Selection && this.f31421x.f() != null) {
                        q1.q f10 = this.f31421x.f();
                        jo.p.e(f10);
                        if (f10.h() && this.f31422y) {
                            z10 = true;
                        }
                    }
                    h.c(vVar, z10, iVar, 8);
                    if (this.f31421x.c() == f0.k.Cursor && !this.f31423z && this.f31422y) {
                        h.d(this.f31420w, iVar, 8);
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                    a(iVar, num.intValue());
                    return wn.v.f59242a;
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.a<t0> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ r0 f31427w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(r0 r0Var) {
                    super(0);
                    this.f31427w = r0Var;
                }

                @Override // io.a
                /* renamed from: a */
                public final t0 invoke() {
                    return this.f31427w.g();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(int i10, y1.d0 d0Var, o0 o0Var, e2.a0 a0Var, e2.i0 i0Var, x0.f fVar, x0.f fVar2, x0.f fVar3, x0.f fVar4, c0.e eVar, r0 r0Var, g0.v vVar, boolean z10, boolean z11, io.l<? super y1.z, wn.v> lVar) {
                super(2);
                this.f31416w = i10;
                this.f31417x = d0Var;
                this.f31418y = o0Var;
                this.f31419z = a0Var;
                this.A = i0Var;
                this.B = fVar;
                this.C = fVar2;
                this.D = fVar3;
                this.E = fVar4;
                this.F = eVar;
                this.G = r0Var;
                this.H = vVar;
                this.I = z10;
                this.J = z11;
                this.K = lVar;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    g0.s.a(c0.g.b(q0.a(n0.c(y.a(x0.f.f59359u, this.f31416w, this.f31417x), this.f31418y, this.f31419z, this.A, new b(this.G)).L(this.B).L(this.C), this.f31417x).L(this.D).L(this.E), this.F), s0.c.b(iVar, 19580180, true, new C0326a(this.H, this.G, this.I, this.J, this.K)), iVar, 48, 0);
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.q<? super io.p<? super l0.i, ? super Integer, wn.v>, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11, y1.d0 d0Var, o0 o0Var, e2.a0 a0Var, e2.i0 i0Var, x0.f fVar, x0.f fVar2, x0.f fVar3, x0.f fVar4, c0.e eVar, r0 r0Var, g0.v vVar, boolean z10, boolean z11, io.l<? super y1.z, wn.v> lVar) {
            super(2);
            this.f31412w = qVar;
            this.f31413x = i10;
            this.f31414y = i11;
            this.f31415z = d0Var;
            this.A = o0Var;
            this.B = a0Var;
            this.C = i0Var;
            this.D = fVar;
            this.E = fVar2;
            this.F = fVar3;
            this.G = fVar4;
            this.H = eVar;
            this.I = r0Var;
            this.J = vVar;
            this.K = z10;
            this.L = z11;
            this.M = lVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                this.f31412w.s0(s0.c.b(iVar, 207445534, true, new a(this.f31414y, this.f31415z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M)), iVar, Integer.valueOf(((this.f31413x >> 9) & 112) | 6));
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ e2.i0 A;
        public final /* synthetic */ io.l<y1.z, wn.v> B;
        public final /* synthetic */ x.m C;
        public final /* synthetic */ c1.u D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ int F;
        public final /* synthetic */ e2.m G;
        public final /* synthetic */ u H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ boolean J;
        public final /* synthetic */ io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31428w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<e2.a0, wn.v> f31429x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f31430y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31431z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(e2.a0 a0Var, io.l<? super e2.a0, wn.v> lVar, x0.f fVar, y1.d0 d0Var, e2.i0 i0Var, io.l<? super y1.z, wn.v> lVar2, x.m mVar, c1.u uVar, boolean z10, int i10, e2.m mVar2, u uVar2, boolean z11, boolean z12, io.q<? super io.p<? super l0.i, ? super Integer, wn.v>, ? super l0.i, ? super Integer, wn.v> qVar, int i11, int i12, int i13) {
            super(2);
            this.f31428w = a0Var;
            this.f31429x = lVar;
            this.f31430y = fVar;
            this.f31431z = d0Var;
            this.A = i0Var;
            this.B = lVar2;
            this.C = mVar;
            this.D = uVar;
            this.E = z10;
            this.F = i10;
            this.G = mVar2;
            this.H = uVar2;
            this.I = z11;
            this.J = z12;
            this.K = qVar;
            this.L = i11;
            this.M = i12;
            this.N = i13;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f31428w, this.f31429x, this.f31430y, this.f31431z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, iVar, this.L | 1, this.M, this.N);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<q1.q, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31432w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r0 r0Var) {
            super(1);
            this.f31432w = r0Var;
        }

        public final void a(q1.q qVar) {
            jo.p.h(qVar, "it");
            t0 g10 = this.f31432w.g();
            if (g10 == null) {
                return;
            }
            g10.l(qVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* renamed from: f0.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0329h extends jo.q implements io.l<e1.e, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31433w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31434x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.t f31435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0329h(r0 r0Var, e2.a0 a0Var, e2.t tVar) {
            super(1);
            this.f31433w = r0Var;
            this.f31434x = a0Var;
            this.f31435y = tVar;
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$drawBehind");
            t0 g10 = this.f31433w.g();
            if (g10 != null) {
                e2.a0 a0Var = this.f31434x;
                e2.t tVar = this.f31435y;
                r0 r0Var = this.f31433w;
                g0.f31400a.c(eVar.M0().e(), a0Var, tVar, g10.i(), r0Var.l());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<a1.x, wn.v> {
        public final /* synthetic */ g0.v A;
        public final /* synthetic */ uo.q0 B;
        public final /* synthetic */ c0.e C;
        public final /* synthetic */ e2.t D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31436w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e2.c0 f31437x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31438y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e2.m f31439z;

        @co.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {298}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ t0 A;
            public final /* synthetic */ e2.t B;

            /* renamed from: w  reason: collision with root package name */
            public int f31440w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c0.e f31441x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e2.a0 f31442y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ r0 f31443z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c0.e eVar, e2.a0 a0Var, r0 r0Var, t0 t0Var, e2.t tVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f31441x = eVar;
                this.f31442y = a0Var;
                this.f31443z = r0Var;
                this.A = t0Var;
                this.B = tVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f31441x, this.f31442y, this.f31443z, this.A, this.B, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f31440w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    c0.e eVar = this.f31441x;
                    e2.a0 a0Var = this.f31442y;
                    d0 q10 = this.f31443z.q();
                    y1.z i11 = this.A.i();
                    e2.t tVar = this.B;
                    this.f31440w = 1;
                    if (h.j(eVar, a0Var, q10, i11, tVar, this) == c10) {
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
        public i(r0 r0Var, e2.c0 c0Var, e2.a0 a0Var, e2.m mVar, g0.v vVar, uo.q0 q0Var, c0.e eVar, e2.t tVar) {
            super(1);
            this.f31436w = r0Var;
            this.f31437x = c0Var;
            this.f31438y = a0Var;
            this.f31439z = mVar;
            this.A = vVar;
            this.B = q0Var;
            this.C = eVar;
            this.D = tVar;
        }

        public final void a(a1.x xVar) {
            t0 g10;
            jo.p.h(xVar, "it");
            if (this.f31436w.d() == xVar.a()) {
                return;
            }
            this.f31436w.s(xVar.a());
            e2.c0 c0Var = this.f31437x;
            if (c0Var != null) {
                h.k(c0Var, this.f31436w, this.f31438y, this.f31439z);
                if (xVar.a() && (g10 = this.f31436w.g()) != null) {
                    uo.l.d(this.B, null, null, new a(this.C, this.f31438y, this.f31436w, g10, this.D, null), 3, null);
                }
            }
            if (xVar.a()) {
                return;
            }
            g0.v.q(this.A, null, 1, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(a1.x xVar) {
            a(xVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<q1.q, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f31445x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.v f31446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r0 r0Var, boolean z10, g0.v vVar) {
            super(1);
            this.f31444w = r0Var;
            this.f31445x = z10;
            this.f31446y = vVar;
        }

        public final void a(q1.q qVar) {
            jo.p.h(qVar, "it");
            this.f31444w.u(qVar);
            if (this.f31445x) {
                if (this.f31444w.c() == f0.k.Selection) {
                    if (this.f31444w.n()) {
                        this.f31446y.a0();
                    } else {
                        this.f31446y.J();
                    }
                    this.f31444w.z(g0.w.c(this.f31446y, true));
                    this.f31444w.y(g0.w.c(this.f31446y, false));
                } else if (this.f31444w.c() == f0.k.Cursor) {
                    this.f31444w.w(g0.w.c(this.f31446y, true));
                }
            }
            t0 g10 = this.f31444w.g();
            if (g10 == null) {
                return;
            }
            g10.m(qVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<b1.f, wn.v> {
        public final /* synthetic */ e2.t A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31447w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a1.t f31448x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f31449y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ g0.v f31450z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r0 r0Var, a1.t tVar, boolean z10, g0.v vVar, e2.t tVar2) {
            super(1);
            this.f31447w = r0Var;
            this.f31448x = tVar;
            this.f31449y = z10;
            this.f31450z = vVar;
            this.A = tVar2;
        }

        public final void a(long j10) {
            h.n(this.f31447w, this.f31448x, !this.f31449y);
            if (this.f31447w.d()) {
                if (this.f31447w.c() != f0.k.Selection) {
                    t0 g10 = this.f31447w.g();
                    if (g10 != null) {
                        r0 r0Var = this.f31447w;
                        g0.f31400a.i(j10, g10, r0Var.j(), this.A, r0Var.i());
                        if (r0Var.q().k().length() > 0) {
                            r0Var.r(f0.k.Cursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f31450z.p(b1.f.d(j10));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
            a(fVar.u());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w.q f31451w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w.q qVar) {
            super(0);
            this.f31451w = qVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final o0 invoke() {
            return new o0(this.f31451w, 0.0f, 2, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<w1.y, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ r0 C;
        public final /* synthetic */ e2.t D;
        public final /* synthetic */ g0.v E;
        public final /* synthetic */ a1.t F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e2.m f31452w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e2.g0 f31453x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31454y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f31455z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<List<y1.z>, Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ r0 f31456w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var) {
                super(1);
                this.f31456w = r0Var;
            }

            @Override // io.l
            /* renamed from: a */
            public final Boolean invoke(List<y1.z> list) {
                boolean z10;
                jo.p.h(list, "it");
                if (this.f31456w.g() != null) {
                    t0 g10 = this.f31456w.g();
                    jo.p.e(g10);
                    list.add(g10.i());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<y1.a, Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ r0 f31457w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r0 r0Var) {
                super(1);
                this.f31457w = r0Var;
            }

            @Override // io.l
            /* renamed from: a */
            public final Boolean invoke(y1.a aVar) {
                jo.p.h(aVar, "it");
                this.f31457w.i().invoke(new e2.a0(aVar.g(), y1.c0.a(aVar.g().length()), (y1.b0) null, 4, (jo.h) null));
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.q<Integer, Integer, Boolean, Boolean> {
            public final /* synthetic */ r0 A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e2.t f31458w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ boolean f31459x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e2.a0 f31460y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ g0.v f31461z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e2.t tVar, boolean z10, e2.a0 a0Var, g0.v vVar, r0 r0Var) {
                super(3);
                this.f31458w = tVar;
                this.f31459x = z10;
                this.f31460y = a0Var;
                this.f31461z = vVar;
                this.A = r0Var;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = this.f31458w.a(i10);
                }
                if (!z10) {
                    i11 = this.f31458w.a(i11);
                }
                boolean z11 = false;
                if (this.f31459x && (i10 != y1.b0.n(this.f31460y.g()) || i11 != y1.b0.i(this.f31460y.g()))) {
                    if (po.n.i(i10, i11) >= 0 && po.n.d(i10, i11) <= this.f31460y.e().length()) {
                        if (!z10 && i10 != i11) {
                            this.f31461z.r();
                        } else {
                            this.f31461z.s();
                        }
                        this.A.i().invoke(new e2.a0(this.f31460y.e(), y1.c0.b(i10, i11), (y1.b0) null, 4, (jo.h) null));
                        z11 = true;
                    } else {
                        this.f31461z.s();
                    }
                }
                return Boolean.valueOf(z11);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Boolean s0(Integer num, Integer num2, Boolean bool) {
                return a(num.intValue(), num2.intValue(), bool.booleanValue());
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ r0 f31462w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a1.t f31463x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f31464y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(r0 r0Var, a1.t tVar, boolean z10) {
                super(0);
                this.f31462w = r0Var;
                this.f31463x = tVar;
                this.f31464y = z10;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                h.n(this.f31462w, this.f31463x, !this.f31464y);
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0.v f31465w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(g0.v vVar) {
                super(0);
                this.f31465w = vVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f31465w.r();
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0.v f31466w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(g0.v vVar) {
                super(0);
                this.f31466w = vVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                g0.v.l(this.f31466w, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0.v f31467w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(g0.v vVar) {
                super(0);
                this.f31467w = vVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f31467w.o();
                return Boolean.TRUE;
            }
        }

        /* renamed from: f0.h$m$h  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0330h extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0.v f31468w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0330h(g0.v vVar) {
                super(0);
                this.f31468w = vVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f31468w.L();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(e2.m mVar, e2.g0 g0Var, e2.a0 a0Var, boolean z10, boolean z11, boolean z12, r0 r0Var, e2.t tVar, g0.v vVar, a1.t tVar2) {
            super(1);
            this.f31452w = mVar;
            this.f31453x = g0Var;
            this.f31454y = a0Var;
            this.f31455z = z10;
            this.A = z11;
            this.B = z12;
            this.C = r0Var;
            this.D = tVar;
            this.E = vVar;
            this.F = tVar2;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.E(yVar, this.f31452w.d());
            w1.w.B(yVar, this.f31453x.b());
            w1.w.P(yVar, this.f31454y.g());
            if (!this.f31455z) {
                w1.w.e(yVar);
            }
            if (this.A) {
                w1.w.o(yVar);
            }
            w1.w.i(yVar, null, new a(this.C), 1, null);
            w1.w.O(yVar, null, new b(this.C), 1, null);
            w1.w.L(yVar, null, new c(this.D, this.f31455z, this.f31454y, this.E, this.C), 1, null);
            w1.w.l(yVar, null, new d(this.C, this.F, this.B), 1, null);
            w1.w.n(yVar, null, new e(this.E), 1, null);
            if (!y1.b0.h(this.f31454y.g()) && !this.A) {
                w1.w.b(yVar, null, new f(this.E), 1, null);
                if (this.f31455z && !this.B) {
                    w1.w.d(yVar, null, new g(this.E), 1, null);
                }
            }
            if (!this.f31455z || this.B) {
                return;
            }
            w1.w.q(yVar, null, new C0330h(this.E), 1, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f31469w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.v f31470x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f31471y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f31472z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(x0.f fVar, g0.v vVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f31469w = fVar;
            this.f31470x = vVar;
            this.f31471y = pVar;
            this.f31472z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.b(this.f31469w, this.f31470x, this.f31471y, iVar, this.f31472z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.v f31473w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f31474x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f31475y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(g0.v vVar, boolean z10, int i10) {
            super(2);
            this.f31473w = vVar;
            this.f31474x = z10;
            this.f31475y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.c(this.f31473w, this.f31474x, iVar, this.f31475y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {947}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31476w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31477x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f31478y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(e0 e0Var, ao.d<? super p> dVar) {
            super(2, dVar);
            this.f31478y = e0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            p pVar = new p(this.f31478y, dVar);
            pVar.f31477x = obj;
            return pVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31476w;
            if (i10 == 0) {
                wn.m.b(obj);
                e0 e0Var = this.f31478y;
                this.f31476w = 1;
                if (w.c((n1.e0) this.f31477x, e0Var, this) == c10) {
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
    public static final class q extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f31479w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j10) {
            super(1);
            this.f31479w = j10;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            yVar.d(g0.n.d(), new g0.m(f0.j.Cursor, this.f31479w, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.v f31480w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f31481x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(g0.v vVar, int i10) {
            super(2);
            this.f31480w = vVar;
            this.f31481x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.d(this.f31480w, iVar, this.f31481x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.l<l1.b, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31482w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.v f31483x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(r0 r0Var, g0.v vVar) {
            super(1);
            this.f31482w = r0Var;
            this.f31483x = vVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            jo.p.h(keyEvent, "keyEvent");
            boolean z10 = true;
            if (this.f31482w.c() == f0.k.Selection && f0.o.a(keyEvent)) {
                g0.v.q(this.f31483x, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(l1.b bVar) {
            return a(bVar.f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0361 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /* JADX WARN: Type inference failed for: r0v52, types: [x0.f] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(e2.a0 r43, io.l<? super e2.a0, wn.v> r44, x0.f r45, y1.d0 r46, e2.i0 r47, io.l<? super y1.z, wn.v> r48, x.m r49, c1.u r50, boolean r51, int r52, e2.m r53, f0.u r54, boolean r55, boolean r56, io.q<? super io.p<? super l0.i, ? super java.lang.Integer, wn.v>, ? super l0.i, ? super java.lang.Integer, wn.v> r57, l0.i r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h.a(e2.a0, io.l, x0.f, y1.d0, e2.i0, io.l, x.m, c1.u, boolean, int, e2.m, f0.u, boolean, boolean, io.q, l0.i, int, int, int):void");
    }

    public static final void b(x0.f fVar, g0.v vVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        l0.i h10 = iVar.h(-20551815);
        int i11 = (i10 & 14) | 384;
        h10.x(733328855);
        int i12 = i11 >> 3;
        q1.c0 h11 = y.j.h(x0.a.f59327a.o(), true, h10, (i12 & 112) | (i12 & 14));
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a10 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(fVar);
        int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a10);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a12 = h2.a(h10);
        h2.b(a12, h11, c0787a.d());
        h2.b(a12, dVar, c0787a.b());
        h2.b(a12, qVar, c0787a.c());
        h2.b(a12, g2Var, c0787a.f());
        h10.c();
        a11.s0(n1.a(n1.b(h10)), h10, Integer.valueOf((i13 >> 3) & 112));
        h10.x(2058660585);
        h10.x(-2137368960);
        if (((i13 >> 9) & 14 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            y.l lVar = y.l.f60836a;
            h10.x(1524757375);
            if (((((i11 >> 6) & 112) | 6) & 81) == 16 && h10.j()) {
                h10.I();
            } else {
                f0.g.a(vVar, pVar, h10, ((i10 >> 3) & 112) | 8);
            }
            h10.O();
        }
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new n(fVar, vVar, pVar, i10));
    }

    public static final void c(g0.v vVar, boolean z10, l0.i iVar, int i10) {
        t0 g10;
        l0.i h10 = iVar.h(626339208);
        if (z10) {
            r0 E = vVar.E();
            y1.z i11 = (E == null || (g10 = E.g()) == null) ? null : g10.i();
            if (i11 != null) {
                if (!y1.b0.h(vVar.H().g())) {
                    int b10 = vVar.C().b(y1.b0.n(vVar.H().g()));
                    int b11 = vVar.C().b(y1.b0.i(vVar.H().g()));
                    j2.d b12 = i11.b(b10);
                    boolean z11 = true;
                    j2.d b13 = i11.b(Math.max(b11 - 1, 0));
                    h10.x(-498396421);
                    r0 E2 = vVar.E();
                    if (E2 != null && E2.p()) {
                        g0.w.a(true, b12, vVar, h10, 518);
                    }
                    h10.O();
                    r0 E3 = vVar.E();
                    if (E3 == null || !E3.o()) {
                        z11 = false;
                    }
                    if (z11) {
                        g0.w.a(false, b13, vVar, h10, 518);
                    }
                }
                r0 E4 = vVar.E();
                if (E4 != null) {
                    if (vVar.K()) {
                        E4.x(false);
                    }
                    if (E4.d()) {
                        if (E4.n()) {
                            vVar.a0();
                        } else {
                            vVar.J();
                        }
                    }
                }
            }
        } else {
            vVar.J();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new o(vVar, z10, i10));
    }

    public static final void d(g0.v vVar, l0.i iVar, int i10) {
        jo.p.h(vVar, "manager");
        l0.i h10 = iVar.h(-1436003720);
        r0 E = vVar.E();
        if (E != null && E.m()) {
            h10.x(1157296644);
            boolean P = h10.P(vVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = vVar.n();
                h10.q(y10);
            }
            h10.O();
            e0 e0Var = (e0) y10;
            long v10 = vVar.v((m2.d) h10.G(androidx.compose.ui.platform.o0.e()));
            x0.f b10 = n1.o0.b(x0.f.f59359u, e0Var, new p(e0Var, null));
            b1.f d10 = b1.f.d(v10);
            h10.x(1157296644);
            boolean P2 = h10.P(d10);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = new q(v10);
                h10.q(y11);
            }
            h10.O();
            f0.a.a(v10, w1.p.b(b10, false, (io.l) y11, 1, null), null, h10, 384);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new r(vVar, i10));
    }

    public static final Object j(c0.e eVar, e2.a0 a0Var, d0 d0Var, y1.z zVar, e2.t tVar, ao.d<? super wn.v> dVar) {
        b1.h hVar;
        int b10 = tVar.b(y1.b0.k(a0Var.g()));
        if (b10 < zVar.k().j().length()) {
            hVar = zVar.c(b10);
        } else if (b10 != 0) {
            hVar = zVar.c(b10 - 1);
        } else {
            hVar = new b1.h(0.0f, 0.0f, 1.0f, m2.o.f(h0.b(d0Var.j(), d0Var.a(), d0Var.b(), null, 0, 24, null)));
        }
        Object a10 = eVar.a(hVar, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public static final void k(e2.c0 c0Var, r0 r0Var, e2.a0 a0Var, e2.m mVar) {
        if (r0Var.d()) {
            r0Var.t(g0.f31400a.g(c0Var, a0Var, r0Var.j(), mVar, r0Var.i(), r0Var.h()));
        } else {
            l(r0Var);
        }
    }

    public static final void l(r0 r0Var) {
        e2.f0 e10 = r0Var.e();
        if (e10 != null) {
            g0.f31400a.e(e10, r0Var.j(), r0Var.i());
        }
        r0Var.t(null);
    }

    public static final x0.f m(x0.f fVar, r0 r0Var, g0.v vVar) {
        return l1.f.c(fVar, new s(r0Var, vVar));
    }

    public static final void n(r0 r0Var, a1.t tVar, boolean z10) {
        e2.f0 e10;
        if (!r0Var.d()) {
            tVar.c();
        } else if (!z10 || (e10 = r0Var.e()) == null) {
        } else {
            e10.c();
        }
    }
}
