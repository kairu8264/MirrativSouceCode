package d0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import io.l;
import jo.p;
import jo.q;
import l0.c2;
import l0.i;
import l0.s0;
import l0.u1;
import l0.z1;
import n1.e0;
import n1.o0;
import r1.e;
import v.r;
import v.x;
import v.z;
import w.a0;
import w.t;
import w1.h;
import w1.w;
import w1.y;
import wn.v;
import x.m;
import x0.f;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<Boolean, v> f28921w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f28922x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, v> lVar, boolean z10) {
            super(0);
            this.f28921w = lVar;
            this.f28922x = z10;
        }

        public final void a() {
            this.f28921w.invoke(Boolean.valueOf(!this.f28922x));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<c1, v> {
        public final /* synthetic */ h A;
        public final /* synthetic */ l B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f28923w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m f28924x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x f28925y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f28926z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, m mVar, x xVar, boolean z11, h hVar, l lVar) {
            super(1);
            this.f28923w = z10;
            this.f28924x = mVar;
            this.f28925y = xVar;
            this.f28926z = z11;
            this.A = hVar;
            this.B = lVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("toggleable");
            c1Var.a().b("value", Boolean.valueOf(this.f28923w));
            c1Var.a().b("interactionSource", this.f28924x);
            c1Var.a().b("indication", this.f28925y);
            c1Var.a().b("enabled", Boolean.valueOf(this.f28926z));
            c1Var.a().b("role", this.A);
            c1Var.a().b("onValueChange", this.B);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* renamed from: d0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0265c extends q implements io.q<f, i, Integer, f> {
        public final /* synthetic */ h A;
        public final /* synthetic */ x1.a B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f28927w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f28928x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m f28929y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x f28930z;

        /* renamed from: d0.c$c$a */
        /* loaded from: classes.dex */
        public static final class a implements r1.b {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f28931w;

            public a(s0<Boolean> s0Var) {
                this.f28931w = s0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r1.b
            public void j0(e eVar) {
                p.h(eVar, "scope");
                this.f28931w.setValue(eVar.a(a0.e()));
            }
        }

        /* renamed from: d0.c$c$b */
        /* loaded from: classes.dex */
        public static final class b extends q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f28932w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.a<Boolean> f28933x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s0<Boolean> s0Var, io.a<Boolean> aVar) {
                super(0);
                this.f28932w = s0Var;
                this.f28933x = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f28932w.getValue().booleanValue() || this.f28933x.invoke().booleanValue());
            }
        }

        @co.f(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", f = "Toggleable.kt", l = {270}, m = "invokeSuspend")
        /* renamed from: d0.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0266c extends co.l implements io.p<e0, ao.d<? super v>, Object> {
            public final /* synthetic */ s0<x.p> A;
            public final /* synthetic */ c2<io.a<Boolean>> B;
            public final /* synthetic */ c2<io.a<v>> C;

            /* renamed from: w  reason: collision with root package name */
            public int f28934w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f28935x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f28936y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ m f28937z;

            @co.f(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", f = "Toggleable.kt", l = {273}, m = "invokeSuspend")
            /* renamed from: d0.c$c$c$a */
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.q<t, b1.f, ao.d<? super v>, Object> {
                public final /* synthetic */ m A;
                public final /* synthetic */ s0<x.p> B;
                public final /* synthetic */ c2<io.a<Boolean>> C;

                /* renamed from: w  reason: collision with root package name */
                public int f28938w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f28939x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ long f28940y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ boolean f28941z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(boolean z10, m mVar, s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, ao.d<? super a> dVar) {
                    super(3, dVar);
                    this.f28941z = z10;
                    this.A = mVar;
                    this.B = s0Var;
                    this.C = c2Var;
                }

                public final Object a(t tVar, long j10, ao.d<? super v> dVar) {
                    a aVar = new a(this.f28941z, this.A, this.B, this.C, dVar);
                    aVar.f28939x = tVar;
                    aVar.f28940y = j10;
                    return aVar.invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f28938w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        t tVar = (t) this.f28939x;
                        long j10 = this.f28940y;
                        if (this.f28941z) {
                            m mVar = this.A;
                            s0<x.p> s0Var = this.B;
                            c2<io.a<Boolean>> c2Var = this.C;
                            this.f28938w = 1;
                            if (v.l.i(tVar, j10, mVar, s0Var, c2Var, this) == c10) {
                                return c10;
                            }
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    return v.f59242a;
                }

                @Override // io.q
                public /* bridge */ /* synthetic */ Object s0(t tVar, b1.f fVar, ao.d<? super v> dVar) {
                    return a(tVar, fVar.u(), dVar);
                }
            }

            /* renamed from: d0.c$c$c$b */
            /* loaded from: classes.dex */
            public static final class b extends q implements l<b1.f, v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ boolean f28942w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ c2<io.a<v>> f28943x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(boolean z10, c2<? extends io.a<v>> c2Var) {
                    super(1);
                    this.f28942w = z10;
                    this.f28943x = c2Var;
                }

                public final void a(long j10) {
                    if (this.f28942w) {
                        this.f28943x.getValue().invoke();
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ v invoke(b1.f fVar) {
                    a(fVar.u());
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0266c(boolean z10, m mVar, s0<x.p> s0Var, c2<? extends io.a<Boolean>> c2Var, c2<? extends io.a<v>> c2Var2, ao.d<? super C0266c> dVar) {
                super(2, dVar);
                this.f28936y = z10;
                this.f28937z = mVar;
                this.A = s0Var;
                this.B = c2Var;
                this.C = c2Var2;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(e0 e0Var, ao.d<? super v> dVar) {
                return ((C0266c) create(e0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                C0266c c0266c = new C0266c(this.f28936y, this.f28937z, this.A, this.B, this.C, dVar);
                c0266c.f28935x = obj;
                return c0266c;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f28934w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    a aVar = new a(this.f28936y, this.f28937z, this.A, this.B, null);
                    b bVar = new b(this.f28936y, this.C);
                    this.f28934w = 1;
                    if (w.e0.i((e0) this.f28935x, aVar, bVar, this) == c10) {
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

        /* renamed from: d0.c$c$d */
        /* loaded from: classes.dex */
        public static final class d extends q implements l<y, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h f28944w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x1.a f28945x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f28946y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f28947z;

            /* renamed from: d0.c$c$d$a */
            /* loaded from: classes.dex */
            public static final class a extends q implements io.a<Boolean> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f28948w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(io.a<v> aVar) {
                    super(0);
                    this.f28948w = aVar;
                }

                @Override // io.a
                /* renamed from: a */
                public final Boolean invoke() {
                    this.f28948w.invoke();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, x1.a aVar, boolean z10, io.a<v> aVar2) {
                super(1);
                this.f28944w = hVar;
                this.f28945x = aVar;
                this.f28946y = z10;
                this.f28947z = aVar2;
            }

            public final void a(y yVar) {
                p.h(yVar, "$this$semantics");
                h hVar = this.f28944w;
                if (hVar != null) {
                    w.I(yVar, hVar.m());
                }
                w.Q(yVar, this.f28945x);
                w.l(yVar, null, new a(this.f28947z), 1, null);
                if (this.f28946y) {
                    return;
                }
                w.e(yVar);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(y yVar) {
                a(yVar);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0265c(io.a<v> aVar, boolean z10, m mVar, x xVar, h hVar, x1.a aVar2) {
            super(3);
            this.f28927w = aVar;
            this.f28928x = z10;
            this.f28929y = mVar;
            this.f28930z = xVar;
            this.A = hVar;
            this.B = aVar2;
        }

        public final f a(f fVar, i iVar, int i10) {
            p.h(fVar, "$this$composed");
            iVar.x(2121285826);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(null, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            f.a aVar2 = f.f59359u;
            f a10 = w1.p.a(aVar2, true, new d(this.A, this.B, this.f28928x, this.f28927w));
            c2 l10 = u1.l(this.f28927w, iVar, 0);
            iVar.x(-2134919160);
            if (this.f28928x) {
                v.l.a(this.f28929y, s0Var, iVar, 48);
            }
            iVar.O();
            io.a<Boolean> d10 = v.m.d(iVar, 0);
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = z1.e(Boolean.TRUE, null, 2, null);
                iVar.q(y11);
            }
            iVar.O();
            s0 s0Var2 = (s0) y11;
            f c10 = o0.c(aVar2, this.f28929y, Boolean.valueOf(this.f28928x), new C0266c(this.f28928x, this.f28929y, s0Var, u1.l(new b(s0Var2, d10), iVar, 0), l10, null));
            iVar.x(-492369756);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = new a(s0Var2);
                iVar.q(y12);
            }
            iVar.O();
            f L = r.d(v.v.a(z.b(fVar.L((f) y12).L(a10), this.f28929y, this.f28930z), this.f28929y, this.f28928x), this.f28928x, this.f28929y).L(c10);
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ f s0(f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final f a(f fVar, boolean z10, m mVar, x xVar, boolean z11, h hVar, l<? super Boolean, v> lVar) {
        p.h(fVar, "$this$toggleable");
        p.h(mVar, "interactionSource");
        p.h(lVar, "onValueChange");
        return a1.b(fVar, a1.c() ? new b(z10, mVar, xVar, z11, hVar, lVar) : a1.a(), b(f.f59359u, x1.b.a(z10), z11, hVar, mVar, xVar, new a(lVar, z10)));
    }

    public static final f b(f fVar, x1.a aVar, boolean z10, h hVar, m mVar, x xVar, io.a<v> aVar2) {
        return x0.e.d(fVar, null, new C0265c(aVar2, z10, mVar, xVar, hVar, aVar), 1, null);
    }
}
