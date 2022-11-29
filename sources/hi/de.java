package hi;

/* loaded from: classes3.dex */
public final class de implements ce {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35730a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35731b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35730a = n6Var.e("measurement.module.pixie.ees", true);
        f35731b = n6Var.e("measurement.module.pixie.fix_array", true);
    }

    @Override // hi.ce
    public final boolean b() {
        return f35731b.b().booleanValue();
    }

    @Override // hi.ce
    public final boolean zza() {
        return true;
    }

    @Override // hi.ce
    public final boolean zzb() {
        return f35730a.b().booleanValue();
    }
}
