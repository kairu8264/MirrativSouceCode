package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class qa3 extends ri3<qa3, pa3> implements yj3 {
    private static final qa3 zzf;
    private ta3 zzb;
    private int zze;

    static {
        qa3 qa3Var = new qa3();
        zzf = qa3Var;
        ri3.y(qa3.class, qa3Var);
    }

    public static qa3 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (qa3) ri3.r(zzf, oh3Var, di3Var);
    }

    public static pa3 E() {
        return zzf.u();
    }

    public static /* synthetic */ void G(qa3 qa3Var, ta3 ta3Var) {
        ta3Var.getClass();
        qa3Var.zzb = ta3Var;
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
                    return new pa3(null);
                }
                return new qa3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final ta3 B() {
        ta3 ta3Var = this.zzb;
        return ta3Var == null ? ta3.D() : ta3Var;
    }

    public final int C() {
        return this.zze;
    }
}
