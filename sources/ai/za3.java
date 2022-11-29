package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class za3 extends ri3<za3, ya3> implements yj3 {
    private static final za3 zzf;
    private int zzb;
    private int zze;

    static {
        za3 za3Var = new za3();
        zzf = za3Var;
        ri3.y(za3.class, za3Var);
    }

    public static za3 C(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (za3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static ya3 D() {
        return zzf.u();
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
                    return new ya3(null);
                }
                return new za3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }
}
