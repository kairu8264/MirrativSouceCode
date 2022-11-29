package u2;

import t2.d;
import t2.e;
import u2.f;
import u2.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f54319k = new int[2];

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54320a;

        static {
            int[] iArr = new int[p.b.values().length];
            f54320a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54320a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54320a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(t2.e eVar) {
        super(eVar);
        this.f54354h.f54307e = f.a.LEFT;
        this.f54355i.f54307e = f.a.RIGHT;
        this.f54352f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // u2.p, u2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u2.d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.l.a(u2.d):void");
    }

    @Override // u2.p
    public void d() {
        t2.e I;
        t2.e I2;
        t2.e eVar = this.f54348b;
        if (eVar.f53053a) {
            this.f54351e.d(eVar.R());
        }
        if (!this.f54351e.f54312j) {
            e.b y10 = this.f54348b.y();
            this.f54350d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (I2 = this.f54348b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar)) {
                    int R = (I2.R() - this.f54348b.N.e()) - this.f54348b.P.e();
                    b(this.f54354h, I2.f53061e.f54354h, this.f54348b.N.e());
                    b(this.f54355i, I2.f53061e.f54355i, -this.f54348b.P.e());
                    this.f54351e.d(R);
                    return;
                } else if (this.f54350d == e.b.FIXED) {
                    this.f54351e.d(this.f54348b.R());
                }
            }
        } else {
            e.b bVar2 = this.f54350d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f54348b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar3)) {
                b(this.f54354h, I.f53061e.f54354h, this.f54348b.N.e());
                b(this.f54355i, I.f53061e.f54355i, -this.f54348b.P.e());
                return;
            }
        }
        g gVar = this.f54351e;
        if (gVar.f54312j) {
            t2.e eVar2 = this.f54348b;
            if (eVar2.f53053a) {
                t2.d[] dVarArr = eVar2.V;
                if (dVarArr[0].f53048f != null && dVarArr[1].f53048f != null) {
                    if (eVar2.d0()) {
                        this.f54354h.f54308f = this.f54348b.V[0].e();
                        this.f54355i.f54308f = -this.f54348b.V[1].e();
                        return;
                    }
                    f h10 = h(this.f54348b.V[0]);
                    if (h10 != null) {
                        b(this.f54354h, h10, this.f54348b.V[0].e());
                    }
                    f h11 = h(this.f54348b.V[1]);
                    if (h11 != null) {
                        b(this.f54355i, h11, -this.f54348b.V[1].e());
                    }
                    this.f54354h.f54304b = true;
                    this.f54355i.f54304b = true;
                    return;
                } else if (dVarArr[0].f53048f != null) {
                    f h12 = h(dVarArr[0]);
                    if (h12 != null) {
                        b(this.f54354h, h12, this.f54348b.V[0].e());
                        b(this.f54355i, this.f54354h, this.f54351e.f54309g);
                        return;
                    }
                    return;
                } else if (dVarArr[1].f53048f != null) {
                    f h13 = h(dVarArr[1]);
                    if (h13 != null) {
                        b(this.f54355i, h13, -this.f54348b.V[1].e());
                        b(this.f54354h, this.f54355i, -this.f54351e.f54309g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof t2.h) || eVar2.I() == null || this.f54348b.m(d.b.CENTER).f53048f != null) {
                    return;
                } else {
                    b(this.f54354h, this.f54348b.I().f53061e.f54354h, this.f54348b.S());
                    b(this.f54355i, this.f54354h, this.f54351e.f54309g);
                    return;
                }
            }
        }
        if (this.f54350d == e.b.MATCH_CONSTRAINT) {
            t2.e eVar3 = this.f54348b;
            int i10 = eVar3.f53095v;
            if (i10 == 2) {
                t2.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f53063f.f54351e;
                    this.f54351e.f54314l.add(gVar2);
                    gVar2.f54313k.add(this.f54351e);
                    g gVar3 = this.f54351e;
                    gVar3.f54304b = true;
                    gVar3.f54313k.add(this.f54354h);
                    this.f54351e.f54313k.add(this.f54355i);
                }
            } else if (i10 == 3) {
                if (eVar3.f53097w == 3) {
                    this.f54354h.f54303a = this;
                    this.f54355i.f54303a = this;
                    n nVar = eVar3.f53063f;
                    nVar.f54354h.f54303a = this;
                    nVar.f54355i.f54303a = this;
                    gVar.f54303a = this;
                    if (eVar3.f0()) {
                        this.f54351e.f54314l.add(this.f54348b.f53063f.f54351e);
                        this.f54348b.f53063f.f54351e.f54313k.add(this.f54351e);
                        n nVar2 = this.f54348b.f53063f;
                        nVar2.f54351e.f54303a = this;
                        this.f54351e.f54314l.add(nVar2.f54354h);
                        this.f54351e.f54314l.add(this.f54348b.f53063f.f54355i);
                        this.f54348b.f53063f.f54354h.f54313k.add(this.f54351e);
                        this.f54348b.f53063f.f54355i.f54313k.add(this.f54351e);
                    } else if (this.f54348b.d0()) {
                        this.f54348b.f53063f.f54351e.f54314l.add(this.f54351e);
                        this.f54351e.f54313k.add(this.f54348b.f53063f.f54351e);
                    } else {
                        this.f54348b.f53063f.f54351e.f54314l.add(this.f54351e);
                    }
                } else {
                    g gVar4 = eVar3.f53063f.f54351e;
                    gVar.f54314l.add(gVar4);
                    gVar4.f54313k.add(this.f54351e);
                    this.f54348b.f53063f.f54354h.f54313k.add(this.f54351e);
                    this.f54348b.f53063f.f54355i.f54313k.add(this.f54351e);
                    g gVar5 = this.f54351e;
                    gVar5.f54304b = true;
                    gVar5.f54313k.add(this.f54354h);
                    this.f54351e.f54313k.add(this.f54355i);
                    this.f54354h.f54314l.add(this.f54351e);
                    this.f54355i.f54314l.add(this.f54351e);
                }
            }
        }
        t2.e eVar4 = this.f54348b;
        t2.d[] dVarArr2 = eVar4.V;
        if (dVarArr2[0].f53048f != null && dVarArr2[1].f53048f != null) {
            if (eVar4.d0()) {
                this.f54354h.f54308f = this.f54348b.V[0].e();
                this.f54355i.f54308f = -this.f54348b.V[1].e();
                return;
            }
            f h14 = h(this.f54348b.V[0]);
            f h15 = h(this.f54348b.V[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f54356j = p.b.CENTER;
        } else if (dVarArr2[0].f53048f != null) {
            f h16 = h(dVarArr2[0]);
            if (h16 != null) {
                b(this.f54354h, h16, this.f54348b.V[0].e());
                c(this.f54355i, this.f54354h, 1, this.f54351e);
            }
        } else if (dVarArr2[1].f53048f != null) {
            f h17 = h(dVarArr2[1]);
            if (h17 != null) {
                b(this.f54355i, h17, -this.f54348b.V[1].e());
                c(this.f54354h, this.f54355i, -1, this.f54351e);
            }
        } else if ((eVar4 instanceof t2.h) || eVar4.I() == null) {
        } else {
            b(this.f54354h, this.f54348b.I().f53061e.f54354h, this.f54348b.S());
            c(this.f54355i, this.f54354h, 1, this.f54351e);
        }
    }

    @Override // u2.p
    public void e() {
        f fVar = this.f54354h;
        if (fVar.f54312j) {
            this.f54348b.d1(fVar.f54309g);
        }
    }

    @Override // u2.p
    public void f() {
        this.f54349c = null;
        this.f54354h.c();
        this.f54355i.c();
        this.f54351e.c();
        this.f54353g = false;
    }

    @Override // u2.p
    public boolean m() {
        return this.f54350d != e.b.MATCH_CONSTRAINT || this.f54348b.f53095v == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f54353g = false;
        this.f54354h.c();
        this.f54354h.f54312j = false;
        this.f54355i.c();
        this.f54355i.f54312j = false;
        this.f54351e.f54312j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f54348b.r();
    }
}
