package ai;

/* loaded from: classes3.dex */
public final class dc3 extends ri3<dc3, cc3> implements yj3 {
    private static final dc3 zzg;
    private oc3 zzb;
    private xb3 zze;
    private int zzf;

    static {
        dc3 dc3Var = new dc3();
        zzg = dc3Var;
        ri3.y(dc3.class, dc3Var);
    }

    public static cc3 D() {
        return zzg.u();
    }

    public static dc3 E() {
        return zzg;
    }

    public static /* synthetic */ void G(dc3 dc3Var, oc3 oc3Var) {
        oc3Var.getClass();
        dc3Var.zzb = oc3Var;
    }

    public static /* synthetic */ void H(dc3 dc3Var, xb3 xb3Var) {
        xb3Var.getClass();
        dc3Var.zze = xb3Var;
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
                    return new cc3(null);
                }
                return new dc3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final oc3 B() {
        oc3 oc3Var = this.zzb;
        return oc3Var == null ? oc3.D() : oc3Var;
    }

    public final xb3 C() {
        xb3 xb3Var = this.zze;
        return xb3Var == null ? xb3.D() : xb3Var;
    }

    public final int I() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
