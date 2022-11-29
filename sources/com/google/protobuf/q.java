package com.google.protobuf;

import com.google.protobuf.t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class q extends c<Float> implements t.f, RandomAccess, fn.r {

    /* renamed from: z  reason: collision with root package name */
    public static final q f28199z;

    /* renamed from: x  reason: collision with root package name */
    public float[] f28200x;

    /* renamed from: y  reason: collision with root package name */
    public int f28201y;

    static {
        q qVar = new q(new float[0], 0);
        f28199z = qVar;
        qVar.C();
    }

    public q() {
        this(new float[10], 0);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        d();
        t.a(collection);
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f28201y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f28201y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f28200x;
            if (i12 > fArr.length) {
                this.f28200x = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(qVar.f28200x, 0, this.f28200x, this.f28201y, qVar.f28201y);
            this.f28201y = i12;
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
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        if (this.f28201y != qVar.f28201y) {
            return false;
        }
        float[] fArr = qVar.f28200x;
        for (int i10 = 0; i10 < this.f28201y; i10++) {
            if (Float.floatToIntBits(this.f28200x[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, Float f10) {
        k(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g */
    public boolean add(Float f10) {
        j(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f28201y; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f28200x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28200x[i10] == floatValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public void j(float f10) {
        d();
        int i10 = this.f28201y;
        float[] fArr = this.f28200x;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f28200x = fArr2;
        }
        float[] fArr3 = this.f28200x;
        int i11 = this.f28201y;
        this.f28201y = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void k(int i10, float f10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f28201y)) {
            float[] fArr = this.f28200x;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f28200x, i10, fArr2, i10 + 1, this.f28201y - i10);
                this.f28200x = fArr2;
            }
            this.f28200x[i10] = f10;
            this.f28201y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(r(i10));
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f28201y) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Float get(int i10) {
        return Float.valueOf(p(i10));
    }

    public float p(int i10) {
        l(i10);
        return this.f28200x[i10];
    }

    public final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28201y;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            float[] fArr = this.f28200x;
            System.arraycopy(fArr, i11, fArr, i10, this.f28201y - i11);
            this.f28201y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: s */
    public t.f o(int i10) {
        if (i10 >= this.f28201y) {
            return new q(Arrays.copyOf(this.f28200x, i10), this.f28201y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28201y;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: t */
    public Float remove(int i10) {
        int i11;
        d();
        l(i10);
        float[] fArr = this.f28200x;
        float f10 = fArr[i10];
        if (i10 < this.f28201y - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f28201y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Float set(int i10, Float f10) {
        return Float.valueOf(w(i10, f10.floatValue()));
    }

    public float w(int i10, float f10) {
        d();
        l(i10);
        float[] fArr = this.f28200x;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public q(float[] fArr, int i10) {
        this.f28200x = fArr;
        this.f28201y = i10;
    }
}
