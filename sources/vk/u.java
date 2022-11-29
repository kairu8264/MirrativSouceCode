package vk;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class u<T> implements xl.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f57472b = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<xl.b<T>> f57471a = Collections.newSetFromMap(new ConcurrentHashMap());

    public u(Collection<xl.b<T>> collection) {
        this.f57471a.addAll(collection);
    }

    public static u<?> b(Collection<xl.b<?>> collection) {
        return new u<>((Set) collection);
    }

    public synchronized void a(xl.b<T> bVar) {
        if (this.f57472b == null) {
            this.f57471a.add(bVar);
        } else {
            this.f57472b.add(bVar.get());
        }
    }

    @Override // xl.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f57472b == null) {
            synchronized (this) {
                if (this.f57472b == null) {
                    this.f57472b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f57472b);
    }

    public final synchronized void d() {
        for (xl.b<T> bVar : this.f57471a) {
            this.f57472b.add(bVar.get());
        }
        this.f57471a = null;
    }
}
