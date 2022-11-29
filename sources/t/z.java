package t;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<m2.o, m2.k> f53011a;

    /* renamed from: b  reason: collision with root package name */
    public final u.c0<m2.k> f53012b;

    public final u.c0<m2.k> a() {
        return this.f53012b;
    }

    public final io.l<m2.o, m2.k> b() {
        return this.f53011a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return jo.p.c(this.f53011a, zVar.f53011a) && jo.p.c(this.f53012b, zVar.f53012b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f53011a.hashCode() * 31) + this.f53012b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f53011a + ", animationSpec=" + this.f53012b + ')';
    }
}
