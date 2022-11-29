package v0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import ko.e;

/* loaded from: classes.dex */
public final class y<K, V> extends z<K, V> implements Iterator<Map.Entry<K, V>>, ko.a {

    /* loaded from: classes.dex */
    public static final class a implements Map.Entry<K, V>, e.a {

        /* renamed from: w  reason: collision with root package name */
        public final K f56555w;

        /* renamed from: x  reason: collision with root package name */
        public V f56556x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y<K, V> f56557y;

        public a(y<K, V> yVar) {
            this.f56557y = yVar;
            Map.Entry<K, V> f10 = yVar.f();
            jo.p.e(f10);
            this.f56555w = f10.getKey();
            Map.Entry<K, V> f11 = yVar.f();
            jo.p.e(f11);
            this.f56556x = f11.getValue();
        }

        public void b(V v10) {
            this.f56556x = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56555w;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f56556x;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            y<K, V> yVar = this.f56557y;
            if (yVar.g().g() == yVar.f56560y) {
                V v11 = (V) getValue();
                yVar.g().put((K) getKey(), v10);
                b(v10);
                return v11;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(uVar, it);
        jo.p.h(uVar, "map");
        jo.p.h(it, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: i */
    public Map.Entry<K, V> next() {
        e();
        if (f() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
