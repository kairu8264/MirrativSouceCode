package ai;

/* loaded from: classes3.dex */
public final class zl3 extends ri3<zl3, yl3> implements yj3 {
    private static final zl3 zzf;
    private int zzb;
    private String zze = "";

    static {
        zl3 zl3Var = new zl3();
        zzf = zl3Var;
        ri3.y(zl3.class, zl3Var);
    }

    public static yl3 B() {
        return zzf.u();
    }

    public static /* synthetic */ void D(zl3 zl3Var, String str) {
        zl3Var.zzb |= 1;
        zl3Var.zze = str;
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
                        return zzf;
                    }
                    return new yl3(null);
                }
                return new zl3();
            }
            return ri3.z(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
