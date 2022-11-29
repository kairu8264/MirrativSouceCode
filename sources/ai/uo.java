package ai;

/* loaded from: classes3.dex */
public final class uo extends ri3<uo, to> implements yj3 {
    private static final uo zzj;
    private int zzb;
    private String zze = "";
    private aj3<oo> zzf = ri3.n();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        uo uoVar = new uo();
        zzj = uoVar;
        ri3.y(uo.class, uoVar);
    }

    public static uo B() {
        return zzj;
    }

    public static /* synthetic */ void D(uo uoVar, String str) {
        str.getClass();
        uoVar.zzb |= 1;
        uoVar.zze = str;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                vi3 vi3Var = dp.f3366a;
                return ri3.z(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", oo.class, "zzg", vi3Var, "zzh", vi3Var, "zzi", vi3Var});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzj;
                }
                return new to(null);
            } else {
                return new uo();
            }
        }
        return (byte) 1;
    }
}
