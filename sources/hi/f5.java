package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class f5 extends t8<f5, e5> implements x9 {
    private static final f5 zza;
    private a9<h5> zze = t8.f();

    static {
        f5 f5Var = new f5();
        zza = f5Var;
        t8.j(f5.class, f5Var);
    }

    public static f5 t() {
        return zza;
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
                    return new e5(null);
                }
                return new f5();
            }
            return t8.i(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", h5.class});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zze.size();
    }

    public final List<h5> u() {
        return this.zze;
    }
}
