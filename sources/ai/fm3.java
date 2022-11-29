package ai;

/* loaded from: classes3.dex */
public final class fm3 extends ri3<fm3, cm3> implements yj3 {
    private static final fm3 zzk;
    private int zzb;
    private em3 zze;
    private oh3 zzg;
    private oh3 zzh;
    private int zzi;
    private byte zzj = 2;
    private aj3<bm3> zzf = ri3.n();

    static {
        fm3 fm3Var = new fm3();
        zzk = fm3Var;
        ri3.y(fm3.class, fm3Var);
    }

    public fm3() {
        oh3 oh3Var = oh3.f7807x;
        this.zzg = oh3Var;
        this.zzh = oh3Var;
    }

    public static cm3 B() {
        return zzk.u();
    }

    public static /* synthetic */ void D(fm3 fm3Var, bm3 bm3Var) {
        bm3Var.getClass();
        aj3<bm3> aj3Var = fm3Var.zzf;
        if (!aj3Var.zza()) {
            fm3Var.zzf = ri3.o(aj3Var);
        }
        fm3Var.zzf.add(bm3Var);
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzk;
                    }
                    return new cm3(null);
                }
                return new fm3();
            }
            return ri3.z(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", bm3.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
