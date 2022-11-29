package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class a3 extends t8<a3, z2> implements x9 {
    private static final a3 zza;
    private int zze;
    private int zzf;
    private a9<l3> zzg = t8.f();
    private a9<c3> zzh = t8.f();
    private boolean zzi;
    private boolean zzj;

    static {
        a3 a3Var = new a3();
        zza = a3Var;
        t8.j(a3.class, a3Var);
    }

    public static /* synthetic */ void A(a3 a3Var, int i10, c3 c3Var) {
        c3Var.getClass();
        a9<c3> a9Var = a3Var.zzh;
        if (!a9Var.b()) {
            a3Var.zzh = t8.g(a9Var);
        }
        a3Var.zzh.set(i10, c3Var);
    }

    public static /* synthetic */ void z(a3 a3Var, int i10, l3 l3Var) {
        l3Var.getClass();
        a9<l3> a9Var = a3Var.zzg;
        if (!a9Var.b()) {
            a3Var.zzg = t8.g(a9Var);
        }
        a3Var.zzg.set(i10, l3Var);
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
                    return new z2(null);
                }
                return new a3();
            }
            return t8.i(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", l3.class, "zzh", c3.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzg.size();
    }

    public final c3 v(int i10) {
        return this.zzh.get(i10);
    }

    public final l3 w(int i10) {
        return this.zzg.get(i10);
    }

    public final List<c3> x() {
        return this.zzh;
    }

    public final List<l3> y() {
        return this.zzg;
    }
}
