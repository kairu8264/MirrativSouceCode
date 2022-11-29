package ai;

/* loaded from: classes3.dex */
public final class mm3 extends ri3<mm3, km3> implements yj3 {
    private static final mm3 zzh;
    private int zzb;
    private int zze;
    private String zzf = "";
    private oh3 zzg = oh3.f7807x;

    static {
        mm3 mm3Var = new mm3();
        zzh = mm3Var;
        ri3.y(mm3.class, mm3Var);
    }

    public static km3 B() {
        return zzh.u();
    }

    public static /* synthetic */ mm3 C() {
        return zzh;
    }

    public static /* synthetic */ void D(mm3 mm3Var, String str) {
        mm3Var.zzb |= 2;
        mm3Var.zzf = "image/png";
    }

    public static /* synthetic */ void E(mm3 mm3Var, oh3 oh3Var) {
        oh3Var.getClass();
        mm3Var.zzb |= 4;
        mm3Var.zzg = oh3Var;
    }

    public static /* synthetic */ void F(mm3 mm3Var, int i10) {
        mm3Var.zze = 1;
        mm3Var.zzb = 1 | mm3Var.zzb;
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
                    return new km3(null);
                }
                return new mm3();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", lm3.f6620a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
