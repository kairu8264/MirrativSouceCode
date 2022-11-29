package h0;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0.a f34370a;

    /* renamed from: b  reason: collision with root package name */
    public final e0.a f34371b;

    /* renamed from: c  reason: collision with root package name */
    public final e0.a f34372c;

    public y0() {
        this(null, null, null, 7, null);
    }

    public y0(e0.a aVar, e0.a aVar2, e0.a aVar3) {
        jo.p.h(aVar, "small");
        jo.p.h(aVar2, "medium");
        jo.p.h(aVar3, "large");
        this.f34370a = aVar;
        this.f34371b = aVar2;
        this.f34372c = aVar3;
    }

    public final e0.a a() {
        return this.f34372c;
    }

    public final e0.a b() {
        return this.f34371b;
    }

    public final e0.a c() {
        return this.f34370a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            return jo.p.c(this.f34370a, y0Var.f34370a) && jo.p.c(this.f34371b, y0Var.f34371b) && jo.p.c(this.f34372c, y0Var.f34372c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34370a.hashCode() * 31) + this.f34371b.hashCode()) * 31) + this.f34372c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f34370a + ", medium=" + this.f34371b + ", large=" + this.f34372c + ')';
    }

    public /* synthetic */ y0(e0.a aVar, e0.a aVar2, e0.a aVar3, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? e0.g.c(m2.g.l(4)) : aVar, (i10 & 2) != 0 ? e0.g.c(m2.g.l(4)) : aVar2, (i10 & 4) != 0 ? e0.g.c(m2.g.l(0)) : aVar3);
    }
}
