package lk;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lk.s0;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class d0 {

    /* loaded from: classes3.dex */
    public static class a extends u0<Map.Entry<K, V>, V> {
        public a(Iterator it) {
            super(it);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [V, java.lang.Object] */
        @Override // lk.u0
        /* renamed from: b */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class b implements kk.g<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ b[] $VALUES;
        public static final b KEY;
        public static final b VALUE;

        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kk.g
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: lk.d0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0581b extends b {
            public C0581b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kk.g
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0);
            KEY = aVar;
            C0581b c0581b = new C0581b("VALUE", 1);
            VALUE = c0581b;
            $VALUES = new b[]{aVar, c0581b};
        }

        public b(String str, int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public /* synthetic */ b(String str, int i10, c0 c0Var) {
            this(str, i10);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c<K, V> extends s0.b<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        public abstract Map<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // lk.s0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) kk.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                return s0.h(this, collection.iterator());
            }
        }

        @Override // lk.s0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) kk.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet e10 = s0.e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        e10.add(((Map.Entry) obj).getKey());
                    }
                }
                return d().keySet().retainAll(e10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    /* loaded from: classes3.dex */
    public static class d<K, V> extends s0.b<K> {
        @Weak

        /* renamed from: w  reason: collision with root package name */
        public final Map<K, V> f40292w;

        public d(Map<K, V> map) {
            this.f40292w = (Map) kk.j.i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().containsKey(obj);
        }

        public Map<K, V> d() {
            return this.f40292w;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    /* loaded from: classes3.dex */
    public static class e<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: w  reason: collision with root package name */
        public final Map<K, V> f40293w;

        public e(Map<K, V> map) {
            this.f40293w = (Map) kk.j.i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return d().containsValue(obj);
        }

        public final Map<K, V> d() {
            return this.f40293w;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d0.k(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (kk.i.a(obj, entry.getValue())) {
                        d().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) kk.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d10 = s0.d();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d10.add(entry.getKey());
                    }
                }
                return d().keySet().removeAll(d10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) kk.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d10 = s0.d();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d10.add(entry.getKey());
                    }
                }
                return d().keySet().retainAll(d10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: w  reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f40294w;
        @MonotonicNonNullDecl

        /* renamed from: x  reason: collision with root package name */
        public transient Collection<V> f40295x;

        public abstract Set<Map.Entry<K, V>> d();

        public Collection<V> e() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f40294w;
            if (set == null) {
                Set<Map.Entry<K, V>> d10 = d();
                this.f40294w = d10;
                return d10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f40295x;
            if (collection == null) {
                Collection<V> e10 = e();
                this.f40295x = e10;
                return e10;
            }
            return collection;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            i.b(i10, "expectedSize");
            return i10 + 1;
        } else if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> c(@NullableDecl K k10, @NullableDecl V v10) {
        return new q(k10, v10);
    }

    public static <K> kk.g<Map.Entry<K, ?>, K> d() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    public static boolean f(Map<?, ?> map, Object obj) {
        kk.j.i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V g(Map<?, V> map, @NullableDecl Object obj) {
        kk.j.i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V h(Map<?, V> map, Object obj) {
        kk.j.i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String i(Map<?, ?> map) {
        StringBuilder a10 = j.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            z10 = false;
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
        }
        a10.append('}');
        return a10.toString();
    }

    public static <V> kk.g<Map.Entry<?, V>, V> j() {
        return b.VALUE;
    }

    public static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
