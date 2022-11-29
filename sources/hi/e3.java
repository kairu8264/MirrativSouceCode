package hi;

/* loaded from: classes3.dex */
public final class e3 extends t8<e3, d3> implements x9 {
    private static final e3 zza;
    private int zze;
    private q3 zzf;
    private j3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        e3 e3Var = new e3();
        zza = e3Var;
        t8.j(e3.class, e3Var);
    }

    public static e3 s() {
        return zza;
    }

    public static /* synthetic */ void w(e3 e3Var, String str) {
        e3Var.zze |= 8;
        e3Var.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
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
                    return new d3(null);
                }
                return new e3();
            }
            return t8.i(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final j3 t() {
        j3 j3Var = this.zzg;
        return j3Var == null ? j3.s() : j3Var;
    }

    public final q3 u() {
        q3 q3Var = this.zzf;
        return q3Var == null ? q3.t() : q3Var;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
