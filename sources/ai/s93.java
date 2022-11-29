package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class s93 extends ri3<s93, r93> implements yj3 {
    private static final s93 zzf;
    private int zzb;
    private v93 zze;

    static {
        s93 s93Var = new s93();
        zzf = s93Var;
        ri3.y(s93.class, s93Var);
    }

    public static s93 D(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (s93) ri3.r(zzf, oh3Var, di3Var);
    }

    public static r93 E() {
        return zzf.u();
    }

    public static /* synthetic */ void H(s93 s93Var, v93 v93Var) {
        v93Var.getClass();
        s93Var.zze = v93Var;
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
                    return new r93(null);
                }
                return new s93();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final v93 C() {
        v93 v93Var = this.zze;
        return v93Var == null ? v93.D() : v93Var;
    }
}
