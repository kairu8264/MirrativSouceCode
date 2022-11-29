package com.google.protobuf;

import com.google.protobuf.t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class y extends c<Long> implements t.h, RandomAccess, fn.r {

    /* renamed from: z  reason: collision with root package name */
    public static final y f28234z;

    /* renamed from: x  reason: collision with root package name */
    public long[] f28235x;

    /* renamed from: y  reason: collision with root package name */
    public int f28236y;

    static {
        y yVar = new y(new long[0], 0);
        f28234z = yVar;
        yVar.C();
    }

    public y() {
        this(new long[10], 0);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        d();
        t.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f28236y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f28236y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f28235x;
            if (i12 > jArr.length) {
                this.f28235x = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(yVar.f28235x, 0, this.f28235x, this.f28236y, yVar.f28236y);
            this.f28236y = i12;
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
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f28236y != yVar.f28236y) {
            return false;
        }
        long[] jArr = yVar.f28235x;
        for (int i10 = 0; i10 < this.f28236y; i10++) {
            if (this.f28235x[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, Long l10) {
        j(i10, l10.longValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f28236y; i11++) {
            i10 = (i10 * 31) + t.f(this.f28235x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28235x[i10] == longValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10, long j10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f28236y)) {
            long[] jArr = this.f28235x;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f28235x, i10, jArr2, i10 + 1, this.f28236y - i10);
                this.f28235x = jArr2;
            }
            this.f28235x[i10] = j10;
            this.f28236y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(r(i10));
    }

    public void k(long j10) {
        d();
        int i10 = this.f28236y;
        long[] jArr = this.f28235x;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f28235x = jArr2;
        }
        long[] jArr3 = this.f28235x;
        int i11 = this.f28236y;
        this.f28236y = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f28236y) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Long get(int i10) {
        return Long.valueOf(p(i10));
    }

    public long p(int i10) {
        l(i10);
        return this.f28235x[i10];
    }

    public final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28236y;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            long[] jArr = this.f28235x;
            System.arraycopy(jArr, i11, jArr, i10, this.f28236y - i11);
            this.f28236y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: s */
    public t.h o(int i10) {
        if (i10 >= this.f28236y) {
            return new y(Arrays.copyOf(this.f28235x, i10), this.f28236y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28236y;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: t */
    public Long remove(int i10) {
        int i11;
        d();
        l(i10);
        long[] jArr = this.f28235x;
        long j10 = jArr[i10];
        if (i10 < this.f28236y - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f28236y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Long set(int i10, Long l10) {
        return Long.valueOf(w(i10, l10.longValue()));
    }

    public long w(int i10, long j10) {
        d();
        l(i10);
        long[] jArr = this.f28235x;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public y(long[] jArr, int i10) {
        this.f28235x = jArr;
        this.f28236y = i10;
    }
}
