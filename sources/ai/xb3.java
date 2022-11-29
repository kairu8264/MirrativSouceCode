package ai;

/* loaded from: classes3.dex */
public final class xb3 extends ri3<xb3, wb3> implements yj3 {
    private static final xb3 zze;
    private hd3 zzb;

    static {
        xb3 xb3Var = new xb3();
        zze = xb3Var;
        ri3.y(xb3.class, xb3Var);
    }

    public static wb3 C() {
        return zze.u();
    }

    public static xb3 D() {
        return zze;
    }

    public static /* synthetic */ void F(xb3 xb3Var, hd3 hd3Var) {
        hd3Var.getClass();
        xb3Var.zzb = hd3Var;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new wb3(null);
                }
                return new xb3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final hd3 B() {
        hd3 hd3Var = this.zzb;
        return hd3Var == null ? hd3.E() : hd3Var;
    }
}
