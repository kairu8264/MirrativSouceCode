package hi;

/* loaded from: classes3.dex */
public final class yc implements xc {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f36078a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f36079b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f36080c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Boolean> f36081d;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f36078a = n6Var.e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f36079b = n6Var.e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f36080c = n6Var.e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f36081d = n6Var.e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // hi.xc
    public final boolean b() {
        return f36080c.b().booleanValue();
    }

    @Override // hi.xc
    public final boolean d() {
        return f36081d.b().booleanValue();
    }

    @Override // hi.xc
    public final boolean zza() {
        return true;
    }

    @Override // hi.xc
    public final boolean zzb() {
        return f36079b.b().booleanValue();
    }
}
