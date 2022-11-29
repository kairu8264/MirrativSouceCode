package ai;

/* loaded from: classes3.dex */
public final class oc3 extends ri3<oc3, nc3> implements yj3 {
    private static final oc3 zzg;
    private int zzb;
    private int zze;
    private oh3 zzf = oh3.f7807x;

    static {
        oc3 oc3Var = new oc3();
        zzg = oc3Var;
        ri3.y(oc3.class, oc3Var);
    }

    public static nc3 C() {
        return zzg.u();
    }

    public static oc3 D() {
        return zzg;
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
                    return new nc3(null);
                }
                return new oc3();
            }
            return ri3.z(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final oh3 B() {
        return this.zzf;
    }

    public final int G() {
        int i10 = this.zzb;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int H() {
        int b10 = sc3.b(this.zze);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }
}
