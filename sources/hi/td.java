package hi;

/* loaded from: classes3.dex */
public final class td implements sd {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f36003a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Long> f36004b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f36003a = n6Var.e("measurement.validation.internal_limits_internal_event_params", false);
        f36004b = n6Var.c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // hi.sd
    public final boolean zza() {
        return f36003a.b().booleanValue();
    }
}
