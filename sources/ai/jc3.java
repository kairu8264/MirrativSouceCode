package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class jc3 extends ri3<jc3, ic3> implements yj3 {
    private static final jc3 zzh;
    private int zzb;
    private dc3 zze;
    private oh3 zzf;
    private oh3 zzg;

    static {
        jc3 jc3Var = new jc3();
        zzh = jc3Var;
        ri3.y(jc3.class, jc3Var);
    }

    public jc3() {
        oh3 oh3Var = oh3.f7807x;
        this.zzf = oh3Var;
        this.zzg = oh3Var;
    }

    public static jc3 F(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (jc3) ri3.r(zzh, oh3Var, di3Var);
    }

    public static ic3 G() {
        return zzh.u();
    }

    public static jc3 H() {
        return zzh;
    }

    public static /* synthetic */ void K(jc3 jc3Var, dc3 dc3Var) {
        dc3Var.getClass();
        jc3Var.zze = dc3Var;
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
                        return zzh;
                    }
                    return new ic3(null);
                }
                return new jc3();
            }
            return ri3.z(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final dc3 C() {
        dc3 dc3Var = this.zze;
        return dc3Var == null ? dc3.E() : dc3Var;
    }

    public final oh3 D() {
        return this.zzf;
    }

    public final oh3 E() {
        return this.zzg;
    }
}
