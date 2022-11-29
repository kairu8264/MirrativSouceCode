package u;

/* loaded from: classes.dex */
public final class i0<T> implements i<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f54024d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final z<T> f54025a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f54026b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54027c;

    public i0(z<T> zVar, q0 q0Var, long j10) {
        this.f54025a = zVar;
        this.f54026b = q0Var;
        this.f54027c = j10;
    }

    public /* synthetic */ i0(z zVar, q0 q0Var, long j10, jo.h hVar) {
        this(zVar, q0Var, j10);
    }

    @Override // u.i
    public <V extends p> f1<V> a(c1<T, V> c1Var) {
        jo.p.h(c1Var, "converter");
        return new m1(this.f54025a.a((c1) c1Var), this.f54026b, f(), null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return jo.p.c(i0Var.f54025a, this.f54025a) && i0Var.f54026b == this.f54026b && v0.d(i0Var.f(), f());
        }
        return false;
    }

    public final long f() {
        return this.f54027c;
    }

    public int hashCode() {
        return (((this.f54025a.hashCode() * 31) + this.f54026b.hashCode()) * 31) + v0.e(f());
    }
}
