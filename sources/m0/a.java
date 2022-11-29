package m0;

import jo.p;
import xn.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f40453a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f40454b = new Object[4];

    /* renamed from: c  reason: collision with root package name */
    public int[] f40455c = new int[4];

    public final void a(Object obj, int i10) {
        int i11;
        p.h(obj, "key");
        if (this.f40453a > 0) {
            i11 = b(obj);
            if (i11 >= 0) {
                this.f40455c[i11] = i10;
                return;
            }
        } else {
            i11 = -1;
        }
        int i12 = -(i11 + 1);
        int i13 = this.f40453a;
        Object[] objArr = this.f40454b;
        if (i13 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i14 = i12 + 1;
            n.i(objArr, objArr2, i14, i12, i13);
            n.g(this.f40455c, iArr, i14, i12, this.f40453a);
            n.m(this.f40454b, objArr2, 0, 0, i12, 6, null);
            n.l(this.f40455c, iArr, 0, 0, i12, 6, null);
            this.f40454b = objArr2;
            this.f40455c = iArr;
        } else {
            int i15 = i12 + 1;
            n.i(objArr, objArr, i15, i12, i13);
            int[] iArr2 = this.f40455c;
            n.g(iArr2, iArr2, i15, i12, this.f40453a);
        }
        this.f40454b[i12] = obj;
        this.f40455c[i12] = i10;
        this.f40453a++;
    }

    public final int b(Object obj) {
        int i10 = this.f40453a - 1;
        int a10 = l0.c.a(obj);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f40454b[i12];
            int a11 = l0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 <= a10) {
                return obj2 == obj ? i12 : c(i12, obj, a10);
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final int c(int i10, Object obj, int i11) {
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj2 = this.f40454b[i12];
            if (obj2 == obj) {
                return i12;
            }
            if (l0.c.a(obj2) != i11) {
                break;
            }
        }
        int i13 = i10 + 1;
        int i14 = this.f40453a;
        while (true) {
            if (i13 < i14) {
                Object obj3 = this.f40454b[i13];
                if (obj3 == obj) {
                    return i13;
                }
                if (l0.c.a(obj3) != i11) {
                    break;
                }
                i13++;
            } else {
                i13 = this.f40453a;
                break;
            }
        }
        return -(i13 + 1);
    }

    public final Object[] d() {
        return this.f40454b;
    }

    public final int e() {
        return this.f40453a;
    }

    public final int[] f() {
        return this.f40455c;
    }

    public final void g(int i10) {
        this.f40453a = i10;
    }
}
