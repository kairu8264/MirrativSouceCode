package vk;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import vk.n;

/* loaded from: classes.dex */
public class n extends vk.a implements pl.a {

    /* renamed from: g  reason: collision with root package name */
    public static final xl.b<Set<Object>> f57444g = m.f57443a;

    /* renamed from: a  reason: collision with root package name */
    public final Map<d<?>, xl.b<?>> f57445a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, xl.b<?>> f57446b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, u<?>> f57447c;

    /* renamed from: d  reason: collision with root package name */
    public final List<xl.b<i>> f57448d;

    /* renamed from: e  reason: collision with root package name */
    public final s f57449e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Boolean> f57450f;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f57451a;

        /* renamed from: b  reason: collision with root package name */
        public final List<xl.b<i>> f57452b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final List<d<?>> f57453c = new ArrayList();

        public b(Executor executor) {
            this.f57451a = executor;
        }

        public static /* synthetic */ i f(i iVar) {
            return iVar;
        }

        public b b(d<?> dVar) {
            this.f57453c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f57452b.add(new xl.b() { // from class: vk.o
                @Override // xl.b
                public final Object get() {
                    i f10;
                    f10 = n.b.f(i.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<xl.b<i>> collection) {
            this.f57452b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f57451a, this.f57452b, this.f57453c);
        }
    }

    public static b i(Executor executor) {
        return new b(executor);
    }

    public static <T> List<T> m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(d dVar) {
        return dVar.f().a(new a0(dVar, this));
    }

    @Override // vk.a, vk.e
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // vk.e
    public synchronized <T> xl.b<Set<T>> b(Class<T> cls) {
        u<?> uVar = this.f57447c.get(cls);
        if (uVar != null) {
            return uVar;
        }
        return (xl.b<Set<T>>) f57444g;
    }

    @Override // vk.a, vk.e
    public /* bridge */ /* synthetic */ Set c(Class cls) {
        return super.c(cls);
    }

    @Override // vk.e
    public synchronized <T> xl.b<T> d(Class<T> cls) {
        z.c(cls, "Null interface requested.");
        return (xl.b<T>) this.f57446b.get(cls);
    }

    @Override // vk.e
    public <T> xl.a<T> e(Class<T> cls) {
        xl.b<T> d10 = d(cls);
        if (d10 == null) {
            return y.e();
        }
        if (d10 instanceof y) {
            return (y) d10;
        }
        return y.i(d10);
    }

    public final void j(List<d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<xl.b<i>> it = this.f57448d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f57445a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f57445a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final d<?> dVar : list) {
                this.f57445a.put(dVar, new t(new xl.b() { // from class: vk.l
                    @Override // xl.b
                    public final Object get() {
                        Object n10;
                        n10 = n.this.n(dVar);
                        return n10;
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        q();
    }

    public final void k(Map<d<?>, xl.b<?>> map, boolean z10) {
        for (Map.Entry<d<?>, xl.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            xl.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z10)) {
                value.get();
            }
        }
        this.f57449e.d();
    }

    public void l(boolean z10) {
        HashMap hashMap;
        if (this.f57450f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f57445a);
            }
            k(hashMap, z10);
        }
    }

    public final void q() {
        Boolean bool = this.f57450f.get();
        if (bool != null) {
            k(this.f57445a, bool.booleanValue());
        }
    }

    public final void r() {
        for (d<?> dVar : this.f57445a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.g() && !this.f57447c.containsKey(qVar.c())) {
                    this.f57447c.put(qVar.c(), u.b(Collections.emptySet()));
                } else if (this.f57446b.containsKey(qVar.c())) {
                    continue;
                } else if (!qVar.f()) {
                    if (!qVar.g()) {
                        this.f57446b.put(qVar.c(), y.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.c()));
                }
            }
        }
    }

    public final List<Runnable> s(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.m()) {
                final xl.b<?> bVar = this.f57445a.get(dVar);
                for (Class<? super Object> cls : dVar.g()) {
                    if (!this.f57446b.containsKey(cls)) {
                        this.f57446b.put(cls, bVar);
                    } else {
                        final y yVar = (y) this.f57446b.get(cls);
                        arrayList.add(new Runnable() { // from class: vk.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                y.this.j(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, xl.b<?>> entry : this.f57445a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.m()) {
                xl.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f57447c.containsKey(entry2.getKey())) {
                this.f57447c.put((Class) entry2.getKey(), u.b((Collection) entry2.getValue()));
            } else {
                final u<?> uVar = this.f57447c.get(entry2.getKey());
                for (final xl.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: vk.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            u.this.a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable<xl.b<i>> iterable, Collection<d<?>> collection) {
        this.f57445a = new HashMap();
        this.f57446b = new HashMap();
        this.f57447c = new HashMap();
        this.f57450f = new AtomicReference<>();
        s sVar = new s(executor);
        this.f57449e = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(sVar, s.class, ul.d.class, ul.c.class));
        arrayList.add(d.p(this, pl.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f57448d = m(iterable);
        j(arrayList);
    }
}
