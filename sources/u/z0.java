package u;

import com.dena.mirrorman.clientlog.logs.LogBase;
import l0.c2;
import l0.u1;
import l0.z1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class z0<S> {

    /* renamed from: a  reason: collision with root package name */
    public final n0<S> f54183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54184b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.s0 f54185c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.s0 f54186d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f54187e;

    /* renamed from: f  reason: collision with root package name */
    public final l0.s0 f54188f;

    /* renamed from: g  reason: collision with root package name */
    public final l0.s0 f54189g;

    /* renamed from: h  reason: collision with root package name */
    public final v0.s<z0<S>.d<?, ?>> f54190h;

    /* renamed from: i  reason: collision with root package name */
    public final v0.s<z0<?>> f54191i;

    /* renamed from: j  reason: collision with root package name */
    public final l0.s0 f54192j;

    /* renamed from: k  reason: collision with root package name */
    public long f54193k;

    /* renamed from: l  reason: collision with root package name */
    public final c2 f54194l;

    /* loaded from: classes.dex */
    public final class a<T, V extends p> {

        /* renamed from: a  reason: collision with root package name */
        public final c1<T, V> f54195a;

        /* renamed from: b  reason: collision with root package name */
        public final String f54196b;

        /* renamed from: c  reason: collision with root package name */
        public z0<S>.C0847a<T, V>.a<T, V> f54197c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ z0<S> f54198d;

        /* renamed from: u.z0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0847a<T, V extends p> implements c2<T> {

            /* renamed from: w  reason: collision with root package name */
            public final z0<S>.d<T, V> f54199w;

            /* renamed from: x  reason: collision with root package name */
            public io.l<? super b<S>, ? extends c0<T>> f54200x;

            /* renamed from: y  reason: collision with root package name */
            public io.l<? super S, ? extends T> f54201y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ z0<S>.a<T, V> f54202z;

            public C0847a(a aVar, z0<S>.d<T, V> dVar, io.l<? super b<S>, ? extends c0<T>> lVar, io.l<? super S, ? extends T> lVar2) {
                jo.p.h(aVar, "this$0");
                jo.p.h(dVar, "animation");
                jo.p.h(lVar, "transitionSpec");
                jo.p.h(lVar2, "targetValueByState");
                this.f54202z = aVar;
                this.f54199w = dVar;
                this.f54200x = lVar;
                this.f54201y = lVar2;
            }

            public final z0<S>.d<T, V> d() {
                return this.f54199w;
            }

            @Override // l0.c2
            public T getValue() {
                r(this.f54202z.f54198d.k());
                return this.f54199w.getValue();
            }

            public final io.l<S, T> j() {
                return (io.l<? super S, ? extends T>) this.f54201y;
            }

            public final io.l<b<S>, c0<T>> k() {
                return (io.l<? super b<S>, ? extends c0<T>>) this.f54200x;
            }

            public final void p(io.l<? super S, ? extends T> lVar) {
                jo.p.h(lVar, "<set-?>");
                this.f54201y = lVar;
            }

            public final void q(io.l<? super b<S>, ? extends c0<T>> lVar) {
                jo.p.h(lVar, "<set-?>");
                this.f54200x = lVar;
            }

            public final void r(b<S> bVar) {
                jo.p.h(bVar, "segment");
                T invoke = this.f54201y.invoke(bVar.a());
                if (this.f54202z.f54198d.q()) {
                    this.f54199w.G(this.f54201y.invoke(bVar.b()), invoke, this.f54200x.invoke(bVar));
                    return;
                }
                this.f54199w.H(invoke, this.f54200x.invoke(bVar));
            }
        }

        public a(z0 z0Var, c1<T, V> c1Var, String str) {
            jo.p.h(z0Var, "this$0");
            jo.p.h(c1Var, "typeConverter");
            jo.p.h(str, LogBase.LABEL);
            this.f54198d = z0Var;
            this.f54195a = c1Var;
            this.f54196b = str;
        }

        public final c2<T> a(io.l<? super b<S>, ? extends c0<T>> lVar, io.l<? super S, ? extends T> lVar2) {
            jo.p.h(lVar, "transitionSpec");
            jo.p.h(lVar2, "targetValueByState");
            z0<S>.C0847a<T, V>.a<T, V> c0847a = this.f54197c;
            if (c0847a == null) {
                z0<S> z0Var = this.f54198d;
                c0847a = new C0847a<>(this, new d(z0Var, lVar2.invoke((S) z0Var.g()), l.g(this.f54195a, lVar2.invoke((S) this.f54198d.g())), this.f54195a, this.f54196b), lVar, lVar2);
                z0<S> z0Var2 = this.f54198d;
                c(c0847a);
                z0Var2.d(c0847a.d());
            }
            z0<S> z0Var3 = this.f54198d;
            c0847a.p(lVar2);
            c0847a.q(lVar);
            c0847a.r(z0Var3.k());
            return c0847a;
        }

        public final z0<S>.C0847a<T, V>.a<T, V> b() {
            return this.f54197c;
        }

        public final void c(z0<S>.C0847a<T, V>.a<T, V> c0847a) {
            this.f54197c = c0847a;
        }

        public final void d() {
            z0<S>.C0847a<T, V>.a<T, V> c0847a = this.f54197c;
            if (c0847a == null) {
                return;
            }
            z0<S> z0Var = this.f54198d;
            c0847a.d().G(c0847a.j().invoke(z0Var.k().b()), c0847a.j().invoke(z0Var.k().a()), c0847a.k().invoke(z0Var.k()));
        }
    }

    /* loaded from: classes.dex */
    public interface b<S> {

        /* loaded from: classes.dex */
        public static final class a {
            public static <S> boolean a(b<S> bVar, S s10, S s11) {
                jo.p.h(bVar, "this");
                return jo.p.c(s10, bVar.b()) && jo.p.c(s11, bVar.a());
            }
        }

        S a();

        S b();

        boolean c(S s10, S s11);
    }

    /* loaded from: classes.dex */
    public static final class c<S> implements b<S> {

        /* renamed from: a  reason: collision with root package name */
        public final S f54203a;

        /* renamed from: b  reason: collision with root package name */
        public final S f54204b;

        public c(S s10, S s11) {
            this.f54203a = s10;
            this.f54204b = s11;
        }

        @Override // u.z0.b
        public S a() {
            return this.f54204b;
        }

        @Override // u.z0.b
        public S b() {
            return this.f54203a;
        }

        @Override // u.z0.b
        public boolean c(S s10, S s11) {
            return b.a.a(this, s10, s11);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (jo.p.c(b(), bVar.b()) && jo.p.c(a(), bVar.a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S b10 = b();
            int hashCode = (b10 == null ? 0 : b10.hashCode()) * 31;
            S a10 = a();
            return hashCode + (a10 != null ? a10.hashCode() : 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d<T, V extends p> implements c2<T> {
        public final l0.s0 A;
        public final l0.s0 B;
        public final l0.s0 C;
        public final l0.s0 D;
        public final l0.s0 E;
        public V F;
        public final c0<T> G;
        public final /* synthetic */ z0<S> H;

        /* renamed from: w  reason: collision with root package name */
        public final c1<T, V> f54205w;

        /* renamed from: x  reason: collision with root package name */
        public final String f54206x;

        /* renamed from: y  reason: collision with root package name */
        public final l0.s0 f54207y;

        /* renamed from: z  reason: collision with root package name */
        public final l0.s0 f54208z;

        public d(z0 z0Var, T t10, V v10, c1<T, V> c1Var, String str) {
            l0.s0 e10;
            l0.s0 e11;
            l0.s0 e12;
            l0.s0 e13;
            l0.s0 e14;
            l0.s0 e15;
            l0.s0 e16;
            T invoke;
            jo.p.h(z0Var, "this$0");
            jo.p.h(v10, "initialVelocityVector");
            jo.p.h(c1Var, "typeConverter");
            jo.p.h(str, LogBase.LABEL);
            this.H = z0Var;
            this.f54205w = c1Var;
            this.f54206x = str;
            e10 = z1.e(t10, null, 2, null);
            this.f54207y = e10;
            e11 = z1.e(j.g(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.f54208z = e11;
            e12 = z1.e(new y0(j(), c1Var, t10, r(), v10), null, 2, null);
            this.A = e12;
            e13 = z1.e(Boolean.TRUE, null, 2, null);
            this.B = e13;
            e14 = z1.e(0L, null, 2, null);
            this.C = e14;
            e15 = z1.e(Boolean.FALSE, null, 2, null);
            this.D = e15;
            e16 = z1.e(t10, null, 2, null);
            this.E = e16;
            this.F = v10;
            Float f10 = q1.h().get(c1Var);
            if (f10 == null) {
                invoke = null;
            } else {
                float floatValue = f10.floatValue();
                V invoke2 = s().a().invoke(t10);
                int b10 = invoke2.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    invoke2.e(i10, floatValue);
                }
                invoke = s().b().invoke(invoke2);
            }
            this.G = j.g(0.0f, 0.0f, invoke, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void F(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.E(obj, z10);
        }

        public final void A(boolean z10) {
            this.D.setValue(Boolean.valueOf(z10));
        }

        public final void B(long j10) {
            this.C.setValue(Long.valueOf(j10));
        }

        public final void C(T t10) {
            this.f54207y.setValue(t10);
        }

        public void D(T t10) {
            this.E.setValue(t10);
        }

        public final void E(T t10, boolean z10) {
            c0<T> j10;
            if (z10) {
                j10 = j() instanceof u0 ? j() : this.G;
            } else {
                j10 = j();
            }
            x(new y0<>(j10, this.f54205w, t10, r(), this.F));
            this.H.r();
        }

        public final void G(T t10, T t11, c0<T> c0Var) {
            jo.p.h(c0Var, "animationSpec");
            C(t11);
            y(c0Var);
            if (jo.p.c(d().h(), t10) && jo.p.c(d().g(), t11)) {
                return;
            }
            F(this, t10, false, 2, null);
        }

        public final void H(T t10, c0<T> c0Var) {
            jo.p.h(c0Var, "animationSpec");
            if (!jo.p.c(r(), t10) || p()) {
                C(t10);
                y(c0Var);
                F(this, null, !t(), 1, null);
                z(false);
                B(this.H.j());
                A(false);
            }
        }

        public final y0<T, V> d() {
            return (y0) this.A.getValue();
        }

        @Override // l0.c2
        public T getValue() {
            return this.E.getValue();
        }

        public final c0<T> j() {
            return (c0) this.f54208z.getValue();
        }

        public final long k() {
            return d().d();
        }

        public final boolean p() {
            return ((Boolean) this.D.getValue()).booleanValue();
        }

        public final long q() {
            return ((Number) this.C.getValue()).longValue();
        }

        public final T r() {
            return this.f54207y.getValue();
        }

        public final c1<T, V> s() {
            return this.f54205w;
        }

        public final boolean t() {
            return ((Boolean) this.B.getValue()).booleanValue();
        }

        public final void u(long j10) {
            long q10 = j10 - q();
            D(d().f(q10));
            this.F = d().b(q10);
            if (d().c(q10)) {
                z(true);
                B(0L);
            }
        }

        public final void v() {
            A(true);
        }

        public final void w(long j10) {
            D(d().f(j10));
            this.F = d().b(j10);
        }

        public final void x(y0<T, V> y0Var) {
            this.A.setValue(y0Var);
        }

        public final void y(c0<T> c0Var) {
            this.f54208z.setValue(c0Var);
        }

        public final void z(boolean z10) {
            this.B.setValue(Boolean.valueOf(z10));
        }
    }

    @co.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {432}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54209w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z0<S> f54210x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<Long, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ z0<S> f54211w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z0<S> z0Var) {
                super(1);
                this.f54211w = z0Var;
            }

            public final void a(long j10) {
                if (this.f54211w.q()) {
                    return;
                }
                this.f54211w.s(j10 / 1);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Long l10) {
                a(l10.longValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z0<S> z0Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f54210x = z0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f54210x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object c10 = bo.c.c();
            int i10 = this.f54209w;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wn.m.b(obj);
            do {
                aVar = new a(this.f54210x);
                this.f54209w = 1;
            } while (l0.o0.b(aVar, this) != c10);
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f54212w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ S f54213x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f54214y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z0<S> z0Var, S s10, int i10) {
            super(2);
            this.f54212w = z0Var;
            this.f54213x = s10;
            this.f54214y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            this.f54212w.f(this.f54213x, iVar, this.f54214y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<Long> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f54215w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(z0<S> z0Var) {
            super(0);
            this.f54215w = z0Var;
        }

        public final Long a() {
            long j10 = 0;
            for (d dVar : this.f54215w.f54190h) {
                j10 = Math.max(j10, dVar.k());
            }
            for (z0 z0Var : this.f54215w.f54191i) {
                j10 = Math.max(j10, z0Var.n());
            }
            return Long.valueOf(j10);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ Long invoke() {
            return a();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f54216w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ S f54217x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f54218y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(z0<S> z0Var, S s10, int i10) {
            super(2);
            this.f54216w = z0Var;
            this.f54217x = s10;
            this.f54218y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            this.f54216w.G(this.f54217x, iVar, this.f54218y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public z0(n0<S> n0Var, String str) {
        l0.s0 e10;
        l0.s0 e11;
        l0.s0 e12;
        l0.s0 e13;
        l0.s0 e14;
        l0.s0 e15;
        jo.p.h(n0Var, "transitionState");
        this.f54183a = n0Var;
        this.f54184b = str;
        e10 = z1.e(g(), null, 2, null);
        this.f54185c = e10;
        e11 = z1.e(new c(g(), g()), null, 2, null);
        this.f54186d = e11;
        e12 = z1.e(0L, null, 2, null);
        this.f54187e = e12;
        e13 = z1.e(Long.MIN_VALUE, null, 2, null);
        this.f54188f = e13;
        e14 = z1.e(Boolean.TRUE, null, 2, null);
        this.f54189g = e14;
        this.f54190h = u1.c();
        this.f54191i = u1.c();
        e15 = z1.e(Boolean.FALSE, null, 2, null);
        this.f54192j = e15;
        this.f54194l = u1.b(new g(this));
    }

    public final void A(long j10) {
        this.f54187e.setValue(Long.valueOf(j10));
    }

    public final void B(boolean z10) {
        this.f54192j.setValue(Boolean.valueOf(z10));
    }

    public final void C(b<S> bVar) {
        this.f54186d.setValue(bVar);
    }

    public final void D(long j10) {
        this.f54188f.setValue(Long.valueOf(j10));
    }

    public final void E(S s10) {
        this.f54185c.setValue(s10);
    }

    public final void F(boolean z10) {
        this.f54189g.setValue(Boolean.valueOf(z10));
    }

    public final void G(S s10, l0.i iVar, int i10) {
        l0.i h10 = iVar.h(-1598251902);
        int i11 = (i10 & 14) == 0 ? (h10.P(s10) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= h10.P(this) ? 32 : 16;
        }
        if (((i11 & 91) ^ 18) == 0 && h10.j()) {
            h10.I();
        } else if (!q() && !jo.p.c(m(), s10)) {
            C(new c(m(), s10));
            z(m());
            E(s10);
            if (!p()) {
                F(true);
            }
            for (z0<S>.d<?, ?> dVar : this.f54190h) {
                dVar.v();
            }
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new h(this, s10, i10));
    }

    public final boolean d(z0<S>.d<?, ?> dVar) {
        jo.p.h(dVar, "animation");
        return this.f54190h.add(dVar);
    }

    public final boolean e(z0<?> z0Var) {
        jo.p.h(z0Var, "transition");
        return this.f54191i.add(z0Var);
    }

    public final void f(S s10, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(-1097578271);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(this) ? 32 : 16;
        }
        if (((i11 & 91) ^ 18) == 0 && h10.j()) {
            h10.I();
        } else if (!q()) {
            G(s10, h10, (i11 & 14) | (i11 & 112));
            if (!jo.p.c(s10, g()) || p() || o()) {
                int i12 = (i11 >> 3) & 14;
                h10.x(-3686930);
                boolean P = h10.P(this);
                Object y10 = h10.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new e(this, null);
                    h10.q(y10);
                }
                h10.O();
                l0.c0.c(this, (io.p) y10, h10, i12);
            }
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new f(this, s10, i10));
    }

    public final S g() {
        return this.f54183a.a();
    }

    public final String h() {
        return this.f54184b;
    }

    public final long i() {
        return this.f54193k;
    }

    public final long j() {
        return ((Number) this.f54187e.getValue()).longValue();
    }

    public final b<S> k() {
        return (b) this.f54186d.getValue();
    }

    public final long l() {
        return ((Number) this.f54188f.getValue()).longValue();
    }

    public final S m() {
        return (S) this.f54185c.getValue();
    }

    public final long n() {
        return ((Number) this.f54194l.getValue()).longValue();
    }

    public final boolean o() {
        return ((Boolean) this.f54189g.getValue()).booleanValue();
    }

    public final boolean p() {
        return l() != Long.MIN_VALUE;
    }

    public final boolean q() {
        return ((Boolean) this.f54192j.getValue()).booleanValue();
    }

    public final void r() {
        F(true);
        if (q()) {
            long j10 = 0;
            for (z0<S>.d<?, ?> dVar : this.f54190h) {
                j10 = Math.max(j10, dVar.k());
                dVar.w(i());
            }
            F(false);
        }
    }

    public final void s(long j10) {
        if (l() == Long.MIN_VALUE) {
            u(j10);
        }
        F(false);
        A(j10 - l());
        boolean z10 = true;
        for (z0<S>.d<?, ?> dVar : this.f54190h) {
            if (!dVar.t()) {
                dVar.u(j());
            }
            if (!dVar.t()) {
                z10 = false;
            }
        }
        for (z0<?> z0Var : this.f54191i) {
            if (!jo.p.c(z0Var.m(), z0Var.g())) {
                z0Var.s(j());
            }
            if (!jo.p.c(z0Var.m(), z0Var.g())) {
                z10 = false;
            }
        }
        if (z10) {
            t();
        }
    }

    public final void t() {
        D(Long.MIN_VALUE);
        z(m());
        A(0L);
        this.f54183a.c(false);
    }

    public final void u(long j10) {
        D(j10);
        this.f54183a.c(true);
    }

    public final void v(z0<S>.a<?, ?> aVar) {
        z0<S>.d<?, ?> d10;
        jo.p.h(aVar, "deferredAnimation");
        z0<S>.C0847a<?, V>.a<?, ?> b10 = aVar.b();
        if (b10 == null || (d10 = b10.d()) == null) {
            return;
        }
        w(d10);
    }

    public final void w(z0<S>.d<?, ?> dVar) {
        jo.p.h(dVar, "animation");
        this.f54190h.remove(dVar);
    }

    public final boolean x(z0<?> z0Var) {
        jo.p.h(z0Var, "transition");
        return this.f54191i.remove(z0Var);
    }

    public final void y(S s10, S s11, long j10) {
        D(Long.MIN_VALUE);
        this.f54183a.c(false);
        if (!q() || !jo.p.c(g(), s10) || !jo.p.c(m(), s11)) {
            z(s10);
            E(s11);
            B(true);
            C(new c(s10, s11));
        }
        for (z0<?> z0Var : this.f54191i) {
            if (z0Var.q()) {
                z0Var.y(z0Var.g(), z0Var.m(), j10);
            }
        }
        for (z0<S>.d<?, ?> dVar : this.f54190h) {
            dVar.w(j10);
        }
        this.f54193k = j10;
    }

    public final void z(S s10) {
        this.f54183a.b(s10);
    }

    public z0(S s10, String str) {
        this(new n0(s10), str);
    }
}
