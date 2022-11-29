package v0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z<K, V> {
    public Map.Entry<? extends K, ? extends V> A;

    /* renamed from: w  reason: collision with root package name */
    public final u<K, V> f56558w;

    /* renamed from: x  reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f56559x;

    /* renamed from: y  reason: collision with root package name */
    public int f56560y;

    /* renamed from: z  reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f56561z;

    /* JADX WARN: Multi-variable type inference failed */
    public z(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        jo.p.h(uVar, "map");
        jo.p.h(it, "iterator");
        this.f56558w = uVar;
        this.f56559x = it;
        this.f56560y = uVar.g();
        e();
    }

    public final void e() {
        this.f56561z = this.A;
        this.A = this.f56559x.hasNext() ? this.f56559x.next() : null;
    }

    public final Map.Entry<K, V> f() {
        return (Map.Entry<? extends K, ? extends V>) this.f56561z;
    }

    public final u<K, V> g() {
        return this.f56558w;
    }

    public final Map.Entry<K, V> h() {
        return (Map.Entry<? extends K, ? extends V>) this.A;
    }

    public final boolean hasNext() {
        return this.A != null;
    }

    public final void remove() {
        if (g().g() == this.f56560y) {
            Map.Entry<? extends K, ? extends V> entry = this.f56561z;
            if (entry != null) {
                this.f56558w.remove(entry.getKey());
                this.f56561z = null;
                wn.v vVar = wn.v.f59242a;
                this.f56560y = g().g();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
