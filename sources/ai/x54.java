package ai;

/* loaded from: classes3.dex */
public final class x54 extends ri3<x54, w54> implements yj3 {
    private static final x54 zzf;
    private int zzb;
    private int zze = 2;

    static {
        x54 x54Var = new x54();
        zzf = x54Var;
        ri3.y(x54.class, x54Var);
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
                    return new w54(null);
                }
                return new x54();
            }
            return ri3.z(zzf, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzb", "zze", y54.f12457a});
        }
        return (byte) 1;
    }
}
