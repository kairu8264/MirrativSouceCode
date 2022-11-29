package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ea3 extends ri3<ea3, da3> implements yj3 {
    private static final ea3 zzg;
    private int zzb;
    private ka3 zze;
    private oh3 zzf = oh3.f7807x;

    static {
        ea3 ea3Var = new ea3();
        zzg = ea3Var;
        ri3.y(ea3.class, ea3Var);
    }

    public static ea3 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (ea3) ri3.r(zzg, oh3Var, di3Var);
    }

    public static da3 F() {
        return zzg.u();
    }

    public static ea3 G() {
        return zzg;
    }

    public static /* synthetic */ void J(ea3 ea3Var, ka3 ka3Var) {
        ka3Var.getClass();
        ea3Var.zze = ka3Var;
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
                    return new da3(null);
                }
                return new ea3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final ka3 C() {
        ka3 ka3Var = this.zze;
        return ka3Var == null ? ka3.D() : ka3Var;
    }

    public final oh3 D() {
        return this.zzf;
    }
}
