package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class mb3 extends ri3<mb3, lb3> implements yj3 {
    private static final mb3 zzf;
    private int zzb;
    private int zze;

    static {
        mb3 mb3Var = new mb3();
        zzf = mb3Var;
        ri3.y(mb3.class, mb3Var);
    }

    public static mb3 C(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (mb3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static lb3 D() {
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
                    return new lb3(null);
                }
                return new mb3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }
}
