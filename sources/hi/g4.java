package hi;

/* loaded from: classes3.dex */
public final class g4 extends t8<g4, f4> implements x9 {
    private static final g4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        g4 g4Var = new g4();
        zza = g4Var;
        t8.j(g4.class, g4Var);
    }

    public static f4 t() {
        return zza.k();
    }

    public static /* synthetic */ void v(g4 g4Var, int i10) {
        g4Var.zze |= 1;
        g4Var.zzf = i10;
    }

    public static /* synthetic */ void w(g4 g4Var, long j10) {
        g4Var.zze |= 2;
        g4Var.zzg = j10;
    }

    @Override // hi.t8
    public final Object q(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new f4(null);
                }
                return new g4();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzf;
    }

    public final long s() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
