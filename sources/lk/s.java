package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import lk.t;
import lk.u;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public class s<K, V> extends u<K, V> implements y<K, V> {

    /* loaded from: classes3.dex */
    public static final class a<K, V> extends u.c<K, V> {
        public s<K, V> e() {
            return (s) super.a();
        }

        @Override // lk.u.c
        @CanIgnoreReturnValue
        /* renamed from: f */
        public a<K, V> c(K k10, Iterable<? extends V> iterable) {
            super.c(k10, iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> g(K k10, V... vArr) {
            super.d(k10, vArr);
            return this;
        }
    }

    public s(t<K, r<V>> tVar, int i10) {
        super(tVar, i10);
    }

    public static <K, V> a<K, V> s() {
        return new a<>();
    }

    public static <K, V> s<K, V> t(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        r J;
        if (collection.isEmpty()) {
            return v();
        }
        t.a aVar = new t.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                J = r.u(value);
            } else {
                J = r.J(comparator, value);
            }
            if (!J.isEmpty()) {
                aVar.c(key, J);
                i10 += J.size();
            }
        }
        return new s<>(aVar.a(), i10);
    }

    public static <K, V> s<K, V> v() {
        return n.C;
    }

    @Override // lk.e0
    /* renamed from: u */
    public r<V> get(@NullableDecl K k10) {
        r<V> rVar = (r) this.A.get(k10);
        return rVar == null ? r.A() : rVar;
    }
}
