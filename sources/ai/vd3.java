package ai;

/* loaded from: classes3.dex */
public final class vd3 extends ri3<vd3, sd3> implements yj3 {
    private static final vd3 zzf;
    private int zzb;
    private aj3<ud3> zze = ri3.n();

    static {
        vd3 vd3Var = new vd3();
        zzf = vd3Var;
        ri3.y(vd3.class, vd3Var);
    }

    public static sd3 B() {
        return zzf.u();
    }

    public static /* synthetic */ void E(vd3 vd3Var, ud3 ud3Var) {
        ud3Var.getClass();
        aj3<ud3> aj3Var = vd3Var.zze;
        if (!aj3Var.zza()) {
            vd3Var.zze = ri3.o(aj3Var);
        }
        vd3Var.zze.add(ud3Var);
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
                    return new sd3(null);
                }
                return new vd3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", ud3.class});
        }
        return (byte) 1;
    }
}
