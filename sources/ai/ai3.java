package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ai3 extends yg3<Double> implements RandomAccess, ek3 {

    /* renamed from: z  reason: collision with root package name */
    public static final ai3 f1878z;

    /* renamed from: x  reason: collision with root package name */
    public double[] f1879x;

    /* renamed from: y  reason: collision with root package name */
    public int f1880y;

    static {
        ai3 ai3Var = new ai3(new double[0], 0);
        f1878z = ai3Var;
        ai3Var.zzb();
    }

    public ai3() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f1880y)) {
            double[] dArr = this.f1879x;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f1879x, i10, dArr2, i10 + 1, this.f1880y - i10);
                this.f1879x = dArr2;
            }
            this.f1879x[i10] = doubleValue;
            this.f1880y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        bj3.a(collection);
        if (!(collection instanceof ai3)) {
            return super.addAll(collection);
        }
        ai3 ai3Var = (ai3) collection;
        int i10 = ai3Var.f1880y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f1880y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f1879x;
            if (i12 > dArr.length) {
                this.f1879x = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(ai3Var.f1879x, 0, this.f1879x, this.f1880y, ai3Var.f1880y);
            this.f1880y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai3)) {
            return super.equals(obj);
        }
        ai3 ai3Var = (ai3) obj;
        if (this.f1880y != ai3Var.f1880y) {
            return false;
        }
        double[] dArr = ai3Var.f1879x;
        for (int i10 = 0; i10 < this.f1880y; i10++) {
            if (Double.doubleToLongBits(this.f1879x[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d10) {
        d();
        int i10 = this.f1880y;
        double[] dArr = this.f1879x;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f1879x = dArr2;
        }
        double[] dArr3 = this.f1879x;
        int i11 = this.f1880y;
        this.f1880y = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f1880y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f1879x[i10]);
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f1880y; i11++) {
            i10 = (i10 * 31) + bj3.e(Double.doubleToLongBits(this.f1879x[i11]));
        }
        return i10;
    }

    @Override // ai.aj3
    public final /* bridge */ /* synthetic */ aj3 i(int i10) {
        if (i10 >= this.f1880y) {
            return new ai3(Arrays.copyOf(this.f1879x, i10), this.f1880y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f1880y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f1879x[i11] == doubleValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        int i11 = this.f1880y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        g(i10);
        double[] dArr = this.f1879x;
        double d10 = dArr[i10];
        if (i10 < this.f1880y - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f1880y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            double[] dArr = this.f1879x;
            System.arraycopy(dArr, i11, dArr, i10, this.f1880y - i11);
            this.f1880y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        g(i10);
        double[] dArr = this.f1879x;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1880y;
    }

    public ai3(double[] dArr, int i10) {
        this.f1879x = dArr;
        this.f1880y = i10;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
