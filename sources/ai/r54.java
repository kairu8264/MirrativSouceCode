package ai;

/* loaded from: classes3.dex */
public final class r54 extends ri3<r54, n54> implements yj3 {
    private static final r54 zzr;
    private int zzb;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private aj3<p54> zzp = ri3.n();

    static {
        r54 r54Var = new r54();
        zzr = r54Var;
        ri3.y(r54.class, r54Var);
    }

    public static n54 B() {
        return zzr.u();
    }

    public static /* synthetic */ void D(r54 r54Var, String str) {
        str.getClass();
        r54Var.zzb |= 1;
        r54Var.zze = str;
    }

    public static /* synthetic */ void E(r54 r54Var, long j10) {
        r54Var.zzb |= 2;
        r54Var.zzf = j10;
    }

    public static /* synthetic */ void F(r54 r54Var, String str) {
        str.getClass();
        r54Var.zzb |= 4;
        r54Var.zzg = str;
    }

    public static /* synthetic */ void G(r54 r54Var, String str) {
        str.getClass();
        r54Var.zzb |= 8;
        r54Var.zzh = str;
    }

    public static /* synthetic */ void H(r54 r54Var, String str) {
        r54Var.zzb |= 16;
        r54Var.zzi = str;
    }

    public static /* synthetic */ void I(r54 r54Var, String str) {
        r54Var.zzb |= 1024;
        r54Var.zzo = str;
    }

    public static /* synthetic */ void J(r54 r54Var, int i10) {
        r54Var.zzq = i10 - 1;
        r54Var.zzb |= 2048;
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
                    return new n54(null);
                }
                return new r54();
            }
            return ri3.z(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", p54.class, "zzq", q54.f8837a});
        }
        return (byte) 1;
    }
}
