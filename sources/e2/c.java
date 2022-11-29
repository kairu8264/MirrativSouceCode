package e2;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f30066a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30067b;

    public c(int i10, int i11) {
        this.f30066a = i10;
        this.f30067b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // e2.d
    public void a(g gVar) {
        boolean b10;
        boolean b11;
        jo.p.h(gVar, "buffer");
        int i10 = this.f30066a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11++;
            if (gVar.k() > i11) {
                b11 = e.b(gVar.c((gVar.k() - i11) - 1), gVar.c(gVar.k() - i11));
                if (b11) {
                    i11++;
                }
            }
            if (i11 == gVar.k()) {
                break;
            }
        }
        int i13 = this.f30067b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14++;
            if (gVar.j() + i14 < gVar.h()) {
                b10 = e.b(gVar.c((gVar.j() + i14) - 1), gVar.c(gVar.j() + i14));
                if (b10) {
                    i14++;
                }
            }
            if (gVar.j() + i14 == gVar.h()) {
                break;
            }
        }
        gVar.b(gVar.j(), gVar.j() + i14);
        gVar.b(gVar.k() - i11, gVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f30066a == cVar.f30066a && this.f30067b == cVar.f30067b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30066a * 31) + this.f30067b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f30066a + ", lengthAfterCursor=" + this.f30067b + ')';
    }
}
