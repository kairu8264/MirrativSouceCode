package ai;

/* loaded from: classes3.dex */
public final class nr extends ri3<nr, mr> implements yj3 {
    private static final nr zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        nr nrVar = new nr();
        zzg = nrVar;
        ri3.y(nr.class, nrVar);
    }

    public static mr C() {
        return zzg.u();
    }

    public static /* synthetic */ void E(nr nrVar, boolean z10) {
        nrVar.zzb |= 1;
        nrVar.zze = z10;
    }

    public static /* synthetic */ void F(nr nrVar, int i10) {
        nrVar.zzb |= 2;
        nrVar.zzf = i10;
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
                    return new mr(null);
                }
                return new nr();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean B() {
        return this.zze;
    }
}
