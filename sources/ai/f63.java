package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes3.dex */
public final class f63 {
    @Deprecated
    public static final b63 a(byte[] bArr) throws GeneralSecurityException {
        try {
            qd3 E = qd3.E(bArr, di3.a());
            for (pd3 pd3Var : E.C()) {
                if (pd3Var.C().I() == 2 || pd3Var.C().I() == 3 || pd3Var.C().I() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return b63.a(E);
        } catch (zzggm unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
