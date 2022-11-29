package u;

import u.p;

/* loaded from: classes.dex */
public final class d1<T, V extends p> implements c1<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<T, V> f53968a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<V, T> f53969b;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(io.l<? super T, ? extends V> lVar, io.l<? super V, ? extends T> lVar2) {
        jo.p.h(lVar, "convertToVector");
        jo.p.h(lVar2, "convertFromVector");
        this.f53968a = lVar;
        this.f53969b = lVar2;
    }

    @Override // u.c1
    public io.l<T, V> a() {
        return this.f53968a;
    }

    @Override // u.c1
    public io.l<V, T> b() {
        return this.f53969b;
    }
}
