package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class k9 extends f7<Long> implements RandomAccess, z8, da {

    /* renamed from: z  reason: collision with root package name */
    public static final k9 f35833z;

    /* renamed from: x  reason: collision with root package name */
    public long[] f35834x;

    /* renamed from: y  reason: collision with root package name */
    public int f35835y;

    static {
        k9 k9Var = new k9(new long[0], 0);
        f35833z = k9Var;
        k9Var.zzb();
    }

    public k9() {
        this(new long[10], 0);
    }

    public static k9 f() {
        return f35833z;
    }

    @Override // hi.z8
    public final long G(int i10) {
        k(i10);
        return this.f35834x[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f35835y)) {
            long[] jArr = this.f35834x;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f35834x, i10, jArr2, i10 + 1, this.f35835y - i10);
                this.f35834x = jArr2;
            }
            this.f35834x[i10] = longValue;
            this.f35835y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        b9.e(collection);
        if (!(collection instanceof k9)) {
            return super.addAll(collection);
        }
        k9 k9Var = (k9) collection;
        int i10 = k9Var.f35835y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35835y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f35834x;
            if (i12 > jArr.length) {
                this.f35834x = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(k9Var.f35834x, 0, this.f35834x, this.f35835y, k9Var.f35835y);
            this.f35835y = i12;
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
        if (!(obj instanceof k9)) {
            return super.equals(obj);
        }
        k9 k9Var = (k9) obj;
        if (this.f35835y != k9Var.f35835y) {
            return false;
        }
        long[] jArr = k9Var.f35834x;
        for (int i10 = 0; i10 < this.f35835y; i10++) {
            if (this.f35834x[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j10) {
        d();
        int i10 = this.f35835y;
        long[] jArr = this.f35834x;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f35834x = jArr2;
        }
        long[] jArr3 = this.f35834x;
        int i11 = this.f35835y;
        this.f35835y = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f35834x[i10]);
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35835y; i11++) {
            i10 = (i10 * 31) + b9.c(this.f35834x[i11]);
        }
        return i10;
    }

    @Override // hi.a9
    /* renamed from: i */
    public final z8 v(int i10) {
        if (i10 >= this.f35835y) {
            return new k9(Arrays.copyOf(this.f35834x, i10), this.f35835y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f35835y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f35834x[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        int i11 = this.f35835y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f35835y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        long[] jArr = this.f35834x;
        long j10 = jArr[i10];
        if (i10 < this.f35835y - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f35835y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            long[] jArr = this.f35834x;
            System.arraycopy(jArr, i11, jArr, i10, this.f35835y - i11);
            this.f35835y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        k(i10);
        long[] jArr = this.f35834x;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35835y;
    }

    public k9(long[] jArr, int i10) {
        this.f35834x = jArr;
        this.f35835y = i10;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
