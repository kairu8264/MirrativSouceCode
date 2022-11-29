package t;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final x0.a f52936a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<m2.o, m2.o> f52937b;

    /* renamed from: c  reason: collision with root package name */
    public final u.c0<m2.o> f52938c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f52939d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(x0.a aVar, io.l<? super m2.o, m2.o> lVar, u.c0<m2.o> c0Var, boolean z10) {
        jo.p.h(aVar, "alignment");
        jo.p.h(lVar, "size");
        jo.p.h(c0Var, "animationSpec");
        this.f52936a = aVar;
        this.f52937b = lVar;
        this.f52938c = c0Var;
        this.f52939d = z10;
    }

    public final x0.a a() {
        return this.f52936a;
    }

    public final u.c0<m2.o> b() {
        return this.f52938c;
    }

    public final boolean c() {
        return this.f52939d;
    }

    public final io.l<m2.o, m2.o> d() {
        return this.f52937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return jo.p.c(this.f52936a, iVar.f52936a) && jo.p.c(this.f52937b, iVar.f52937b) && jo.p.c(this.f52938c, iVar.f52938c) && this.f52939d == iVar.f52939d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f52936a.hashCode() * 31) + this.f52937b.hashCode()) * 31) + this.f52938c.hashCode()) * 31;
        boolean z10 = this.f52939d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f52936a + ", size=" + this.f52937b + ", animationSpec=" + this.f52938c + ", clip=" + this.f52939d + ')';
    }
}
