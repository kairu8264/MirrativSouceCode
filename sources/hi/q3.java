package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class q3 extends t8<q3, m3> implements x9 {
    private static final q3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private a9<String> zzi = t8.f();

    static {
        q3 q3Var = new q3();
        zza = q3Var;
        t8.j(q3.class, q3Var);
    }

    public static q3 t() {
        return zza;
    }

    public final int A() {
        int a10 = p3.a(this.zzf);
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
                    return new m3(null);
                }
                return new q3();
            }
            return t8.i(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", o3.f35893a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzi.size();
    }

    public final String u() {
        return this.zzg;
    }

    public final List<String> v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
