package hi;

/* loaded from: classes3.dex */
public final class nd implements md {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35881a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35882b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f35883c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Long> f35884d;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35881a = n6Var.e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f35882b = n6Var.e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f35883c = n6Var.e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f35884d = n6Var.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // hi.md
    public final boolean zza() {
        return f35881a.b().booleanValue();
    }

    @Override // hi.md
    public final boolean zzb() {
        return f35883c.b().booleanValue();
    }
}
