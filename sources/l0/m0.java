package l0;

/* loaded from: classes.dex */
public final class m0<T> implements c2<T> {

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f39202w;

    public m0(io.a<? extends T> aVar) {
        jo.p.h(aVar, "valueProducer");
        this.f39202w = wn.g.a(aVar);
    }

    public final T d() {
        return (T) this.f39202w.getValue();
    }

    @Override // l0.c2
    public T getValue() {
        return d();
    }
}
