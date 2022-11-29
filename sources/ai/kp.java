package ai;

/* loaded from: classes3.dex */
public final class kp extends ri3<kp, jp> implements yj3 {
    private static final kp zzg;
    private int zzb;
    private int zze;
    private wi3 zzf = ri3.k();

    static {
        kp kpVar = new kp();
        zzg = kpVar;
        ri3.y(kp.class, kpVar);
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
                        return zzg;
                    }
                    return new jp(null);
                }
                return new kp();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzb", "zze", dp.f3366a, "zzf"});
        }
        return (byte) 1;
    }
}
