package ai;

/* loaded from: classes3.dex */
public final class bp extends ri3<bp, zo> implements yj3 {
    private static final bp zzi;
    private int zzb;
    private int zze;
    private rq zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        bp bpVar = new bp();
        zzi = bpVar;
        ri3.y(bp.class, bpVar);
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
                    return new zo(null);
                }
                return new bp();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzb", "zze", ap.f1962a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
