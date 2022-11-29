package lk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p0 extends k0<Comparable> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final p0 f40344w = new p0();

    @Override // lk.k0
    public <S extends Comparable> k0<S> f() {
        return k0.c();
    }

    @Override // lk.k0, java.util.Comparator
    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        kk.j.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
