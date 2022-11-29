package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class y4 extends t8<y4, x4> implements x9 {
    private static final y4 zza;
    private z8 zze = t8.o();
    private z8 zzf = t8.o();
    private a9<g4> zzg = t8.f();
    private a9<a5> zzh = t8.f();

    static {
        y4 y4Var = new y4();
        zza = y4Var;
        t8.j(y4.class, y4Var);
    }

    public static /* synthetic */ void E(y4 y4Var, Iterable iterable) {
        z8 z8Var = y4Var.zze;
        if (!z8Var.b()) {
            y4Var.zze = t8.p(z8Var);
        }
        e7.c(iterable, y4Var.zze);
    }

    public static /* synthetic */ void G(y4 y4Var, Iterable iterable) {
        z8 z8Var = y4Var.zzf;
        if (!z8Var.b()) {
            y4Var.zzf = t8.p(z8Var);
        }
        e7.c(iterable, y4Var.zzf);
    }

    public static /* synthetic */ void I(y4 y4Var, Iterable iterable) {
        y4Var.M();
        e7.c(iterable, y4Var.zzg);
    }

    public static /* synthetic */ void J(y4 y4Var, int i10) {
        y4Var.M();
        y4Var.zzg.remove(i10);
    }

    public static /* synthetic */ void K(y4 y4Var, Iterable iterable) {
        y4Var.N();
        e7.c(iterable, y4Var.zzh);
    }

    public static /* synthetic */ void L(y4 y4Var, int i10) {
        y4Var.N();
        y4Var.zzh.remove(i10);
    }

    public static x4 w() {
        return zza.k();
    }

    public static y4 y() {
        return zza;
    }

    public final List<g4> A() {
        return this.zzg;
    }

    public final List<Long> B() {
        return this.zzf;
    }

    public final List<a5> C() {
        return this.zzh;
    }

    public final List<Long> D() {
        return this.zze;
    }

    public final void M() {
        a9<g4> a9Var = this.zzg;
        if (a9Var.b()) {
            return;
        }
        this.zzg = t8.g(a9Var);
    }

    public final void N() {
        a9<a5> a9Var = this.zzh;
        if (a9Var.b()) {
            return;
        }
        this.zzh = t8.g(a9Var);
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
                    return new x4(null);
                }
                return new y4();
            }
            return t8.i(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", g4.class, "zzh", a5.class});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zze.size();
    }

    public final g4 v(int i10) {
        return this.zzg.get(i10);
    }

    public final a5 z(int i10) {
        return this.zzh.get(i10);
    }
}
