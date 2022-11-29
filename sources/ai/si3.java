package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class si3 extends yg3<Integer> implements RandomAccess, wi3, ek3 {

    /* renamed from: z  reason: collision with root package name */
    public static final si3 f9844z;

    /* renamed from: x  reason: collision with root package name */
    public int[] f9845x;

    /* renamed from: y  reason: collision with root package name */
    public int f9846y;

    static {
        si3 si3Var = new si3(new int[0], 0);
        f9844z = si3Var;
        si3Var.zzb();
    }

    public si3() {
        this(new int[10], 0);
    }

    public static si3 f() {
        return f9844z;
    }

    @Override // ai.aj3
    /* renamed from: E */
    public final wi3 i(int i10) {
        if (i10 >= this.f9846y) {
            return new si3(Arrays.copyOf(this.f9845x, i10), this.f9846y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f9846y)) {
            int[] iArr = this.f9845x;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f9845x, i10, iArr2, i10 + 1, this.f9846y - i10);
                this.f9845x = iArr2;
            }
            this.f9845x[i10] = intValue;
            this.f9846y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        bj3.a(collection);
        if (!(collection instanceof si3)) {
            return super.addAll(collection);
        }
        si3 si3Var = (si3) collection;
        int i10 = si3Var.f9846y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9846y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f9845x;
            if (i12 > iArr.length) {
                this.f9845x = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(si3Var.f9845x, 0, this.f9845x, this.f9846y, si3Var.f9846y);
            this.f9846y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // ai.wi3
    public final void c0(int i10) {
        d();
        int i11 = this.f9846y;
        int[] iArr = this.f9845x;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f9845x = iArr2;
        }
        int[] iArr3 = this.f9845x;
        int i12 = this.f9846y;
        this.f9846y = i12 + 1;
        iArr3[i12] = i10;
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
        if (!(obj instanceof si3)) {
            return super.equals(obj);
        }
        si3 si3Var = (si3) obj;
        if (this.f9846y != si3Var.f9846y) {
            return false;
        }
        int[] iArr = si3Var.f9845x;
        for (int i10 = 0; i10 < this.f9846y; i10++) {
            if (this.f9845x[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i10) {
        j(i10);
        return this.f9845x[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        j(i10);
        return Integer.valueOf(this.f9845x[i10]);
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f9846y; i11++) {
            i10 = (i10 * 31) + this.f9845x[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f9846y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f9845x[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f9846y) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final String k(int i10) {
        int i11 = this.f9846y;
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
        j(i10);
        int[] iArr = this.f9845x;
        int i12 = iArr[i10];
        if (i10 < this.f9846y - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f9846y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            int[] iArr = this.f9845x;
            System.arraycopy(iArr, i11, iArr, i10, this.f9846y - i11);
            this.f9846y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        j(i10);
        int[] iArr = this.f9845x;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9846y;
    }

    public si3(int[] iArr, int i10) {
        this.f9845x = iArr;
        this.f9846y = i10;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c0(((Integer) obj).intValue());
        return true;
    }
}
