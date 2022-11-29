package s1;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f51823a;

    /* renamed from: b  reason: collision with root package name */
    public final wn.f f51824b = wn.g.b(wn.i.NONE, C0789b.f51827w);

    /* renamed from: c  reason: collision with root package name */
    public final Comparator<k> f51825c;

    /* renamed from: d  reason: collision with root package name */
    public final f0<k> f51826d;

    /* loaded from: classes.dex */
    public static final class a implements Comparator<k> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(k kVar, k kVar2) {
            jo.p.h(kVar, "l1");
            jo.p.h(kVar2, "l2");
            int j10 = jo.p.j(kVar.Y(), kVar2.Y());
            return j10 != 0 ? j10 : jo.p.j(kVar.hashCode(), kVar2.hashCode());
        }
    }

    /* renamed from: s1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0789b extends jo.q implements io.a<Map<k, Integer>> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0789b f51827w = new C0789b();

        public C0789b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Map<k, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public b(boolean z10) {
        this.f51823a = z10;
        a aVar = new a();
        this.f51825c = aVar;
        this.f51826d = new f0<>(aVar);
    }

    public final void a(k kVar) {
        jo.p.h(kVar, "node");
        if (kVar.L0()) {
            if (this.f51823a) {
                Integer num = c().get(kVar);
                if (num == null) {
                    c().put(kVar, Integer.valueOf(kVar.Y()));
                } else {
                    if (!(num.intValue() == kVar.Y())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f51826d.add(kVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(k kVar) {
        jo.p.h(kVar, "node");
        boolean contains = this.f51826d.contains(kVar);
        if (this.f51823a) {
            if (!(contains == c().containsKey(kVar))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final Map<k, Integer> c() {
        return (Map) this.f51824b.getValue();
    }

    public final boolean d() {
        return this.f51826d.isEmpty();
    }

    public final k e() {
        k first = this.f51826d.first();
        jo.p.g(first, "node");
        f(first);
        return first;
    }

    public final boolean f(k kVar) {
        jo.p.h(kVar, "node");
        if (kVar.L0()) {
            boolean remove = this.f51826d.remove(kVar);
            if (this.f51823a) {
                Integer remove2 = c().remove(kVar);
                if (remove) {
                    int Y = kVar.Y();
                    if (remove2 == null || remove2.intValue() != Y) {
                        r3 = false;
                    }
                    if (!r3) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (!(remove2 == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String treeSet = this.f51826d.toString();
        jo.p.g(treeSet, "set.toString()");
        return treeSet;
    }
}
