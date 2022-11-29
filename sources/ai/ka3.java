package ai;

/* loaded from: classes3.dex */
public final class ka3 extends ri3<ka3, ja3> implements yj3 {
    private static final ka3 zze;
    private int zzb;

    static {
        ka3 ka3Var = new ka3();
        zze = ka3Var;
        ri3.y(ka3.class, ka3Var);
    }

    public static ja3 C() {
        return zze.u();
    }

    public static ka3 D() {
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
                    return new ja3(null);
                }
                return new ka3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }
}
