package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b<C, T, A> implements Cloneable {
    public final a<C, T, A> A;

    /* renamed from: w  reason: collision with root package name */
    public List<C> f15020w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public long f15021x = 0;

    /* renamed from: y  reason: collision with root package name */
    public long[] f15022y;

    /* renamed from: z  reason: collision with root package name */
    public int f15023z;

    /* loaded from: classes.dex */
    public static abstract class a<C, T, A> {
        public abstract void a(C c10, T t10, int i10, A a10);
    }

    public b(a<C, T, A> aVar) {
        this.A = aVar;
    }

    public synchronized void b(C c10) {
        if (c10 != null) {
            int lastIndexOf = this.f15020w.lastIndexOf(c10);
            if (lastIndexOf < 0 || e(lastIndexOf)) {
                this.f15020w.add(c10);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: c */
    public synchronized b<C, T, A> clone() {
        b<C, T, A> bVar;
        CloneNotSupportedException e10;
        try {
            bVar = (b) super.clone();
        } catch (CloneNotSupportedException e11) {
            bVar = null;
            e10 = e11;
        }
        try {
            bVar.f15021x = 0L;
            bVar.f15022y = null;
            bVar.f15023z = 0;
            bVar.f15020w = new ArrayList();
            int size = this.f15020w.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!e(i10)) {
                    bVar.f15020w.add(this.f15020w.get(i10));
                }
            }
        } catch (CloneNotSupportedException e12) {
            e10 = e12;
            e10.printStackTrace();
            return bVar;
        }
        return bVar;
    }

    public final boolean e(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f15021x) != 0;
        }
        long[] jArr = this.f15022y;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public synchronized void f(T t10, int i10, A a10) {
        this.f15023z++;
        i(t10, i10, a10);
        int i11 = this.f15023z - 1;
        this.f15023z = i11;
        if (i11 == 0) {
            long[] jArr = this.f15022y;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j10 = this.f15022y[length];
                    if (j10 != 0) {
                        m((length + 1) * 64, j10);
                        this.f15022y[length] = 0;
                    }
                }
            }
            long j11 = this.f15021x;
            if (j11 != 0) {
                m(0, j11);
                this.f15021x = 0L;
            }
        }
    }

    public final void g(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.A.a(this.f15020w.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void h(T t10, int i10, A a10) {
        g(t10, i10, a10, 0, Math.min(64, this.f15020w.size()), this.f15021x);
    }

    public final void i(T t10, int i10, A a10) {
        int size = this.f15020w.size();
        long[] jArr = this.f15022y;
        int length = jArr == null ? -1 : jArr.length - 1;
        k(t10, i10, a10, length);
        g(t10, i10, a10, (length + 2) * 64, size, 0L);
    }

    public final void k(T t10, int i10, A a10, int i11) {
        if (i11 < 0) {
            h(t10, i10, a10);
            return;
        }
        long j10 = this.f15022y[i11];
        int i12 = (i11 + 1) * 64;
        int min = Math.min(this.f15020w.size(), i12 + 64);
        k(t10, i10, a10, i11 - 1);
        g(t10, i10, a10, i12, min, j10);
    }

    public synchronized void l(C c10) {
        if (this.f15023z == 0) {
            this.f15020w.remove(c10);
        } else {
            int lastIndexOf = this.f15020w.lastIndexOf(c10);
            if (lastIndexOf >= 0) {
                n(lastIndexOf);
            }
        }
    }

    public final void m(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = (i10 + 64) - 1; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f15020w.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    public final void n(int i10) {
        if (i10 < 64) {
            this.f15021x = (1 << i10) | this.f15021x;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f15022y;
        if (jArr == null) {
            this.f15022y = new long[this.f15020w.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.f15020w.size() / 64];
            long[] jArr3 = this.f15022y;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f15022y = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f15022y;
        jArr4[i11] = j10 | jArr4[i11];
    }
}
