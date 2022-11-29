package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ee3 extends ri3<ee3, de3> implements yj3 {
    private static final ee3 zzf;
    private int zzb;
    private he3 zze;

    static {
        ee3 ee3Var = new ee3();
        zzf = ee3Var;
        ri3.y(ee3.class, ee3Var);
    }

    public static ee3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (ee3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static de3 E() {
        return zzf.u();
    }

    public static /* synthetic */ void H(ee3 ee3Var, he3 he3Var) {
        he3Var.getClass();
        ee3Var.zze = he3Var;
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
                    return new de3(null);
                }
                return new ee3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final he3 C() {
        he3 he3Var = this.zze;
        return he3Var == null ? he3.F() : he3Var;
    }
}
