package ai;

/* loaded from: classes3.dex */
public final class br extends ri3<br, ar> implements yj3 {
    private static final br zzi;
    private int zzb;
    private rq zze;
    private int zzf = 1000;
    private zq zzg;
    private pq zzh;

    static {
        br brVar = new br();
        zzi = brVar;
        ri3.y(br.class, brVar);
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
                    return new ar(null);
                }
                return new br();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", dp.f3366a, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
