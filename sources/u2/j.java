package u2;

/* loaded from: classes.dex */
public class j extends p {
    public j(t2.e eVar) {
        super(eVar);
        eVar.f53061e.f();
        eVar.f53063f.f();
        this.f54352f = ((t2.g) eVar).j1();
    }

    @Override // u2.p, u2.d
    public void a(d dVar) {
        f fVar = this.f54354h;
        if (fVar.f54305c && !fVar.f54312j) {
            this.f54354h.d((int) ((fVar.f54314l.get(0).f54309g * ((t2.g) this.f54348b).m1()) + 0.5f));
        }
    }

    @Override // u2.p
    public void d() {
        t2.g gVar = (t2.g) this.f54348b;
        int k12 = gVar.k1();
        int l12 = gVar.l1();
        gVar.m1();
        if (gVar.j1() == 1) {
            if (k12 != -1) {
                this.f54354h.f54314l.add(this.f54348b.Z.f53061e.f54354h);
                this.f54348b.Z.f53061e.f54354h.f54313k.add(this.f54354h);
                this.f54354h.f54308f = k12;
            } else if (l12 != -1) {
                this.f54354h.f54314l.add(this.f54348b.Z.f53061e.f54355i);
                this.f54348b.Z.f53061e.f54355i.f54313k.add(this.f54354h);
                this.f54354h.f54308f = -l12;
            } else {
                f fVar = this.f54354h;
                fVar.f54304b = true;
                fVar.f54314l.add(this.f54348b.Z.f53061e.f54355i);
                this.f54348b.Z.f53061e.f54355i.f54313k.add(this.f54354h);
            }
            q(this.f54348b.f53061e.f54354h);
            q(this.f54348b.f53061e.f54355i);
            return;
        }
        if (k12 != -1) {
            this.f54354h.f54314l.add(this.f54348b.Z.f53063f.f54354h);
            this.f54348b.Z.f53063f.f54354h.f54313k.add(this.f54354h);
            this.f54354h.f54308f = k12;
        } else if (l12 != -1) {
            this.f54354h.f54314l.add(this.f54348b.Z.f53063f.f54355i);
            this.f54348b.Z.f53063f.f54355i.f54313k.add(this.f54354h);
            this.f54354h.f54308f = -l12;
        } else {
            f fVar2 = this.f54354h;
            fVar2.f54304b = true;
            fVar2.f54314l.add(this.f54348b.Z.f53063f.f54355i);
            this.f54348b.Z.f53063f.f54355i.f54313k.add(this.f54354h);
        }
        q(this.f54348b.f53063f.f54354h);
        q(this.f54348b.f53063f.f54355i);
    }

    @Override // u2.p
    public void e() {
        if (((t2.g) this.f54348b).j1() == 1) {
            this.f54348b.d1(this.f54354h.f54309g);
        } else {
            this.f54348b.e1(this.f54354h.f54309g);
        }
    }

    @Override // u2.p
    public void f() {
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
