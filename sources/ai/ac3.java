package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ac3 extends ri3<ac3, zb3> implements yj3 {
    private static final ac3 zze;
    private dc3 zzb;

    static {
        ac3 ac3Var = new ac3();
        zze = ac3Var;
        ri3.y(ac3.class, ac3Var);
    }

    public static ac3 C(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (ac3) ri3.r(zze, oh3Var, di3Var);
    }

    public static zb3 D() {
        return zze.u();
    }

    public static /* synthetic */ void F(ac3 ac3Var, dc3 dc3Var) {
        dc3Var.getClass();
        ac3Var.zzb = dc3Var;
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
                        return zze;
                    }
                    return new zb3(null);
                }
                return new ac3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final dc3 B() {
        dc3 dc3Var = this.zzb;
        return dc3Var == null ? dc3.E() : dc3Var;
    }
}
