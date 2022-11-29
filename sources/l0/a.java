package l0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f38956a;

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f38957b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public T f38958c;

    public a(T t10) {
        this.f38956a = t10;
        this.f38958c = t10;
    }

    @Override // l0.e
    public T a() {
        return this.f38958c;
    }

    @Override // l0.e
    public final void clear() {
        this.f38957b.clear();
        l(this.f38956a);
        k();
    }

    @Override // l0.e
    public void g(T t10) {
        this.f38957b.add(a());
        l(t10);
    }

    @Override // l0.e
    public void i() {
        if (!this.f38957b.isEmpty()) {
            List<T> list = this.f38957b;
            l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final T j() {
        return this.f38956a;
    }

    public abstract void k();

    public void l(T t10) {
        this.f38958c = t10;
    }
}
