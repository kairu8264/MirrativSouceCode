package lk;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class o0<E> extends v<E> {
    public static final o0<Object> D = new o0<>(new Object[0], 0, null, 0, 0);
    public final transient int A;
    public final transient int B;
    public final transient int C;

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f40338y;

    /* renamed from: z  reason: collision with root package name */
    public final transient Object[] f40339z;

    public o0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f40338y = objArr;
        this.f40339z = objArr2;
        this.A = i11;
        this.B = i10;
        this.C = i12;
    }

    @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f40339z;
        if (obj == null || objArr == null) {
            return false;
        }
        int c10 = o.c(obj);
        while (true) {
            int i10 = c10 & this.A;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    @Override // lk.p
    public int f(Object[] objArr, int i10) {
        System.arraycopy(this.f40338y, 0, objArr, i10, this.C);
        return i10 + this.C;
    }

    @Override // lk.p
    public Object[] g() {
        return this.f40338y;
    }

    @Override // lk.v, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.B;
    }

    @Override // lk.p
    public int j() {
        return this.C;
    }

    @Override // lk.p
    public int k() {
        return 0;
    }

    @Override // lk.p
    public boolean l() {
        return false;
    }

    @Override // lk.v, lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public v0<E> iterator() {
        return d().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.C;
    }

    @Override // lk.v
    public r<E> u() {
        return r.r(this.f40338y, this.C);
    }

    @Override // lk.v
    public boolean w() {
        return true;
    }
}
