package ai;

/* loaded from: classes3.dex */
public final class m13<E> extends zz2<E> {
    public static final zz2<Object> A = new m13(new Object[0], 0);

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f6767y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f6768z;

    public m13(Object[] objArr, int i10) {
        this.f6767y = objArr;
        this.f6768z = i10;
    }

    @Override // ai.uz2
    public final Object[] f() {
        return this.f6767y;
    }

    @Override // ai.uz2
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i10) {
        lx2.e(i10, this.f6768z, "index");
        E e10 = (E) this.f6767y[i10];
        e10.getClass();
        return e10;
    }

    @Override // ai.uz2
    public final int j() {
        return this.f6768z;
    }

    @Override // ai.uz2
    public final boolean l() {
        return false;
    }

    @Override // ai.zz2, ai.uz2
    public final int m(Object[] objArr, int i10) {
        System.arraycopy(this.f6767y, 0, objArr, i10, this.f6768z);
        return i10 + this.f6768z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6768z;
    }
}
