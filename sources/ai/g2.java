package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class g2 extends ri3<g2, f2> implements yj3 {
    private static final g2 zzh;
    private int zzb;
    private j2 zze;
    private oh3 zzf;
    private oh3 zzg;

    static {
        g2 g2Var = new g2();
        zzh = g2Var;
        ri3.y(g2.class, g2Var);
    }

    public g2() {
        oh3 oh3Var = oh3.f7807x;
        this.zzf = oh3Var;
        this.zzg = oh3Var;
    }

    public static g2 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (g2) ri3.r(zzh, oh3Var, di3Var);
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
                    return new f2(null);
                }
                return new g2();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final j2 B() {
        j2 j2Var = this.zze;
        return j2Var == null ? j2.J() : j2Var;
    }

    public final oh3 C() {
        return this.zzf;
    }

    public final oh3 D() {
        return this.zzg;
    }
}
