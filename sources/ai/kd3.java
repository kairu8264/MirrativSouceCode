package ai;

@Deprecated
/* loaded from: classes3.dex */
public final class kd3 extends ri3<kd3, jd3> implements yj3 {
    private static final kd3 zzi;
    private int zzf;
    private boolean zzg;
    private String zzb = "";
    private String zze = "";
    private String zzh = "";

    static {
        kd3 kd3Var = new kd3();
        zzi = kd3Var;
        ri3.y(kd3.class, kd3Var);
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
                        return zzi;
                    }
                    return new jd3(null);
                }
                return new kd3();
            }
            return ri3.z(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zzb;
    }

    public final String C() {
        return this.zze;
    }

    public final int D() {
        return this.zzf;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }
}
