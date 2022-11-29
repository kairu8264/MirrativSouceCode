package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class u8 extends f7<Integer> implements RandomAccess, y8, da {

    /* renamed from: z  reason: collision with root package name */
    public static final u8 f36018z;

    /* renamed from: x  reason: collision with root package name */
    public int[] f36019x;

    /* renamed from: y  reason: collision with root package name */
    public int f36020y;

    static {
        u8 u8Var = new u8(new int[0], 0);
        f36018z = u8Var;
        u8Var.zzb();
    }

    public u8() {
        this(new int[10], 0);
    }

    public static u8 g() {
        return f36018z;
    }

    @Override // hi.a9
    /* renamed from: Y */
    public final y8 v(int i10) {
        if (i10 >= this.f36020y) {
            return new u8(Arrays.copyOf(this.f36019x, i10), this.f36020y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f36020y)) {
            int[] iArr = this.f36019x;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f36019x, i10, iArr2, i10 + 1, this.f36020y - i10);
                this.f36019x = iArr2;
            }
            this.f36019x[i10] = intValue;
            this.f36020y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        b9.e(collection);
        if (!(collection instanceof u8)) {
            return super.addAll(collection);
        }
        u8 u8Var = (u8) collection;
        int i10 = u8Var.f36020y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f36020y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f36019x;
            if (i12 > iArr.length) {
                this.f36019x = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(u8Var.f36019x, 0, this.f36019x, this.f36020y, u8Var.f36020y);
            this.f36020y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c0(int i10) {
        d();
        int i11 = this.f36020y;
        int[] iArr = this.f36019x;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f36019x = iArr2;
        }
        int[] iArr3 = this.f36019x;
        int i12 = this.f36020y;
        this.f36020y = i12 + 1;
        iArr3[i12] = i10;
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
        if (!(obj instanceof u8)) {
            return super.equals(obj);
        }
        u8 u8Var = (u8) obj;
        if (this.f36020y != u8Var.f36020y) {
            return false;
        }
        int[] iArr = u8Var.f36019x;
        for (int i10 = 0; i10 < this.f36020y; i10++) {
            if (this.f36019x[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        k(i10);
        return this.f36019x[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f36019x[i10]);
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f36020y; i11++) {
            i10 = (i10 * 31) + this.f36019x[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f36020y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f36019x[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        int i11 = this.f36020y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f36020y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        k(i10);
        int[] iArr = this.f36019x;
        int i12 = iArr[i10];
        if (i10 < this.f36020y - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f36020y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            int[] iArr = this.f36019x;
            System.arraycopy(iArr, i11, iArr, i10, this.f36020y - i11);
            this.f36020y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        k(i10);
        int[] iArr = this.f36019x;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36020y;
    }

    public u8(int[] iArr, int i10) {
        this.f36019x = iArr;
        this.f36020y = i10;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c0(((Integer) obj).intValue());
        return true;
    }
}
