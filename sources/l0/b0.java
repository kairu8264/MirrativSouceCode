package l0;

/* loaded from: classes.dex */
public final class b0<T> extends c1<T> {

    /* renamed from: b  reason: collision with root package name */
    public final t1<T> f38963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(t1<T> t1Var, io.a<? extends T> aVar) {
        super(aVar);
        jo.p.h(t1Var, "policy");
        jo.p.h(aVar, "defaultFactory");
        this.f38963b = t1Var;
    }

    @Override // l0.q
    public c2<T> b(T t10, i iVar, int i10) {
        iVar.x(-84026900);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        if (y10 == i.f39065a.a()) {
            y10 = u1.f(t10, this.f38963b);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        s0Var.setValue(t10);
        iVar.O();
        return s0Var;
    }
}
