package ai;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c03<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f2651a;

    /* renamed from: b  reason: collision with root package name */
    public int f2652b;

    public c03() {
        this(4);
    }

    public final c03<K, V> a(K k10, V v10) {
        d(this.f2652b + 1);
        xy2.a(k10, v10);
        Object[] objArr = this.f2651a;
        int i10 = this.f2652b;
        int i11 = i10 + i10;
        objArr[i11] = k10;
        objArr[i11 + 1] = v10;
        this.f2652b = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c03<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            d(this.f2652b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final d03<K, V> c() {
        return s13.k(this.f2652b, this.f2651a);
    }

    public final void d(int i10) {
        int i11 = i10 + i10;
        Object[] objArr = this.f2651a;
        int length = objArr.length;
        if (i11 > length) {
            this.f2651a = Arrays.copyOf(objArr, tz2.b(length, i11));
        }
    }

    public c03(int i10) {
        this.f2651a = new Object[i10 + i10];
        this.f2652b = 0;
    }
}
