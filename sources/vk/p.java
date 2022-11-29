package vk;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class p {

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d<?> f57455a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<b> f57456b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Set<b> f57457c = new HashSet();

        public b(d<?> dVar) {
            this.f57455a = dVar;
        }

        public void a(b bVar) {
            this.f57456b.add(bVar);
        }

        public void b(b bVar) {
            this.f57457c.add(bVar);
        }

        public d<?> c() {
            return this.f57455a;
        }

        public Set<b> d() {
            return this.f57456b;
        }

        public boolean e() {
            return this.f57456b.isEmpty();
        }

        public boolean f() {
            return this.f57457c.isEmpty();
        }

        public void g(b bVar) {
            this.f57457c.remove(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f57458a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f57459b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f57458a.equals(this.f57458a) && cVar.f57459b == this.f57459b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f57458a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f57459b).hashCode();
        }

        public c(Class<?> cls, boolean z10) {
            this.f57458a = cls;
            this.f57459b = z10;
        }
    }

    public static void a(List<d<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c10) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    public static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            for (Class<? super Object> cls : dVar.g()) {
                c cVar = new c(cls, !dVar.m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f57459b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (q qVar : bVar2.c().e()) {
                    if (qVar.e() && (set = (Set) hashMap.get(new c(qVar.c(), qVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
