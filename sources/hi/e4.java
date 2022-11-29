package hi;

/* loaded from: classes3.dex */
public final class e4 extends t8<e4, d4> implements x9 {
    private static final e4 zza;
    private int zze;
    private int zzf;
    private y4 zzg;
    private y4 zzh;
    private boolean zzi;

    static {
        e4 e4Var = new e4();
        zza = e4Var;
        t8.j(e4.class, e4Var);
    }

    public static d4 s() {
        return zza.k();
    }

    public static /* synthetic */ void w(e4 e4Var, int i10) {
        e4Var.zze |= 1;
        e4Var.zzf = i10;
    }

    public static /* synthetic */ void x(e4 e4Var, y4 y4Var) {
        y4Var.getClass();
        e4Var.zzg = y4Var;
        e4Var.zze |= 2;
    }

    public static /* synthetic */ void y(e4 e4Var, y4 y4Var) {
        e4Var.zzh = y4Var;
        e4Var.zze |= 4;
    }

    public static /* synthetic */ void z(e4 e4Var, boolean z10) {
        e4Var.zze |= 8;
        e4Var.zzi = z10;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
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
                    return new d4(null);
                }
                return new e4();
            }
            return t8.i(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzf;
    }

    public final y4 u() {
        y4 y4Var = this.zzg;
        return y4Var == null ? y4.y() : y4Var;
    }

    public final y4 v() {
        y4 y4Var = this.zzh;
        return y4Var == null ? y4.y() : y4Var;
    }
}
