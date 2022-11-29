package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class na3 extends ri3<na3, ma3> implements yj3 {
    private static final na3 zzg;
    private int zzb;
    private ta3 zze;
    private oh3 zzf = oh3.f7807x;

    static {
        na3 na3Var = new na3();
        zzg = na3Var;
        ri3.y(na3.class, na3Var);
    }

    public static na3 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (na3) ri3.r(zzg, oh3Var, di3Var);
    }

    public static ma3 F() {
        return zzg.u();
    }

    public static /* synthetic */ void I(na3 na3Var, ta3 ta3Var) {
        ta3Var.getClass();
        na3Var.zze = ta3Var;
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
                    return new ma3(null);
                }
                return new na3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final ta3 C() {
        ta3 ta3Var = this.zze;
        return ta3Var == null ? ta3.D() : ta3Var;
    }

    public final oh3 D() {
        return this.zzf;
    }
}
