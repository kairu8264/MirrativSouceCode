package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class j2 extends ri3<j2, i2> implements yj3 {
    private static final j2 zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        j2 j2Var = new j2();
        zzj = j2Var;
        ri3.y(j2.class, j2Var);
    }

    public static j2 G(oh3 oh3Var) throws zzggm {
        return (j2) ri3.q(zzj, oh3Var);
    }

    public static j2 H(oh3 oh3Var, di3 di3Var) throws zzggm {
        return (j2) ri3.r(zzj, oh3Var, di3Var);
    }

    public static i2 I() {
        return zzj.u();
    }

    public static j2 J() {
        return zzj;
    }

    public static /* synthetic */ void M(j2 j2Var, String str) {
        str.getClass();
        j2Var.zzb |= 1;
        j2Var.zze = str;
    }

    public static /* synthetic */ void N(j2 j2Var, String str) {
        str.getClass();
        j2Var.zzb |= 2;
        j2Var.zzf = str;
    }

    public static /* synthetic */ void O(j2 j2Var, long j10) {
        j2Var.zzb |= 4;
        j2Var.zzg = j10;
    }

    public static /* synthetic */ void Q(j2 j2Var, long j10) {
        j2Var.zzb |= 8;
        j2Var.zzh = j10;
    }

    public static /* synthetic */ void R(j2 j2Var, long j10) {
        j2Var.zzb |= 16;
        j2Var.zzi = j10;
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
                        return zzj;
                    }
                    return new i2(null);
                }
                return new j2();
            }
            return ri3.z(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zze;
    }

    public final String C() {
        return this.zzf;
    }

    public final long D() {
        return this.zzg;
    }

    public final long E() {
        return this.zzh;
    }

    public final long F() {
        return this.zzi;
    }
}
