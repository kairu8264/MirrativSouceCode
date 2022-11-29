package ai;

/* loaded from: classes3.dex */
public final class xu2 extends ri3<xu2, vu2> implements yj3 {
    private static final xu2 zzi;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private tu2 zzh;

    static {
        xu2 xu2Var = new xu2();
        zzi = xu2Var;
        ri3.y(xu2.class, xu2Var);
    }

    public static vu2 B() {
        return zzi.u();
    }

    public static /* synthetic */ void D(xu2 xu2Var, String str) {
        str.getClass();
        xu2Var.zzb |= 2;
        xu2Var.zzf = str;
    }

    public static /* synthetic */ void E(xu2 xu2Var, tu2 tu2Var) {
        tu2Var.getClass();
        xu2Var.zzh = tu2Var;
        xu2Var.zzb |= 8;
    }

    public static /* synthetic */ void F(xu2 xu2Var, int i10) {
        xu2Var.zze = 1;
        xu2Var.zzb = 1 | xu2Var.zzb;
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
                    return new vu2(null);
                }
                return new xu2();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", wu2.f11753a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
