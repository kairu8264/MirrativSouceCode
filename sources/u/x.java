package u;

/* loaded from: classes.dex */
public final class x<T> implements w<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f54152a;

    public x(e0 e0Var) {
        jo.p.h(e0Var, "floatDecaySpec");
        this.f54152a = e0Var;
    }

    @Override // u.w
    public <V extends p> h1<V> a(c1<T, V> c1Var) {
        jo.p.h(c1Var, "typeConverter");
        return new l1(this.f54152a);
    }
}
