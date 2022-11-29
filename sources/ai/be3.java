package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class be3 extends ri3<be3, ae3> implements yj3 {
    private static final be3 zze;
    private String zzb = "";

    static {
        be3 be3Var = new be3();
        zze = be3Var;
        ri3.y(be3.class, be3Var);
    }

    public static be3 C(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (be3) ri3.r(zze, oh3Var, di3Var);
    }

    public static be3 D() {
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
                    return new ae3(null);
                }
                return new be3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zzb;
    }
}
