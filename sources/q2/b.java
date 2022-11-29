package q2;

import java.util.ArrayList;
import q2.d;
import q2.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e  reason: collision with root package name */
    public a f48652e;

    /* renamed from: a  reason: collision with root package name */
    public i f48648a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f48649b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48650c = false;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<i> f48651d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f48653f = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar, float f10);

        i b(int i10);

        boolean c(i iVar);

        void clear();

        void d();

        float e(i iVar);

        void f(i iVar, float f10, boolean z10);

        float g(i iVar, boolean z10);

        int h();

        float i(b bVar, boolean z10);

        float j(int i10);

        void k(float f10);
    }

    public b() {
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.C) {
            return;
        }
        this.f48649b += iVar.B * this.f48652e.e(iVar);
        this.f48652e.g(iVar, z10);
        if (z10) {
            iVar.h(this);
        }
        if (d.f48660t && this.f48652e.h() == 0) {
            this.f48653f = true;
            dVar.f48667a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f48649b += bVar.f48649b * this.f48652e.i(bVar, z10);
        if (z10) {
            bVar.f48648a.h(this);
        }
        if (d.f48660t && this.f48648a != null && this.f48652e.h() == 0) {
            this.f48653f = true;
            dVar.f48667a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.J) {
            return;
        }
        float e10 = this.f48652e.e(iVar);
        this.f48649b += iVar.L * e10;
        this.f48652e.g(iVar, z10);
        if (z10) {
            iVar.h(this);
        }
        this.f48652e.f(dVar.f48680n.f48657d[iVar.K], e10, z10);
        if (d.f48660t && this.f48652e.h() == 0) {
            this.f48653f = true;
            dVar.f48667a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f48673g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int h10 = this.f48652e.h();
            for (int i10 = 0; i10 < h10; i10++) {
                i b10 = this.f48652e.b(i10);
                if (b10.f48700z != -1 || b10.C || b10.J) {
                    this.f48651d.add(b10);
                }
            }
            int size = this.f48651d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f48651d.get(i11);
                    if (iVar.C) {
                        A(dVar, iVar, true);
                    } else if (iVar.J) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f48673g[iVar.f48700z], true);
                    }
                }
                this.f48651d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f48660t && this.f48648a != null && this.f48652e.h() == 0) {
            this.f48653f = true;
            dVar.f48667a = true;
        }
    }

    @Override // q2.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f48648a = null;
            this.f48652e.clear();
            for (int i10 = 0; i10 < bVar.f48652e.h(); i10++) {
                this.f48652e.f(bVar.f48652e.b(i10), bVar.f48652e.j(i10), true);
            }
        }
    }

    @Override // q2.d.a
    public void b(i iVar) {
        int i10 = iVar.A;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f48652e.a(iVar, f10);
    }

    @Override // q2.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // q2.d.a
    public void clear() {
        this.f48652e.clear();
        this.f48648a = null;
        this.f48649b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f48652e.a(dVar.o(i10, "ep"), 1.0f);
        this.f48652e.a(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f48652e.a(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f48652e.h() == 0) {
            this.f48653f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        boolean u10;
        boolean u11;
        int h10 = this.f48652e.h();
        i iVar = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        i iVar2 = null;
        for (int i10 = 0; i10 < h10; i10++) {
            float j10 = this.f48652e.j(i10);
            i b10 = this.f48652e.b(i10);
            if (b10.F == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(b10, dVar);
                } else if (f10 > j10) {
                    u11 = u(b10, dVar);
                } else if (!z10 && u(b10, dVar)) {
                    f10 = j10;
                    iVar = b10;
                    z10 = true;
                }
                z10 = u11;
                f10 = j10;
                iVar = b10;
            } else if (iVar == null && j10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(b10, dVar);
                } else if (f11 > j10) {
                    u10 = u(b10, dVar);
                } else if (!z11 && u(b10, dVar)) {
                    f11 = j10;
                    iVar2 = b10;
                    z11 = true;
                }
                z11 = u10;
                f11 = j10;
                iVar2 = b10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // q2.d.a
    public i getKey() {
        return this.f48648a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar4, 1.0f);
            this.f48652e.a(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
            this.f48652e.a(iVar3, -1.0f);
            this.f48652e.a(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f48649b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f48652e.a(iVar, -1.0f);
            this.f48652e.a(iVar2, 1.0f);
            this.f48649b = i10;
        } else if (f10 >= 1.0f) {
            this.f48652e.a(iVar4, -1.0f);
            this.f48652e.a(iVar3, 1.0f);
            this.f48649b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f48652e.a(iVar, f11 * 1.0f);
            this.f48652e.a(iVar2, f11 * (-1.0f));
            this.f48652e.a(iVar3, (-1.0f) * f10);
            this.f48652e.a(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f48649b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f48648a = iVar;
        float f10 = i10;
        iVar.B = f10;
        this.f48649b = f10;
        this.f48653f = true;
        return this;
    }

    @Override // q2.d.a
    public boolean isEmpty() {
        return this.f48648a == null && this.f48649b == 0.0f && this.f48652e.h() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f48652e.a(iVar, -1.0f);
        this.f48652e.a(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f48652e.a(iVar, -1.0f);
        this.f48652e.a(iVar2, 1.0f);
        this.f48652e.a(iVar3, f10);
        this.f48652e.a(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f48649b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
            this.f48652e.a(iVar4, 1.0f);
            this.f48652e.a(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f48652e.a(iVar3, 1.0f);
            this.f48652e.a(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
            this.f48652e.a(iVar4, f13);
            this.f48652e.a(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f48649b = i10 * (-1);
            this.f48652e.a(iVar, 1.0f);
        } else {
            this.f48649b = i10;
            this.f48652e.a(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f48649b = i10;
        }
        if (!z10) {
            this.f48652e.a(iVar, -1.0f);
            this.f48652e.a(iVar2, 1.0f);
        } else {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f48649b = i10;
        }
        if (!z10) {
            this.f48652e.a(iVar, -1.0f);
            this.f48652e.a(iVar2, 1.0f);
            this.f48652e.a(iVar3, 1.0f);
        } else {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
            this.f48652e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f48649b = i10;
        }
        if (!z10) {
            this.f48652e.a(iVar, -1.0f);
            this.f48652e.a(iVar2, 1.0f);
            this.f48652e.a(iVar3, -1.0f);
        } else {
            this.f48652e.a(iVar, 1.0f);
            this.f48652e.a(iVar2, -1.0f);
            this.f48652e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f48652e.a(iVar3, 0.5f);
        this.f48652e.a(iVar4, 0.5f);
        this.f48652e.a(iVar, -0.5f);
        this.f48652e.a(iVar2, -0.5f);
        this.f48649b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f48649b;
        if (f10 < 0.0f) {
            this.f48649b = f10 * (-1.0f);
            this.f48652e.d();
        }
    }

    public boolean s() {
        i iVar = this.f48648a;
        return iVar != null && (iVar.F == i.a.UNRESTRICTED || this.f48649b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f48652e.c(iVar);
    }

    public String toString() {
        return z();
    }

    public final boolean u(i iVar, d dVar) {
        return iVar.I <= 1;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public final i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int h10 = this.f48652e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < h10; i10++) {
            float j10 = this.f48652e.j(i10);
            if (j10 < 0.0f) {
                i b10 = this.f48652e.b(i10);
                if ((zArr == null || !zArr[b10.f48699y]) && b10 != iVar && (((aVar = b10.F) == i.a.SLACK || aVar == i.a.ERROR) && j10 < f10)) {
                    f10 = j10;
                    iVar2 = b10;
                }
            }
        }
        return iVar2;
    }

    public void x(i iVar) {
        i iVar2 = this.f48648a;
        if (iVar2 != null) {
            this.f48652e.a(iVar2, -1.0f);
            this.f48648a.f48700z = -1;
            this.f48648a = null;
        }
        float g10 = this.f48652e.g(iVar, true) * (-1.0f);
        this.f48648a = iVar;
        if (g10 == 1.0f) {
            return;
        }
        this.f48649b /= g10;
        this.f48652e.k(g10);
    }

    public void y() {
        this.f48648a = null;
        this.f48652e.clear();
        this.f48649b = 0.0f;
        this.f48653f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String z() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f48652e = new q2.a(this, cVar);
    }
}
