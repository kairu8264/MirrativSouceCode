package v;

import android.view.KeyEvent;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import l0.c2;
import l0.i;
import l0.l1;
import l0.u1;
import l0.z1;
import uo.b1;
import x0.f;

/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w */
        public final /* synthetic */ l0.s0<x.p> f56237w;

        /* renamed from: x */
        public final /* synthetic */ x.m f56238x;

        /* renamed from: v.l$a$a */
        /* loaded from: classes.dex */
        public static final class C0887a implements l0.z {

            /* renamed from: a */
            public final /* synthetic */ l0.s0 f56239a;

            /* renamed from: b */
            public final /* synthetic */ x.m f56240b;

            public C0887a(l0.s0 s0Var, x.m mVar) {
                this.f56239a = s0Var;
                this.f56240b = mVar;
            }

            @Override // l0.z
            public void dispose() {
                x.p pVar = (x.p) this.f56239a.getValue();
                if (pVar != null) {
                    this.f56240b.a(new x.o(pVar));
                    this.f56239a.setValue(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.s0<x.p> s0Var, x.m mVar) {
            super(1);
            this.f56237w = s0Var;
            this.f56238x = mVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new C0887a(this.f56237w, this.f56238x);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ x.m f56241w;

        /* renamed from: x */
        public final /* synthetic */ l0.s0<x.p> f56242x;

        /* renamed from: y */
        public final /* synthetic */ int f56243y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x.m mVar, l0.s0<x.p> s0Var, int i10) {
            super(2);
            this.f56241w = mVar;
            this.f56242x = s0Var;
            this.f56243y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            l.a(this.f56241w, this.f56242x, iVar, this.f56243y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w */
        public final /* synthetic */ boolean f56244w;

        /* renamed from: x */
        public final /* synthetic */ String f56245x;

        /* renamed from: y */
        public final /* synthetic */ w1.h f56246y;

        /* renamed from: z */
        public final /* synthetic */ io.a<wn.v> f56247z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, w1.h hVar, io.a<wn.v> aVar) {
            super(3);
            this.f56244w = z10;
            this.f56245x = str;
            this.f56246y = hVar;
            this.f56247z = aVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-756081143);
            f.a aVar = x0.f.f59359u;
            x xVar = (x) iVar.G(z.a());
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = x.l.a();
                iVar.q(y10);
            }
            iVar.O();
            x0.f b10 = l.b(aVar, (x.m) y10, xVar, this.f56244w, this.f56245x, this.f56246y, this.f56247z);
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ String A;
        public final /* synthetic */ w1.h B;

        /* renamed from: w */
        public final /* synthetic */ io.a<wn.v> f56248w;

        /* renamed from: x */
        public final /* synthetic */ boolean f56249x;

        /* renamed from: y */
        public final /* synthetic */ x.m f56250y;

        /* renamed from: z */
        public final /* synthetic */ x f56251z;

        /* loaded from: classes.dex */
        public static final class a implements r1.b {

            /* renamed from: w */
            public final /* synthetic */ l0.s0<Boolean> f56252w;

            public a(l0.s0<Boolean> s0Var) {
                this.f56252w = s0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r1.b
            public void j0(r1.e eVar) {
                jo.p.h(eVar, "scope");
                this.f56252w.setValue(eVar.a(w.a0.e()));
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<Boolean> {

            /* renamed from: w */
            public final /* synthetic */ l0.s0<Boolean> f56253w;

            /* renamed from: x */
            public final /* synthetic */ io.a<Boolean> f56254x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l0.s0<Boolean> s0Var, io.a<Boolean> aVar) {
                super(0);
                this.f56253w = s0Var;
                this.f56254x = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f56253w.getValue().booleanValue() || this.f56254x.invoke().booleanValue());
            }
        }

        @co.f(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ l0.s0<x.p> A;
            public final /* synthetic */ c2<io.a<Boolean>> B;
            public final /* synthetic */ c2<io.a<wn.v>> C;

            /* renamed from: w */
            public int f56255w;

            /* renamed from: x */
            public /* synthetic */ Object f56256x;

            /* renamed from: y */
            public final /* synthetic */ boolean f56257y;

            /* renamed from: z */
            public final /* synthetic */ x.m f56258z;

            @co.f(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.q<w.t, b1.f, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ x.m A;
                public final /* synthetic */ l0.s0<x.p> B;
                public final /* synthetic */ c2<io.a<Boolean>> C;

                /* renamed from: w */
                public int f56259w;

                /* renamed from: x */
                public /* synthetic */ Object f56260x;

                /* renamed from: y */
                public /* synthetic */ long f56261y;

                /* renamed from: z */
                public final /* synthetic */ boolean f56262z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(boolean z10, x.m mVar, l0.s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, ao.d<? super a> dVar) {
                    super(3, dVar);
                    this.f56262z = z10;
                    this.A = mVar;
                    this.B = s0Var;
                    this.C = c2Var;
                }

                public final Object a(w.t tVar, long j10, ao.d<? super wn.v> dVar) {
                    a aVar = new a(this.f56262z, this.A, this.B, this.C, dVar);
                    aVar.f56260x = tVar;
                    aVar.f56261y = j10;
                    return aVar.invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f56259w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        w.t tVar = (w.t) this.f56260x;
                        long j10 = this.f56261y;
                        if (this.f56262z) {
                            x.m mVar = this.A;
                            l0.s0<x.p> s0Var = this.B;
                            c2<io.a<Boolean>> c2Var = this.C;
                            this.f56259w = 1;
                            if (l.i(tVar, j10, mVar, s0Var, c2Var, this) == c10) {
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

                @Override // io.q
                public /* bridge */ /* synthetic */ Object s0(w.t tVar, b1.f fVar, ao.d<? super wn.v> dVar) {
                    return a(tVar, fVar.u(), dVar);
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.l<b1.f, wn.v> {

                /* renamed from: w */
                public final /* synthetic */ boolean f56263w;

                /* renamed from: x */
                public final /* synthetic */ c2<io.a<wn.v>> f56264x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(boolean z10, c2<? extends io.a<wn.v>> c2Var) {
                    super(1);
                    this.f56263w = z10;
                    this.f56264x = c2Var;
                }

                public final void a(long j10) {
                    if (this.f56263w) {
                        this.f56264x.getValue().invoke();
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
                    a(fVar.u());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(boolean z10, x.m mVar, l0.s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, c2<? extends io.a<wn.v>> c2Var2, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f56257y = z10;
                this.f56258z = mVar;
                this.A = s0Var;
                this.B = c2Var;
                this.C = c2Var2;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((c) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                c cVar = new c(this.f56257y, this.f56258z, this.A, this.B, this.C, dVar);
                cVar.f56256x = obj;
                return cVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f56255w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    a aVar = new a(this.f56257y, this.f56258z, this.A, this.B, null);
                    b bVar = new b(this.f56257y, this.C);
                    this.f56255w = 1;
                    if (w.e0.i((n1.e0) this.f56256x, aVar, bVar, this) == c10) {
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
        public d(io.a<wn.v> aVar, boolean z10, x.m mVar, x xVar, String str, w1.h hVar) {
            super(3);
            this.f56248w = aVar;
            this.f56249x = z10;
            this.f56250y = mVar;
            this.f56251z = xVar;
            this.A = str;
            this.B = hVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(92076020);
            c2 l10 = u1.l(this.f56248w, iVar, 0);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(null, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            l0.s0 s0Var = (l0.s0) y10;
            iVar.x(1841981204);
            if (this.f56249x) {
                l.a(this.f56250y, s0Var, iVar, 48);
            }
            iVar.O();
            io.a<Boolean> d10 = m.d(iVar, 0);
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = z1.e(Boolean.TRUE, null, 2, null);
                iVar.q(y11);
            }
            iVar.O();
            l0.s0 s0Var2 = (l0.s0) y11;
            c2 l11 = u1.l(new b(s0Var2, d10), iVar, 0);
            f.a aVar2 = x0.f.f59359u;
            x0.f c10 = n1.o0.c(aVar2, this.f56250y, Boolean.valueOf(this.f56249x), new c(this.f56249x, this.f56250y, s0Var, l11, l10, null));
            iVar.x(-492369756);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = new a(s0Var2);
                iVar.q(y12);
            }
            iVar.O();
            x0.f f10 = l.f(aVar2.L((x0.f) y12), c10, this.f56250y, this.f56251z, this.f56249x, this.A, this.B, null, null, this.f56248w);
            iVar.O();
            return f10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<c1, wn.v> {
        public final /* synthetic */ x A;
        public final /* synthetic */ x.m B;

        /* renamed from: w */
        public final /* synthetic */ boolean f56265w;

        /* renamed from: x */
        public final /* synthetic */ String f56266x;

        /* renamed from: y */
        public final /* synthetic */ w1.h f56267y;

        /* renamed from: z */
        public final /* synthetic */ io.a f56268z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, String str, w1.h hVar, io.a aVar, x xVar, x.m mVar) {
            super(1);
            this.f56265w = z10;
            this.f56266x = str;
            this.f56267y = hVar;
            this.f56268z = aVar;
            this.A = xVar;
            this.B = mVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("clickable");
            c1Var.a().b("enabled", Boolean.valueOf(this.f56265w));
            c1Var.a().b("onClickLabel", this.f56266x);
            c1Var.a().b("role", this.f56267y);
            c1Var.a().b("onClick", this.f56268z);
            c1Var.a().b("indication", this.A);
            c1Var.a().b("interactionSource", this.B);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ boolean f56269w;

        /* renamed from: x */
        public final /* synthetic */ String f56270x;

        /* renamed from: y */
        public final /* synthetic */ w1.h f56271y;

        /* renamed from: z */
        public final /* synthetic */ io.a f56272z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, String str, w1.h hVar, io.a aVar) {
            super(1);
            this.f56269w = z10;
            this.f56270x = str;
            this.f56271y = hVar;
            this.f56272z = aVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("clickable");
            c1Var.a().b("enabled", Boolean.valueOf(this.f56269w));
            c1Var.a().b("onClickLabel", this.f56270x);
            c1Var.a().b("role", this.f56271y);
            c1Var.a().b("onClick", this.f56272z);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<w1.y, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ io.a<wn.v> B;

        /* renamed from: w */
        public final /* synthetic */ w1.h f56273w;

        /* renamed from: x */
        public final /* synthetic */ String f56274x;

        /* renamed from: y */
        public final /* synthetic */ io.a<wn.v> f56275y;

        /* renamed from: z */
        public final /* synthetic */ String f56276z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<Boolean> {

            /* renamed from: w */
            public final /* synthetic */ io.a<wn.v> f56277w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.a<wn.v> aVar) {
                super(0);
                this.f56277w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f56277w.invoke();
                return Boolean.TRUE;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<Boolean> {

            /* renamed from: w */
            public final /* synthetic */ io.a<wn.v> f56278w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(io.a<wn.v> aVar) {
                super(0);
                this.f56278w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                this.f56278w.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w1.h hVar, String str, io.a<wn.v> aVar, String str2, boolean z10, io.a<wn.v> aVar2) {
            super(1);
            this.f56273w = hVar;
            this.f56274x = str;
            this.f56275y = aVar;
            this.f56276z = str2;
            this.A = z10;
            this.B = aVar2;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.h hVar = this.f56273w;
            if (hVar != null) {
                w1.w.I(yVar, hVar.m());
            }
            w1.w.k(yVar, this.f56274x, new a(this.B));
            io.a<wn.v> aVar = this.f56275y;
            if (aVar != null) {
                w1.w.m(yVar, this.f56276z, new b(aVar));
            }
            if (this.A) {
                return;
            }
            w1.w.e(yVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<l1.b, Boolean> {

        /* renamed from: w */
        public final /* synthetic */ boolean f56279w;

        /* renamed from: x */
        public final /* synthetic */ io.a<wn.v> f56280x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, io.a<wn.v> aVar) {
            super(1);
            this.f56279w = z10;
            this.f56280x = aVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            jo.p.h(keyEvent, "it");
            if (this.f56279w && m.c(keyEvent)) {
                this.f56280x.invoke();
                z10 = true;
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

    @co.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {412, 414, 421, 422, 431}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ long A;
        public final /* synthetic */ x.m B;
        public final /* synthetic */ l0.s0<x.p> C;
        public final /* synthetic */ c2<io.a<Boolean>> D;

        /* renamed from: w */
        public boolean f56281w;

        /* renamed from: x */
        public int f56282x;

        /* renamed from: y */
        public /* synthetic */ Object f56283y;

        /* renamed from: z */
        public final /* synthetic */ w.t f56284z;

        @co.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {406, 409}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ x.m A;
            public final /* synthetic */ l0.s0<x.p> B;

            /* renamed from: w */
            public Object f56285w;

            /* renamed from: x */
            public int f56286x;

            /* renamed from: y */
            public final /* synthetic */ c2<io.a<Boolean>> f56287y;

            /* renamed from: z */
            public final /* synthetic */ long f56288z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c2<? extends io.a<Boolean>> c2Var, long j10, x.m mVar, l0.s0<x.p> s0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f56287y = c2Var;
                this.f56288z = j10;
                this.A = mVar;
                this.B = s0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f56287y, this.f56288z, this.A, this.B, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                x.p pVar;
                Object c10 = bo.c.c();
                int i10 = this.f56286x;
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f56287y.getValue().invoke().booleanValue()) {
                        long b10 = m.b();
                        this.f56286x = 1;
                        if (b1.a(b10, this) == c10) {
                            return c10;
                        }
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (x.p) this.f56285w;
                    wn.m.b(obj);
                    this.B.setValue(pVar);
                    return wn.v.f59242a;
                } else {
                    wn.m.b(obj);
                }
                x.p pVar2 = new x.p(this.f56288z, null);
                x.m mVar = this.A;
                this.f56285w = pVar2;
                this.f56286x = 2;
                if (mVar.b(pVar2, this) == c10) {
                    return c10;
                }
                pVar = pVar2;
                this.B.setValue(pVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(w.t tVar, long j10, x.m mVar, l0.s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f56284z = tVar;
            this.A = j10;
            this.B = mVar;
            this.C = s0Var;
            this.D = c2Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            i iVar = new i(this.f56284z, this.A, this.B, this.C, this.D, dVar);
            iVar.f56283y = obj;
            return iVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b4 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v.l.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(x.m mVar, l0.s0<x.p> s0Var, l0.i iVar, int i10) {
        int i11;
        jo.p.h(mVar, "interactionSource");
        jo.p.h(s0Var, "pressedInteraction");
        l0.i h10 = iVar.h(1761107222);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(s0Var) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            h10.x(511388516);
            boolean P = h10.P(s0Var) | h10.P(mVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(s0Var, mVar);
                h10.q(y10);
            }
            h10.O();
            l0.c0.a(mVar, (io.l) y10, h10, i11 & 14);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(mVar, s0Var, i10));
    }

    public static final x0.f b(x0.f fVar, x.m mVar, x xVar, boolean z10, String str, w1.h hVar, io.a<wn.v> aVar) {
        jo.p.h(fVar, "$this$clickable");
        jo.p.h(mVar, "interactionSource");
        jo.p.h(aVar, "onClick");
        return x0.e.c(fVar, a1.c() ? new e(z10, str, hVar, aVar, xVar, mVar) : a1.a(), new d(aVar, z10, mVar, xVar, str, hVar));
    }

    public static /* synthetic */ x0.f c(x0.f fVar, x.m mVar, x xVar, boolean z10, String str, w1.h hVar, io.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return b(fVar, mVar, xVar, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : hVar, aVar);
    }

    public static final x0.f d(x0.f fVar, boolean z10, String str, w1.h hVar, io.a<wn.v> aVar) {
        jo.p.h(fVar, "$this$clickable");
        jo.p.h(aVar, "onClick");
        return x0.e.c(fVar, a1.c() ? new f(z10, str, hVar, aVar) : a1.a(), new c(z10, str, hVar, aVar));
    }

    public static /* synthetic */ x0.f e(x0.f fVar, boolean z10, String str, w1.h hVar, io.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            hVar = null;
        }
        return d(fVar, z10, str, hVar, aVar);
    }

    public static final x0.f f(x0.f fVar, x0.f fVar2, x.m mVar, x xVar, boolean z10, String str, w1.h hVar, String str2, io.a<wn.v> aVar, io.a<wn.v> aVar2) {
        jo.p.h(fVar, "$this$genericClickableWithoutGesture");
        jo.p.h(fVar2, "gestureModifiers");
        jo.p.h(mVar, "interactionSource");
        jo.p.h(aVar2, "onClick");
        return r.d(v.a(z.b(h(g(fVar, hVar, str, aVar, str2, z10, aVar2), z10, aVar2), mVar, xVar), mVar, z10), z10, mVar).L(fVar2);
    }

    public static final x0.f g(x0.f fVar, w1.h hVar, String str, io.a<wn.v> aVar, String str2, boolean z10, io.a<wn.v> aVar2) {
        return w1.p.a(fVar, true, new g(hVar, str, aVar, str2, z10, aVar2));
    }

    public static final x0.f h(x0.f fVar, boolean z10, io.a<wn.v> aVar) {
        return l1.f.b(fVar, new h(z10, aVar));
    }

    public static final Object i(w.t tVar, long j10, x.m mVar, l0.s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, ao.d<? super wn.v> dVar) {
        Object e10 = uo.r0.e(new i(tVar, j10, mVar, s0Var, c2Var, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }
}
