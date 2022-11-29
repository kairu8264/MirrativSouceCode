package dk;

/* loaded from: classes3.dex */
public final class c0<T> implements f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public f0<T> f29683a;

    public static <T> void a(f0<T> f0Var, f0<T> f0Var2) {
        c0 c0Var = (c0) f0Var;
        if (c0Var.f29683a != null) {
            throw new IllegalStateException();
        }
        c0Var.f29683a = f0Var2;
    }

    @Override // dk.f0
    public final T zza() {
        f0<T> f0Var = this.f29683a;
        if (f0Var != null) {
            return f0Var.zza();
        }
        throw new IllegalStateException();
    }
}
