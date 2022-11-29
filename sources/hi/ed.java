package hi;

/* loaded from: classes3.dex */
public final class ed implements dd {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35743a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35744b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Long> f35745c;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35743a = n6Var.e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f35744b = n6Var.e("measurement.collection.redundant_engagement_removal_enabled", false);
        f35745c = n6Var.c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // hi.dd
    public final boolean zza() {
        return f35744b.b().booleanValue();
    }
}
