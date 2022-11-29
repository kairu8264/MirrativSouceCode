package ud;

import java.util.List;

/* loaded from: classes2.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<a>> f55800a;

    public z1() {
        this(null, 1, null);
    }

    public z1(androidx.lifecycle.e0<List<a>> e0Var) {
        jo.p.h(e0Var, "items");
        this.f55800a = e0Var;
    }

    public final androidx.lifecycle.e0<List<a>> a() {
        return this.f55800a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1) && jo.p.c(this.f55800a, ((z1) obj).f55800a);
    }

    public int hashCode() {
        return this.f55800a.hashCode();
    }

    public String toString() {
        return "LiveHistoriesBindModel(items=" + this.f55800a + ')';
    }

    public /* synthetic */ z1(androidx.lifecycle.e0 e0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0(xn.s.k()) : e0Var);
    }
}
