package ai;

/* loaded from: classes3.dex */
public final class go extends ri3<go, fo> implements yj3 {
    private static final go zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        go goVar = new go();
        zzg = goVar;
        ri3.y(go.class, goVar);
    }

    public static fo B() {
        return zzg.u();
    }

    public static go C() {
        return zzg;
    }

    public static /* synthetic */ void E(go goVar, boolean z10) {
        goVar.zzb |= 1;
        goVar.zze = z10;
    }

    public static /* synthetic */ void F(go goVar, int i10) {
        goVar.zzb |= 2;
        goVar.zzf = i10;
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
                    return new fo(null);
                }
                return new go();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
