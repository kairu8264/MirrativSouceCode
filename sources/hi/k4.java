package hi;

/* loaded from: classes3.dex */
public final class k4 extends t8<k4, j4> implements x9 {
    private static final k4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        k4 k4Var = new k4();
        zza = k4Var;
        t8.j(k4.class, k4Var);
    }

    public static j4 r() {
        return zza.k();
    }

    public static /* synthetic */ void t(k4 k4Var, String str) {
        str.getClass();
        k4Var.zze |= 1;
        k4Var.zzf = str;
    }

    public static /* synthetic */ void u(k4 k4Var, long j10) {
        k4Var.zze |= 2;
        k4Var.zzg = j10;
    }

    @Override // hi.t8
    public final Object q(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new j4(null);
                }
                return new k4();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
