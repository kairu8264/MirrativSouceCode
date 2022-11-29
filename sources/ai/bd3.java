package ai;

/* loaded from: classes3.dex */
public final class bd3 extends ri3<bd3, ad3> implements yj3 {
    private static final bd3 zzf;
    private int zzb;
    private int zze;

    static {
        bd3 bd3Var = new bd3();
        zzf = bd3Var;
        ri3.y(bd3.class, bd3Var);
    }

    public static ad3 C() {
        return zzf.u();
    }

    public static bd3 D() {
        return zzf;
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
                        return zzf;
                    }
                    return new ad3(null);
                }
                return new bd3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zze;
    }

    public final int G() {
        int b10 = sc3.b(this.zzb);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }
}
