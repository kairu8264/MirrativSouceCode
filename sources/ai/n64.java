package ai;

/* loaded from: classes3.dex */
public final class n64 extends ri3<n64, m64> implements yj3 {
    private static final n64 zzg;
    private int zzb;
    private long zze = -1;
    private int zzf = 1000;

    static {
        n64 n64Var = new n64();
        zzg = n64Var;
        ri3.y(n64.class, n64Var);
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
                    return new m64(null);
                }
                return new n64();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf", z64.f12899a});
        }
        return (byte) 1;
    }
}
