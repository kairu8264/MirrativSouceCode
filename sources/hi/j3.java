package hi;

/* loaded from: classes3.dex */
public final class j3 extends t8<j3, f3> implements x9 {
    private static final j3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        j3 j3Var = new j3();
        zza = j3Var;
        t8.j(j3.class, j3Var);
    }

    public static j3 s() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 16) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final int C() {
        int a10 = i3.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    @Override // hi.t8
    public final Object q(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new f3(null);
                }
                return new j3();
            }
            return t8.i(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", h3.f35797a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzj;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
