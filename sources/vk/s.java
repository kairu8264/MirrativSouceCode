package vk;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class s implements ul.d, ul.c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<ul.b<Object>, Executor>> f57465a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<ul.a<?>> f57466b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f57467c;

    public s(Executor executor) {
        this.f57467c = executor;
    }

    public static /* synthetic */ void f(Map.Entry entry, ul.a aVar) {
        ((ul.b) entry.getKey()).a(aVar);
    }

    @Override // ul.d
    public <T> void a(Class<T> cls, ul.b<? super T> bVar) {
        b(cls, this.f57467c, bVar);
    }

    @Override // ul.d
    public synchronized <T> void b(Class<T> cls, Executor executor, ul.b<? super T> bVar) {
        z.b(cls);
        z.b(bVar);
        z.b(executor);
        if (!this.f57465a.containsKey(cls)) {
            this.f57465a.put(cls, new ConcurrentHashMap<>());
        }
        this.f57465a.get(cls).put(bVar, executor);
    }

    public void d() {
        Queue<ul.a<?>> queue;
        synchronized (this) {
            queue = this.f57466b;
            if (queue != null) {
                this.f57466b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ul.a<?> aVar : queue) {
                g(aVar);
            }
        }
    }

    public final synchronized Set<Map.Entry<ul.b<Object>, Executor>> e(ul.a<?> aVar) {
        ConcurrentHashMap<ul.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f57465a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public void g(final ul.a<?> aVar) {
        z.b(aVar);
        synchronized (this) {
            Queue<ul.a<?>> queue = this.f57466b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<ul.b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: vk.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.f(entry, aVar);
                    }
                });
            }
        }
    }
}
