package hi;

/* loaded from: classes3.dex */
public final class pb implements ob {

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Boolean> f35912a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Boolean> f35913b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Boolean> f35914c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<Long> f35915d;

    /* renamed from: e  reason: collision with root package name */
    public static final q6<Boolean> f35916e;

    /* renamed from: f  reason: collision with root package name */
    public static final q6<Boolean> f35917f;

    static {
        n6 a10 = new n6(g6.a("com.google.android.gms.measurement")).a();
        f35912a = a10.e("measurement.adid_zero.app_instance_id_fix", true);
        f35913b = a10.e("measurement.adid_zero.service", false);
        f35914c = a10.e("measurement.adid_zero.adid_uid", false);
        f35915d = a10.c("measurement.id.adid_zero.service", 0L);
        f35916e = a10.e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f35917f = a10.e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    @Override // hi.ob
    public final boolean a() {
        return f35917f.b().booleanValue();
    }

    @Override // hi.ob
    public final boolean b() {
        return f35913b.b().booleanValue();
    }

    @Override // hi.ob
    public final boolean c() {
        return f35916e.b().booleanValue();
    }

    @Override // hi.ob
    public final boolean d() {
        return f35914c.b().booleanValue();
    }

    @Override // hi.ob
    public final boolean zza() {
        return true;
    }

    @Override // hi.ob
    public final boolean zzb() {
        return f35912a.b().booleanValue();
    }
}
