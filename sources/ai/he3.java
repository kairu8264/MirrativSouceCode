package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class he3 extends ri3<he3, ge3> implements yj3 {
    private static final he3 zzf;
    private String zzb = "";
    private hd3 zze;

    static {
        he3 he3Var = new he3();
        zzf = he3Var;
        ri3.y(he3.class, he3Var);
    }

    public static he3 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (he3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static he3 F() {
        return zzf;
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
                    return new ge3(null);
                }
                return new he3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zzb;
    }

    public final boolean C() {
        return this.zze != null;
    }

    public final hd3 D() {
        hd3 hd3Var = this.zze;
        return hd3Var == null ? hd3.E() : hd3Var;
    }
}
