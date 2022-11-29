package ai;

/* loaded from: classes3.dex */
public final class v93 extends ri3<v93, u93> implements yj3 {
    private static final v93 zze;
    private int zzb;

    static {
        v93 v93Var = new v93();
        zze = v93Var;
        ri3.y(v93.class, v93Var);
    }

    public static u93 C() {
        return zze.u();
    }

    public static v93 D() {
        return zze;
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
                    return new u93(null);
                }
                return new v93();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }
}
