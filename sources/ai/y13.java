package ai;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class y13<E> extends j03<E> {

    /* renamed from: y  reason: collision with root package name */
    public final transient E f12410y;

    /* renamed from: z  reason: collision with root package name */
    public transient int f12411z;

    public y13(E e10) {
        Objects.requireNonNull(e10);
        this.f12410y = e10;
    }

    @Override // ai.uz2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12410y.equals(obj);
    }

    @Override // ai.j03, ai.uz2
    public final b23<E> d() {
        return new k03(this.f12410y);
    }

    @Override // ai.j03, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f12411z;
        if (i10 == 0) {
            int hashCode = this.f12410y.hashCode();
            this.f12411z = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // ai.j03, ai.uz2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new k03(this.f12410y);
    }

    @Override // ai.uz2
    public final int m(Object[] objArr, int i10) {
        objArr[i10] = this.f12410y;
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f12410y.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // ai.j03
    public final boolean w() {
        return this.f12411z != 0;
    }

    @Override // ai.j03
    public final zz2<E> x() {
        return zz2.s(this.f12410y);
    }

    public y13(E e10, int i10) {
        this.f12410y = e10;
        this.f12411z = i10;
    }
}
