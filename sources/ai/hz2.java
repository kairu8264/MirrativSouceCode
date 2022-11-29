package ai;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class hz2<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object F = new Object();
    public transient int A;
    public transient int B;
    public transient Set<K> C;
    public transient Set<Map.Entry<K, V>> D;
    public transient Collection<V> E;

    /* renamed from: w  reason: collision with root package name */
    public transient Object f5052w;

    /* renamed from: x  reason: collision with root package name */
    public transient int[] f5053x;

    /* renamed from: y  reason: collision with root package name */
    public transient Object[] f5054y;

    /* renamed from: z  reason: collision with root package name */
    public transient Object[] f5055z;

    public hz2() {
        k(3);
    }

    public static /* synthetic */ Object A(hz2 hz2Var, int i10) {
        return hz2Var.e()[i10];
    }

    public static /* synthetic */ Object B(hz2 hz2Var, int i10) {
        return hz2Var.f()[i10];
    }

    public static /* synthetic */ void C(hz2 hz2Var, int i10, Object obj) {
        hz2Var.f()[i10] = obj;
    }

    public static /* synthetic */ Object w(hz2 hz2Var) {
        Object obj = hz2Var.f5052w;
        obj.getClass();
        return obj;
    }

    public final void D(int i10) {
        this.A = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.A & (-32));
    }

    public final int E() {
        return (1 << (this.A & 31)) - 1;
    }

    public final int F(int i10, int i11, int i12, int i13) {
        Object a10 = iz2.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            iz2.c(a10, i12 & i14, i13 + 1);
        }
        Object obj = this.f5052w;
        obj.getClass();
        int[] d10 = d();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = iz2.b(obj, i15);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = d10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = iz2.b(a10, i19);
                iz2.c(a10, i19, b10);
                d10[i16] = ((~i14) & i18) | (b11 & i14);
                b10 = i17 & i10;
            }
        }
        this.f5052w = a10;
        D(i14);
        return i14;
    }

    public final int G(Object obj) {
        if (m()) {
            return -1;
        }
        int b10 = rz2.b(obj);
        int E = E();
        Object obj2 = this.f5052w;
        obj2.getClass();
        int b11 = iz2.b(obj2, b10 & E);
        if (b11 != 0) {
            int i10 = ~E;
            int i11 = b10 & i10;
            do {
                int i12 = b11 - 1;
                int i13 = d()[i12];
                if ((i13 & i10) == i11 && hx2.a(obj, e()[i12])) {
                    return i12;
                }
                b11 = i13 & E;
            } while (b11 != 0);
            return -1;
        }
        return -1;
    }

    public final Object H(Object obj) {
        if (m()) {
            return F;
        }
        int E = E();
        Object obj2 = this.f5052w;
        obj2.getClass();
        int e10 = iz2.e(obj, null, E, obj2, d(), e(), null);
        if (e10 == -1) {
            return F;
        }
        Object obj3 = f()[e10];
        t(e10, E);
        this.B--;
        q();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m()) {
            return;
        }
        q();
        Map<K, V> o10 = o();
        if (o10 != null) {
            this.A = h23.a(size(), 3, 1073741823);
            o10.clear();
            this.f5052w = null;
            this.B = 0;
            return;
        }
        Arrays.fill(e(), 0, this.B, (Object) null);
        Arrays.fill(f(), 0, this.B, (Object) null);
        Object obj = this.f5052w;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(d(), 0, this.B, 0);
        this.B = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> o10 = o();
        if (o10 != null) {
            return o10.containsKey(obj);
        }
        return G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> o10 = o();
        if (o10 == null) {
            for (int i10 = 0; i10 < this.B; i10++) {
                if (hx2.a(obj, f()[i10])) {
                    return true;
                }
            }
            return false;
        }
        return o10.containsValue(obj);
    }

    public final int[] d() {
        int[] iArr = this.f5053x;
        iArr.getClass();
        return iArr;
    }

    public final Object[] e() {
        Object[] objArr = this.f5054y;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.D;
        if (set == null) {
            bz2 bz2Var = new bz2(this);
            this.D = bz2Var;
            return bz2Var;
        }
        return set;
    }

    public final Object[] f() {
        Object[] objArr = this.f5055z;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> o10 = o();
        if (o10 != null) {
            return o10.get(obj);
        }
        int G = G(obj);
        if (G == -1) {
            return null;
        }
        return (V) f()[G];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void k(int i10) {
        this.A = h23.a(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.C;
        if (set == null) {
            dz2 dz2Var = new dz2(this);
            this.C = dz2Var;
            return dz2Var;
        }
        return set;
    }

    public final boolean m() {
        return this.f5052w == null;
    }

    public final Map<K, V> o() {
        Object obj = this.f5052w;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        int min;
        if (m()) {
            lx2.b(m(), "Arrays already allocated");
            int i10 = this.A;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f5052w = iz2.a(max2);
            D(max2 - 1);
            this.f5053x = new int[i10];
            this.f5054y = new Object[i10];
            this.f5055z = new Object[i10];
        }
        Map<K, V> o10 = o();
        if (o10 != null) {
            return o10.put(k10, v10);
        }
        int[] d10 = d();
        Object[] e10 = e();
        Object[] f10 = f();
        int i11 = this.B;
        int i12 = i11 + 1;
        int b10 = rz2.b(k10);
        int E = E();
        int i13 = b10 & E;
        Object obj = this.f5052w;
        obj.getClass();
        int b11 = iz2.b(obj, i13);
        if (b11 != 0) {
            int i14 = ~E;
            int i15 = b10 & i14;
            int i16 = 0;
            while (true) {
                int i17 = b11 - 1;
                int i18 = d10[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && hx2.a(k10, e10[i17])) {
                    V v11 = (V) f10[i17];
                    f10[i17] = v10;
                    return v11;
                }
                int i20 = i18 & E;
                i16++;
                if (i20 != 0) {
                    b11 = i20;
                } else if (i16 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(E() + 1, 1.0f);
                    int u10 = u();
                    while (u10 >= 0) {
                        linkedHashMap.put(e()[u10], f()[u10]);
                        u10 = v(u10);
                    }
                    this.f5052w = linkedHashMap;
                    this.f5053x = null;
                    this.f5054y = null;
                    this.f5055z = null;
                    q();
                    return (V) linkedHashMap.put(k10, v10);
                } else if (i12 > E) {
                    E = F(E, iz2.d(E), b10, i11);
                } else {
                    d10[i17] = (i12 & E) | i19;
                }
            }
        } else if (i12 > E) {
            E = F(E, iz2.d(E), b10, i11);
        } else {
            Object obj2 = this.f5052w;
            obj2.getClass();
            iz2.c(obj2, i13, i12);
        }
        int length = d().length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f5053x = Arrays.copyOf(d(), min);
            this.f5054y = Arrays.copyOf(e(), min);
            this.f5055z = Arrays.copyOf(f(), min);
        }
        d()[i11] = (~E) & b10;
        e()[i11] = k10;
        f()[i11] = v10;
        this.B = i12;
        q();
        return null;
    }

    public final void q() {
        this.A += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> o10 = o();
        if (o10 != null) {
            return o10.remove(obj);
        }
        V v10 = (V) H(obj);
        if (v10 == F) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> o10 = o();
        return o10 != null ? o10.size() : this.B;
    }

    public final void t(int i10, int i11) {
        Object obj = this.f5052w;
        obj.getClass();
        int[] d10 = d();
        Object[] e10 = e();
        Object[] f10 = f();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = e10[size];
            e10[i10] = obj2;
            f10[i10] = f10[size];
            e10[size] = null;
            f10[size] = null;
            d10[i10] = d10[size];
            d10[size] = 0;
            int b10 = rz2.b(obj2) & i11;
            int b11 = iz2.b(obj, b10);
            int i12 = size + 1;
            if (b11 == i12) {
                iz2.c(obj, b10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = b11 - 1;
                int i14 = d10[i13];
                int i15 = i14 & i11;
                if (i15 == i12) {
                    d10[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                b11 = i15;
            }
        } else {
            e10[i10] = null;
            f10[i10] = null;
            d10[i10] = 0;
        }
    }

    public final int u() {
        return isEmpty() ? -1 : 0;
    }

    public final int v(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.B) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.E;
        if (collection == null) {
            gz2 gz2Var = new gz2(this);
            this.E = gz2Var;
            return gz2Var;
        }
        return collection;
    }

    public hz2(int i10) {
        k(8);
    }
}
