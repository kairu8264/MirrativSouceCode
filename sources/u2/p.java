package u2;

import t2.d;
import t2.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f54347a;

    /* renamed from: b  reason: collision with root package name */
    public t2.e f54348b;

    /* renamed from: c  reason: collision with root package name */
    public m f54349c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f54350d;

    /* renamed from: e  reason: collision with root package name */
    public g f54351e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f54352f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f54353g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f54354h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f54355i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f54356j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54357a;

        static {
            int[] iArr = new int[d.b.values().length];
            f54357a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54357a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54357a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54357a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54357a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(t2.e eVar) {
        this.f54348b = eVar;
    }

    @Override // u2.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f54314l.add(fVar2);
        fVar.f54308f = i10;
        fVar2.f54313k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f54314l.add(fVar2);
        fVar.f54314l.add(this.f54351e);
        fVar.f54310h = i10;
        fVar.f54311i = gVar;
        fVar2.f54313k.add(fVar);
        gVar.f54313k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            t2.e eVar = this.f54348b;
            int i12 = eVar.f53103z;
            max = Math.max(eVar.f53101y, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            t2.e eVar2 = this.f54348b;
            int i13 = eVar2.C;
            max = Math.max(eVar2.B, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public final f h(t2.d dVar) {
        t2.d dVar2 = dVar.f53048f;
        if (dVar2 == null) {
            return null;
        }
        t2.e eVar = dVar2.f53046d;
        int i10 = a.f54357a[dVar2.f53047e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return eVar.f53063f.f54355i;
                    }
                    return eVar.f53063f.f54329k;
                }
                return eVar.f53063f.f54354h;
            }
            return eVar.f53061e.f54355i;
        }
        return eVar.f53061e.f54354h;
    }

    public final f i(t2.d dVar, int i10) {
        t2.d dVar2 = dVar.f53048f;
        if (dVar2 == null) {
            return null;
        }
        t2.e eVar = dVar2.f53046d;
        p pVar = i10 == 0 ? eVar.f53061e : eVar.f53063f;
        int i11 = a.f54357a[dVar2.f53047e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f54355i;
        }
        return pVar.f54354h;
    }

    public long j() {
        g gVar = this.f54351e;
        if (gVar.f54312j) {
            return gVar.f54309g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f54353g;
    }

    public final void l(int i10, int i11) {
        int i12;
        int i13 = this.f54347a;
        if (i13 == 0) {
            this.f54351e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f54351e.d(Math.min(g(this.f54351e.f54315m, i10), i11));
        } else if (i13 == 2) {
            t2.e I = this.f54348b.I();
            if (I != null) {
                g gVar = (i10 == 0 ? I.f53061e : I.f53063f).f54351e;
                if (gVar.f54312j) {
                    t2.e eVar = this.f54348b;
                    this.f54351e.d(g((int) ((gVar.f54309g * (i10 == 0 ? eVar.A : eVar.D)) + 0.5f), i10));
                }
            }
        } else if (i13 != 3) {
        } else {
            t2.e eVar2 = this.f54348b;
            p pVar = eVar2.f53061e;
            e.b bVar = pVar.f54350d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f54347a == 3) {
                n nVar = eVar2.f53063f;
                if (nVar.f54350d == bVar2 && nVar.f54347a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar2.f53063f;
            }
            if (pVar.f54351e.f54312j) {
                float t10 = eVar2.t();
                if (i10 == 1) {
                    i12 = (int) ((pVar.f54351e.f54309g / t10) + 0.5f);
                } else {
                    i12 = (int) ((t10 * pVar.f54351e.f54309g) + 0.5f);
                }
                this.f54351e.d(i12);
            }
        }
    }

    public abstract boolean m();

    public void n(d dVar, t2.d dVar2, t2.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f54312j && h11.f54312j) {
            int e10 = h10.f54309g + dVar2.e();
            int e11 = h11.f54309g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f54351e.f54312j && this.f54350d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f54351e;
            if (gVar.f54312j) {
                if (gVar.f54309g == i11) {
                    this.f54354h.d(e10);
                    this.f54355i.d(e11);
                    return;
                }
                t2.e eVar = this.f54348b;
                float w10 = i10 == 0 ? eVar.w() : eVar.M();
                if (h10 == h11) {
                    e10 = h10.f54309g;
                    e11 = h11.f54309g;
                    w10 = 0.5f;
                }
                this.f54354h.d((int) (e10 + 0.5f + (((e11 - e10) - this.f54351e.f54309g) * w10)));
                this.f54355i.d(this.f54354h.f54309g + this.f54351e.f54309g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
