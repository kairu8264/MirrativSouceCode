package lk;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class g0 {

    /* loaded from: classes3.dex */
    public static class a<K, V> extends c<K, V> {
        public transient kk.n<? extends List<V>> C;

        public a(Map<K, Collection<V>> map, kk.n<? extends List<V>> nVar) {
            super(map);
            this.C = (kk.n) kk.j.i(nVar);
        }

        @Override // lk.d
        /* renamed from: C */
        public List<V> s() {
            return this.C.get();
        }

        @Override // lk.f
        public Map<K, Collection<V>> e() {
            return u();
        }

        @Override // lk.f
        public Set<K> g() {
            return v();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return d().c(entry.getKey(), entry.getValue());
            }
            return false;
        }

        public abstract e0<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return d().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    public static boolean a(e0<?, ?> e0Var, @NullableDecl Object obj) {
        if (obj == e0Var) {
            return true;
        }
        if (obj instanceof e0) {
            return e0Var.b().equals(((e0) obj).b());
        }
        return false;
    }

    public static <K, V> y<K, V> b(Map<K, Collection<V>> map, kk.n<? extends List<V>> nVar) {
        return new a(map, nVar);
    }
}
