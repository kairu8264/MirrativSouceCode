package z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n3.e;
import n3.f;
import s.g;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<ArrayList<T>> f62496a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    public final g<T, ArrayList<T>> f62497b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f62498c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f62499d = new HashSet<>();

    public void a(T t10, T t11) {
        if (this.f62497b.containsKey(t10) && this.f62497b.containsKey(t11)) {
            ArrayList<T> arrayList = this.f62497b.get(t10);
            if (arrayList == null) {
                arrayList = f();
                this.f62497b.put(t10, arrayList);
            }
            arrayList.add(t11);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t10) {
        if (this.f62497b.containsKey(t10)) {
            return;
        }
        this.f62497b.put(t10, null);
    }

    public void c() {
        int size = this.f62497b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> r10 = this.f62497b.r(i10);
            if (r10 != null) {
                k(r10);
            }
        }
        this.f62497b.clear();
    }

    public boolean d(T t10) {
        return this.f62497b.containsKey(t10);
    }

    public final void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (!hashSet.contains(t10)) {
            hashSet.add(t10);
            ArrayList<T> arrayList2 = this.f62497b.get(t10);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t10);
            arrayList.add(t10);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final ArrayList<T> f() {
        ArrayList<T> acquire = this.f62496a.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    public List g(T t10) {
        return this.f62497b.get(t10);
    }

    public List<T> h(T t10) {
        int size = this.f62497b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> r10 = this.f62497b.r(i10);
            if (r10 != null && r10.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f62497b.m(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f62498c.clear();
        this.f62499d.clear();
        int size = this.f62497b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f62497b.m(i10), this.f62498c, this.f62499d);
        }
        return this.f62498c;
    }

    public boolean j(T t10) {
        int size = this.f62497b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> r10 = this.f62497b.r(i10);
            if (r10 != null && r10.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f62496a.a(arrayList);
    }
}
