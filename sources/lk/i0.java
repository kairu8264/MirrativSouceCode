package lk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class i0 extends k0<Comparable> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final i0 f40309w = new i0();

    @Override // lk.k0
    public <S extends Comparable> k0<S> f() {
        return p0.f40344w;
    }

    @Override // lk.k0, java.util.Comparator
    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        kk.j.i(comparable);
        kk.j.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
