package ai;

/* loaded from: classes3.dex */
public final class em3 extends ri3<em3, dm3> implements yj3 {
    private static final em3 zzh;
    private int zzb;
    private oh3 zze;
    private oh3 zzf;
    private oh3 zzg;

    static {
        em3 em3Var = new em3();
        zzh = em3Var;
        ri3.y(em3.class, em3Var);
    }

    public em3() {
        oh3 oh3Var = oh3.f7807x;
        this.zze = oh3Var;
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
                    return new dm3(null);
                }
                return new em3();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
