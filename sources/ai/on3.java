package ai;

/* loaded from: classes3.dex */
public final class on3<T> implements rn3<T> {

    /* renamed from: a  reason: collision with root package name */
    public eo3<T> f7868a;

    public static <T> void a(eo3<T> eo3Var, eo3<T> eo3Var2) {
        on3 on3Var = (on3) eo3Var;
        if (on3Var.f7868a != null) {
            throw new IllegalStateException();
        }
        on3Var.f7868a = eo3Var2;
    }

    @Override // ai.eo3
    public final T zzb() {
        eo3<T> eo3Var = this.f7868a;
        if (eo3Var != null) {
            return eo3Var.zzb();
        }
        throw new IllegalStateException();
    }
}
