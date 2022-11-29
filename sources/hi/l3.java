package hi;

/* loaded from: classes3.dex */
public final class l3 extends t8<l3, k3> implements x9 {
    private static final l3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private e3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        l3 l3Var = new l3();
        zza = l3Var;
        t8.j(l3.class, l3Var);
    }

    public static k3 t() {
        return zza.k();
    }

    public static /* synthetic */ void w(l3 l3Var, String str) {
        l3Var.zze |= 2;
        l3Var.zzg = str;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 32) != 0;
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
                    return new k3(null);
                }
                return new l3();
            }
            return t8.i(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzf;
    }

    public final e3 s() {
        e3 e3Var = this.zzh;
        return e3Var == null ? e3.s() : e3Var;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzk;
    }
}
