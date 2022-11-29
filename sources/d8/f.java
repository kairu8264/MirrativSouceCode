package d8;

import java.util.ArrayList;
import java.util.List;
import m7.k;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?>> f29311a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f29312a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f29313b;

        public a(Class<T> cls, k<T> kVar) {
            this.f29312a = cls;
            this.f29313b = kVar;
        }

        public boolean a(Class<?> cls) {
            return this.f29312a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, k<Z> kVar) {
        this.f29311a.add(new a<>(cls, kVar));
    }

    public synchronized <Z> k<Z> b(Class<Z> cls) {
        int size = this.f29311a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f29311a.get(i10);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.f29313b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(Class<Z> cls, k<Z> kVar) {
        this.f29311a.add(0, new a<>(cls, kVar));
    }
}
