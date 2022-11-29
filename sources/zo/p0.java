package zo;

import java.lang.Comparable;
import java.util.Arrays;
import uo.u0;
import zo.q0;

/* loaded from: classes4.dex */
public class p0<T extends q0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f63318a;

    public final void a(T t10) {
        if (u0.a()) {
            if (!(t10.a() == null)) {
                throw new AssertionError();
            }
        }
        t10.e(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.setIndex(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f63318a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final T[] f() {
        T[] tArr = this.f63318a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.f63318a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            jo.p.g(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((q0[]) copyOf);
            this.f63318a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            if (t10.a() == null) {
                z10 = false;
            } else {
                int index = t10.getIndex();
                if (u0.a()) {
                    if (!(index >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(index);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        if (u0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f63318a;
        jo.p.e(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                jo.p.e(t10);
                T t11 = tArr[i11];
                jo.p.e(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        jo.p.e(t12);
        if (u0.a()) {
            if (!(t12.a() == this)) {
                throw new AssertionError();
            }
        }
        t12.e(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }

    public final void j(int i10) {
        this._size = i10;
    }

    public final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f63318a;
            jo.p.e(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                jo.p.e(t10);
                T t11 = tArr[i11];
                jo.p.e(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            jo.p.e(t12);
            T t13 = tArr[i11];
            jo.p.e(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    public final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f63318a;
            jo.p.e(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            jo.p.e(t10);
            T t11 = tArr[i10];
            jo.p.e(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    public final void m(int i10, int i11) {
        T[] tArr = this.f63318a;
        jo.p.e(tArr);
        T t10 = tArr[i11];
        jo.p.e(t10);
        T t11 = tArr[i10];
        jo.p.e(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
