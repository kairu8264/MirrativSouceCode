package u7;

import i8.j;
import o7.u;

/* loaded from: classes.dex */
public class b<T> implements u<T> {

    /* renamed from: w  reason: collision with root package name */
    public final T f54602w;

    public b(T t10) {
        this.f54602w = (T) j.d(t10);
    }

    @Override // o7.u
    public final int a() {
        return 1;
    }

    @Override // o7.u
    public void c() {
    }

    @Override // o7.u
    public Class<T> d() {
        return (Class<T>) this.f54602w.getClass();
    }

    @Override // o7.u
    public final T get() {
        return this.f54602w;
    }
}
