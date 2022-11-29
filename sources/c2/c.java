package c2;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import jo.h;
import jo.p;
import xn.n;

/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f18805a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f18806b;

    /* renamed from: c  reason: collision with root package name */
    public int f18807c;

    public c() {
        this(0, 1, null);
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f18805a = a.f18793a;
            this.f18806b = a.f18794b;
        } else {
            this.f18805a = new int[i10];
            this.f18806b = new Object[i10 << 1];
        }
        this.f18807c = 0;
    }

    public final boolean a(K k10) {
        return d(k10) >= 0;
    }

    public final V b(K k10) {
        int d10 = d(k10);
        if (d10 >= 0) {
            return (V) this.f18806b[(d10 << 1) + 1];
        }
        return null;
    }

    public final int c(Object obj, int i10) {
        p.h(obj, "key");
        int i11 = this.f18807c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = a.a(this.f18805a, i11, i10);
        if (a10 >= 0 && !p.c(obj, this.f18806b[a10 << 1])) {
            int i12 = a10 + 1;
            while (i12 < i11 && this.f18805a[i12] == i10) {
                if (p.c(obj, this.f18806b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && this.f18805a[i13] == i10; i13--) {
                if (p.c(obj, this.f18806b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a10;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i10 = this.f18807c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = a.a(this.f18805a, i10, 0);
        if (a10 >= 0 && this.f18806b[a10 << 1] != null) {
            int i11 = a10 + 1;
            while (i11 < i10 && this.f18805a[i11] == 0) {
                if (this.f18806b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && this.f18805a[i12] == 0; i12--) {
                if (this.f18806b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return a10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f18807c;
                if (i10 != cVar.f18807c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K g10 = g(i11);
                    V i12 = i(i11);
                    Object b10 = cVar.b(g10);
                    if (i12 == null) {
                        if (b10 != null || !cVar.a(g10)) {
                            return false;
                        }
                    } else if (!p.c(i12, b10)) {
                        return false;
                    }
                }
                return true;
            } else if ((obj instanceof Map) && this.f18807c == ((Map) obj).size()) {
                int i13 = this.f18807c;
                for (int i14 = 0; i14 < i13; i14++) {
                    K g11 = g(i14);
                    V i15 = i(i14);
                    Object obj2 = ((Map) obj).get(g11);
                    if (i15 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g11)) {
                            return false;
                        }
                    } else if (!p.c(i15, obj2)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f18807c <= 0;
    }

    public final K g(int i10) {
        return (K) this.f18806b[i10 << 1];
    }

    public final V h(K k10, V v10) {
        int hashCode;
        int c10;
        int i10 = this.f18807c;
        if (k10 == null) {
            hashCode = 0;
            c10 = e();
        } else {
            hashCode = k10.hashCode();
            c10 = c(k10, hashCode);
        }
        if (c10 >= 0) {
            int i11 = (c10 << 1) + 1;
            Object[] objArr = this.f18806b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~c10;
        int[] iArr = this.f18805a;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            p.g(copyOf, "copyOf(this, newSize)");
            this.f18805a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18806b, i13 << 1);
            p.g(copyOf2, "copyOf(this, newSize)");
            this.f18806b = copyOf2;
            if (i10 != this.f18807c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f18805a;
            int i14 = i12 + 1;
            n.g(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f18806b;
            n.i(objArr2, objArr2, i14 << 1, i12 << 1, this.f18807c << 1);
        }
        int i15 = this.f18807c;
        if (i10 == i15) {
            int[] iArr3 = this.f18805a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.f18806b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f18807c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.f18805a;
        Object[] objArr = this.f18806b;
        int i10 = this.f18807c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final V i(int i10) {
        return (V) this.f18806b[(i10 << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f18807c * 28);
        sb2.append('{');
        int i10 = this.f18807c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K g10 = g(i11);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V i12 = i(i11);
            if (i12 != this) {
                sb2.append(i12);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        p.g(sb3, "buffer.toString()");
        return sb3;
    }

    public /* synthetic */ c(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
