package ai;

/* loaded from: classes3.dex */
public final class jm3 extends ri3<jm3, gm3> implements yj3 {
    private static final jm3 zzl;
    private int zzb;
    private im3 zze;
    private oh3 zzg;
    private oh3 zzh;
    private int zzi;
    private oh3 zzj;
    private byte zzk = 2;
    private aj3<bm3> zzf = ri3.n();

    static {
        jm3 jm3Var = new jm3();
        zzl = jm3Var;
        ri3.y(jm3.class, jm3Var);
    }

    public jm3() {
        oh3 oh3Var = oh3.f7807x;
        this.zzg = oh3Var;
        this.zzh = oh3Var;
        this.zzj = oh3Var;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzl;
                    }
                    return new gm3(null);
                }
                return new jm3();
            }
            return ri3.z(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", bm3.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
