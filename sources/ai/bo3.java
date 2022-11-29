package ai;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class bo3<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<eo3<T>> f2429a;

    /* renamed from: b  reason: collision with root package name */
    public final List<eo3<Collection<T>>> f2430b;

    public /* synthetic */ bo3(int i10, int i11, ao3 ao3Var) {
        this.f2429a = nn3.a(i10);
        this.f2430b = nn3.a(i11);
    }

    public final bo3<T> a(eo3<? extends T> eo3Var) {
        this.f2429a.add(eo3Var);
        return this;
    }

    public final bo3<T> b(eo3<? extends Collection<? extends T>> eo3Var) {
        this.f2430b.add(eo3Var);
        return this;
    }

    public final co3<T> c() {
        return new co3<>(this.f2429a, this.f2430b, null);
    }
}
