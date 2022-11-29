package ai;

/* loaded from: classes3.dex */
public final class r13 extends zz2<Object> {
    public final transient int A;

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f9300y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f9301z;

    public r13(Object[] objArr, int i10, int i11) {
        this.f9300y = objArr;
        this.f9301z = i10;
        this.A = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        lx2.e(i10, this.A, "index");
        Object obj = this.f9300y[i10 + i10 + this.f9301z];
        obj.getClass();
        return obj;
    }

    @Override // ai.uz2
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
