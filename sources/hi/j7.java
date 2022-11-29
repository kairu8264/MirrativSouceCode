package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class j7 extends f7<Boolean> implements RandomAccess, da {

    /* renamed from: z  reason: collision with root package name */
    public static final j7 f35819z;

    /* renamed from: x  reason: collision with root package name */
    public boolean[] f35820x;

    /* renamed from: y  reason: collision with root package name */
    public int f35821y;

    static {
        j7 j7Var = new j7(new boolean[0], 0);
        f35819z = j7Var;
        j7Var.zzb();
    }

    public j7() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f35821y)) {
            boolean[] zArr = this.f35820x;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f35820x, i10, zArr2, i10 + 1, this.f35821y - i10);
                this.f35820x = zArr2;
            }
            this.f35820x[i10] = booleanValue;
            this.f35821y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        b9.e(collection);
        if (!(collection instanceof j7)) {
            return super.addAll(collection);
        }
        j7 j7Var = (j7) collection;
        int i10 = j7Var.f35821y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35821y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f35820x;
            if (i12 > zArr.length) {
                this.f35820x = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(j7Var.f35820x, 0, this.f35820x, this.f35821y, j7Var.f35821y);
            this.f35821y = i12;
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
        if (!(obj instanceof j7)) {
            return super.equals(obj);
        }
        j7 j7Var = (j7) obj;
        if (this.f35821y != j7Var.f35821y) {
            return false;
        }
        boolean[] zArr = j7Var.f35820x;
        for (int i10 = 0; i10 < this.f35821y; i10++) {
            if (this.f35820x[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        d();
        int i10 = this.f35821y;
        boolean[] zArr = this.f35820x;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f35820x = zArr2;
        }
        boolean[] zArr3 = this.f35820x;
        int i11 = this.f35821y;
        this.f35821y = i11 + 1;
        zArr3[i11] = z10;
    }

    public final String g(int i10) {
        int i11 = this.f35821y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Boolean.valueOf(this.f35820x[i10]);
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35821y; i11++) {
            i10 = (i10 * 31) + b9.a(this.f35820x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f35821y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f35820x[i11] == booleanValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35821y) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        j(i10);
        boolean[] zArr = this.f35820x;
        boolean z10 = zArr[i10];
        if (i10 < this.f35821y - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f35821y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            boolean[] zArr = this.f35820x;
            System.arraycopy(zArr, i11, zArr, i10, this.f35821y - i11);
            this.f35821y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        j(i10);
        boolean[] zArr = this.f35820x;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35821y;
    }

    @Override // hi.a9
    public final /* bridge */ /* synthetic */ a9 v(int i10) {
        if (i10 >= this.f35821y) {
            return new j7(Arrays.copyOf(this.f35820x, i10), this.f35821y);
        }
        throw new IllegalArgumentException();
    }

    public j7(boolean[] zArr, int i10) {
        this.f35820x = zArr;
        this.f35821y = i10;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
