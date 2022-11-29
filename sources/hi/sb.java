package hi;

/* loaded from: classes3.dex */
public final class sb implements rb {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35987a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35988b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35987a = n6Var.e("measurement.androidId.delete_feature", true);
        f35988b = n6Var.e("measurement.log_androidId_enabled", false);
    }

    @Override // hi.rb
    public final boolean zza() {
        return f35987a.b().booleanValue();
    }
}
