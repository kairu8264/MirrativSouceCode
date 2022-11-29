package com.google.protobuf;

import com.google.protobuf.t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class s extends c<Integer> implements t.g, RandomAccess, fn.r {

    /* renamed from: z  reason: collision with root package name */
    public static final s f28212z;

    /* renamed from: x  reason: collision with root package name */
    public int[] f28213x;

    /* renamed from: y  reason: collision with root package name */
    public int f28214y;

    static {
        s sVar = new s(new int[0], 0);
        f28212z = sVar;
        sVar.C();
    }

    public s() {
        this(new int[10], 0);
    }

    public static s k() {
        return f28212z;
    }

    @Override // com.google.protobuf.t.g
    public void Y0(int i10) {
        d();
        int i11 = this.f28214y;
        int[] iArr = this.f28213x;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f28213x = iArr2;
        }
        int[] iArr3 = this.f28213x;
        int i12 = this.f28214y;
        this.f28214y = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        d();
        t.a(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i10 = sVar.f28214y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f28214y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f28213x;
            if (i12 > iArr.length) {
                this.f28213x = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(sVar.f28213x, 0, this.f28213x, this.f28214y, sVar.f28214y);
            this.f28214y = i12;
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
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f28214y != sVar.f28214y) {
            return false;
        }
        int[] iArr = sVar.f28213x;
        for (int i10 = 0; i10 < this.f28214y; i10++) {
            if (this.f28213x[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, Integer num) {
        j(i10, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g */
    public boolean add(Integer num) {
        Y0(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.t.g
    public int getInt(int i10) {
        l(i10);
        return this.f28213x[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f28214y; i11++) {
            i10 = (i10 * 31) + this.f28213x[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28213x[i10] == intValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10, int i11) {
        int i12;
        d();
        if (i10 >= 0 && i10 <= (i12 = this.f28214y)) {
            int[] iArr = this.f28213x;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f28213x, i10, iArr2, i10 + 1, this.f28214y - i10);
                this.f28213x = iArr2;
            }
            this.f28213x[i10] = i11;
            this.f28214y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(p(i10));
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f28214y) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public final String p(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28214y;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Integer remove(int i10) {
        int i11;
        d();
        l(i10);
        int[] iArr = this.f28213x;
        int i12 = iArr[i10];
        if (i10 < this.f28214y - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f28214y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            int[] iArr = this.f28213x;
            System.arraycopy(iArr, i11, iArr, i10, this.f28214y - i11);
            this.f28214y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: s */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(t(i10, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28214y;
    }

    public int t(int i10, int i11) {
        d();
        l(i10);
        int[] iArr = this.f28213x;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public s(int[] iArr, int i10) {
        this.f28213x = iArr;
        this.f28214y = i10;
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: o */
    public t.i<Integer> o2(int i10) {
        if (i10 >= this.f28214y) {
            return new s(Arrays.copyOf(this.f28213x, i10), this.f28214y);
        }
        throw new IllegalArgumentException();
    }
}
