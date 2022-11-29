package hi;

/* loaded from: classes3.dex */
public final class c5 extends t8<c5, b5> implements x9 {
    private static final c5 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        c5 c5Var = new c5();
        zza = c5Var;
        t8.j(c5.class, c5Var);
    }

    public static /* synthetic */ void A(c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 4;
        c5Var.zzh = str;
    }

    public static /* synthetic */ void B(c5 c5Var) {
        c5Var.zze &= -5;
        c5Var.zzh = zza.zzh;
    }

    public static /* synthetic */ void C(c5 c5Var, long j10) {
        c5Var.zze |= 8;
        c5Var.zzi = j10;
    }

    public static /* synthetic */ void D(c5 c5Var) {
        c5Var.zze &= -9;
        c5Var.zzi = 0L;
    }

    public static /* synthetic */ void E(c5 c5Var, double d10) {
        c5Var.zze |= 32;
        c5Var.zzk = d10;
    }

    public static /* synthetic */ void F(c5 c5Var) {
        c5Var.zze &= -33;
        c5Var.zzk = 0.0d;
    }

    public static b5 u() {
        return zza.k();
    }

    public static /* synthetic */ void y(c5 c5Var, long j10) {
        c5Var.zze |= 1;
        c5Var.zzf = j10;
    }

    public static /* synthetic */ void z(c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 2;
        c5Var.zzg = str;
    }

    public final boolean G() {
        return (this.zze & 32) != 0;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    public final boolean J() {
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
                    return new b5(null);
                }
                return new c5();
            }
            return t8.i(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final double r() {
        return this.zzk;
    }

    public final long s() {
        return this.zzi;
    }

    public final long t() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }
}
