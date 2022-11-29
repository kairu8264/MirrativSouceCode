package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class w3 extends t8<w3, v3> implements x9 {
    private static final w3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private a9<y3> zzi = t8.f();
    private a9<u3> zzj = t8.f();
    private a9<a3> zzk = t8.f();
    private String zzl = "";
    private a9<j5> zzn = t8.f();

    static {
        w3 w3Var = new w3();
        zza = w3Var;
        t8.j(w3.class, w3Var);
    }

    public static /* synthetic */ void C(w3 w3Var, int i10, u3 u3Var) {
        u3Var.getClass();
        a9<u3> a9Var = w3Var.zzj;
        if (!a9Var.b()) {
            w3Var.zzj = t8.g(a9Var);
        }
        w3Var.zzj.set(i10, u3Var);
    }

    public static v3 v() {
        return zza.k();
    }

    public static w3 x() {
        return zza;
    }

    public final List<j5> A() {
        return this.zzn;
    }

    public final List<y3> B() {
        return this.zzi;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zze & 2) != 0;
    }

    public final boolean G() {
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
                    return new v3(null);
                }
                return new w3();
            }
            return t8.i(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", y3.class, "zzj", u3.class, "zzk", a3.class, "zzl", "zzm", "zzn", j5.class});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzn.size();
    }

    public final int s() {
        return this.zzj.size();
    }

    public final long t() {
        return this.zzf;
    }

    public final u3 u(int i10) {
        return this.zzj.get(i10);
    }

    public final String y() {
        return this.zzg;
    }

    public final List<a3> z() {
        return this.zzk;
    }
}
