package ai;

/* loaded from: classes3.dex */
public final class hd3 extends ri3<hd3, gd3> implements yj3 {
    private static final hd3 zzg;
    private String zzb = "";
    private oh3 zze = oh3.f7807x;
    private int zzf;

    static {
        hd3 hd3Var = new hd3();
        zzg = hd3Var;
        ri3.y(hd3.class, hd3Var);
    }

    public static gd3 D() {
        return zzg.u();
    }

    public static hd3 E() {
        return zzg;
    }

    public static /* synthetic */ hd3 F() {
        return zzg;
    }

    public static /* synthetic */ void G(hd3 hd3Var, String str) {
        str.getClass();
        hd3Var.zzb = str;
    }

    public static /* synthetic */ void H(hd3 hd3Var, oh3 oh3Var) {
        hd3Var.zze = oh3Var;
    }

    public static /* synthetic */ void J(hd3 hd3Var, int i10) {
        hd3Var.zzf = je3.a(i10);
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
                    return new gd3(null);
                }
                return new hd3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String B() {
        return this.zzb;
    }

    public final oh3 C() {
        return this.zze;
    }

    public final int I() {
        int b10 = je3.b(this.zzf);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }
}
