package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class te3 extends ri3<te3, se3> implements yj3 {
    private static final te3 zze;
    private int zzb;

    static {
        te3 te3Var = new te3();
        zze = te3Var;
        ri3.y(te3.class, te3Var);
    }

    public static te3 B(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (te3) ri3.r(zze, oh3Var, di3Var);
    }

    public static te3 C() {
        return zze;
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
                    return new se3(null);
                }
                return new te3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
