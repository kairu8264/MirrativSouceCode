package q1;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f48626f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final a1 f48627a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f48628b;

    /* renamed from: c  reason: collision with root package name */
    public final io.p<s1.k, y0, wn.v> f48629c;

    /* renamed from: d  reason: collision with root package name */
    public final io.p<s1.k, l0.m, wn.v> f48630d;

    /* renamed from: e  reason: collision with root package name */
    public final io.p<s1.k, io.p<? super z0, ? super m2.b, ? extends d0>, wn.v> f48631e;

    /* loaded from: classes.dex */
    public interface a {
        default int a() {
            return 0;
        }

        default void b(int i10, long j10) {
        }

        void dispose();
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<s1.k, l0.m, wn.v> {
        public b() {
            super(2);
        }

        public final void a(s1.k kVar, l0.m mVar) {
            jo.p.h(kVar, "$this$null");
            jo.p.h(mVar, "it");
            y0.this.i().u(mVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(s1.k kVar, l0.m mVar) {
            a(kVar, mVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<s1.k, io.p<? super z0, ? super m2.b, ? extends d0>, wn.v> {
        public c() {
            super(2);
        }

        public final void a(s1.k kVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar) {
            jo.p.h(kVar, "$this$null");
            jo.p.h(pVar, "it");
            kVar.a(y0.this.i().k(pVar));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(s1.k kVar, io.p<? super z0, ? super m2.b, ? extends d0> pVar) {
            a(kVar, pVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<s1.k, y0, wn.v> {
        public d() {
            super(2);
        }

        public final void a(s1.k kVar, y0 y0Var) {
            jo.p.h(kVar, "$this$null");
            jo.p.h(y0Var, "it");
            y0 y0Var2 = y0.this;
            a0 w02 = kVar.w0();
            if (w02 == null) {
                w02 = new a0(kVar, y0.this.f48627a);
                kVar.w1(w02);
            }
            y0Var2.f48628b = w02;
            y0.this.i().q();
            y0.this.i().v(y0.this.f48627a);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(s1.k kVar, y0 y0Var) {
            a(kVar, y0Var);
            return wn.v.f59242a;
        }
    }

    public y0(a1 a1Var) {
        jo.p.h(a1Var, "slotReusePolicy");
        this.f48627a = a1Var;
        this.f48629c = new d();
        this.f48630d = new b();
        this.f48631e = new c();
    }

    public final void d() {
        i().m();
    }

    public final void e() {
        i().o();
    }

    public final io.p<s1.k, l0.m, wn.v> f() {
        return this.f48630d;
    }

    public final io.p<s1.k, io.p<? super z0, ? super m2.b, ? extends d0>, wn.v> g() {
        return this.f48631e;
    }

    public final io.p<s1.k, y0, wn.v> h() {
        return this.f48629c;
    }

    public final a0 i() {
        a0 a0Var = this.f48628b;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final a j(Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        return i().t(obj, pVar);
    }

    public y0() {
        this(h0.f48585a);
    }
}
