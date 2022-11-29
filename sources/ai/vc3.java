package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class vc3 extends ri3<vc3, uc3> implements yj3 {
    private static final vc3 zzg;
    private int zzb;
    private bd3 zze;
    private oh3 zzf = oh3.f7807x;

    static {
        vc3 vc3Var = new vc3();
        zzg = vc3Var;
        ri3.y(vc3.class, vc3Var);
    }

    public static vc3 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (vc3) ri3.r(zzg, oh3Var, di3Var);
    }

    public static uc3 F() {
        return zzg.u();
    }

    public static vc3 G() {
        return zzg;
    }

    public static /* synthetic */ void J(vc3 vc3Var, bd3 bd3Var) {
        bd3Var.getClass();
        vc3Var.zze = bd3Var;
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
                    return new uc3(null);
                }
                return new vc3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final bd3 C() {
        bd3 bd3Var = this.zze;
        return bd3Var == null ? bd3.D() : bd3Var;
    }

    public final oh3 D() {
        return this.zzf;
    }
}
