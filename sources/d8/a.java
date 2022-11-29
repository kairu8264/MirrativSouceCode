package d8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<C0274a<?>> f29297a = new ArrayList();

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0274a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f29298a;

        /* renamed from: b  reason: collision with root package name */
        public final m7.d<T> f29299b;

        public C0274a(Class<T> cls, m7.d<T> dVar) {
            this.f29298a = cls;
            this.f29299b = dVar;
        }

        public boolean a(Class<?> cls) {
            return this.f29298a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, m7.d<T> dVar) {
        this.f29297a.add(new C0274a<>(cls, dVar));
    }

    public synchronized <T> m7.d<T> b(Class<T> cls) {
        for (C0274a<?> c0274a : this.f29297a) {
            if (c0274a.a(cls)) {
                return (m7.d<T>) c0274a.f29299b;
            }
        }
        return null;
    }
}
