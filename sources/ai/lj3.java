package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class lj3 extends yg3<Long> implements RandomAccess, zi3, ek3 {

    /* renamed from: z  reason: collision with root package name */
    public static final lj3 f6582z;

    /* renamed from: x  reason: collision with root package name */
    public long[] f6583x;

    /* renamed from: y  reason: collision with root package name */
    public int f6584y;

    static {
        lj3 lj3Var = new lj3(new long[0], 0);
        f6582z = lj3Var;
        lj3Var.zzb();
    }

    public lj3() {
        this(new long[10], 0);
    }

    public static lj3 f() {
        return f6582z;
    }

    @Override // ai.aj3
    /* renamed from: F */
    public final zi3 i(int i10) {
        if (i10 >= this.f6584y) {
            return new lj3(Arrays.copyOf(this.f6583x, i10), this.f6584y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f6584y)) {
            long[] jArr = this.f6583x;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f6583x, i10, jArr2, i10 + 1, this.f6584y - i10);
                this.f6583x = jArr2;
            }
            this.f6583x[i10] = longValue;
            this.f6584y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        bj3.a(collection);
        if (!(collection instanceof lj3)) {
            return super.addAll(collection);
        }
        lj3 lj3Var = (lj3) collection;
        int i10 = lj3Var.f6584y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6584y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f6583x;
            if (i12 > jArr.length) {
                this.f6583x = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(lj3Var.f6583x, 0, this.f6583x, this.f6584y, lj3Var.f6584y);
            this.f6584y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c0(int i10) {
        if (i10 < 0 || i10 >= this.f6584y) {
            throw new IndexOutOfBoundsException(k(i10));
        }
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
        if (!(obj instanceof lj3)) {
            return super.equals(obj);
        }
        lj3 lj3Var = (lj3) obj;
        if (this.f6584y != lj3Var.f6584y) {
            return false;
        }
        long[] jArr = lj3Var.f6583x;
        for (int i10 = 0; i10 < this.f6584y; i10++) {
            if (this.f6583x[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long g(int i10) {
        c0(i10);
        return this.f6583x[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        c0(i10);
        return Long.valueOf(this.f6583x[i10]);
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6584y; i11++) {
            i10 = (i10 * 31) + bj3.e(this.f6583x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f6584y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f6583x[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(long j10) {
        d();
        int i10 = this.f6584y;
        long[] jArr = this.f6583x;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f6583x = jArr2;
        }
        long[] jArr3 = this.f6583x;
        int i11 = this.f6584y;
        this.f6584y = i11 + 1;
        jArr3[i11] = j10;
    }

    public final String k(int i10) {
        int i11 = this.f6584y;
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
        c0(i10);
        long[] jArr = this.f6583x;
        long j10 = jArr[i10];
        if (i10 < this.f6584y - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f6584y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            long[] jArr = this.f6583x;
            System.arraycopy(jArr, i11, jArr, i10, this.f6584y - i11);
            this.f6584y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        c0(i10);
        long[] jArr = this.f6583x;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6584y;
    }

    public lj3(long[] jArr, int i10) {
        this.f6583x = jArr;
        this.f6584y = i10;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Long) obj).longValue());
        return true;
    }
}
