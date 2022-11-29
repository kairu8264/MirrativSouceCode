package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class fa<E> extends f7<E> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public static final fa<Object> f35758z;

    /* renamed from: x  reason: collision with root package name */
    public E[] f35759x;

    /* renamed from: y  reason: collision with root package name */
    public int f35760y;

    static {
        fa<Object> faVar = new fa<>(new Object[0], 0);
        f35758z = faVar;
        faVar.zzb();
    }

    public fa(E[] eArr, int i10) {
        this.f35759x = eArr;
        this.f35760y = i10;
    }

    public static <E> fa<E> f() {
        return (fa<E>) f35758z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f35760y)) {
            E[] eArr = this.f35759x;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f35759x, i10, eArr2, i10 + 1, this.f35760y - i10);
                this.f35759x = eArr2;
            }
            this.f35759x[i10] = e10;
            this.f35760y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    public final String g(int i10) {
        int i11 = this.f35760y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        j(i10);
        return this.f35759x[i10];
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35760y) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        d();
        j(i10);
        E[] eArr = this.f35759x;
        E e10 = eArr[i10];
        if (i10 < this.f35760y - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f35760y--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        j(i10);
        E[] eArr = this.f35759x;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35760y;
    }

    @Override // hi.a9
    public final /* bridge */ /* synthetic */ a9 v(int i10) {
        if (i10 >= this.f35760y) {
            return new fa(Arrays.copyOf(this.f35759x, i10), this.f35760y);
        }
        throw new IllegalArgumentException();
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f35760y;
        E[] eArr = this.f35759x;
        if (i10 == eArr.length) {
            this.f35759x = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f35759x;
        int i11 = this.f35760y;
        this.f35760y = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
