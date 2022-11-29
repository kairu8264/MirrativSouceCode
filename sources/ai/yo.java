package ai;

/* loaded from: classes3.dex */
public final class yo extends ri3<yo, xo> implements yj3 {
    private static final yo zzm;
    private int zzb;
    private pq zzf;
    private int zzg;
    private rq zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        yo yoVar = new yo();
        zzm = yoVar;
        ri3.y(yo.class, yoVar);
    }

    public static yo B() {
        return zzm;
    }

    public static /* synthetic */ void D(yo yoVar, String str) {
        yoVar.zzb |= 1;
        yoVar.zze = str;
    }

    public static /* synthetic */ void E(yo yoVar, rq rqVar) {
        rqVar.getClass();
        yoVar.zzh = rqVar;
        yoVar.zzb |= 8;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                vi3 vi3Var = dp.f3366a;
                return ri3.z(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", vi3Var, "zzk", vi3Var, "zzl", vi3Var});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzm;
                }
                return new xo(null);
            } else {
                return new yo();
            }
        }
        return (byte) 1;
    }
}
