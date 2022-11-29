package ai;

/* loaded from: classes3.dex */
public final class hq extends ri3<hq, gq> implements yj3 {
    private static final hq zzp;
    private int zzb;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private jq zzo;

    static {
        hq hqVar = new hq();
        zzp = hqVar;
        ri3.y(hq.class, hqVar);
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                vi3 vi3Var = dp.f3366a;
                return ri3.z(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzb", "zze", vi3Var, "zzf", vi3Var, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzp;
                }
                return new gq(null);
            } else {
                return new hq();
            }
        }
        return (byte) 1;
    }
}
