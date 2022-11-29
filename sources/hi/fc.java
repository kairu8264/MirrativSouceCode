package hi;

/* loaded from: classes3.dex */
public final class fc implements ec {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35770a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35771b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f35772c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Long> f35773d;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35770a = n6Var.e("measurement.client.consent_state_v1", true);
        f35771b = n6Var.e("measurement.client.3p_consent_state_v1", true);
        f35772c = n6Var.e("measurement.service.consent_state_v1_W36", true);
        f35773d = n6Var.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // hi.ec
    public final long zza() {
        return f35773d.b().longValue();
    }
}
