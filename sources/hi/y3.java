package hi;

/* loaded from: classes3.dex */
public final class y3 extends t8<y3, x3> implements x9 {
    private static final y3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        y3 y3Var = new y3();
        zza = y3Var;
        t8.j(y3.class, y3Var);
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
                    return new x3(null);
                }
                return new y3();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }
}
