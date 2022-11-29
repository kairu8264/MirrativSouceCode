package ai;

/* loaded from: classes3.dex */
public final class wq extends ri3<wq, vq> implements yj3 {
    private static final wq zzh;
    private int zzb;
    private int zze = 1000;
    private zq zzf;
    private pq zzg;

    static {
        wq wqVar = new wq();
        zzh = wqVar;
        ri3.y(wq.class, wqVar);
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
                    return new vq(null);
                }
                return new wq();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", dp.f3366a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
