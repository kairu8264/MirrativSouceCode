package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class q4 extends t8<q4, p4> implements x9 {
    private static final q4 zza;
    private a9<s4> zze = t8.f();

    static {
        q4 q4Var = new q4();
        zza = q4Var;
        t8.j(q4.class, q4Var);
    }

    public static p4 r() {
        return zza.k();
    }

    public static /* synthetic */ void v(q4 q4Var, s4 s4Var) {
        s4Var.getClass();
        a9<s4> a9Var = q4Var.zze;
        if (!a9Var.b()) {
            q4Var.zze = t8.g(a9Var);
        }
        q4Var.zze.add(s4Var);
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
                    return new p4(null);
                }
                return new q4();
            }
            return t8.i(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", s4.class});
        }
        return (byte) 1;
    }

    public final s4 t(int i10) {
        return this.zze.get(0);
    }

    public final List<s4> u() {
        return this.zze;
    }
}
