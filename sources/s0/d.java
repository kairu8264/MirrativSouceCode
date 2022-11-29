package s0;

import jo.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f51798a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f51799b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f51800c;

    public d(int i10, long[] jArr, Object[] objArr) {
        p.h(jArr, "keys");
        p.h(objArr, "values");
        this.f51798a = i10;
        this.f51799b = jArr;
        this.f51800c = objArr;
    }

    public final int a(long j10) {
        int i10 = this.f51798a - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 == 0) {
                long[] jArr = this.f51799b;
                if (jArr[0] == j10) {
                    return 0;
                }
                return jArr[0] > j10 ? -2 : -1;
            }
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                int i13 = ((this.f51799b[i12] - j10) > 0L ? 1 : ((this.f51799b[i12] - j10) == 0L ? 0 : -1));
                if (i13 < 0) {
                    i11 = i12 + 1;
                } else if (i13 <= 0) {
                    return i12;
                } else {
                    i10 = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        return -1;
    }

    public final Object b(long j10) {
        int a10 = a(j10);
        if (a10 >= 0) {
            return this.f51800c[a10];
        }
        return null;
    }

    public final d c(long j10, Object obj) {
        int i10 = this.f51798a;
        Object[] objArr = this.f51800c;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] != null) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                if (i11 >= i14 || i15 >= i10) {
                    break;
                }
                long j11 = this.f51799b[i15];
                Object obj2 = this.f51800c[i15];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i11] = j11;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr[i16] = j10;
                objArr2[i16] = obj;
            } else {
                while (i11 < i14) {
                    long j12 = this.f51799b[i15];
                    Object obj3 = this.f51800c[i15];
                    if (obj3 != null) {
                        jArr[i11] = j12;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr2[0] = obj;
        }
        return new d(i14, jArr, objArr2);
    }

    public final boolean d(long j10, Object obj) {
        int a10 = a(j10);
        if (a10 < 0) {
            return false;
        }
        this.f51800c[a10] = obj;
        return true;
    }
}
