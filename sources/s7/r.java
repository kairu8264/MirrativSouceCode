package s7;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s7.n;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f52277e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final n<Object, Object> f52278f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?, ?>> f52279a;

    /* renamed from: b  reason: collision with root package name */
    public final c f52280b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b<?, ?>> f52281c;

    /* renamed from: d  reason: collision with root package name */
    public final n3.e<List<Throwable>> f52282d;

    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // s7.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // s7.n
        public n.a<Object> b(Object obj, int i10, int i11, m7.h hVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f52283a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f52284b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f52285c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f52283a = cls;
            this.f52284b = cls2;
            this.f52285c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.f52283a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f52284b.isAssignableFrom(cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, n3.e<List<Throwable>> eVar) {
            return new q<>(list, eVar);
        }
    }

    public r(n3.e<List<Throwable>> eVar) {
        this(eVar, f52277e);
    }

    public static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f52278f;
    }

    public final <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f52279a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f52279a) {
                if (!this.f52281c.contains(bVar) && bVar.a(cls)) {
                    this.f52281c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f52281c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f52281c.clear();
            throw th2;
        }
        return arrayList;
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f52279a) {
                if (this.f52281c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f52281c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f52281c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f52280b.a(arrayList, this.f52282d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f52281c.clear();
            throw th2;
        }
    }

    public final <Model, Data> n<Model, Data> e(b<?, ?> bVar) {
        return (n) i8.j.d(bVar.f52285c.c(this));
    }

    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f52279a) {
            if (!arrayList.contains(bVar.f52284b) && bVar.a(cls)) {
                arrayList.add(bVar.f52284b);
            }
        }
        return arrayList;
    }

    public final <Model, Data> o<Model, Data> h(b<?, ?> bVar) {
        return (o<Model, Data>) bVar.f52285c;
    }

    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f52279a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> i10;
        i10 = i(cls, cls2);
        b(cls, cls2, oVar);
        return i10;
    }

    public r(n3.e<List<Throwable>> eVar, c cVar) {
        this.f52279a = new ArrayList();
        this.f52281c = new HashSet();
        this.f52282d = eVar;
        this.f52280b = cVar;
    }
}
