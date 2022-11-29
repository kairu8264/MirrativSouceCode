package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ha3 extends ri3<ha3, ga3> implements yj3 {
    private static final ha3 zzf;
    private ka3 zzb;
    private int zze;

    static {
        ha3 ha3Var = new ha3();
        zzf = ha3Var;
        ri3.y(ha3.class, ha3Var);
    }

    public static ha3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (ha3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static ga3 E() {
        return zzf.u();
    }

    public static ha3 F() {
        return zzf;
    }

    public static /* synthetic */ void H(ha3 ha3Var, ka3 ka3Var) {
        ka3Var.getClass();
        ha3Var.zzb = ka3Var;
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
                    return new ga3(null);
                }
                return new ha3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final ka3 B() {
        ka3 ka3Var = this.zzb;
        return ka3Var == null ? ka3.D() : ka3Var;
    }

    public final int C() {
        return this.zze;
    }
}
