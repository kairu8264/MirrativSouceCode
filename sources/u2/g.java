package u2;

import u2.f;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f54315m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f54307e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f54307e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // u2.f
    public void d(int i10) {
        if (this.f54312j) {
            return;
        }
        this.f54312j = true;
        this.f54309g = i10;
        for (d dVar : this.f54313k) {
            dVar.a(dVar);
        }
    }
}
