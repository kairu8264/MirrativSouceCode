package ai;

/* loaded from: classes3.dex */
public final class gp extends ri3<gp, fp> implements yj3 {
    private static final gp zzr;
    private int zzb;
    private int zze;
    private int zzg;
    private rq zzi;
    private yo zzk;
    private bp zzl;
    private vp zzm;
    private ao zzn;
    private fq zzo;
    private nr zzp;
    private jo zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zi3 zzj = ri3.m();

    static {
        gp gpVar = new gp();
        zzr = gpVar;
        ri3.y(gp.class, gpVar);
    }

    public static fp E() {
        return zzr.u();
    }

    public static /* synthetic */ void G(gp gpVar, String str) {
        str.getClass();
        gpVar.zzb |= 2;
        gpVar.zzf = str;
    }

    public static /* synthetic */ void H(gp gpVar, Iterable iterable) {
        zi3 zi3Var = gpVar.zzj;
        if (!zi3Var.zza()) {
            int size = zi3Var.size();
            gpVar.zzj = zi3Var.F(size == 0 ? 10 : size + size);
        }
        xg3.h(iterable, gpVar.zzj);
    }

    public static /* synthetic */ void J(gp gpVar, yo yoVar) {
        yoVar.getClass();
        gpVar.zzk = yoVar;
        gpVar.zzb |= 32;
    }

    public static /* synthetic */ void K(gp gpVar, ao aoVar) {
        aoVar.getClass();
        gpVar.zzn = aoVar;
        gpVar.zzb |= 256;
    }

    public static /* synthetic */ void M(gp gpVar, fq fqVar) {
        fqVar.getClass();
        gpVar.zzo = fqVar;
        gpVar.zzb |= 512;
    }

    public static /* synthetic */ void N(gp gpVar, nr nrVar) {
        nrVar.getClass();
        gpVar.zzp = nrVar;
        gpVar.zzb |= 1024;
    }

    public static /* synthetic */ void O(gp gpVar, jo joVar) {
        joVar.getClass();
        gpVar.zzq = joVar;
        gpVar.zzb |= 2048;
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
                        return zzr;
                    }
                    return new fp(null);
                }
                return new gp();
            }
            return ri3.z(zzr, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", dp.f3366a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zzf;
    }

    public final yo C() {
        yo yoVar = this.zzk;
        return yoVar == null ? yo.B() : yoVar;
    }

    public final ao D() {
        ao aoVar = this.zzn;
        return aoVar == null ? ao.C() : aoVar;
    }
}
