package ai;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class e93 extends z53<e63, vc3> {
    public e93(Class cls) {
        super(cls);
    }

    @Override // ai.z53
    public final /* bridge */ /* synthetic */ e63 b(vc3 vc3Var) throws GeneralSecurityException {
        vc3 vc3Var2 = vc3Var;
        int G = vc3Var2.C().G();
        SecretKeySpec secretKeySpec = new SecretKeySpec(vc3Var2.D().U(), "HMAC");
        int B = vc3Var2.C().B();
        int i10 = G - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new gg3(new fg3("HMACSHA224", secretKeySpec), B);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new gg3(new fg3("HMACSHA512", secretKeySpec), B);
                }
                return new gg3(new fg3("HMACSHA256", secretKeySpec), B);
            }
            return new gg3(new fg3("HMACSHA384", secretKeySpec), B);
        }
        return new gg3(new fg3("HMACSHA1", secretKeySpec), B);
    }
}
