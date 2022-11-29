package q1;

/* loaded from: classes.dex */
public final class h implements b0 {

    /* renamed from: w  reason: collision with root package name */
    public final l f48582w;

    /* renamed from: x  reason: collision with root package name */
    public final n f48583x;

    /* renamed from: y  reason: collision with root package name */
    public final o f48584y;

    public h(l lVar, n nVar, o oVar) {
        jo.p.h(lVar, "measurable");
        jo.p.h(nVar, "minMax");
        jo.p.h(oVar, "widthHeight");
        this.f48582w = lVar;
        this.f48583x = nVar;
        this.f48584y = oVar;
    }

    @Override // q1.l
    public int E(int i10) {
        return this.f48582w.E(i10);
    }

    @Override // q1.l
    public int G(int i10) {
        return this.f48582w.G(i10);
    }

    @Override // q1.b0
    public q0 M(long j10) {
        int u10;
        int E;
        if (this.f48584y == o.Width) {
            if (this.f48583x == n.Max) {
                E = this.f48582w.G(m2.b.m(j10));
            } else {
                E = this.f48582w.E(m2.b.m(j10));
            }
            return new j(E, m2.b.m(j10));
        }
        if (this.f48583x == n.Max) {
            u10 = this.f48582w.e(m2.b.n(j10));
        } else {
            u10 = this.f48582w.u(m2.b.n(j10));
        }
        return new j(m2.b.n(j10), u10);
    }

    @Override // q1.l
    public Object d() {
        return this.f48582w.d();
    }

    @Override // q1.l
    public int e(int i10) {
        return this.f48582w.e(i10);
    }

    @Override // q1.l
    public int u(int i10) {
        return this.f48582w.u(i10);
    }
}
