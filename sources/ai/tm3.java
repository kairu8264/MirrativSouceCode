package ai;

/* loaded from: classes3.dex */
public final class tm3 extends ri3<tm3, sm3> implements yj3 {
    private static final tm3 zzo;
    private int zzb;
    private int zze;
    private fm3 zzg;
    private jm3 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private wi3 zzj = ri3.k();
    private String zzk = "";
    private aj3<String> zzm = ri3.n();

    static {
        tm3 tm3Var = new tm3();
        zzo = tm3Var;
        ri3.y(tm3.class, tm3Var);
    }

    public static sm3 D() {
        return zzo.u();
    }

    public static /* synthetic */ void F(tm3 tm3Var, int i10) {
        tm3Var.zzb |= 1;
        tm3Var.zze = i10;
    }

    public static /* synthetic */ void G(tm3 tm3Var, String str) {
        str.getClass();
        tm3Var.zzb |= 2;
        tm3Var.zzf = str;
    }

    public static /* synthetic */ void H(tm3 tm3Var, fm3 fm3Var) {
        fm3Var.getClass();
        tm3Var.zzg = fm3Var;
        tm3Var.zzb |= 4;
    }

    public static /* synthetic */ void I(tm3 tm3Var, String str) {
        str.getClass();
        aj3<String> aj3Var = tm3Var.zzm;
        if (!aj3Var.zza()) {
            tm3Var.zzm = ri3.o(aj3Var);
        }
        tm3Var.zzm.add(str);
    }

    public static /* synthetic */ void J(tm3 tm3Var, int i10) {
        tm3Var.zzl = i10 - 1;
        tm3Var.zzb |= 64;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzn = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzo;
                    }
                    return new sm3(null);
                }
                return new tm3();
            }
            return ri3.z(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", qm3.f9011a, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final String B() {
        return this.zzf;
    }

    public final int C() {
        return this.zzm.size();
    }
}
