package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class d8 extends f7<Double> implements RandomAccess, da {

    /* renamed from: z  reason: collision with root package name */
    public static final d8 f35722z;

    /* renamed from: x  reason: collision with root package name */
    public double[] f35723x;

    /* renamed from: y  reason: collision with root package name */
    public int f35724y;

    static {
        d8 d8Var = new d8(new double[0], 0);
        f35722z = d8Var;
        d8Var.zzb();
    }

    public d8() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f35724y)) {
            double[] dArr = this.f35723x;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f35723x, i10, dArr2, i10 + 1, this.f35724y - i10);
                this.f35723x = dArr2;
            }
            this.f35723x[i10] = doubleValue;
            this.f35724y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        b9.e(collection);
        if (!(collection instanceof d8)) {
            return super.addAll(collection);
        }
        d8 d8Var = (d8) collection;
        int i10 = d8Var.f35724y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35724y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f35723x;
            if (i12 > dArr.length) {
                this.f35723x = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(d8Var.f35723x, 0, this.f35723x, this.f35724y, d8Var.f35724y);
            this.f35724y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return super.equals(obj);
        }
        d8 d8Var = (d8) obj;
        if (this.f35724y != d8Var.f35724y) {
            return false;
        }
        double[] dArr = d8Var.f35723x;
        for (int i10 = 0; i10 < this.f35724y; i10++) {
            if (Double.doubleToLongBits(this.f35723x[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d10) {
        d();
        int i10 = this.f35724y;
        double[] dArr = this.f35723x;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f35723x = dArr2;
        }
        double[] dArr3 = this.f35723x;
        int i11 = this.f35724y;
        this.f35724y = i11 + 1;
        dArr3[i11] = d10;
    }

    public final String g(int i10) {
        int i11 = this.f35724y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Double.valueOf(this.f35723x[i10]);
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35724y; i11++) {
            i10 = (i10 * 31) + b9.c(Double.doubleToLongBits(this.f35723x[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f35724y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f35723x[i11] == doubleValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35724y) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        j(i10);
        double[] dArr = this.f35723x;
        double d10 = dArr[i10];
        if (i10 < this.f35724y - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f35724y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            double[] dArr = this.f35723x;
            System.arraycopy(dArr, i11, dArr, i10, this.f35724y - i11);
            this.f35724y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        j(i10);
        double[] dArr = this.f35723x;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35724y;
    }

    @Override // hi.a9
    public final /* bridge */ /* synthetic */ a9 v(int i10) {
        if (i10 >= this.f35724y) {
            return new d8(Arrays.copyOf(this.f35723x, i10), this.f35724y);
        }
        throw new IllegalArgumentException();
    }

    public d8(double[] dArr, int i10) {
        this.f35723x = dArr;
        this.f35724y = i10;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
