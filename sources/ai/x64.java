package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class x64 extends ri3<x64, w64> implements yj3 {
    private static final x64 zzi;
    private int zzb;
    private oh3 zze;
    private oh3 zzf;
    private oh3 zzg;
    private oh3 zzh;

    static {
        x64 x64Var = new x64();
        zzi = x64Var;
        ri3.y(x64.class, x64Var);
    }

    public x64() {
        oh3 oh3Var = oh3.f7807x;
        this.zze = oh3Var;
        this.zzf = oh3Var;
        this.zzg = oh3Var;
        this.zzh = oh3Var;
    }

    public static x64 F(byte[] bArr, di3 di3Var) throws zzggm {
        return (x64) ri3.t(zzi, bArr, di3Var);
    }

    public static w64 G() {
        return zzi.u();
    }

    public static /* synthetic */ x64 H() {
        return zzi;
    }

    public static /* synthetic */ void I(x64 x64Var, oh3 oh3Var) {
        x64Var.zzb |= 1;
        x64Var.zze = oh3Var;
    }

    public static /* synthetic */ void J(x64 x64Var, oh3 oh3Var) {
        x64Var.zzb |= 2;
        x64Var.zzf = oh3Var;
    }

    public static /* synthetic */ void K(x64 x64Var, oh3 oh3Var) {
        x64Var.zzb |= 4;
        x64Var.zzg = oh3Var;
    }

    public static /* synthetic */ void M(x64 x64Var, oh3 oh3Var) {
        x64Var.zzb |= 8;
        x64Var.zzh = oh3Var;
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
                    return new w64(null);
                }
                return new x64();
            }
            return ri3.z(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final oh3 B() {
        return this.zze;
    }

    public final oh3 C() {
        return this.zzf;
    }

    public final oh3 D() {
        return this.zzg;
    }

    public final oh3 E() {
        return this.zzh;
    }
}
