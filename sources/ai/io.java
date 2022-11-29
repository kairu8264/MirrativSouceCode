package ai;

/* loaded from: classes3.dex */
public final class io extends ri3<io, ho> implements yj3 {
    private static final io zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        io ioVar = new io();
        zzh = ioVar;
        ri3.y(io.class, ioVar);
    }

    public static ho B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(io ioVar, boolean z10) {
        ioVar.zzb |= 1;
        ioVar.zze = z10;
    }

    public static /* synthetic */ void E(io ioVar, boolean z10) {
        ioVar.zzb |= 2;
        ioVar.zzf = z10;
    }

    public static /* synthetic */ void F(io ioVar, int i10) {
        ioVar.zzb |= 4;
        ioVar.zzg = i10;
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
                    return new ho(null);
                }
                return new io();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
