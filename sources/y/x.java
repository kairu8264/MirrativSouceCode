package y;

/* loaded from: classes.dex */
public final class x implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final int f61019b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61020c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61021d;

    /* renamed from: e  reason: collision with root package name */
    public final int f61022e;

    public x(int i10, int i11, int i12, int i13) {
        this.f61019b = i10;
        this.f61020c = i11;
        this.f61021d = i12;
        this.f61022e = i13;
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        return this.f61022e;
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        return this.f61020c;
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return this.f61019b;
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return this.f61021d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f61019b == xVar.f61019b && this.f61020c == xVar.f61020c && this.f61021d == xVar.f61021d && this.f61022e == xVar.f61022e;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f61019b * 31) + this.f61020c) * 31) + this.f61021d) * 31) + this.f61022e;
    }

    public String toString() {
        return "Insets(left=" + this.f61019b + ", top=" + this.f61020c + ", right=" + this.f61021d + ", bottom=" + this.f61022e + ')';
    }
}
