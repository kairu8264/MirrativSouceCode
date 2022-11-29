package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class yd3 extends ri3<yd3, xd3> implements yj3 {
    private static final yd3 zzf;
    private int zzb;
    private be3 zze;

    static {
        yd3 yd3Var = new yd3();
        zzf = yd3Var;
        ri3.y(yd3.class, yd3Var);
    }

    public static yd3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (yd3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static xd3 E() {
        return zzf.u();
    }

    public static /* synthetic */ void H(yd3 yd3Var, be3 be3Var) {
        be3Var.getClass();
        yd3Var.zze = be3Var;
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
                    return new xd3(null);
                }
                return new yd3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final be3 C() {
        be3 be3Var = this.zze;
        return be3Var == null ? be3.D() : be3Var;
    }
}
