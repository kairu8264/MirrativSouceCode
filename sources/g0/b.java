package g0;

import g0.b;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f32204h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f32205a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32206b;

    /* renamed from: c  reason: collision with root package name */
    public final y1.z f32207c;

    /* renamed from: d  reason: collision with root package name */
    public final e2.t f32208d;

    /* renamed from: e  reason: collision with root package name */
    public final y f32209e;

    /* renamed from: f  reason: collision with root package name */
    public long f32210f;

    /* renamed from: g  reason: collision with root package name */
    public y1.a f32211g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public b(y1.a aVar, long j10, y1.z zVar, e2.t tVar, y yVar) {
        this.f32205a = aVar;
        this.f32206b = j10;
        this.f32207c = zVar;
        this.f32208d = tVar;
        this.f32209e = yVar;
        this.f32210f = j10;
        this.f32211g = aVar;
    }

    public /* synthetic */ b(y1.a aVar, long j10, y1.z zVar, e2.t tVar, y yVar, jo.h hVar) {
        this(aVar, j10, zVar, tVar, yVar);
    }

    public static /* synthetic */ int h(b bVar, y1.z zVar, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.Y();
            }
            return bVar.g(zVar, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    public static /* synthetic */ int k(b bVar, y1.z zVar, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.Z();
            }
            return bVar.j(zVar, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    public static /* synthetic */ int o(b bVar, y1.z zVar, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.X();
            }
            return bVar.n(zVar, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    public static /* synthetic */ int u(b bVar, y1.z zVar, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.X();
            }
            return bVar.t(zVar, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    public final int A(y1.z zVar, int i10) {
        int X = X();
        if (this.f32209e.a() == null) {
            this.f32209e.c(Float.valueOf(zVar.d(X).i()));
        }
        int p10 = zVar.p(X) + i10;
        if (p10 < 0) {
            return 0;
        }
        if (p10 >= zVar.m()) {
            return y().length();
        }
        float l10 = zVar.l(p10) - 1;
        Float a10 = this.f32209e.a();
        jo.p.e(a10);
        float floatValue = a10.floatValue();
        if ((z() && floatValue >= zVar.s(p10)) || (!z() && floatValue <= zVar.r(p10))) {
            return zVar.n(p10, true);
        }
        return this.f32208d.a(zVar.w(b1.g.a(a10.floatValue(), l10)));
    }

    public final T B() {
        y1.z zVar;
        if ((y().length() > 0) && (zVar = this.f32207c) != null) {
            V(A(zVar, 1));
        }
        return this;
    }

    public final T C() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                H();
            } else {
                E();
            }
        }
        return this;
    }

    public final T D() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                J();
            } else {
                G();
            }
        }
        return this;
    }

    public final T E() {
        int l10;
        x().b();
        if ((y().length() > 0) && (l10 = l()) != -1) {
            V(l10);
        }
        return this;
    }

    public final T F() {
        x().b();
        if (y().length() > 0) {
            V(q());
        }
        return this;
    }

    public final T G() {
        Integer m10;
        x().b();
        if ((y().length() > 0) && (m10 = m()) != null) {
            V(m10.intValue());
        }
        return this;
    }

    public final T H() {
        int s10;
        x().b();
        if ((y().length() > 0) && (s10 = s()) != -1) {
            V(s10);
        }
        return this;
    }

    public final T I() {
        x().b();
        if (y().length() > 0) {
            V(r());
        }
        return this;
    }

    public final T J() {
        Integer v10;
        x().b();
        if ((y().length() > 0) && (v10 = v()) != null) {
            V(v10.intValue());
        }
        return this;
    }

    public final T K() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                E();
            } else {
                H();
            }
        }
        return this;
    }

    public final T L() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                G();
            } else {
                J();
            }
        }
        return this;
    }

    public final T M() {
        x().b();
        if (y().length() > 0) {
            V(y().length());
        }
        return this;
    }

    public final T N() {
        x().b();
        if (y().length() > 0) {
            V(0);
        }
        return this;
    }

    public final T O() {
        Integer f10;
        x().b();
        if ((y().length() > 0) && (f10 = f()) != null) {
            V(f10.intValue());
        }
        return this;
    }

    public final T P() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                R();
            } else {
                O();
            }
        }
        return this;
    }

    public final T Q() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                O();
            } else {
                R();
            }
        }
        return this;
    }

    public final T R() {
        Integer i10;
        x().b();
        if ((y().length() > 0) && (i10 = i()) != null) {
            V(i10.intValue());
        }
        return this;
    }

    public final T S() {
        y1.z zVar;
        if ((y().length() > 0) && (zVar = this.f32207c) != null) {
            V(A(zVar, -1));
        }
        return this;
    }

    public final T T() {
        x().b();
        if (y().length() > 0) {
            W(0, y().length());
        }
        return this;
    }

    public final T U() {
        if (y().length() > 0) {
            this.f32210f = y1.c0.b(y1.b0.n(this.f32206b), y1.b0.i(this.f32210f));
        }
        return this;
    }

    public final void V(int i10) {
        W(i10, i10);
    }

    public final void W(int i10, int i11) {
        this.f32210f = y1.c0.b(i10, i11);
    }

    public final int X() {
        return this.f32208d.b(y1.b0.i(this.f32210f));
    }

    public final int Y() {
        return this.f32208d.b(y1.b0.k(this.f32210f));
    }

    public final int Z() {
        return this.f32208d.b(y1.b0.l(this.f32210f));
    }

    public final int a(int i10) {
        return po.n.i(i10, y().length() - 1);
    }

    public final T b(io.l<? super T, wn.v> lVar) {
        jo.p.h(lVar, "or");
        x().b();
        if (y().length() > 0) {
            if (y1.b0.h(this.f32210f)) {
                lVar.invoke(this);
            } else if (z()) {
                V(y1.b0.l(this.f32210f));
            } else {
                V(y1.b0.k(this.f32210f));
            }
        }
        return this;
    }

    public final T c(io.l<? super T, wn.v> lVar) {
        jo.p.h(lVar, "or");
        x().b();
        if (y().length() > 0) {
            if (y1.b0.h(this.f32210f)) {
                lVar.invoke(this);
            } else if (z()) {
                V(y1.b0.k(this.f32210f));
            } else {
                V(y1.b0.l(this.f32210f));
            }
        }
        return this;
    }

    public final T d() {
        x().b();
        if (y().length() > 0) {
            V(y1.b0.i(this.f32210f));
        }
        return this;
    }

    public final y1.a e() {
        return this.f32211g;
    }

    public final Integer f() {
        y1.z zVar = this.f32207c;
        if (zVar != null) {
            return Integer.valueOf(h(this, zVar, 0, 1, null));
        }
        return null;
    }

    public final int g(y1.z zVar, int i10) {
        return this.f32208d.a(zVar.n(zVar.p(i10), true));
    }

    public final Integer i() {
        y1.z zVar = this.f32207c;
        if (zVar != null) {
            return Integer.valueOf(k(this, zVar, 0, 1, null));
        }
        return null;
    }

    public final int j(y1.z zVar, int i10) {
        return this.f32208d.a(zVar.t(zVar.p(i10)));
    }

    public final int l() {
        return f0.a0.a(this.f32211g.g(), y1.b0.i(this.f32210f));
    }

    public final Integer m() {
        y1.z zVar = this.f32207c;
        if (zVar != null) {
            return Integer.valueOf(o(this, zVar, 0, 1, null));
        }
        return null;
    }

    public final int n(y1.z zVar, int i10) {
        if (i10 >= this.f32205a.length()) {
            return this.f32205a.length();
        }
        long B = zVar.B(a(i10));
        if (y1.b0.i(B) <= i10) {
            return n(zVar, i10 + 1);
        }
        return this.f32208d.a(y1.b0.i(B));
    }

    public final e2.t p() {
        return this.f32208d;
    }

    public final int q() {
        return f0.z.a(y(), y1.b0.k(this.f32210f));
    }

    public final int r() {
        return f0.z.b(y(), y1.b0.l(this.f32210f));
    }

    public final int s() {
        return f0.a0.b(this.f32211g.g(), y1.b0.i(this.f32210f));
    }

    public final int t(y1.z zVar, int i10) {
        if (i10 < 0) {
            return 0;
        }
        long B = zVar.B(a(i10));
        if (y1.b0.n(B) >= i10) {
            return t(zVar, i10 - 1);
        }
        return this.f32208d.a(y1.b0.n(B));
    }

    public final Integer v() {
        y1.z zVar = this.f32207c;
        if (zVar != null) {
            return Integer.valueOf(u(this, zVar, 0, 1, null));
        }
        return null;
    }

    public final long w() {
        return this.f32210f;
    }

    public final y x() {
        return this.f32209e;
    }

    public final String y() {
        return this.f32211g.g();
    }

    public final boolean z() {
        y1.z zVar = this.f32207c;
        return (zVar != null ? zVar.x(y1.b0.i(this.f32210f)) : null) != j2.d.Rtl;
    }
}
