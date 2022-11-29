package s7;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f52267a;

    /* renamed from: b  reason: collision with root package name */
    public final a f52268b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, C0800a<?>> f52269a = new HashMap();

        /* renamed from: s7.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0800a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f52270a;

            public C0800a(List<n<Model, ?>> list) {
                this.f52270a = list;
            }
        }

        public void a() {
            this.f52269a.clear();
        }

        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0800a<?> c0800a = this.f52269a.get(cls);
            if (c0800a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0800a.f52270a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f52269a.put(cls, new C0800a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(n3.e<List<Throwable>> eVar) {
        this(new r(eVar));
    }

    public static <A> Class<A> b(A a10) {
        return (Class<A>) a10.getClass();
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f52267a.b(cls, cls2, oVar);
        this.f52268b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f52267a.g(cls);
    }

    public <A> List<n<A, ?>> d(A a10) {
        List<n<A, ?>> e10 = e(b(a10));
        if (!e10.isEmpty()) {
            int size = e10.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n<A, ?> nVar = e10.get(i10);
                if (nVar.a(a10)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (emptyList.isEmpty()) {
                throw new Registry.NoModelLoaderAvailableException(a10, e10);
            }
            return emptyList;
        }
        throw new Registry.NoModelLoaderAvailableException(a10);
    }

    public final synchronized <A> List<n<A, ?>> e(Class<A> cls) {
        List<n<A, ?>> b10;
        b10 = this.f52268b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f52267a.c(cls));
            this.f52268b.c(cls, b10);
        }
        return b10;
    }

    public synchronized <Model, Data> void f(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        g(this.f52267a.j(cls, cls2, oVar));
        this.f52268b.a();
    }

    public final <Model, Data> void g(List<o<? extends Model, ? extends Data>> list) {
        for (o<? extends Model, ? extends Data> oVar : list) {
            oVar.a();
        }
    }

    public p(r rVar) {
        this.f52268b = new a();
        this.f52267a = rVar;
    }
}
