package ai;

/* loaded from: classes3.dex */
public final class ao extends ri3<ao, zn> implements yj3 {
    private static final ao zzp;
    private int zzb;
    private int zze;
    private so zzg;
    private uo zzh;
    private wo zzj;
    private hq zzk;
    private xp zzl;
    private kp zzm;
    private mp zzn;
    private int zzf = 1000;
    private aj3<oo> zzi = ri3.n();
    private aj3<uq> zzo = ri3.n();

    static {
        ao aoVar = new ao();
        zzp = aoVar;
        ri3.y(ao.class, aoVar);
    }

    public static ao C() {
        return zzp;
    }

    public static /* synthetic */ void E(ao aoVar, yn ynVar) {
        aoVar.zze = ynVar.zza();
        aoVar.zzb |= 1;
    }

    public static /* synthetic */ void F(ao aoVar, uo uoVar) {
        uoVar.getClass();
        aoVar.zzh = uoVar;
        aoVar.zzb |= 8;
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
                        return zzp;
                    }
                    return new zn(null);
                }
                return new ao();
            }
            return ri3.z(zzp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzb", "zze", yn.c(), "zzf", dp.f3366a, "zzg", "zzh", "zzi", oo.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", uq.class});
        }
        return (byte) 1;
    }

    public final uo B() {
        uo uoVar = this.zzh;
        return uoVar == null ? uo.B() : uoVar;
    }
}
