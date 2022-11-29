package ai;

/* loaded from: classes3.dex */
public final class r64 extends ri3<r64, q64> implements yj3 {
    private static final r64 zzl;
    private int zzb;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        r64 r64Var = new r64();
        zzl = r64Var;
        ri3.y(r64.class, r64Var);
    }

    public static q64 B() {
        return zzl.u();
    }

    public static /* synthetic */ void D(r64 r64Var, long j10) {
        r64Var.zzb |= 4;
        r64Var.zzg = j10;
    }

    public static /* synthetic */ void E(r64 r64Var, long j10) {
        r64Var.zzb |= 8;
        r64Var.zzh = j10;
    }

    public static /* synthetic */ void F(r64 r64Var, long j10) {
        r64Var.zzb |= 16;
        r64Var.zzi = j10;
    }

    public static /* synthetic */ void G(r64 r64Var, long j10) {
        r64Var.zzb |= 32;
        r64Var.zzj = j10;
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
                        return zzl;
                    }
                    return new q64(null);
                }
                return new r64();
            }
            return ri3.z(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
