package ai;

/* loaded from: classes3.dex */
public final class c74 extends ri3<c74, b74> implements yj3 {
    private static final c74 zzh;
    private int zzb;
    private long zze;
    private String zzf = "";
    private oh3 zzg = oh3.f7807x;

    static {
        c74 c74Var = new c74();
        zzh = c74Var;
        ri3.y(c74.class, c74Var);
    }

    public static c74 D() {
        return zzh;
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
                        return zzh;
                    }
                    return new b74(null);
                }
                return new c74();
            }
            return ri3.z(zzh, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean B() {
        return (this.zzb & 1) != 0;
    }

    public final long C() {
        return this.zze;
    }
}
