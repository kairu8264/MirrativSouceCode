package ai;

/* loaded from: classes3.dex */
public final class ud3 extends ri3<ud3, td3> implements yj3 {
    private static final ud3 zzh;
    private String zzb = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ud3 ud3Var = new ud3();
        zzh = ud3Var;
        ri3.y(ud3.class, ud3Var);
    }

    public static td3 B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(ud3 ud3Var, String str) {
        str.getClass();
        ud3Var.zzb = str;
    }

    public static /* synthetic */ void F(ud3 ud3Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        ud3Var.zze = i10 - 2;
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
                        return zzh;
                    }
                    return new td3(null);
                }
                return new ud3();
            }
            return ri3.z(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
