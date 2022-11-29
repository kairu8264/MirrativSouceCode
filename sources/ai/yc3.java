package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class yc3 extends ri3<yc3, xc3> implements yj3 {
    private static final yc3 zzg;
    private bd3 zzb;
    private int zze;
    private int zzf;

    static {
        yc3 yc3Var = new yc3();
        zzg = yc3Var;
        ri3.y(yc3.class, yc3Var);
    }

    public static yc3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (yc3) ri3.r(zzg, oh3Var, di3Var);
    }

    public static xc3 E() {
        return zzg.u();
    }

    public static yc3 F() {
        return zzg;
    }

    public static /* synthetic */ void H(yc3 yc3Var, bd3 bd3Var) {
        bd3Var.getClass();
        yc3Var.zzb = bd3Var;
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
                    return new xc3(null);
                }
                return new yc3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final bd3 B() {
        bd3 bd3Var = this.zzb;
        return bd3Var == null ? bd3.D() : bd3Var;
    }

    public final int C() {
        return this.zze;
    }
}
