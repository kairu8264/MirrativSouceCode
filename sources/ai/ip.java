package ai;

/* loaded from: classes3.dex */
public final class ip extends ri3<ip, hp> implements yj3 {
    private static final ip zzi;
    private int zzb;
    private int zzf;
    private pq zzh;
    private String zze = "";
    private wi3 zzg = ri3.k();

    static {
        ip ipVar = new ip();
        zzi = ipVar;
        ri3.y(ip.class, ipVar);
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzi;
                    }
                    return new hp(null);
                }
                return new ip();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", dp.f3366a, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
