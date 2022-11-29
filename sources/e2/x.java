package e2;

/* loaded from: classes.dex */
public final class x implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f30162a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30163b;

    public x(int i10, int i11) {
        this.f30162a = i10;
        this.f30163b = i11;
    }

    @Override // e2.d
    public void a(g gVar) {
        jo.p.h(gVar, "buffer");
        if (gVar.l()) {
            gVar.a();
        }
        int m10 = po.n.m(this.f30162a, 0, gVar.h());
        int m11 = po.n.m(this.f30163b, 0, gVar.h());
        if (m10 != m11) {
            if (m10 < m11) {
                gVar.n(m10, m11);
            } else {
                gVar.n(m11, m10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f30162a == xVar.f30162a && this.f30163b == xVar.f30163b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30162a * 31) + this.f30163b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f30162a + ", end=" + this.f30163b + ')';
    }
}
