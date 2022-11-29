package hi;

/* loaded from: classes3.dex */
public final class uc implements tc {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f36023a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f36024b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f36023a = n6Var.e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f36024b = n6Var.e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // hi.tc
    public final boolean b() {
        return f36024b.b().booleanValue();
    }

    @Override // hi.tc
    public final boolean zza() {
        return true;
    }

    @Override // hi.tc
    public final boolean zzb() {
        return f36023a.b().booleanValue();
    }
}
