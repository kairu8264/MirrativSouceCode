package com.google.protobuf;

import com.google.protobuf.t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class e extends c<Boolean> implements t.a, RandomAccess, fn.r {

    /* renamed from: z  reason: collision with root package name */
    public static final e f28091z;

    /* renamed from: x  reason: collision with root package name */
    public boolean[] f28092x;

    /* renamed from: y  reason: collision with root package name */
    public int f28093y;

    static {
        e eVar = new e(new boolean[0], 0);
        f28091z = eVar;
        eVar.C();
    }

    public e() {
        this(new boolean[10], 0);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        d();
        t.a(collection);
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f28093y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f28093y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f28092x;
            if (i12 > zArr.length) {
                this.f28092x = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(eVar.f28092x, 0, this.f28092x, this.f28093y, eVar.f28093y);
            this.f28093y = i12;
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
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f28093y != eVar.f28093y) {
            return false;
        }
        boolean[] zArr = eVar.f28092x;
        for (int i10 = 0; i10 < this.f28093y; i10++) {
            if (this.f28092x[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, Boolean bool) {
        j(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f28093y; i11++) {
            i10 = (i10 * 31) + t.c(this.f28092x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28092x[i10] == booleanValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10, boolean z10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f28093y)) {
            boolean[] zArr = this.f28092x;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f28092x, i10, zArr2, i10 + 1, this.f28093y - i10);
                this.f28092x = zArr2;
            }
            this.f28092x[i10] = z10;
            this.f28093y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(r(i10));
    }

    public void k(boolean z10) {
        d();
        int i10 = this.f28093y;
        boolean[] zArr = this.f28092x;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f28092x = zArr2;
        }
        boolean[] zArr3 = this.f28092x;
        int i11 = this.f28093y;
        this.f28093y = i11 + 1;
        zArr3[i11] = z10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f28093y) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Boolean get(int i10) {
        return Boolean.valueOf(p(i10));
    }

    public boolean p(int i10) {
        l(i10);
        return this.f28092x[i10];
    }

    public final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28093y;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            boolean[] zArr = this.f28092x;
            System.arraycopy(zArr, i11, zArr, i10, this.f28093y - i11);
            this.f28093y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: s */
    public t.a o(int i10) {
        if (i10 >= this.f28093y) {
            return new e(Arrays.copyOf(this.f28092x, i10), this.f28093y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28093y;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: t */
    public Boolean remove(int i10) {
        int i11;
        d();
        l(i10);
        boolean[] zArr = this.f28092x;
        boolean z10 = zArr[i10];
        if (i10 < this.f28093y - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f28093y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(w(i10, bool.booleanValue()));
    }

    public boolean w(int i10, boolean z10) {
        d();
        l(i10);
        boolean[] zArr = this.f28092x;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    public e(boolean[] zArr, int i10) {
        this.f28092x = zArr;
        this.f28093y = i10;
    }
}
