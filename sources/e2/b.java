package e2;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f30064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30065b;

    public b(int i10, int i11) {
        this.f30064a = i10;
        this.f30065b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // e2.d
    public void a(g gVar) {
        jo.p.h(gVar, "buffer");
        gVar.b(gVar.j(), Math.min(gVar.j() + this.f30065b, gVar.h()));
        gVar.b(Math.max(0, gVar.k() - this.f30064a), gVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f30064a == bVar.f30064a && this.f30065b == bVar.f30065b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30064a * 31) + this.f30065b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f30064a + ", lengthAfterCursor=" + this.f30065b + ')';
    }
}
