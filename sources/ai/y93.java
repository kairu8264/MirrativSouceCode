package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class y93 extends ri3<y93, x93> implements yj3 {
    private static final y93 zzg;
    private int zzb;
    private ea3 zze;
    private vc3 zzf;

    static {
        y93 y93Var = new y93();
        zzg = y93Var;
        ri3.y(y93.class, y93Var);
    }

    public static y93 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (y93) ri3.r(zzg, oh3Var, di3Var);
    }

    public static x93 F() {
        return zzg.u();
    }

    public static /* synthetic */ void I(y93 y93Var, ea3 ea3Var) {
        ea3Var.getClass();
        y93Var.zze = ea3Var;
    }

    public static /* synthetic */ void J(y93 y93Var, vc3 vc3Var) {
        vc3Var.getClass();
        y93Var.zzf = vc3Var;
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
                    return new x93(null);
                }
                return new y93();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final ea3 C() {
        ea3 ea3Var = this.zze;
        return ea3Var == null ? ea3.G() : ea3Var;
    }

    public final vc3 D() {
        vc3 vc3Var = this.zzf;
        return vc3Var == null ? vc3.G() : vc3Var;
    }
}
