package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class j5 extends t8<j5, i5> implements x9 {
    private static final j5 zza;
    private int zze;
    private a9<o5> zzf = t8.f();
    private f5 zzg;

    static {
        j5 j5Var = new j5();
        zza = j5Var;
        t8.j(j5.class, j5Var);
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
                    return new i5(null);
                }
                return new j5();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", o5.class, "zzg"});
        }
        return (byte) 1;
    }

    public final f5 r() {
        f5 f5Var = this.zzg;
        return f5Var == null ? f5.t() : f5Var;
    }

    public final List<o5> t() {
        return this.zzf;
    }
}
