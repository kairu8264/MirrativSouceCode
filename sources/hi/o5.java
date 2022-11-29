package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class o5 extends t8<o5, k5> implements x9 {
    private static final o5 zza;
    private int zze;
    private int zzf;
    private a9<o5> zzg = t8.f();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        o5 o5Var = new o5();
        zza = o5Var;
        t8.j(o5.class, o5Var);
    }

    public final int A() {
        int a10 = n5.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
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
                    return new k5(null);
                }
                return new o5();
            }
            return t8.i(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", m5.f35855a, "zzg", o5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final double r() {
        return this.zzk;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }

    public final List<o5> v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 16) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
