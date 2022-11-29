package hi;

/* loaded from: classes3.dex */
public final class ae implements zd {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35646a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Double> f35647b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Long> f35648c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Long> f35649d;

    /* renamed from: e  reason: collision with root package name */
    public static final q6<String> f35650e;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35646a = n6Var.e("measurement.test.boolean_flag", false);
        f35647b = n6Var.b("measurement.test.double_flag", -3.0d);
        f35648c = n6Var.c("measurement.test.int_flag", -2L);
        f35649d = n6Var.c("measurement.test.long_flag", -1L);
        f35650e = n6Var.d("measurement.test.string_flag", "---");
    }

    @Override // hi.zd
    public final long b() {
        return f35649d.b().longValue();
    }

    @Override // hi.zd
    public final boolean c() {
        return f35646a.b().booleanValue();
    }

    @Override // hi.zd
    public final String d() {
        return f35650e.b();
    }

    @Override // hi.zd
    public final double zza() {
        return f35647b.b().doubleValue();
    }

    @Override // hi.zd
    public final long zzb() {
        return f35648c.b().longValue();
    }
}
