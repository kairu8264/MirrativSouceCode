package com.google.protobuf;

import com.google.protobuf.t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class j extends c<Double> implements t.b, RandomAccess, fn.r {

    /* renamed from: z  reason: collision with root package name */
    public static final j f28150z;

    /* renamed from: x  reason: collision with root package name */
    public double[] f28151x;

    /* renamed from: y  reason: collision with root package name */
    public int f28152y;

    static {
        j jVar = new j(new double[0], 0);
        f28150z = jVar;
        jVar.C();
    }

    public j() {
        this(new double[10], 0);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        d();
        t.a(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f28152y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f28152y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f28151x;
            if (i12 > dArr.length) {
                this.f28151x = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(jVar.f28151x, 0, this.f28151x, this.f28152y, jVar.f28152y);
            this.f28152y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f28152y != jVar.f28152y) {
            return false;
        }
        double[] dArr = jVar.f28151x;
        for (int i10 = 0; i10 < this.f28152y; i10++) {
            if (Double.doubleToLongBits(this.f28151x[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, Double d10) {
        k(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g */
    public boolean add(Double d10) {
        j(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f28152y; i11++) {
            i10 = (i10 * 31) + t.f(Double.doubleToLongBits(this.f28151x[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28151x[i10] == doubleValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void j(double d10) {
        d();
        int i10 = this.f28152y;
        double[] dArr = this.f28151x;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f28151x = dArr2;
        }
        double[] dArr3 = this.f28151x;
        int i11 = this.f28152y;
        this.f28152y = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void k(int i10, double d10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f28152y)) {
            double[] dArr = this.f28151x;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f28151x, i10, dArr2, i10 + 1, this.f28152y - i10);
                this.f28151x = dArr2;
            }
            this.f28151x[i10] = d10;
            this.f28152y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(r(i10));
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f28152y) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Double get(int i10) {
        return Double.valueOf(p(i10));
    }

    public double p(int i10) {
        l(i10);
        return this.f28151x[i10];
    }

    public final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28152y;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            double[] dArr = this.f28151x;
            System.arraycopy(dArr, i11, dArr, i10, this.f28152y - i11);
            this.f28152y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: s */
    public t.b o(int i10) {
        if (i10 >= this.f28152y) {
            return new j(Arrays.copyOf(this.f28151x, i10), this.f28152y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28152y;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: t */
    public Double remove(int i10) {
        int i11;
        d();
        l(i10);
        double[] dArr = this.f28151x;
        double d10 = dArr[i10];
        if (i10 < this.f28152y - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f28152y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Double set(int i10, Double d10) {
        return Double.valueOf(w(i10, d10.doubleValue()));
    }

    public double w(int i10, double d10) {
        d();
        l(i10);
        double[] dArr = this.f28151x;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public j(double[] dArr, int i10) {
        this.f28151x = dArr;
        this.f28152y = i10;
    }
}
