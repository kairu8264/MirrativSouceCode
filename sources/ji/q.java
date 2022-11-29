package ji;

/* loaded from: classes3.dex */
public final class q<E> extends p<E> {

    /* renamed from: z  reason: collision with root package name */
    public static final p<Object> f38066z = new q(new Object[0], 0);

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f38067y;

    public q(Object[] objArr, int i10) {
        this.f38067y = objArr;
    }

    @Override // ji.p, ji.m
    public final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f38067y, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ji.m
    public final int f() {
        return 0;
    }

    @Override // ji.m
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i10) {
        j.a(i10, 0, "index");
        return (E) this.f38067y[i10];
    }

    @Override // ji.m
    public final Object[] j() {
        return this.f38067y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
