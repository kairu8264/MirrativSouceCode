package lk;

/* loaded from: classes3.dex */
public class m0<E> extends r<E> {
    public static final r<Object> A = new m0(new Object[0], 0);

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f40329y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f40330z;

    public m0(Object[] objArr, int i10) {
        this.f40329y = objArr;
        this.f40330z = i10;
    }

    @Override // lk.r, lk.p
    public int f(Object[] objArr, int i10) {
        System.arraycopy(this.f40329y, 0, objArr, i10, this.f40330z);
        return i10 + this.f40330z;
    }

    @Override // lk.p
    public Object[] g() {
        return this.f40329y;
    }

    @Override // java.util.List
    public E get(int i10) {
        kk.j.g(i10, this.f40330z);
        return (E) this.f40329y[i10];
    }

    @Override // lk.p
    public int j() {
        return this.f40330z;
    }

    @Override // lk.p
    public int k() {
        return 0;
    }

    @Override // lk.p
    public boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40330z;
    }
}
