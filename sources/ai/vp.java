package ai;

/* loaded from: classes3.dex */
public final class vp extends ri3<vp, np> implements yj3 {
    private static final vp zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        vp vpVar = new vp();
        zzg = vpVar;
        ri3.y(vp.class, vpVar);
    }

    public static np D() {
        return zzg.u();
    }

    public static vp E() {
        return zzg;
    }

    public static /* synthetic */ void I(vp vpVar, int i10) {
        vpVar.zze = i10 - 1;
        vpVar.zzb |= 1;
    }

    public static /* synthetic */ void J(vp vpVar, int i10) {
        vpVar.zzf = i10 - 1;
        vpVar.zzb |= 2;
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
                    return new np(null);
                }
                return new vp();
            }
            return ri3.z(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", tp.f10364a, "zzf", pp.f8490a});
        }
        return (byte) 1;
    }

    public final boolean B() {
        return (this.zzb & 1) != 0;
    }

    public final boolean C() {
        return (this.zzb & 2) != 0;
    }

    public final int G() {
        int a10 = up.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int H() {
        int a10 = qp.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
