package m0;

import jo.h;
import jo.p;
import xn.n;

/* loaded from: classes.dex */
public final class b<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f40456a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f40457b;

    /* renamed from: c  reason: collision with root package name */
    public int f40458c;

    public b(int i10) {
        this.f40456a = new Object[i10];
        this.f40457b = new Object[i10];
    }

    public final boolean a(Key key) {
        p.h(key, "key");
        return b(key) >= 0;
    }

    public final int b(Object obj) {
        int a10 = l0.c.a(obj);
        int i10 = this.f40458c - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f40456a[i12];
            int a11 = l0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 <= a10) {
                return obj == obj2 ? i12 : c(i12, obj, a10);
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final int c(int i10, Object obj, int i11) {
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj2 = this.f40456a[i12];
            if (obj2 == obj) {
                return i12;
            }
            if (l0.c.a(obj2) != i11) {
                break;
            }
        }
        int i13 = i10 + 1;
        int i14 = this.f40458c;
        while (true) {
            if (i13 < i14) {
                Object obj3 = this.f40456a[i13];
                if (obj3 == obj) {
                    return i13;
                }
                if (l0.c.a(obj3) != i11) {
                    break;
                }
                i13++;
            } else {
                i13 = this.f40458c;
                break;
            }
        }
        return -(i13 + 1);
    }

    public final Value d(Key key) {
        p.h(key, "key");
        int b10 = b(key);
        if (b10 >= 0) {
            return (Value) this.f40457b[b10];
        }
        return null;
    }

    public final Object[] e() {
        return this.f40456a;
    }

    public final int f() {
        return this.f40458c;
    }

    public final Object[] g() {
        return this.f40457b;
    }

    public final boolean h() {
        return this.f40458c > 0;
    }

    public final boolean i(Key key) {
        p.h(key, "key");
        int b10 = b(key);
        if (b10 >= 0) {
            int i10 = this.f40458c;
            Object[] objArr = this.f40456a;
            Object[] objArr2 = this.f40457b;
            int i11 = b10 + 1;
            n.i(objArr, objArr, b10, i11, i10);
            n.i(objArr2, objArr2, b10, i11, i10);
            int i12 = i10 - 1;
            objArr[i12] = null;
            objArr2[i12] = null;
            this.f40458c = i12;
            return true;
        }
        return false;
    }

    public final void j(Key key, Value value) {
        Object[] objArr;
        p.h(key, "key");
        int b10 = b(key);
        if (b10 >= 0) {
            this.f40457b[b10] = value;
            return;
        }
        int i10 = -(b10 + 1);
        int i11 = this.f40458c;
        Object[] objArr2 = this.f40456a;
        boolean z10 = i11 == objArr2.length;
        Object[] objArr3 = z10 ? new Object[i11 * 2] : objArr2;
        int i12 = i10 + 1;
        n.i(objArr2, objArr3, i12, i10, i11);
        if (z10) {
            n.m(this.f40456a, objArr3, 0, 0, i10, 6, null);
        }
        objArr3[i10] = key;
        this.f40456a = objArr3;
        if (z10) {
            objArr = new Object[this.f40458c * 2];
        } else {
            objArr = this.f40457b;
        }
        n.i(this.f40457b, objArr, i12, i10, this.f40458c);
        if (z10) {
            n.m(this.f40457b, objArr, 0, 0, i10, 6, null);
        }
        objArr[i10] = value;
        this.f40457b = objArr;
        this.f40458c++;
    }

    public /* synthetic */ b(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
