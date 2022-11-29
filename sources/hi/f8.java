package hi;

/* loaded from: classes3.dex */
public final class f8 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f35756a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35757b;

    public f8(Object obj, int i10) {
        this.f35756a = obj;
        this.f35757b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f8) {
            f8 f8Var = (f8) obj;
            return this.f35756a == f8Var.f35756a && this.f35757b == f8Var.f35757b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f35756a) * 65535) + this.f35757b;
    }
}
