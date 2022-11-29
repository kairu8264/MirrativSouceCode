package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class c3 extends t8<c3, b3> implements x9 {
    private static final c3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private a9<e3> zzh = t8.f();
    private boolean zzi;
    private j3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        c3 c3Var = new c3();
        zza = c3Var;
        t8.j(c3.class, c3Var);
    }

    public static /* synthetic */ void A(c3 c3Var, int i10, e3 e3Var) {
        e3Var.getClass();
        a9<e3> a9Var = c3Var.zzh;
        if (!a9Var.b()) {
            c3Var.zzh = t8.g(a9Var);
        }
        c3Var.zzh.set(i10, e3Var);
    }

    public static b3 t() {
        return zza.k();
    }

    public static /* synthetic */ void z(c3 c3Var, String str) {
        c3Var.zze |= 2;
        c3Var.zzg = str;
    }

    public final boolean B() {
        return this.zzk;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final boolean D() {
        return this.zzm;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final boolean G() {
        return (this.zze & 64) != 0;
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
                    return new b3(null);
                }
                return new c3();
            }
            return t8.i(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", e3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzh.size();
    }

    public final int s() {
        return this.zzf;
    }

    public final e3 v(int i10) {
        return this.zzh.get(i10);
    }

    public final j3 w() {
        j3 j3Var = this.zzj;
        return j3Var == null ? j3.s() : j3Var;
    }

    public final String x() {
        return this.zzg;
    }

    public final List<e3> y() {
        return this.zzh;
    }
}
