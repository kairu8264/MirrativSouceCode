package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class sb3 extends ri3<sb3, rb3> implements yj3 {
    private static final sb3 zzb;

    static {
        sb3 sb3Var = new sb3();
        zzb = sb3Var;
        ri3.y(sb3.class, sb3Var);
    }

    public static sb3 B(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (sb3) ri3.r(zzb, oh3Var, di3Var);
    }

    public static sb3 C() {
        return zzb;
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
                        return zzb;
                    }
                    return new rb3(null);
                }
                return new sb3();
            }
            return ri3.z(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
