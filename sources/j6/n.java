package j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xn.n0;

/* loaded from: classes.dex */
public final class n implements Iterable<wn.k<? extends String, ? extends c>>, ko.a {

    /* renamed from: x  reason: collision with root package name */
    public static final b f37220x = new b(null);

    /* renamed from: y  reason: collision with root package name */
    public static final n f37221y = new n();

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, c> f37222w;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, c> f37223a;

        public a(n nVar) {
            this.f37223a = n0.p(nVar.f37222w);
        }

        public final n a() {
            return new n(o6.c.b(this.f37223a), null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f37224a;

        /* renamed from: b  reason: collision with root package name */
        public final String f37225b;

        public final String a() {
            return this.f37225b;
        }

        public final Object b() {
            return this.f37224a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (jo.p.c(this.f37224a, cVar.f37224a) && jo.p.c(this.f37225b, cVar.f37225b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f37224a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.f37225b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Entry(value=" + this.f37224a + ", memoryCacheKey=" + ((Object) this.f37225b) + ')';
        }
    }

    public n(Map<String, c> map) {
        this.f37222w = map;
    }

    public /* synthetic */ n(Map map, jo.h hVar) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && jo.p.c(this.f37222w, ((n) obj).f37222w);
    }

    public final Map<String, String> f() {
        if (isEmpty()) {
            return n0.e();
        }
        Map<String, c> map = this.f37222w;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String a10 = entry.getValue().a();
            if (a10 != null) {
                linkedHashMap.put(entry.getKey(), a10);
            }
        }
        return linkedHashMap;
    }

    public final a g() {
        return new a(this);
    }

    public int hashCode() {
        return this.f37222w.hashCode();
    }

    public final boolean isEmpty() {
        return this.f37222w.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<wn.k<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f37222w;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(wn.q.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final <T> T j(String str) {
        c cVar = this.f37222w.get(str);
        if (cVar == null) {
            return null;
        }
        return (T) cVar.b();
    }

    public String toString() {
        return "Parameters(entries=" + this.f37222w + ')';
    }

    public n() {
        this(n0.e());
    }
}
