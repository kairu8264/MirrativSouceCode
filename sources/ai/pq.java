package ai;

/* loaded from: classes3.dex */
public final class pq extends ri3<pq, oq> implements yj3 {
    private static final pq zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        pq pqVar = new pq();
        zzg = pqVar;
        ri3.y(pq.class, pqVar);
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
                    return new oq(null);
                }
                return new pq();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
