package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {
    public static int A;
    public static Object[] B;
    public static int C;

    /* renamed from: z  reason: collision with root package name */
    public static Object[] f51775z;

    /* renamed from: w  reason: collision with root package name */
    public int[] f51776w;

    /* renamed from: x  reason: collision with root package name */
    public Object[] f51777x;

    /* renamed from: y  reason: collision with root package name */
    public int f51778y;

    public g() {
        this.f51776w = c.f51765a;
        this.f51777x = c.f51767c;
        this.f51778y = 0;
    }

    private void d(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = B;
                if (objArr != null) {
                    this.f51777x = objArr;
                    B = (Object[]) objArr[0];
                    this.f51776w = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    C--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f51775z;
                if (objArr2 != null) {
                    this.f51777x = objArr2;
                    f51775z = (Object[]) objArr2[0];
                    this.f51776w = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A--;
                    return;
                }
            }
        }
        this.f51776w = new int[i10];
        this.f51777x = new Object[i10 << 1];
    }

    public static int e(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void g(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (C < 10) {
                    objArr[0] = B;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    B = objArr;
                    C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (A < 10) {
                    objArr[0] = f51775z;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f51775z = objArr;
                    A++;
                }
            }
        }
    }

    public void clear() {
        int i10 = this.f51778y;
        if (i10 > 0) {
            int[] iArr = this.f51776w;
            Object[] objArr = this.f51777x;
            this.f51776w = c.f51765a;
            this.f51777x = c.f51767c;
            this.f51778y = 0;
            g(iArr, objArr, i10);
        }
        if (this.f51778y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f51778y; i10++) {
                K m10 = m(i10);
                V r10 = r(i10);
                Object obj2 = gVar.get(m10);
                if (r10 == null) {
                    if (obj2 != null || !gVar.containsKey(m10)) {
                        return false;
                    }
                } else if (!r10.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f51778y; i11++) {
                K m11 = m(i11);
                V r11 = r(i11);
                Object obj3 = map.get(m11);
                if (r11 == null) {
                    if (obj3 != null || !map.containsKey(m11)) {
                        return false;
                    }
                } else if (!r11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i10) {
        int i11 = this.f51778y;
        int[] iArr = this.f51776w;
        if (iArr.length < i10) {
            Object[] objArr = this.f51777x;
            d(i10);
            if (this.f51778y > 0) {
                System.arraycopy(iArr, 0, this.f51776w, 0, i11);
                System.arraycopy(objArr, 0, this.f51777x, 0, i11 << 1);
            }
            g(iArr, objArr, i11);
        }
        if (this.f51778y != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int i10 = i(obj);
        return i10 >= 0 ? (V) this.f51777x[(i10 << 1) + 1] : v10;
    }

    public int h(Object obj, int i10) {
        int i11 = this.f51778y;
        if (i11 == 0) {
            return -1;
        }
        int e10 = e(this.f51776w, i11, i10);
        if (e10 >= 0 && !obj.equals(this.f51777x[e10 << 1])) {
            int i12 = e10 + 1;
            while (i12 < i11 && this.f51776w[i12] == i10) {
                if (obj.equals(this.f51777x[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = e10 - 1; i13 >= 0 && this.f51776w[i13] == i10; i13--) {
                if (obj.equals(this.f51777x[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return e10;
    }

    public int hashCode() {
        int[] iArr = this.f51776w;
        Object[] objArr = this.f51777x;
        int i10 = this.f51778y;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public int i(Object obj) {
        return obj == null ? j() : h(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f51778y <= 0;
    }

    public int j() {
        int i10 = this.f51778y;
        if (i10 == 0) {
            return -1;
        }
        int e10 = e(this.f51776w, i10, 0);
        if (e10 >= 0 && this.f51777x[e10 << 1] != null) {
            int i11 = e10 + 1;
            while (i11 < i10 && this.f51776w[i11] == 0) {
                if (this.f51777x[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = e10 - 1; i12 >= 0 && this.f51776w[i12] == 0; i12--) {
                if (this.f51777x[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return e10;
    }

    public int k(Object obj) {
        int i10 = this.f51778y * 2;
        Object[] objArr = this.f51777x;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public K m(int i10) {
        return (K) this.f51777x[i10 << 1];
    }

    public void o(g<? extends K, ? extends V> gVar) {
        int i10 = gVar.f51778y;
        f(this.f51778y + i10);
        if (this.f51778y != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.m(i11), gVar.r(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f51776w, 0, this.f51776w, 0, i10);
            System.arraycopy(gVar.f51777x, 0, this.f51777x, 0, i10 << 1);
            this.f51778y = i10;
        }
    }

    public V p(int i10) {
        Object[] objArr = this.f51777x;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f51778y;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f51776w;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                d(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f51778y) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f51776w, 0, i10);
                    System.arraycopy(objArr, 0, this.f51777x, 0, i11);
                }
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    int i15 = i13 - i10;
                    System.arraycopy(iArr, i14, this.f51776w, i10, i15);
                    System.arraycopy(objArr, i14 << 1, this.f51777x, i11, i15 << 1);
                }
            } else {
                if (i10 < i13) {
                    int i16 = i10 + 1;
                    int i17 = i13 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f51777x;
                    System.arraycopy(objArr2, i16 << 1, objArr2, i11, i17 << 1);
                }
                Object[] objArr3 = this.f51777x;
                int i18 = i13 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            }
            if (i12 == this.f51778y) {
                this.f51778y = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v10;
    }

    public V put(K k10, V v10) {
        int i10;
        int h10;
        int i11 = this.f51778y;
        if (k10 == null) {
            h10 = j();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            h10 = h(k10, hashCode);
        }
        if (h10 >= 0) {
            int i12 = (h10 << 1) + 1;
            Object[] objArr = this.f51777x;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~h10;
        int[] iArr = this.f51776w;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f51777x;
            d(i14);
            if (i11 == this.f51778y) {
                int[] iArr2 = this.f51776w;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f51777x, 0, objArr2.length);
                }
                g(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f51776w;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f51777x;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f51778y - i13) << 1);
        }
        int i16 = this.f51778y;
        if (i11 == i16) {
            int[] iArr4 = this.f51776w;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f51777x;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f51778y = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V q(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f51777x;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V r(int i10) {
        return (V) this.f51777x[(i10 << 1) + 1];
    }

    public V remove(Object obj) {
        int i10 = i(obj);
        if (i10 >= 0) {
            return p(i10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return q(i10, v10);
        }
        return null;
    }

    public int size() {
        return this.f51778y;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f51778y * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f51778y; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V r10 = r(i10);
            if (r10 != this) {
                sb2.append(r10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int i10 = i(obj);
        if (i10 >= 0) {
            V r10 = r(i10);
            if (obj2 == r10 || (obj2 != null && obj2.equals(r10))) {
                p(i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k10, V v10, V v11) {
        int i10 = i(k10);
        if (i10 >= 0) {
            V r10 = r(i10);
            if (r10 == v10 || (v10 != null && v10.equals(r10))) {
                q(i10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f51776w = c.f51765a;
            this.f51777x = c.f51767c;
        } else {
            d(i10);
        }
        this.f51778y = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            o(gVar);
        }
    }
}
