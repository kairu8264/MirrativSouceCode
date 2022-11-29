package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class p64 extends ri3<p64, o64> implements yj3 {
    private static final p64 zzz;
    private int zzb;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        p64 p64Var = new p64();
        zzz = p64Var;
        ri3.y(p64.class, p64Var);
    }

    public static o64 B() {
        return zzz.u();
    }

    public static /* synthetic */ void D(p64 p64Var, long j10) {
        p64Var.zzb |= 1;
        p64Var.zze = j10;
    }

    public static /* synthetic */ void E(p64 p64Var, long j10) {
        p64Var.zzb |= 2;
        p64Var.zzf = j10;
    }

    public static /* synthetic */ void F(p64 p64Var, long j10) {
        p64Var.zzb |= 4;
        p64Var.zzg = j10;
    }

    public static /* synthetic */ void G(p64 p64Var, long j10) {
        p64Var.zzb |= 8;
        p64Var.zzh = j10;
    }

    public static /* synthetic */ void H(p64 p64Var) {
        p64Var.zzb &= -9;
        p64Var.zzh = -1L;
    }

    public static /* synthetic */ void I(p64 p64Var, long j10) {
        p64Var.zzb |= 16;
        p64Var.zzi = j10;
    }

    public static /* synthetic */ void J(p64 p64Var, long j10) {
        p64Var.zzb |= 32;
        p64Var.zzj = j10;
    }

    public static /* synthetic */ void K(p64 p64Var, long j10) {
        p64Var.zzb |= 128;
        p64Var.zzl = j10;
    }

    public static /* synthetic */ void M(p64 p64Var, long j10) {
        p64Var.zzb |= 256;
        p64Var.zzm = j10;
    }

    public static /* synthetic */ void N(p64 p64Var, long j10) {
        p64Var.zzb |= 512;
        p64Var.zzn = j10;
    }

    public static /* synthetic */ void O(p64 p64Var, long j10) {
        p64Var.zzb |= 2048;
        p64Var.zzp = j10;
    }

    public static /* synthetic */ void Q(p64 p64Var, long j10) {
        p64Var.zzb |= 4096;
        p64Var.zzq = j10;
    }

    public static /* synthetic */ void R(p64 p64Var, long j10) {
        p64Var.zzb |= 8192;
        p64Var.zzr = j10;
    }

    public static /* synthetic */ void S(p64 p64Var, long j10) {
        p64Var.zzb |= 16384;
        p64Var.zzs = j10;
    }

    public static /* synthetic */ void U(p64 p64Var, long j10) {
        p64Var.zzb |= 32768;
        p64Var.zzt = j10;
    }

    public static /* synthetic */ void V(p64 p64Var, long j10) {
        p64Var.zzb |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        p64Var.zzu = j10;
    }

    public static /* synthetic */ void W(p64 p64Var, long j10) {
        p64Var.zzb |= 131072;
        p64Var.zzv = j10;
    }

    public static /* synthetic */ void X(p64 p64Var, long j10) {
        p64Var.zzb |= 262144;
        p64Var.zzw = j10;
    }

    public static /* synthetic */ void Y(p64 p64Var, int i10) {
        p64Var.zzk = i10 - 1;
        p64Var.zzb |= 64;
    }

    public static /* synthetic */ void Z(p64 p64Var, int i10) {
        p64Var.zzo = i10 - 1;
        p64Var.zzb |= 1024;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                vi3 vi3Var = z64.f12899a;
                return ri3.z(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", vi3Var, "zzl", "zzm", "zzn", "zzo", vi3Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzz;
                }
                return new o64(null);
            } else {
                return new p64();
            }
        }
        return (byte) 1;
    }
}
