package com.cookpad.puree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class PureeLogger {

    /* renamed from: a  reason: collision with root package name */
    public final k8.c f20162a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, List<n8.c>> f20163b;

    /* renamed from: c  reason: collision with root package name */
    public final o8.c f20164c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f20165d;

    /* loaded from: classes.dex */
    public static class NoRegisteredOutputPluginException extends IllegalStateException {
        public NoRegisteredOutputPluginException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class a implements c<n8.c> {
        public a() {
        }

        @Override // com.cookpad.puree.PureeLogger.c
        /* renamed from: a */
        public void accept(n8.c cVar) {
            cVar.g(PureeLogger.this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements c<n8.c> {
        public b() {
        }

        @Override // com.cookpad.puree.PureeLogger.c
        /* renamed from: a */
        public void accept(n8.c cVar) {
            cVar.d();
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void accept(T t10);
    }

    public PureeLogger(Map<Class<?>, List<n8.c>> map, k8.c cVar, o8.c cVar2, ScheduledExecutorService scheduledExecutorService) {
        HashMap hashMap = new HashMap();
        this.f20163b = hashMap;
        hashMap.putAll(map);
        this.f20162a = cVar;
        this.f20164c = cVar2;
        this.f20165d = scheduledExecutorService;
        b(new a());
    }

    public void a() {
        b(new b());
    }

    public void b(c<n8.c> cVar) {
        Iterator it = new HashSet(this.f20163b.values()).iterator();
        while (it.hasNext()) {
            for (n8.c cVar2 : (List) it.next()) {
                cVar.accept(cVar2);
            }
        }
    }

    public ScheduledExecutorService c() {
        return this.f20165d;
    }

    public List<n8.c> d(Class<?> cls) {
        List<n8.c> list = this.f20163b.get(cls);
        if (list != null) {
            return list;
        }
        throw new NoRegisteredOutputPluginException("No output plugin registered for " + cls);
    }

    public List<n8.c> e(Object obj) {
        return d(obj.getClass());
    }

    public o8.c f() {
        return this.f20164c;
    }

    public void g(Object obj) {
        for (n8.c cVar : e(obj)) {
            cVar.h(h(obj));
        }
    }

    public String h(Object obj) {
        return this.f20162a.a(obj);
    }
}
