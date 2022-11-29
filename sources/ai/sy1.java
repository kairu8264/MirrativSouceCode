package ai;

/* loaded from: classes3.dex */
public final class sy1<DelegateT, AdapterT> implements ry1<AdapterT> {

    /* renamed from: a  reason: collision with root package name */
    public final ry1<DelegateT> f10026a;

    /* renamed from: b  reason: collision with root package name */
    public final bx2<DelegateT, AdapterT> f10027b;

    public sy1(ry1<DelegateT> ry1Var, bx2<DelegateT, AdapterT> bx2Var) {
        this.f10026a = ry1Var;
        this.f10027b = bx2Var;
    }

    @Override // ai.ry1
    public final s43<AdapterT> a(sl2 sl2Var, fl2 fl2Var) {
        return j43.j(this.f10026a.a(sl2Var, fl2Var), this.f10027b, hk0.f4878a);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        return this.f10026a.b(sl2Var, fl2Var);
    }
}
