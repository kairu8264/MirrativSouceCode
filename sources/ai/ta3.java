package ai;

/* loaded from: classes3.dex */
public final class ta3 extends ri3<ta3, sa3> implements yj3 {
    private static final ta3 zze;
    private int zzb;

    static {
        ta3 ta3Var = new ta3();
        zze = ta3Var;
        ri3.y(ta3.class, ta3Var);
    }

    public static sa3 C() {
        return zze.u();
    }

    public static ta3 D() {
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
                    return new sa3(null);
                }
                return new ta3();
            }
            return ri3.z(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }
}
