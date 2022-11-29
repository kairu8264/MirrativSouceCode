package l0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 implements l1, e1 {

    /* renamed from: a  reason: collision with root package name */
    public int f38992a;

    /* renamed from: b  reason: collision with root package name */
    public o f38993b;

    /* renamed from: c  reason: collision with root package name */
    public d f38994c;

    /* renamed from: d  reason: collision with root package name */
    public io.p<? super i, ? super Integer, wn.v> f38995d;

    /* renamed from: e  reason: collision with root package name */
    public int f38996e;

    /* renamed from: f  reason: collision with root package name */
    public m0.a f38997f;

    /* renamed from: g  reason: collision with root package name */
    public m0.b<x<?>, Object> f38998g;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<l, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39000x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m0.a f39001y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, m0.a aVar) {
            super(1);
            this.f39000x = i10;
            this.f39001y = aVar;
        }

        public final void a(l lVar) {
            jo.p.h(lVar, "composition");
            if (f1.this.f38996e == this.f39000x && jo.p.c(this.f39001y, f1.this.f38997f) && (lVar instanceof o)) {
                m0.a aVar = this.f39001y;
                int i10 = this.f39000x;
                f1 f1Var = f1.this;
                int e10 = aVar.e();
                int i11 = 0;
                for (int i12 = 0; i12 < e10; i12++) {
                    Object obj = aVar.d()[i12];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = aVar.f()[i12];
                    boolean z10 = i13 != i10;
                    if (z10) {
                        o oVar = (o) lVar;
                        oVar.D(obj, f1Var);
                        x<?> xVar = obj instanceof x ? (x) obj : null;
                        if (xVar != null) {
                            oVar.C(xVar);
                            m0.b bVar = f1Var.f38998g;
                            if (bVar != null) {
                                bVar.i(xVar);
                                if (bVar.f() == 0) {
                                    f1Var.f38998g = null;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            aVar.d()[i11] = obj;
                            aVar.f()[i11] = i13;
                        }
                        i11++;
                    }
                }
                int e11 = aVar.e();
                for (int i14 = i11; i14 < e11; i14++) {
                    aVar.d()[i14] = null;
                }
                aVar.g(i11);
                if (this.f39001y.e() == 0) {
                    f1.this.f38997f = null;
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l lVar) {
            a(lVar);
            return wn.v.f59242a;
        }
    }

    public f1(o oVar) {
        this.f38993b = oVar;
    }

    public final void A(d dVar) {
        this.f38994c = dVar;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f38992a |= 2;
        } else {
            this.f38992a &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.f38992a |= 4;
        } else {
            this.f38992a &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.f38992a |= 8;
        } else {
            this.f38992a &= -9;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            this.f38992a |= 32;
        } else {
            this.f38992a &= -33;
        }
    }

    public final void F(boolean z10) {
        if (z10) {
            this.f38992a |= 16;
        } else {
            this.f38992a &= -17;
        }
    }

    public final void G(boolean z10) {
        if (z10) {
            this.f38992a |= 1;
        } else {
            this.f38992a &= -2;
        }
    }

    public final void H(int i10) {
        this.f38996e = i10;
        F(false);
    }

    @Override // l0.l1
    public void a(io.p<? super i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "block");
        this.f38995d = pVar;
    }

    public final void g(o oVar) {
        jo.p.h(oVar, "composition");
        this.f38993b = oVar;
    }

    public final void h(i iVar) {
        wn.v vVar;
        jo.p.h(iVar, "composer");
        io.p<? super i, ? super Integer, wn.v> pVar = this.f38995d;
        if (pVar != null) {
            pVar.invoke(iVar, 1);
            vVar = wn.v.f59242a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final io.l<l, wn.v> i(int i10) {
        m0.a aVar = this.f38997f;
        if (aVar == null || q()) {
            return null;
        }
        int e10 = aVar.e();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= e10) {
                break;
            }
            Objects.requireNonNull(aVar.d()[i11], "null cannot be cast to non-null type kotlin.Any");
            if (aVar.f()[i11] != i10) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return new a(i10, aVar);
        }
        return null;
    }

    @Override // l0.e1
    public void invalidate() {
        o oVar = this.f38993b;
        if (oVar != null) {
            oVar.z(this, null);
        }
    }

    public final d j() {
        return this.f38994c;
    }

    public final boolean k() {
        return this.f38995d != null;
    }

    public final o l() {
        return this.f38993b;
    }

    public final boolean m() {
        return (this.f38992a & 2) != 0;
    }

    public final boolean n() {
        return (this.f38992a & 4) != 0;
    }

    public final boolean o() {
        return (this.f38992a & 8) != 0;
    }

    public final boolean p() {
        return (this.f38992a & 32) != 0;
    }

    public final boolean q() {
        return (this.f38992a & 16) != 0;
    }

    public final boolean r() {
        return (this.f38992a & 1) != 0;
    }

    public final boolean s() {
        if (this.f38993b != null) {
            d dVar = this.f38994c;
            return dVar != null ? dVar.b() : false;
        }
        return false;
    }

    public final h0 t(Object obj) {
        h0 z10;
        o oVar = this.f38993b;
        return (oVar == null || (z10 = oVar.z(this, obj)) == null) ? h0.IGNORED : z10;
    }

    public final boolean u() {
        return this.f38998g != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(m0.c<Object> cVar) {
        m0.b<x<?>, Object> bVar;
        boolean z10;
        boolean z11;
        if (cVar != null && (bVar = this.f38998g) != 0 && cVar.k()) {
            if (!cVar.isEmpty()) {
                for (Object obj : cVar) {
                    if ((obj instanceof x) && jo.p.c(bVar.d(obj), ((x) obj).c())) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        return true;
    }

    public final void w(Object obj) {
        jo.p.h(obj, "instance");
        if (p()) {
            return;
        }
        m0.a aVar = this.f38997f;
        if (aVar == null) {
            aVar = new m0.a();
            this.f38997f = aVar;
        }
        aVar.a(obj, this.f38996e);
        if (obj instanceof x) {
            m0.b<x<?>, Object> bVar = this.f38998g;
            if (bVar == null) {
                bVar = new m0.b<>(0, 1, null);
                this.f38998g = bVar;
            }
            bVar.j(obj, ((x) obj).c());
        }
    }

    public final void x() {
        this.f38993b = null;
        this.f38997f = null;
        this.f38998g = null;
    }

    public final void y() {
        m0.a aVar;
        o oVar = this.f38993b;
        if (oVar == null || (aVar = this.f38997f) == null) {
            return;
        }
        E(true);
        try {
            int e10 = aVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                Object obj = aVar.d()[i10];
                if (obj != null) {
                    int i11 = aVar.f()[i10];
                    oVar.o(obj);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            }
        } finally {
            E(false);
        }
    }

    public final void z() {
        F(true);
    }
}
