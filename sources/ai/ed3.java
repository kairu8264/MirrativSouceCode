package ai;

/* loaded from: classes3.dex */
public final class ed3 extends ri3<ed3, dd3> implements yj3 {
    private static final ed3 zzg;
    private String zzb = "";
    private oh3 zze = oh3.f7807x;
    private int zzf;

    static {
        ed3 ed3Var = new ed3();
        zzg = ed3Var;
        ri3.y(ed3.class, ed3Var);
    }

    public static dd3 D() {
        return zzg.u();
    }

    public static ed3 E() {
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
                    return new dd3(null);
                }
                return new ed3();
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
        int i10 = this.zzf;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
