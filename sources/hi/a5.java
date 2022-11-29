package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class a5 extends t8<a5, z4> implements x9 {
    private static final a5 zza;
    private int zze;
    private int zzf;
    private z8 zzg = t8.o();

    static {
        a5 a5Var = new a5();
        zza = a5Var;
        t8.j(a5.class, a5Var);
    }

    public static z4 u() {
        return zza.k();
    }

    public static /* synthetic */ void x(a5 a5Var, int i10) {
        a5Var.zze |= 1;
        a5Var.zzf = i10;
    }

    public static /* synthetic */ void y(a5 a5Var, Iterable iterable) {
        z8 z8Var = a5Var.zzg;
        if (!z8Var.b()) {
            a5Var.zzg = t8.p(z8Var);
        }
        e7.c(iterable, a5Var.zzg);
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
                    return new z4(null);
                }
                return new a5();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf;
    }

    public final long t(int i10) {
        return this.zzg.G(i10);
    }

    public final List<Long> w() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
