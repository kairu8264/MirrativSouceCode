package ai;

/* loaded from: classes3.dex */
public final class tu2 extends ri3<tu2, su2> implements yj3 {
    private static final xi3<Integer, Object> zzf = new qu2();
    private static final tu2 zzj;
    private int zzb;
    private wi3 zze = ri3.k();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        tu2 tu2Var = new tu2();
        zzj = tu2Var;
        ri3.y(tu2.class, tu2Var);
    }

    public static su2 B() {
        return zzj.u();
    }

    public static /* synthetic */ void D(tu2 tu2Var, String str) {
        str.getClass();
        tu2Var.zzb |= 1;
        tu2Var.zzg = str;
    }

    public static /* synthetic */ void E(tu2 tu2Var, int i10) {
        wi3 wi3Var = tu2Var.zze;
        if (!wi3Var.zza()) {
            tu2Var.zze = ri3.l(wi3Var);
        }
        tu2Var.zze.c0(2);
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
                        return zzj;
                    }
                    return new su2(null);
                }
                return new tu2();
            }
            return ri3.z(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zze", ru2.f9597a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
