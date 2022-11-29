package ai;

/* loaded from: classes3.dex */
public final class fq extends ri3<fq, bq> implements yj3 {
    private static final fq zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private aj3<aq> zze = ri3.n();
    private String zzi = "";
    private String zzj = "";

    static {
        fq fqVar = new fq();
        zzl = fqVar;
        ri3.y(fq.class, fqVar);
    }

    public static bq B() {
        return zzl.u();
    }

    public static /* synthetic */ void D(fq fqVar, Iterable iterable) {
        aj3<aq> aj3Var = fqVar.zze;
        if (!aj3Var.zza()) {
            fqVar.zze = ri3.o(aj3Var);
        }
        xg3.h(iterable, fqVar.zze);
    }

    public static /* synthetic */ void E(fq fqVar, int i10) {
        fqVar.zzb |= 1;
        fqVar.zzf = i10;
    }

    public static /* synthetic */ void F(fq fqVar, int i10) {
        fqVar.zzb |= 2;
        fqVar.zzg = i10;
    }

    public static /* synthetic */ void G(fq fqVar, long j10) {
        fqVar.zzb |= 4;
        fqVar.zzh = j10;
    }

    public static /* synthetic */ void H(fq fqVar, String str) {
        str.getClass();
        fqVar.zzb |= 8;
        fqVar.zzi = str;
    }

    public static /* synthetic */ void I(fq fqVar, String str) {
        str.getClass();
        fqVar.zzb |= 16;
        fqVar.zzj = str;
    }

    public static /* synthetic */ void J(fq fqVar, long j10) {
        fqVar.zzb |= 32;
        fqVar.zzk = j10;
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
                        return zzl;
                    }
                    return new bq(null);
                }
                return new fq();
            }
            return ri3.z(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", aq.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
