package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class cb3 extends ri3<cb3, bb3> implements yj3 {
    private static final cb3 zzf;
    private int zzb;
    private oh3 zze = oh3.f7807x;

    static {
        cb3 cb3Var = new cb3();
        zzf = cb3Var;
        ri3.y(cb3.class, cb3Var);
    }

    public static cb3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (cb3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static bb3 E() {
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
                    return new bb3(null);
                }
                return new cb3();
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
