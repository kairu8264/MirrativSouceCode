package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.util.List;

/* loaded from: classes3.dex */
public final class qd3 extends ri3<qd3, md3> implements yj3 {
    private static final qd3 zzf;
    private int zzb;
    private aj3<pd3> zze = ri3.n();

    static {
        qd3 qd3Var = new qd3();
        zzf = qd3Var;
        ri3.y(qd3.class, qd3Var);
    }

    public static qd3 E(byte[] bArr, di3 di3Var) throws zzggm {
        return (qd3) ri3.t(zzf, bArr, di3Var);
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
                    return new md3(null);
                }
                return new qd3();
            }
            return ri3.z(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", pd3.class});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzb;
    }

    public final List<pd3> C() {
        return this.zze;
    }

    public final int D() {
        return this.zze.size();
    }
}
