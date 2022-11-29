package ai;

import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class me3 extends ri3<me3, le3> implements yj3 {
    private static final me3 zzf;
    private String zzb = "";
    private aj3<kd3> zze = ri3.n();

    static {
        me3 me3Var = new me3();
        zzf = me3Var;
        ri3.y(me3.class, me3Var);
    }

    public static me3 C() {
        return zzf;
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
                        return zzf;
                    }
                    return new le3(null);
                }
                return new me3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", kd3.class});
        }
        return (byte) 1;
    }

    public final List<kd3> B() {
        return this.zze;
    }
}
