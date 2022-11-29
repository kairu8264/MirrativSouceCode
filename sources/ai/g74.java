package ai;

/* loaded from: classes3.dex */
public final class g74 extends ri3<g74, f74> implements yj3 {
    private static final g74 zzi;
    private int zzb;
    private aj3<oh3> zze = ri3.n();
    private oh3 zzf = oh3.f7807x;
    private int zzg = 1;
    private int zzh = 1;

    static {
        g74 g74Var = new g74();
        zzi = g74Var;
        ri3.y(g74.class, g74Var);
    }

    public static f74 B() {
        return zzi.u();
    }

    public static /* synthetic */ void D(g74 g74Var, oh3 oh3Var) {
        aj3<oh3> aj3Var = g74Var.zze;
        if (!aj3Var.zza()) {
            g74Var.zze = ri3.o(aj3Var);
        }
        g74Var.zze.add(oh3Var);
    }

    public static /* synthetic */ void E(g74 g74Var, oh3 oh3Var) {
        g74Var.zzb |= 1;
        g74Var.zzf = oh3Var;
    }

    public static /* synthetic */ void F(g74 g74Var, int i10) {
        g74Var.zzh = i10 - 1;
        g74Var.zzb |= 4;
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
                        return zzi;
                    }
                    return new f74(null);
                }
                return new g74();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", a74.f1777a, "zzh", y64.f12473a});
        }
        return (byte) 1;
    }
}
