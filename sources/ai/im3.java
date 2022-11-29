package ai;

/* loaded from: classes3.dex */
public final class im3 extends ri3<im3, hm3> implements yj3 {
    private static final im3 zzh;
    private int zzb;
    private int zze;
    private oh3 zzf;
    private oh3 zzg;

    static {
        im3 im3Var = new im3();
        zzh = im3Var;
        ri3.y(im3.class, im3Var);
    }

    public im3() {
        oh3 oh3Var = oh3.f7807x;
        this.zzf = oh3Var;
        this.zzg = oh3Var;
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
                        return zzh;
                    }
                    return new hm3(null);
                }
                return new im3();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
