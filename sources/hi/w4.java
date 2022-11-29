package hi;

/* loaded from: classes3.dex */
public final class w4 extends t8<w4, t4> implements x9 {
    private static final w4 zza;
    private int zze;
    private int zzf = 1;
    private a9<k4> zzg = t8.f();

    static {
        w4 w4Var = new w4();
        zza = w4Var;
        t8.j(w4.class, w4Var);
    }

    public static t4 r() {
        return zza.k();
    }

    public static /* synthetic */ void t(w4 w4Var, k4 k4Var) {
        k4Var.getClass();
        a9<k4> a9Var = w4Var.zzg;
        if (!a9Var.b()) {
            w4Var.zzg = t8.g(a9Var);
        }
        w4Var.zzg.add(k4Var);
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
                    return new t4(null);
                }
                return new w4();
            }
            return t8.i(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", v4.f36029a, "zzg", k4.class});
        }
        return (byte) 1;
    }
}
