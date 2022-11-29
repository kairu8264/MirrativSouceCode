package y1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final long f61106a;

    /* renamed from: b  reason: collision with root package name */
    public final long f61107b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61108c;

    public final long a() {
        return this.f61107b;
    }

    public final int b() {
        return this.f61108c;
    }

    public final long c() {
        return this.f61106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return m2.r.e(this.f61106a, pVar.f61106a) && m2.r.e(this.f61107b, pVar.f61107b) && q.i(this.f61108c, pVar.f61108c);
        }
        return false;
    }

    public int hashCode() {
        return (((m2.r.i(this.f61106a) * 31) + m2.r.i(this.f61107b)) * 31) + q.j(this.f61108c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) m2.r.j(this.f61106a)) + ", height=" + ((Object) m2.r.j(this.f61107b)) + ", placeholderVerticalAlign=" + ((Object) q.k(this.f61108c)) + ')';
    }
}
