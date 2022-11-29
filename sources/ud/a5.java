package ud;

import java.util.List;

/* loaded from: classes2.dex */
public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<a>> f54754a;

    public a5() {
        this(null, 1, null);
    }

    public a5(androidx.lifecycle.e0<List<a>> e0Var) {
        jo.p.h(e0Var, "items");
        this.f54754a = e0Var;
    }

    public final androidx.lifecycle.e0<List<a>> a() {
        return this.f54754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && jo.p.c(this.f54754a, ((a5) obj).f54754a);
    }

    public int hashCode() {
        return this.f54754a.hashCode();
    }

    public String toString() {
        return "ViewHistoriesBindModel(items=" + this.f54754a + ')';
    }

    public /* synthetic */ a5(androidx.lifecycle.e0 e0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0(xn.s.k()) : e0Var);
    }
}
