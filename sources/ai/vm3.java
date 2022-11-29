package ai;

/* loaded from: classes3.dex */
public final class vm3 extends ri3<vm3, um3> implements yj3 {
    private static final vm3 zzh;
    private int zzb;
    private String zze = "";
    private long zzf;
    private boolean zzg;

    static {
        vm3 vm3Var = new vm3();
        zzh = vm3Var;
        ri3.y(vm3.class, vm3Var);
    }

    public static um3 B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(vm3 vm3Var, String str) {
        vm3Var.zzb |= 1;
        vm3Var.zze = str;
    }

    public static /* synthetic */ void E(vm3 vm3Var, long j10) {
        vm3Var.zzb |= 2;
        vm3Var.zzf = j10;
    }

    public static /* synthetic */ void F(vm3 vm3Var, boolean z10) {
        vm3Var.zzb |= 4;
        vm3Var.zzg = z10;
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
                    return new um3(null);
                }
                return new vm3();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
