package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class gc3 extends ri3<gc3, fc3> implements yj3 {
    private static final gc3 zzg;
    private int zzb;
    private jc3 zze;
    private oh3 zzf = oh3.f7807x;

    static {
        gc3 gc3Var = new gc3();
        zzg = gc3Var;
        ri3.y(gc3.class, gc3Var);
    }

    public static gc3 E(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (gc3) ri3.r(zzg, oh3Var, di3Var);
    }

    public static fc3 F() {
        return zzg.u();
    }

    public static /* synthetic */ void I(gc3 gc3Var, jc3 jc3Var) {
        jc3Var.getClass();
        gc3Var.zze = jc3Var;
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
                    return new fc3(null);
                }
                return new gc3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final jc3 C() {
        jc3 jc3Var = this.zze;
        return jc3Var == null ? jc3.H() : jc3Var;
    }

    public final oh3 D() {
        return this.zzf;
    }
}
