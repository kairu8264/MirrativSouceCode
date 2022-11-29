package ai;

/* loaded from: classes3.dex */
public final class co extends ri3<co, bo> implements yj3 {
    private static final co zzh;
    private int zzb;
    private int zze;
    private go zzf;
    private io zzg;

    static {
        co coVar = new co();
        zzh = coVar;
        ri3.y(co.class, coVar);
    }

    public static bo B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(co coVar, go goVar) {
        goVar.getClass();
        coVar.zzf = goVar;
        coVar.zzb |= 2;
    }

    public static /* synthetic */ void E(co coVar, io ioVar) {
        ioVar.getClass();
        coVar.zzg = ioVar;
        coVar.zzb |= 4;
    }

    public static /* synthetic */ void F(co coVar, int i10) {
        coVar.zze = 1;
        coVar.zzb = 1 | coVar.zzb;
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
                    return new bo(null);
                }
                return new co();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", eo.f3730a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
