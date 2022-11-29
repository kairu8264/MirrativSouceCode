package l0;

/* loaded from: classes.dex */
public final class b1<T> implements a1<T>, s0<T> {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f38964w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ s0<T> f38965x;

    public b1(s0<T> s0Var, ao.g gVar) {
        jo.p.h(s0Var, "state");
        jo.p.h(gVar, "coroutineContext");
        this.f38964w = gVar;
        this.f38965x = s0Var;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f38964w;
    }

    @Override // l0.s0, l0.c2
    public T getValue() {
        return this.f38965x.getValue();
    }

    @Override // l0.s0
    public void setValue(T t10) {
        this.f38965x.setValue(t10);
    }
}
