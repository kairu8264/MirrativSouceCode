package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ba3 extends ri3<ba3, aa3> implements yj3 {
    private static final ba3 zzf;
    private ha3 zzb;
    private yc3 zze;

    static {
        ba3 ba3Var = new ba3();
        zzf = ba3Var;
        ri3.y(ba3.class, ba3Var);
    }

    public static ba3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (ba3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static aa3 E() {
        return zzf.u();
    }

    public static /* synthetic */ void G(ba3 ba3Var, ha3 ha3Var) {
        ha3Var.getClass();
        ba3Var.zzb = ha3Var;
    }

    public static /* synthetic */ void H(ba3 ba3Var, yc3 yc3Var) {
        yc3Var.getClass();
        ba3Var.zze = yc3Var;
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
                    return new aa3(null);
                }
                return new ba3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final ha3 B() {
        ha3 ha3Var = this.zzb;
        return ha3Var == null ? ha3.F() : ha3Var;
    }

    public final yc3 C() {
        yc3 yc3Var = this.zze;
        return yc3Var == null ? yc3.F() : yc3Var;
    }
}
