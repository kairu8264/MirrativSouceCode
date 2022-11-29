package u;

/* loaded from: classes.dex */
public final class b1<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f53947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f53948b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f53949c;

    public b1() {
        this(0, 0, null, 7, null);
    }

    public b1(int i10, int i11, a0 a0Var) {
        jo.p.h(a0Var, "easing");
        this.f53947a = i10;
        this.f53948b = i11;
        this.f53949c = a0Var;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return b1Var.f53947a == this.f53947a && b1Var.f53948b == this.f53948b && jo.p.c(b1Var.f53949c, this.f53949c);
        }
        return false;
    }

    @Override // u.z, u.i
    /* renamed from: f */
    public <V extends p> p1<V> a(c1<T, V> c1Var) {
        jo.p.h(c1Var, "converter");
        return new p1<>(this.f53947a, this.f53948b, this.f53949c);
    }

    public int hashCode() {
        return (((this.f53947a * 31) + this.f53949c.hashCode()) * 31) + this.f53948b;
    }

    public /* synthetic */ b1(int i10, int i11, a0 a0Var, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? b0.b() : a0Var);
    }
}
