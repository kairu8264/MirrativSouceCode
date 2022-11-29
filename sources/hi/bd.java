package hi;

/* loaded from: classes3.dex */
public final class bd implements ad {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35669a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35670b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f35671c;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35669a = n6Var.e("measurement.client.sessions.check_on_reset_and_enable2", true);
        f35670b = n6Var.e("measurement.client.sessions.check_on_startup", true);
        f35671c = n6Var.e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // hi.ad
    public final boolean zza() {
        return true;
    }

    @Override // hi.ad
    public final boolean zzb() {
        return f35669a.b().booleanValue();
    }
}
