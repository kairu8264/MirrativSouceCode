package u2;

import t2.d;
import t2.e;
import u2.f;
import u2.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f54329k;

    /* renamed from: l  reason: collision with root package name */
    public g f54330l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54331a;

        static {
            int[] iArr = new int[p.b.values().length];
            f54331a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54331a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54331a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(t2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f54329k = fVar;
        this.f54330l = null;
        this.f54354h.f54307e = f.a.TOP;
        this.f54355i.f54307e = f.a.BOTTOM;
        fVar.f54307e = f.a.BASELINE;
        this.f54352f = 1;
    }

    @Override // u2.p, u2.d
    public void a(d dVar) {
        g gVar;
        float f10;
        float t10;
        float f11;
        int i10;
        t2.e eVar;
        int i11 = a.f54331a[this.f54356j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            t2.e eVar2 = this.f54348b;
            n(dVar, eVar2.O, eVar2.Q, 1);
            return;
        }
        g gVar2 = this.f54351e;
        if (gVar2.f54305c && !gVar2.f54312j && this.f54350d == e.b.MATCH_CONSTRAINT) {
            t2.e eVar3 = this.f54348b;
            int i12 = eVar3.f53097w;
            if (i12 != 2) {
                if (i12 == 3 && eVar3.f53061e.f54351e.f54312j) {
                    int u10 = eVar3.u();
                    if (u10 == -1) {
                        t2.e eVar4 = this.f54348b;
                        f10 = eVar4.f53061e.f54351e.f54309g;
                        t10 = eVar4.t();
                    } else if (u10 == 0) {
                        f11 = eVar.f53061e.f54351e.f54309g * this.f54348b.t();
                        i10 = (int) (f11 + 0.5f);
                        this.f54351e.d(i10);
                    } else if (u10 == 1) {
                        t2.e eVar5 = this.f54348b;
                        f10 = eVar5.f53061e.f54351e.f54309g;
                        t10 = eVar5.t();
                    } else {
                        i10 = 0;
                        this.f54351e.d(i10);
                    }
                    f11 = f10 / t10;
                    i10 = (int) (f11 + 0.5f);
                    this.f54351e.d(i10);
                }
            } else {
                t2.e I = eVar3.I();
                if (I != null) {
                    if (I.f53063f.f54351e.f54312j) {
                        this.f54351e.d((int) ((gVar.f54309g * this.f54348b.D) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f54354h;
        if (fVar.f54305c) {
            f fVar2 = this.f54355i;
            if (fVar2.f54305c) {
                if (fVar.f54312j && fVar2.f54312j && this.f54351e.f54312j) {
                    return;
                }
                if (!this.f54351e.f54312j && this.f54350d == e.b.MATCH_CONSTRAINT) {
                    t2.e eVar6 = this.f54348b;
                    if (eVar6.f53095v == 0 && !eVar6.f0()) {
                        int i13 = this.f54354h.f54314l.get(0).f54309g;
                        f fVar3 = this.f54354h;
                        int i14 = i13 + fVar3.f54308f;
                        int i15 = this.f54355i.f54314l.get(0).f54309g + this.f54355i.f54308f;
                        fVar3.d(i14);
                        this.f54355i.d(i15);
                        this.f54351e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f54351e.f54312j && this.f54350d == e.b.MATCH_CONSTRAINT && this.f54347a == 1 && this.f54354h.f54314l.size() > 0 && this.f54355i.f54314l.size() > 0) {
                    int i16 = (this.f54355i.f54314l.get(0).f54309g + this.f54355i.f54308f) - (this.f54354h.f54314l.get(0).f54309g + this.f54354h.f54308f);
                    g gVar3 = this.f54351e;
                    int i17 = gVar3.f54315m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f54351e.f54312j && this.f54354h.f54314l.size() > 0 && this.f54355i.f54314l.size() > 0) {
                    f fVar4 = this.f54354h.f54314l.get(0);
                    f fVar5 = this.f54355i.f54314l.get(0);
                    int i18 = fVar4.f54309g + this.f54354h.f54308f;
                    int i19 = fVar5.f54309g + this.f54355i.f54308f;
                    float M = this.f54348b.M();
                    if (fVar4 == fVar5) {
                        i18 = fVar4.f54309g;
                        i19 = fVar5.f54309g;
                        M = 0.5f;
                    }
                    this.f54354h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f54351e.f54309g) * M)));
                    this.f54355i.d(this.f54354h.f54309g + this.f54351e.f54309g);
                }
            }
        }
    }

    @Override // u2.p
    public void d() {
        t2.e I;
        t2.e I2;
        t2.e eVar = this.f54348b;
        if (eVar.f53053a) {
            this.f54351e.d(eVar.v());
        }
        if (!this.f54351e.f54312j) {
            this.f54350d = this.f54348b.O();
            if (this.f54348b.U()) {
                this.f54330l = new u2.a(this);
            }
            e.b bVar = this.f54350d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f54348b.I()) != null && I2.O() == e.b.FIXED) {
                    int v10 = (I2.v() - this.f54348b.O.e()) - this.f54348b.Q.e();
                    b(this.f54354h, I2.f53063f.f54354h, this.f54348b.O.e());
                    b(this.f54355i, I2.f53063f.f54355i, -this.f54348b.Q.e());
                    this.f54351e.d(v10);
                    return;
                } else if (this.f54350d == e.b.FIXED) {
                    this.f54351e.d(this.f54348b.v());
                }
            }
        } else if (this.f54350d == e.b.MATCH_PARENT && (I = this.f54348b.I()) != null && I.O() == e.b.FIXED) {
            b(this.f54354h, I.f53063f.f54354h, this.f54348b.O.e());
            b(this.f54355i, I.f53063f.f54355i, -this.f54348b.Q.e());
            return;
        }
        g gVar = this.f54351e;
        boolean z10 = gVar.f54312j;
        if (z10) {
            t2.e eVar2 = this.f54348b;
            if (eVar2.f53053a) {
                t2.d[] dVarArr = eVar2.V;
                if (dVarArr[2].f53048f != null && dVarArr[3].f53048f != null) {
                    if (eVar2.f0()) {
                        this.f54354h.f54308f = this.f54348b.V[2].e();
                        this.f54355i.f54308f = -this.f54348b.V[3].e();
                    } else {
                        f h10 = h(this.f54348b.V[2]);
                        if (h10 != null) {
                            b(this.f54354h, h10, this.f54348b.V[2].e());
                        }
                        f h11 = h(this.f54348b.V[3]);
                        if (h11 != null) {
                            b(this.f54355i, h11, -this.f54348b.V[3].e());
                        }
                        this.f54354h.f54304b = true;
                        this.f54355i.f54304b = true;
                    }
                    if (this.f54348b.U()) {
                        b(this.f54329k, this.f54354h, this.f54348b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f53048f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        b(this.f54354h, h12, this.f54348b.V[2].e());
                        b(this.f54355i, this.f54354h, this.f54351e.f54309g);
                        if (this.f54348b.U()) {
                            b(this.f54329k, this.f54354h, this.f54348b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f53048f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        b(this.f54355i, h13, -this.f54348b.V[3].e());
                        b(this.f54354h, this.f54355i, -this.f54351e.f54309g);
                    }
                    if (this.f54348b.U()) {
                        b(this.f54329k, this.f54354h, this.f54348b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f53048f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        b(this.f54329k, h14, 0);
                        b(this.f54354h, this.f54329k, -this.f54348b.n());
                        b(this.f54355i, this.f54354h, this.f54351e.f54309g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof t2.h) || eVar2.I() == null || this.f54348b.m(d.b.CENTER).f53048f != null) {
                    return;
                } else {
                    b(this.f54354h, this.f54348b.I().f53063f.f54354h, this.f54348b.T());
                    b(this.f54355i, this.f54354h, this.f54351e.f54309g);
                    if (this.f54348b.U()) {
                        b(this.f54329k, this.f54354h, this.f54348b.n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z10 && this.f54350d == e.b.MATCH_CONSTRAINT) {
            t2.e eVar3 = this.f54348b;
            int i10 = eVar3.f53097w;
            if (i10 != 2) {
                if (i10 == 3 && !eVar3.f0()) {
                    t2.e eVar4 = this.f54348b;
                    if (eVar4.f53095v != 3) {
                        g gVar2 = eVar4.f53061e.f54351e;
                        this.f54351e.f54314l.add(gVar2);
                        gVar2.f54313k.add(this.f54351e);
                        g gVar3 = this.f54351e;
                        gVar3.f54304b = true;
                        gVar3.f54313k.add(this.f54354h);
                        this.f54351e.f54313k.add(this.f54355i);
                    }
                }
            } else {
                t2.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar4 = I3.f53063f.f54351e;
                    this.f54351e.f54314l.add(gVar4);
                    gVar4.f54313k.add(this.f54351e);
                    g gVar5 = this.f54351e;
                    gVar5.f54304b = true;
                    gVar5.f54313k.add(this.f54354h);
                    this.f54351e.f54313k.add(this.f54355i);
                }
            }
        } else {
            gVar.b(this);
        }
        t2.e eVar5 = this.f54348b;
        t2.d[] dVarArr2 = eVar5.V;
        if (dVarArr2[2].f53048f != null && dVarArr2[3].f53048f != null) {
            if (eVar5.f0()) {
                this.f54354h.f54308f = this.f54348b.V[2].e();
                this.f54355i.f54308f = -this.f54348b.V[3].e();
            } else {
                f h15 = h(this.f54348b.V[2]);
                f h16 = h(this.f54348b.V[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f54356j = p.b.CENTER;
            }
            if (this.f54348b.U()) {
                c(this.f54329k, this.f54354h, 1, this.f54330l);
            }
        } else if (dVarArr2[2].f53048f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                b(this.f54354h, h17, this.f54348b.V[2].e());
                c(this.f54355i, this.f54354h, 1, this.f54351e);
                if (this.f54348b.U()) {
                    c(this.f54329k, this.f54354h, 1, this.f54330l);
                }
                e.b bVar2 = this.f54350d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f54348b.t() > 0.0f) {
                    l lVar = this.f54348b.f53061e;
                    if (lVar.f54350d == bVar3) {
                        lVar.f54351e.f54313k.add(this.f54351e);
                        this.f54351e.f54314l.add(this.f54348b.f53061e.f54351e);
                        this.f54351e.f54303a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f53048f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                b(this.f54355i, h18, -this.f54348b.V[3].e());
                c(this.f54354h, this.f54355i, -1, this.f54351e);
                if (this.f54348b.U()) {
                    c(this.f54329k, this.f54354h, 1, this.f54330l);
                }
            }
        } else if (dVarArr2[4].f53048f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                b(this.f54329k, h19, 0);
                c(this.f54354h, this.f54329k, -1, this.f54330l);
                c(this.f54355i, this.f54354h, 1, this.f54351e);
            }
        } else if (!(eVar5 instanceof t2.h) && eVar5.I() != null) {
            b(this.f54354h, this.f54348b.I().f53063f.f54354h, this.f54348b.T());
            c(this.f54355i, this.f54354h, 1, this.f54351e);
            if (this.f54348b.U()) {
                c(this.f54329k, this.f54354h, 1, this.f54330l);
            }
            e.b bVar4 = this.f54350d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f54348b.t() > 0.0f) {
                l lVar2 = this.f54348b.f53061e;
                if (lVar2.f54350d == bVar5) {
                    lVar2.f54351e.f54313k.add(this.f54351e);
                    this.f54351e.f54314l.add(this.f54348b.f53061e.f54351e);
                    this.f54351e.f54303a = this;
                }
            }
        }
        if (this.f54351e.f54314l.size() == 0) {
            this.f54351e.f54305c = true;
        }
    }

    @Override // u2.p
    public void e() {
        f fVar = this.f54354h;
        if (fVar.f54312j) {
            this.f54348b.e1(fVar.f54309g);
        }
    }

    @Override // u2.p
    public void f() {
        this.f54349c = null;
        this.f54354h.c();
        this.f54355i.c();
        this.f54329k.c();
        this.f54351e.c();
        this.f54353g = false;
    }

    @Override // u2.p
    public boolean m() {
        return this.f54350d != e.b.MATCH_CONSTRAINT || this.f54348b.f53097w == 0;
    }

    public void q() {
        this.f54353g = false;
        this.f54354h.c();
        this.f54354h.f54312j = false;
        this.f54355i.c();
        this.f54355i.f54312j = false;
        this.f54329k.c();
        this.f54329k.f54312j = false;
        this.f54351e.f54312j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f54348b.r();
    }
}
