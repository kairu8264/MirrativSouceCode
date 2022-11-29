package ai;

/* loaded from: classes3.dex */
public final class bm3 extends ri3<bm3, am3> implements yj3 {
    private static final bm3 zzh;
    private int zzb;
    private oh3 zze;
    private oh3 zzf;
    private byte zzg = 2;

    static {
        bm3 bm3Var = new bm3();
        zzh = bm3Var;
        ri3.y(bm3.class, bm3Var);
    }

    public bm3() {
        oh3 oh3Var = oh3.f7807x;
        this.zze = oh3Var;
        this.zzf = oh3Var;
    }

    public static am3 B() {
        return zzh.u();
    }

    public static /* synthetic */ void D(bm3 bm3Var, oh3 oh3Var) {
        bm3Var.zzb |= 1;
        bm3Var.zze = oh3Var;
    }

    public static /* synthetic */ void E(bm3 bm3Var, oh3 oh3Var) {
        bm3Var.zzb |= 2;
        bm3Var.zzf = oh3Var;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzh;
                    }
                    return new am3(null);
                }
                return new bm3();
            }
            return ri3.z(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
