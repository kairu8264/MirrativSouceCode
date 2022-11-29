package ai;

/* loaded from: classes3.dex */
public final class ci3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2841a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2842b;

    public ci3(Object obj, int i10) {
        this.f2841a = obj;
        this.f2842b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ci3) {
            ci3 ci3Var = (ci3) obj;
            return this.f2841a == ci3Var.f2841a && this.f2842b == ci3Var.f2842b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f2841a) * 65535) + this.f2842b;
    }
}
