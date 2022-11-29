package ai;

/* loaded from: classes3.dex */
public final class pd3 extends ri3<pd3, od3> implements yj3 {
    private static final pd3 zzh;
    private ed3 zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        pd3 pd3Var = new pd3();
        zzh = pd3Var;
        ri3.y(pd3.class, pd3Var);
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
                        return zzh;
                    }
                    return new od3(null);
                }
                return new pd3();
            }
            return ri3.z(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean B() {
        return this.zzb != null;
    }

    public final ed3 C() {
        ed3 ed3Var = this.zzb;
        return ed3Var == null ? ed3.E() : ed3Var;
    }

    public final int D() {
        return this.zzf;
    }

    public final int F() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int G() {
        int b10 = je3.b(this.zzg);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }
}
