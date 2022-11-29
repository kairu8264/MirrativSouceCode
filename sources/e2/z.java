package e2;

/* loaded from: classes.dex */
public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f30166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30167b;

    public z(int i10, int i11) {
        this.f30166a = i10;
        this.f30167b = i11;
    }

    @Override // e2.d
    public void a(g gVar) {
        jo.p.h(gVar, "buffer");
        int m10 = po.n.m(this.f30166a, 0, gVar.h());
        int m11 = po.n.m(this.f30167b, 0, gVar.h());
        if (m10 < m11) {
            gVar.p(m10, m11);
        } else {
            gVar.p(m11, m10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f30166a == zVar.f30166a && this.f30167b == zVar.f30167b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30166a * 31) + this.f30167b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f30166a + ", end=" + this.f30167b + ')';
    }
}
