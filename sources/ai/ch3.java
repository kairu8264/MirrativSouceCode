package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ch3 extends yg3<Boolean> implements RandomAccess, ek3 {

    /* renamed from: z  reason: collision with root package name */
    public static final ch3 f2831z;

    /* renamed from: x  reason: collision with root package name */
    public boolean[] f2832x;

    /* renamed from: y  reason: collision with root package name */
    public int f2833y;

    static {
        ch3 ch3Var = new ch3(new boolean[0], 0);
        f2831z = ch3Var;
        ch3Var.zzb();
    }

    public ch3() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f2833y)) {
            boolean[] zArr = this.f2832x;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f2832x, i10, zArr2, i10 + 1, this.f2833y - i10);
                this.f2832x = zArr2;
            }
            this.f2832x[i10] = booleanValue;
            this.f2833y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        bj3.a(collection);
        if (!(collection instanceof ch3)) {
            return super.addAll(collection);
        }
        ch3 ch3Var = (ch3) collection;
        int i10 = ch3Var.f2833y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2833y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f2832x;
            if (i12 > zArr.length) {
                this.f2832x = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(ch3Var.f2832x, 0, this.f2832x, this.f2833y, ch3Var.f2833y);
            this.f2833y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
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
        if (!(obj instanceof ch3)) {
            return super.equals(obj);
        }
        ch3 ch3Var = (ch3) obj;
        if (this.f2833y != ch3Var.f2833y) {
            return false;
        }
        boolean[] zArr = ch3Var.f2832x;
        for (int i10 = 0; i10 < this.f2833y; i10++) {
            if (this.f2832x[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        d();
        int i10 = this.f2833y;
        boolean[] zArr = this.f2832x;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2832x = zArr2;
        }
        boolean[] zArr3 = this.f2832x;
        int i11 = this.f2833y;
        this.f2833y = i11 + 1;
        zArr3[i11] = z10;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f2833y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f2832x[i10]);
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2833y; i11++) {
            i10 = (i10 * 31) + bj3.f(this.f2832x[i11]);
        }
        return i10;
    }

    @Override // ai.aj3
    public final /* bridge */ /* synthetic */ aj3 i(int i10) {
        if (i10 >= this.f2833y) {
            return new ch3(Arrays.copyOf(this.f2832x, i10), this.f2833y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f2833y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f2832x[i11] == booleanValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        int i11 = this.f2833y;
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
        g(i10);
        boolean[] zArr = this.f2832x;
        boolean z10 = zArr[i10];
        if (i10 < this.f2833y - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f2833y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            boolean[] zArr = this.f2832x;
            System.arraycopy(zArr, i11, zArr, i10, this.f2833y - i11);
            this.f2833y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i10);
        boolean[] zArr = this.f2832x;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2833y;
    }

    public ch3(boolean[] zArr, int i10) {
        this.f2832x = zArr;
        this.f2833y = i10;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
