package u2;

import u2.f;

/* loaded from: classes.dex */
public class k extends p {
    public k(t2.e eVar) {
        super(eVar);
    }

    @Override // u2.p, u2.d
    public void a(d dVar) {
        t2.a aVar = (t2.a) this.f54348b;
        int m12 = aVar.m1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f54354h.f54314l) {
            int i12 = fVar.f54309g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (m12 != 0 && m12 != 2) {
            this.f54354h.d(i10 + aVar.n1());
        } else {
            this.f54354h.d(i11 + aVar.n1());
        }
    }

    @Override // u2.p
    public void d() {
        t2.e eVar = this.f54348b;
        if (eVar instanceof t2.a) {
            this.f54354h.f54304b = true;
            t2.a aVar = (t2.a) eVar;
            int m12 = aVar.m1();
            boolean l12 = aVar.l1();
            int i10 = 0;
            if (m12 == 0) {
                this.f54354h.f54307e = f.a.LEFT;
                while (i10 < aVar.K0) {
                    t2.e eVar2 = aVar.J0[i10];
                    if (l12 || eVar2.Q() != 8) {
                        f fVar = eVar2.f53061e.f54354h;
                        fVar.f54313k.add(this.f54354h);
                        this.f54354h.f54314l.add(fVar);
                    }
                    i10++;
                }
                q(this.f54348b.f53061e.f54354h);
                q(this.f54348b.f53061e.f54355i);
            } else if (m12 == 1) {
                this.f54354h.f54307e = f.a.RIGHT;
                while (i10 < aVar.K0) {
                    t2.e eVar3 = aVar.J0[i10];
                    if (l12 || eVar3.Q() != 8) {
                        f fVar2 = eVar3.f53061e.f54355i;
                        fVar2.f54313k.add(this.f54354h);
                        this.f54354h.f54314l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f54348b.f53061e.f54354h);
                q(this.f54348b.f53061e.f54355i);
            } else if (m12 == 2) {
                this.f54354h.f54307e = f.a.TOP;
                while (i10 < aVar.K0) {
                    t2.e eVar4 = aVar.J0[i10];
                    if (l12 || eVar4.Q() != 8) {
                        f fVar3 = eVar4.f53063f.f54354h;
                        fVar3.f54313k.add(this.f54354h);
                        this.f54354h.f54314l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f54348b.f53063f.f54354h);
                q(this.f54348b.f53063f.f54355i);
            } else if (m12 != 3) {
            } else {
                this.f54354h.f54307e = f.a.BOTTOM;
                while (i10 < aVar.K0) {
                    t2.e eVar5 = aVar.J0[i10];
                    if (l12 || eVar5.Q() != 8) {
                        f fVar4 = eVar5.f53063f.f54355i;
                        fVar4.f54313k.add(this.f54354h);
                        this.f54354h.f54314l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f54348b.f53063f.f54354h);
                q(this.f54348b.f53063f.f54355i);
            }
        }
    }

    @Override // u2.p
    public void e() {
        t2.e eVar = this.f54348b;
        if (eVar instanceof t2.a) {
            int m12 = ((t2.a) eVar).m1();
            if (m12 != 0 && m12 != 1) {
                this.f54348b.e1(this.f54354h.f54309g);
            } else {
                this.f54348b.d1(this.f54354h.f54309g);
            }
        }
    }

    @Override // u2.p
    public void f() {
        this.f54349c = null;
        this.f54354h.c();
    }

    @Override // u2.p
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f54354h.f54313k.add(fVar);
        fVar.f54314l.add(this.f54354h);
    }
}
