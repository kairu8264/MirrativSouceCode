package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class h5 extends t8<h5, g5> implements x9 {
    private static final h5 zza;
    private int zze;
    private String zzf = "";
    private a9<o5> zzg = t8.f();

    static {
        h5 h5Var = new h5();
        zza = h5Var;
        t8.j(h5.class, h5Var);
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
                    return new g5(null);
                }
                return new h5();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", o5.class});
        }
        return (byte) 1;
    }

    public final String s() {
        return this.zzf;
    }

    public final List<o5> t() {
        return this.zzg;
    }
}
