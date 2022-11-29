package ph;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f47474a;

    /* renamed from: b  reason: collision with root package name */
    public final nh.c f47475b;

    public /* synthetic */ d0(b bVar, nh.c cVar, c0 c0Var) {
        this.f47474a = bVar;
        this.f47475b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d0)) {
            d0 d0Var = (d0) obj;
            if (rh.n.a(this.f47474a, d0Var.f47474a) && rh.n.a(this.f47475b, d0Var.f47475b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rh.n.b(this.f47474a, this.f47475b);
    }

    public final String toString() {
        return rh.n.c(this).a("key", this.f47474a).a("feature", this.f47475b).toString();
    }
}
