package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class gk3<E> extends yg3<E> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public static final gk3<Object> f4501z;

    /* renamed from: x  reason: collision with root package name */
    public E[] f4502x;

    /* renamed from: y  reason: collision with root package name */
    public int f4503y;

    static {
        gk3<Object> gk3Var = new gk3<>(new Object[0], 0);
        f4501z = gk3Var;
        gk3Var.zzb();
    }

    public gk3(E[] eArr, int i10) {
        this.f4502x = eArr;
        this.f4503y = i10;
    }

    public static <E> gk3<E> f() {
        return (gk3<E>) f4501z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f4503y)) {
            E[] eArr = this.f4502x;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f4502x, i10, eArr2, i10 + 1, this.f4503y - i10);
                this.f4502x = eArr2;
            }
            this.f4502x[i10] = e10;
            this.f4503y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f4503y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        g(i10);
        return this.f4502x[i10];
    }

    @Override // ai.aj3
    public final /* bridge */ /* synthetic */ aj3 i(int i10) {
        if (i10 >= this.f4503y) {
            return new gk3(Arrays.copyOf(this.f4502x, i10), this.f4503y);
        }
        throw new IllegalArgumentException();
    }

    public final String j(int i10) {
        int i11 = this.f4503y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        d();
        g(i10);
        E[] eArr = this.f4502x;
        E e10 = eArr[i10];
        if (i10 < this.f4503y - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f4503y--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        g(i10);
        E[] eArr = this.f4502x;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4503y;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f4503y;
        E[] eArr = this.f4502x;
        if (i10 == eArr.length) {
            this.f4502x = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4502x;
        int i11 = this.f4503y;
        this.f4503y = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
