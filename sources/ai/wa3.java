package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class wa3 extends ri3<wa3, va3> implements yj3 {
    private static final wa3 zzf;
    private int zzb;
    private oh3 zze = oh3.f7807x;

    static {
        wa3 wa3Var = new wa3();
        zzf = wa3Var;
        ri3.y(wa3.class, wa3Var);
    }

    public static wa3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (wa3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static va3 E() {
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
                    return new va3(null);
                }
                return new wa3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final oh3 C() {
        return this.zze;
    }
}
