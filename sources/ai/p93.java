package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class p93 extends ri3<p93, o93> implements yj3 {
    private static final p93 zzg;
    private int zzb;
    private oh3 zze = oh3.f7807x;
    private v93 zzf;

    static {
        p93 p93Var = new p93();
        zzg = p93Var;
        ri3.y(p93.class, p93Var);
    }

    public static p93 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (p93) ri3.r(zzg, oh3Var, di3Var);
    }

    public static o93 F() {
        return zzg.u();
    }

    public static /* synthetic */ void J(p93 p93Var, v93 v93Var) {
        v93Var.getClass();
        p93Var.zzf = v93Var;
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
                        return zzg;
                    }
                    return new o93(null);
                }
                return new p93();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final oh3 C() {
        return this.zze;
    }

    public final v93 D() {
        v93 v93Var = this.zzf;
        return v93Var == null ? v93.D() : v93Var;
    }
}
