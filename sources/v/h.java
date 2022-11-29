package v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final float f56229a;

    /* renamed from: b  reason: collision with root package name */
    public final c1.u f56230b;

    public h(float f10, c1.u uVar) {
        this.f56229a = f10;
        this.f56230b = uVar;
    }

    public /* synthetic */ h(float f10, c1.u uVar, jo.h hVar) {
        this(f10, uVar);
    }

    public final c1.u a() {
        return this.f56230b;
    }

    public final float b() {
        return this.f56229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return m2.g.n(this.f56229a, hVar.f56229a) && jo.p.c(this.f56230b, hVar.f56230b);
        }
        return false;
    }

    public int hashCode() {
        return (m2.g.o(this.f56229a) * 31) + this.f56230b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) m2.g.p(this.f56229a)) + ", brush=" + this.f56230b + ')';
    }
}
