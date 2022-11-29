package ai;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t13<E> extends j03<E> {
    public static final Object[] D;
    public static final t13<Object> E;
    public final transient Object[] A;
    public final transient int B;
    public final transient int C;

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f10072y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f10073z;

    static {
        Object[] objArr = new Object[0];
        D = objArr;
        E = new t13<>(objArr, 0, objArr, 0, 0);
    }

    public t13(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f10072y = objArr;
        this.f10073z = i10;
        this.A = objArr2;
        this.B = i11;
        this.C = i12;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.A;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = rz2.b(obj);
        while (true) {
            int i10 = b10 & this.B;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override // ai.j03, ai.uz2
    public final b23<E> d() {
        return k().listIterator(0);
    }

    @Override // ai.uz2
    public final Object[] f() {
        return this.f10072y;
    }

    @Override // ai.uz2
    public final int g() {
        return 0;
    }

    @Override // ai.j03, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10073z;
    }

    @Override // ai.j03, ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // ai.uz2
    public final int j() {
        return this.C;
    }

    @Override // ai.uz2
    public final int m(Object[] objArr, int i10) {
        System.arraycopy(this.f10072y, 0, objArr, i10, this.C);
        return i10 + this.C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C;
    }

    @Override // ai.j03
    public final boolean w() {
        return true;
    }

    @Override // ai.j03
    public final zz2<E> x() {
        return zz2.H(this.f10072y, this.C);
    }
}
