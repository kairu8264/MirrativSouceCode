package p0;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public Object[] f45677w = t.f45669e.a().p();

    /* renamed from: x  reason: collision with root package name */
    public int f45678x;

    /* renamed from: y  reason: collision with root package name */
    public int f45679y;

    public final K b() {
        r0.a.a(g());
        return (K) this.f45677w[this.f45679y];
    }

    public final t<? extends K, ? extends V> d() {
        r0.a.a(h());
        Object obj = this.f45677w[this.f45679y];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    public final Object[] e() {
        return this.f45677w;
    }

    public final int f() {
        return this.f45679y;
    }

    public final boolean g() {
        return this.f45679y < this.f45678x;
    }

    public final boolean h() {
        r0.a.a(this.f45679y >= this.f45678x);
        return this.f45679y < this.f45677w.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void i() {
        r0.a.a(g());
        this.f45679y += 2;
    }

    public final void j() {
        r0.a.a(h());
        this.f45679y++;
    }

    public final void k(Object[] objArr, int i10) {
        jo.p.h(objArr, "buffer");
        m(objArr, i10, 0);
    }

    public final void m(Object[] objArr, int i10, int i11) {
        jo.p.h(objArr, "buffer");
        this.f45677w = objArr;
        this.f45678x = i10;
        this.f45679y = i11;
    }

    public final void o(int i10) {
        this.f45679y = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
