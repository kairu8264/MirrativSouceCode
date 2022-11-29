package hi;

/* loaded from: classes3.dex */
public final class qd implements pd {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Long> f35961a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35962b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f35963c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Boolean> f35964d;

    /* renamed from: e  reason: collision with root package name */
    public static final q6<Long> f35965e;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35961a = n6Var.c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f35962b = n6Var.e("measurement.lifecycle.app_backgrounded_engagement", false);
        f35963c = n6Var.e("measurement.lifecycle.app_backgrounded_tracking", true);
        f35964d = n6Var.e("measurement.lifecycle.app_in_background_parameter", false);
        f35965e = n6Var.c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // hi.pd
    public final boolean zza() {
        return f35962b.b().booleanValue();
    }

    @Override // hi.pd
    public final boolean zzb() {
        return f35964d.b().booleanValue();
    }
}
