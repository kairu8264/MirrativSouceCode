package ai;

/* loaded from: classes3.dex */
public final class p54 extends ri3<p54, o54> implements yj3 {
    private static final p54 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        p54 p54Var = new p54();
        zzg = p54Var;
        ri3.y(p54.class, p54Var);
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
                        return zzg;
                    }
                    return new o54(null);
                }
                return new p54();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
