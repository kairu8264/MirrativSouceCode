package ai;

/* loaded from: classes3.dex */
public final class rq extends ri3<rq, qq> implements yj3 {
    private static final rq zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        rq rqVar = new rq();
        zzh = rqVar;
        ri3.y(rq.class, rqVar);
    }

    public static qq B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(rq rqVar, int i10) {
        rqVar.zzb |= 1;
        rqVar.zze = i10;
    }

    public static /* synthetic */ void E(rq rqVar, int i10) {
        rqVar.zzb |= 2;
        rqVar.zzf = i10;
    }

    public static /* synthetic */ void F(rq rqVar, int i10) {
        rqVar.zzb |= 4;
        rqVar.zzg = i10;
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
                    return new qq(null);
                }
                return new rq();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
